package com.course.testng;

import org.testng.annotations.Test;

public class TimeOutTest {

    @Test(timeOut = 2000)
    public void testSucess() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Test(timeOut = 1000)
    public void testFail() throws InterruptedException {
        Thread.sleep(2000);
    }
}
