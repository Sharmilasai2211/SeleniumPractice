package org.example.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class CommandsDemo {
    public static void main(String[] args) throws InterruptedException {

//        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/elements");
        driver.manage().window().maximize();
        /* Text box */
        driver.findElement(By.xpath("//span[text()='Text Box']")).click();
        driver.findElement(By.id("userName")).sendKeys("Sharmila");
        driver.findElement(By.id("userEmail")).sendKeys("sharmila@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Hyderabad");
        WebElement address = driver.findElement(By.id("permanentAddress"));
        address.sendKeys("Hyderabad");
        address.clear();
        Thread.sleep(5);
//        WebElement e = driver.findElement(By.xpath("//*[text()='Button']"));
//        System.out.println(e);

        /* Check Box */
        driver.findElement(By.xpath("//span[text()='Check Box']")).click();
        driver.findElement(By.className("rct-checkbox")).click();
        String actualText = driver.findElement(By.id("result")).getText();
        String expectedText = "You have selected :\n" +
                "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile";
        Assert.assertEquals(actualText,expectedText);
//        new SoftAssert().assertEquals(actualText,expectedText);
        /* Radio Button */
        driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
        List<WebElement> l = driver.findElements(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']/label[@class='custom-control-label']"));
        l.get(0).click();
//        SoftAssert assertObj = new SoftAssert();
//        assertObj.assertTrue(l.get(0).isEnabled(),"./.Yes is enabled");
//        assertObj.assertTrue(l.get(1).isEnabled(),"Impressive is enabled");
//        assertObj.assertAll();
        Assert.assertTrue(l.get(0).isEnabled(),"Yes is enabled");
        Assert.assertTrue(l.get(1).isEnabled(),"Impressive is enabled");

        Assert.assertTrue(l.get(0).isDisplayed(), "Yes is displayed");
        Assert.assertTrue(l.get(1).isDisplayed(), "Impressive is displayed");

        String result = driver.findElement(By.className("text-success")).getText();
        Assert.assertEquals(result, "Yes");

        l.get(1).click();
        Assert.assertTrue(l.get(0).isEnabled(),"Yes is enabled");
        Assert.assertTrue(l.get(1).isEnabled(),"Impressive is enabled");

        Assert.assertTrue(l.get(0).isDisplayed(), "Yes is displayed");
        Assert.assertTrue(l.get(1).isDisplayed(), "Impressive is displayed");

        result = driver.findElement(By.className("text-success")).getText();
        Assert.assertEquals(result, "Impressive");


        driver.close();
    }
}
