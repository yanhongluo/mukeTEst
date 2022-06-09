package com.course.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public void ignoreTest1(){
        System.out.println("这是默认的test标签");
        System.out.printf("线程编号是这样的：%s%n",Thread.currentThread().getId());
    }

    @Test(enabled = false)
    public void ignoreTest2(){
        System.out.println("这是属性为false的test标签");
        System.out.printf("线程编号是这样的：%s%n",Thread.currentThread().getId());
    }

    @Test(enabled = true)
    public void ignoreTest3(){
        System.out.println("这是属性为true的test标签");
        System.out.printf("线程编号是这样的：%s%n",Thread.currentThread().getId());
    }
    /*@BeforeClass
    public void beforeTestClass(){
        System.out.println("这是beforeclass运行的");
        System.out.printf("beforeclass线程编号是这样的：%s%n", Thread.currentThread().getId());
    }*/
}
