package com.course.testng;

import org.omg.CORBA.Current;
import org.testng.annotations.*;

public class basicAnnotation {

    @Test
    public  void  testCase1(){
        System.out.println("Test这是测试用例1");
        System.out.printf("Thread id:%s%n", Thread.currentThread().getId());
    }
    @Test
    public  void  testCase2(){
        System.out.println("Test这是测试用例2");
        System.out.printf("Thread id:%s%n", Thread.currentThread().getId());
    }
    @BeforeMethod
    public void beforeTestMothod(){
        System.out.println("这是BeforeMethod运行的");
        System.out.printf("Thread id:%s%n", Thread.currentThread().getId());
    }
    @AfterMethod
    public void afterTestMothod(){
        System.out.println("这是afterMothod运行的");
        System.out.printf("Thread id:%s%n", Thread.currentThread().getId());
    }
    @BeforeTest
    public  void  beforeTest(){
        System.out.println("这是beforeTest运行的");
        System.out.printf("Thread id:%s%n", Thread.currentThread().getId());
    }
    @AfterTest
    public void afterTest(){
        System.out.println("这是AfterTest运行的");
        System.out.printf("Thread id:%s%n", Thread.currentThread().getId());
    }
    @BeforeClass
    public void beforeTestClass(){
        System.out.println("这是beforeclass运行的");
        System.out.printf("Thread id:%s%n", Thread.currentThread().getId());
    }
    @AfterClass
    public void afterTestClass(){
        System.out.println("这是afterclass运行的");
        System.out.printf("Thread id:%s%n", Thread.currentThread().getId());
    }
    @AfterSuite
    public void afterTestSuit(){
        System.out.println("这是afterTestSuit运行的额");
        System.out.printf("Thread id:%s%n", Thread.currentThread().getId());
    }
    @BeforeSuite
    public void beforeTestSuit(){
        System.out.println("这是beforetestsuit运行的额");
        System.out.printf("Thread id:%s%n", Thread.currentThread().getId());
    }

}
