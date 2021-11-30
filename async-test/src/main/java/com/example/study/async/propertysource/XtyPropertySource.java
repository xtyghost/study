package com.example.study.async.propertysource;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author xutong
 */
@Data
@Component
@PropertySource("classpath:propertysource.properties")
public class XtyPropertySource {
    @Value("xty")
    private String name;
}
