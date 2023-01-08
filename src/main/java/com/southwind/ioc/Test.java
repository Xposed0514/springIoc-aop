package com.southwind.ioc;

/**
 * @FileName：Test
 * @Author：LiYan
 * @createDate：2023/1/8 14:46
 * @description：
 */
public class Test {
    public static void main(String[] args) {
        DataConfig dataConfig = new DataConfig();
        dataConfig.setDriverName("Driver");
        dataConfig.setUrl("localhost:3306");
        dataConfig.setUsername("root");
        dataConfig.setPassword("root");
    }
}
