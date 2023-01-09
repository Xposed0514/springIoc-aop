package com.southwind.ioc;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @FileName：GlobalConfig
 * @Author：LiYan
 * @createDate：2023/1/8 17:06
 * @description：
 */
@Data
@Component
public class GlobalConfig {
    @Value("8080")
    private String port;
    @Value("/")
    private String path;
    @Autowired //自动注入 通过类型进行注入，如果需要通过名字注入 需要@Qualifier注解
    @Qualifier("Config")
    private DataConfig dataConfig;
}
