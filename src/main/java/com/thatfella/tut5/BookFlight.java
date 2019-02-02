package com.thatfella.tut5;

import org.testng.annotations.Test;

public class BookFlight {
    //here we mark this testCase as a part of TestGroup1
    @Test (groups = "TestGroup1")
    public void bookFlight_RoundTrip_Case1() {
        System.out.println("RoundTrip Case 1");
    }

    @Test
    public void bookFlight_RoundTrip_Case2() {
        System.out.println("RoundTrip Case 2");

    }

    @Test (groups = "TestGroup1")
    public void bookFlight_OneWay_Case1() {
        System.out.println("OneWay Case 1");
    }

    @Test
    public void bookFlight_OneWay_Case2() {
        System.out.println("OneWay Case 2");
    }

}
