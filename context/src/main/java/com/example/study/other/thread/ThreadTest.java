package com.example.study.other.thread;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author xutong
 */
public class ThreadTest {
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();
    private static final ThreadPoolTaskExecutor POOL_EXECUTOR;

    static {
        POOL_EXECUTOR = new ThreadPoolTaskExecutor();

        POOL_EXECUTOR.setCorePoolSize(1);
        POOL_EXECUTOR.setMaxPoolSize(2);
        POOL_EXECUTOR.setThreadNamePrefix("datasource2es_");

        // for passing in request scope context
        POOL_EXECUTOR.setTaskDecorator(runnable -> {
            String dataSource = contextHolder.get();
            return () -> {
                contextHolder.set(dataSource);
                runnable.run();
                contextHolder.remove();
            };
        });

        POOL_EXECUTOR.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        POOL_EXECUTOR.setWaitForTasksToCompleteOnShutdown(true);
        POOL_EXECUTOR.initialize();
    }
    public static void main(String[] args) {
        contextHolder.set("llll");

        POOL_EXECUTOR.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(contextHolder.get());
            }
        });
        contextHolder.remove();
    }
}
