package com.southwind.ioc;

import lombok.Data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @FileName：DataConfig
 * @Author：LiYan
 * @createDate：2023/1/8 14:35
 * @description：
 */
@Data
@Component("Config") //这个注解标识  当前类需要spring框架把它注入到Ioc
public class DataConfig {
    @Value("localhost:8080")
    private  String url;
    @Value("driver")
    private  String driverName;
    @Value("root")
    private String username;
    @Value("root")
    private String password;
}
