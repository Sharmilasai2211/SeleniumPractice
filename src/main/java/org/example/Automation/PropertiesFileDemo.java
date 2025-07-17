package org.example.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo {

    WebDriver driverObj;
    FileInputStream input;

    @BeforeMethod
    public void startBrowser(){
        driverObj = new ChromeDriver();
        driverObj.get("https://demo.guru99.com/test/upload/");
        driverObj.manage().window().maximize();
    }
    @Test
    public void getDataFromPropFile() throws IOException {
        Properties prop = new Properties();
        input = new FileInputStream("C:\\Users\\UX507801\\Documents\\L2\\SeleniumPractice\\Details.properties");
        prop.load(input);

        driverObj.findElement(By.xpath(prop.getProperty("chooseFile"))).sendKeys(prop.getProperty("filePath"));
        driverObj.findElement(By.xpath(prop.getProperty("acceptTerms"))).click();
        driverObj.findElement(By.xpath(prop.getProperty("submitFile"))).click();
    }

    @AfterMethod
    public void closeBrowser() throws IOException {
        input.close();
        driverObj.close();
    }
}
