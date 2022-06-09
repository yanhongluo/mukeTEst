package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupOnClass3 {
    public void test1(){
        System.out.println("这是class3的test11111");
    }
    public void test2(){
        System.out.println("这是class3的test22222");
    }
}
