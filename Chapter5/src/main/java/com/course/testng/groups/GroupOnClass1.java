package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupOnClass1 {
    public void test1(){
        System.out.println("这是class1的test11111");
    }
    public void test2(){
        System.out.println("这是class1的test22222");
    }
}
