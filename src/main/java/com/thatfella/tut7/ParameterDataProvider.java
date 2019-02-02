package com.thatfella.tut7;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterDataProvider {

    //here we set the dataProvider "myData1"
    @Test(dataProvider = "myData1")
    public void testDataProvider(String username, String password) {
        System.out.println("Test Case 1 running.....");
        System.out.println("userName is " + username);
        System.out.println("Password is " + password);
    }

    //Use DataProvider annotation to define a Data Provider
    @DataProvider (name = "myData1")
    public Object[][] myDataProvider1() {
        //1st number in the array is number of times to be run (in our case - 4 let's assume, that we have 4 users)
        //2nd number shows that we have 2 parameters - login and password
        Object[][]obj = new Object[4][2];
        obj[0][0] = "user1";
        obj[0][1] = "pass1";
        obj[1][0] = "user2";
        obj[1][1] = "pass2";
        obj[2][0] = "user3";
        obj[2][1] = "pass3";
        obj[3][0] = "user4";
        obj[3][1] = "pass4";
        return obj;
    }
}
