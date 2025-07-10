package org.example.Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AxisBankExample {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.axisbank.com/");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("//li[@id='Aboutus']/a"));

        System.out.println(element.getText());
    }
}
