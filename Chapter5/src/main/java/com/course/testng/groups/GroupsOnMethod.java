package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是server组的测试111111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是server组的测试222222");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是client组的测试33333");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("这是client组的测试44444");
    }

    @BeforeGroups("server")
    public void beforeGroupServer(){
        System.out.println("这是在server组前运行的测试");
    }
    @AfterGroups("server")
    public void afterGroupServer(){
        System.out.println("这是在server组后运行的测试");
    }

    @BeforeGroups("client")
    public void beforeGroupClient(){
        System.out.println("这是在client组前运行的测试");
    }
    @AfterGroups("client")
    public void afterGroupClient(){
        System.out.println("这是在client组后运行的测试");


    }
}
