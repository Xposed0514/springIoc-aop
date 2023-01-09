package com.southwind.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @FileName：Test
 * @Author：LiYan
 * @createDate：2023/1/8 21:18
 * @description：
 *      AOP 面向切面编程
 *      面向切面编程，是一种抽象化的面向对象编程，对面向对象编程的一种补充
 *      计算器方法中，日志和业务混合在一起，AOP 要做的就是将日志代码全部抽象出去统一进行处理，计算器方法中只保留核心的业务代码。
 *      做到核心业务和非业务代码的解耦合
 *
 *      一个切面类只能给一个是实现类生成代理
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Cal bean = context.getBean(Cal.class);
        System.out.println(bean.add(1, 2));
        System.out.println(bean.sub(2, 1));
        System.out.println(bean.mul(1, 2));
        System.out.println(bean.div(4, 2));
    }
}
