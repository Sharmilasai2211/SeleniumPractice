package org.example.Automation;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyserTest implements IRetryAnalyzer {

    private int count=0;
    private static final int retryCount=1;
    @Override
    public boolean retry(ITestResult iTestResult) {
        if(count<retryCount){
            count++;
            return true;
        }
        return false;
    }
}
