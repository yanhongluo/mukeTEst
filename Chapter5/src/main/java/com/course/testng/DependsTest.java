package com.course.testng;

import org.testng.annotations.Test;

public class DependsTest {
    @Test(expectedExceptions=RuntimeException.class)
    public void test1(){
        System.out.println("这是test1的方法");
       // throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("这是test2的方法");
    }
}
