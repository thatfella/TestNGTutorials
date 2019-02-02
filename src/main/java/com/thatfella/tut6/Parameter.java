package com.thatfella.tut6;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {

    //this annotation shows that we are using testparameters from xml-config
    @Parameters({"url","username","password"})
    @Test
    public void testCase1(String url, String username, String password) {
        System.out.println("Url is "+ url);
        System.out.println("Uname is "+ username);
        System.out.println("Pword is "+ password);
    }

}
