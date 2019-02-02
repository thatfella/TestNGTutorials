package com.thatfella.tut8;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ListenerClass1 {

    @Test
    public void Class1_testcase1() {
        Assert.assertEquals("A","A");
    }

    @Test
    public void Class1_testcase2() {
        Assert.assertNull(12);
    }

    @Test
    public void Class1_testcase3() {
        throw new SkipException("Skipped");
        //Assert.assertEquals(12,12);
    }
}
