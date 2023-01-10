package com.southwind.ioc;

import com.southwind.configuration.BeanConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @FileName：Test
 * @Author：LiYan
 * @createDate：2023/1/8 14:46
 * @description：
 */
public class Test {
    public static void main(String[] args) {
//        DataConfig dataConfig = new DataConfig();
//        dataConfig.setDriverName("Driver");
//        dataConfig.setUrl("localhost:3306");
//        dataConfig.setUsername("root");
//        dataConfig.setPassword("root");
        /**
         *    Ioc 基于xml创建对象
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("根据xml配置1：" + context.getBean("dataConfig"));

        /**
         *    Ioc 基于注解创建对象
         */
        // 1、配置类
        // 通过类
        ApplicationContext context1 = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        // 通过包名
        // ApplicationContext context1 = new AnnotationConfigApplicationContext("com.southwind.configuration");

        // 通过类创建
        // System.out.println(context.getBean(DataConfig.class));
        // 方法名当做ID
        // System.out.println(context.getBean("dataConfig"));
        // 通过@Bean 中的 value或者name 设置id
        System.out.println("配置类：" + context1.getBean("config"));


        // 2、扫包+注解 @Component注解
        ApplicationContext context2 = new AnnotationConfigApplicationContext("com.southwind.ioc");
        System.out.println("扫包+注解 @Component注解：" + context2.getBean(DataConfig.class));

        /**
         * 自动创建对象 依赖注入
         */
        ApplicationContext context3 = new AnnotationConfigApplicationContext("com.southwind.ioc");
        System.out.println("自动创建对象 依赖注入：" + context3.getBean(GlobalConfig.class));
    }
}
