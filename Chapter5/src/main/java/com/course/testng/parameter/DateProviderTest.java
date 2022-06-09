package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sun.tools.jconsole.inspector.XObject;

import java.lang.reflect.Method;

public class DateProviderTest {
    @Test(dataProvider="data")
    public void test(String name,int age){
        System.out.println("test方法放回姓名："+name+"; 年龄："+age);

    }
    @DataProvider(name="data")
    public Object[][] dataProvider(){
        Object[][] o=new Object[][]{
                {"张三",18},
                {"李四",20},
                {"王五",22}
        };
        return o;
    }

    @Test(dataProvider="dataMethod")
    public void test2(String name,int age){
        System.out.println("test2方法放回姓名："+name+"; 年龄："+age);

    }

    @Test(dataProvider="dataMethod")
    public void test3(String name,int age){
        System.out.println("test3方法放回姓名："+name+"; 年龄："+age);

    }
    @DataProvider(name = "dataMethod")
    public Object[][] dataMethodProvider(Method method){
       Object[][] result=null;
      if (method.getName().equals("test2")){
          result=new Object[][]{
                  {"刘亦菲",18},
                  {"陈晓",20},
                  {"林允",22}
          };
      }else if (method.getName().equals("test3")){
          result=new Object[][]{
                  {"赵盼儿",18},
                  {"顾千帆",20},
                  {"宋引章",22}
          };
      }
      return result;

    }

}
