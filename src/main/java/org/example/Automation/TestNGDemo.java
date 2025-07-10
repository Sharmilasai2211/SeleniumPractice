package org.example.Automation;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGDemo {

    @Test(priority = 1, groups = {"abc", "def"})
    public void testB() {
        System.out.println("Test B");
    }

    @Test(priority = 0, groups = {"def"}, retryAnalyzer = RetryAnalyserTest.class)
    public void testC(){
        System.out.println("Test C");
//        Assert.assertTrue(false);
    }

    @Test(priority = 1, groups = {"abc", "acx"}, dependsOnGroups = {"def"})
    public void testA() {
        System.out.println("Test A");
        Reporter.log("SSS", 1,true);
//        Assert.assertTrue(false);
    }

    @DataProvider(name = "testdata")
    public Object[][] getData(){
        return new Object[][] { {1, 2}, {3,4}, {5,6} };
    }

    @Test(dataProvider = "testdata")
    public void testData(int a, int b){
        System.out.println(a+b);
    }

    @Test(retryAnalyzer = RetryAnalyserTest.class)
    public void assertTest(){
        Assert.fail("Failing...");
    }

    @Test
    public void verifyTest(){
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(1,2, "Not equal");
//        soft.assertAll();
    }
}
