package com.utilities;

import com.constants.Constant;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener {
    public void onTestStart(ITestResult result) {
        Reporter.log("test Case has started: "+ result.getTestName());
    }

    public void onTestSuccess(ITestResult result) {
        Reporter.log("Test case has been passed: "+ result.getTestName());
        Constant.passedcount = Constant.passedcount + 1;
        System.out.println("Execution current status: passed "+ Constant.passedcount + "failes:" + Constant.failedCount);
    }

    public void onTestFailure(ITestResult result) {
        Reporter.log("Test case has been failed: "+ result.getTestName());
        Constant.failedCount = Constant.failedCount + 1;
        System.out.println("Execution current status: passed "+ Constant.passedcount + "failes:" + Constant.failedCount);

    }

    public void onTestSkipped(ITestResult result) {
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        this.onTestFailure(result);
    }

    public void onStart(ITestContext context) {
    }

    public void onFinish(ITestContext context) {
    }

}
