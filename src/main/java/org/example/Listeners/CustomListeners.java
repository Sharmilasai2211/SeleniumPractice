package org.example.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener  {

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Execution of "+context.getName()+" has been started");
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Execution of test "+result.getName()+" has been started");

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Execution of "+result.getName()+" is success");

    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Execution of "+result.getName()+" is failed");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Execution of "+context.getName()+" has been finished");
    }
}
