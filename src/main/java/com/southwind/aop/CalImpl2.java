package com.southwind.aop;

import org.springframework.stereotype.Component;

/**
 * @FileName：CalImpl
 * @Author：LiYan
 * @createDate：2023/1/8 17:42
 * @description：
 */
//@Component
public class CalImpl2 implements Cal {
    @Override
    public int add(int num1, int num2) {
        int result = num1 + num2;
        return 0;
    }

    @Override
    public int sub(int num1, int num2) {
        int result = num1 - num2;
        return 0;
    }

    @Override
    public int mul(int num1, int num2) {
        int result = num1 * num2;
        return 0;
    }

    @Override
    public int div(int num1, int num2) {
        int result = num1 / num2;
        return 0;
    }
}
