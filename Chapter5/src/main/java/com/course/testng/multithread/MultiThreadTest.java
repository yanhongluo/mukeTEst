package com.course.testng.multithread;


import org.testng.annotations.Test;

public class MultiThreadTest {
    @Test(invocationCount = 10,threadPoolSize = 2)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread id : %s%n", Thread.currentThread().getId());
    }
}
