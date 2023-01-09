package com.southwind.configuration;

import com.southwind.ioc.DataConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @FileName：BeanConfiguration
 * @Author：LiYan
 * @createDate：2023/1/8 15:51
 * @description：
 */
@Configuration
public class BeanConfiguration {
    @Bean(value = "config")
    public DataConfig dataConfig() {
        DataConfig dataConfig = new DataConfig();
        dataConfig.setDriverName("Driver");
        dataConfig.setUrl("localhost:3306/Configuration");
        dataConfig.setUsername("root");
        dataConfig.setPassword("root");
        return dataConfig;
    }
}
