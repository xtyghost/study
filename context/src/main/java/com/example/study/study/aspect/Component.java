/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Component Author: xutong Date: 2020/6/19 10:01 上午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aspect;

import com.example.study.study.aspect.entity.Car;
import com.example.study.study.aspect.entity.User;
import com.example.study.study.aspect.exception.CarNotFindException;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/19
 * @since 1.0.0
 */
public class Component {

    public Car getCar(User user, String something) throws CarNotFindException {
        String template = "%s 今年 %d 喜欢 %s";
        System.out.println(String.format(template, user.getName(), user.getAge(), something));
        if (user.getCar() == null) {
            throw new CarNotFindException("this gay is very pool");
        }
        return user.getCar();
    }

    public Car getCar(User user, String something, String test) throws CarNotFindException {
        String template = "%s 今年 %d 喜欢 %s";
        System.out.println(String.format(template, user.getName(), user.getAge(), something));
        if (user.getCar() == null) {
            throw new CarNotFindException("this gay is very pool");
        }
        return user.getCar();
    }

    public Car getCar(User user) {
        return null;
    }
}
