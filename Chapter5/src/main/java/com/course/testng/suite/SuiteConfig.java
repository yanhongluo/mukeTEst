package com.course.testng.suite;

import org.testng.annotations.*;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("这是beforesuit运行的");
    }

    @AfterSuite
    public  void afterSuit(){
        System.out.println("这个aftersuit运行的");
    }

    @BeforeTest
    public  void boforeTest(){
        System.out.println("这是beforeTest运行的");
    }
    @AfterTest
    public  void afterTest(){
        System.out.println("这是afterTest运行的");
    }

    //method的方法在套件运行中不生效
   /* @BeforeMethod
    public  void boforeMethod(){
        System.out.println("这是boforeMethod运行的");
    }
    @AfterMethod
    public  void afterMethod(){
        System.out.println("这是afterMethod运行的");
    }*/
    //class的方法在套件运行中不生效
  /*  @BeforeClass
    public void beforeTestClass(){
        System.out.println("这是beforeclass运行的");
    }
    @AfterClass
    public void afterTestClass(){
        System.out.println("这是afterclass运行的");
    }
*/

}
