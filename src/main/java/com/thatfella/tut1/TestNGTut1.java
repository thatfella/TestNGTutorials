package com.thatfella.tut1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTut1 {

    //we set the "priority" attribute to set the order of tests execution

    @Test (priority = 3)
    public void testCase1() {
        //just a failure example
        Assert.assertEquals(12,15);
        System.out.println("My First TestNg testcase");
    }

    @Test (priority = 1)
    public void testCase2() {
        System.out.println("My Second TestNg testcase");
    }

    @Test (priority = 2)
    public void testCase3() {
        System.out.println("My Third TestNg testcase");
    }
}
