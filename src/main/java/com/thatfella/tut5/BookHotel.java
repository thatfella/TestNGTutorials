package com.thatfella.tut5;

import org.testng.annotations.Test;

public class BookHotel {
    //here we mark this testCase as a part of TestGroup1
    @Test (groups = "TestGroup1")
    public void BookHotel_DestinationCity() {

        System.out.println("BookHotel tc 1");
    }

    @Test
    public void BookHotel_Checkin() {
        System.out.println("BookHotel tc 2");

    }


    @Test
    public void BookHotel_Checkout() {
        System.out.println("BookHotel tc 3");

    }

}
