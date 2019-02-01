package com.thatfella.tut2;

import org.testng.annotations.*;

public class BookFlight {

    @BeforeTest
    public void prepare() {
        System.out.println("Before Test");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("I am running before every method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("I am running after every method");
    }

    @Test
    public void bookFlight_RoundTrip_Case1() {
        System.out.println("Case 1");
    }

    //dependsonMethods is used to set an order that one method is executed after other
    @Test (dependsOnMethods = {"bookFlight_RoundTrip_Case1"})
    public void bookFlight_RoundTrip_Case2() {
        System.out.println("Case 2");

    }

    @Test
    public void bookFlight_OneWay_Case1() {
        System.out.println("Case 3");
    }

    //enabled = false - not to run the test case
    @Test (enabled = false)
    public void bookFlight_OneWay_Case2() {
        System.out.println("Case 4");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After test");
    }

}
