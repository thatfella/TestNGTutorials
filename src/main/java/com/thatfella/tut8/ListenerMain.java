package com.thatfella.tut8;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//here we implement TestNG ITestListener interface
public class ListenerMain implements ITestListener {


    public void onTestStart(ITestResult iTestResult) {
        System.out.println("Test started..." + iTestResult.getName());
    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("TestCase passed!!!! " + iTestResult.getName());
    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("TestCase failed:=((\n" + iTestResult.getName() + " " + iTestResult.getThrowable());
    }

    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("TESTCASE WAS SKIPPED !!!!" + iTestResult.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }
}
