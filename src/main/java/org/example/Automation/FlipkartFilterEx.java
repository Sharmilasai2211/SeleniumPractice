package org.example.Automation;

import org.apache.commons.io.FileUtils;
import org.joda.time.DateTime;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlipkartFilterEx {

    WebDriver driver;
    @BeforeClass
    public void setUp() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.xpath("//div[@class='_25HC_u'][3]//a")).click();
    }
    @Test(priority = 1)
    public void removeOffer() throws InterruptedException {
        waitThread(3000);
        driver.findElement(By.xpath("//div[text()='50% or more']/preceding-sibling::div")).click();
        waitThread(5000);
    }
    @Test(priority = 2)
    public void setPrice(){
        WebElement priceDrpDwn = driver.findElement(By.xpath("//select[@class='Gn+jFg']"));
        Select sel = new Select(priceDrpDwn);
        sel.selectByIndex(3);
    }
    @Test(priority = 3)
    public void selectColors() throws InterruptedException {
        WebElement colorFilter = driver.findElement(By.xpath("//div[text()='Color']"));
        Actions act = new Actions(driver);

        List<String> colors = new ArrayList<>(Arrays.asList("Beige", "Brown", "Dark Green"));

        for (String s: colors){
            waitThread(3000);
            act.moveToElement(colorFilter).perform();
            colorFilter.click();
            WebElement filter = driver.findElement(By.xpath("//div[text()='"+s+"']/preceding-sibling::div"));
            filter.click();
        }
    }
    @Test(priority = 4)
    public void sortProducts() throws InterruptedException {
        waitThread(3000);
        driver.findElement(By.xpath("//div[text()='Newest First']")).click();
        waitThread(3000);
        String pricePath = "//div[@class='Nx9bqj']";
        WebElement priceEle = driver.findElement(By.xpath(pricePath));
        int preCost = Integer.parseInt(priceEle.getText().substring(1).replace(",",""));
        System.out.println("Newest product price: "+preCost);

        if(preCost > 1000){
            System.out.println("Hence changing sort to Low to High");
            driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();
        }
        else {
            System.out.println("Hence changing sort to High to Low");
            driver.findElement(By.xpath("//div[text()='Price -- High to Low']")).click();
        }
        waitThread(3000);
        WebElement selectPriceEle = driver.findElement(By.xpath(pricePath));
        int postCost = Integer.parseInt(selectPriceEle.getText().substring(1).replace(",",""));
        System.out.println("Sorted product price: "+postCost);
        Assert.assertTrue(postCost>preCost);

    }
    @AfterMethod
    public void getScreenshot(ITestResult result) throws IOException {

        TakesScreenshot ss = (TakesScreenshot) driver;
        File src = ss.getScreenshotAs(OutputType.FILE);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
        File tgt = new File("src/main/resources/"+result.getName()+"_"+ LocalDateTime.now().format(formatter)+".png");
        FileUtils.copyFile(src,tgt);
    }

    void waitThread(long ms) throws InterruptedException {
        Thread.sleep(ms);
    }

    @AfterClass
    void cleanUp(){
        driver.quit();
    }
}
