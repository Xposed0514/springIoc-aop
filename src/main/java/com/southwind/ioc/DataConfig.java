package com.southwind.ioc;

import lombok.Data;

/**
 * @FileName：DataConfig
 * @Author：LiYan
 * @createDate：2023/1/8 14:35
 * @description：
 */
@Data
public class DataConfig {
    private  String url;
    private  String driverName;
    private String username;
    private String password;
}
