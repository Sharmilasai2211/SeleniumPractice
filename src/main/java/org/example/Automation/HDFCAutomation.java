package org.example.Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.time.Duration;

public class HDFCAutomation {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hdfcbank.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement login = driver.findElement(By.xpath("(//button[text()='Login'])[1]"));

        Actions act = new Actions(driver);
        act.moveToElement(login).perform();

        driver.findElement(By.xpath("//a[text()='NetBanking']")).click();

        for (String s: driver.getWindowHandles()){
            if(!(driver.getWindowHandle().equals(s)))
                driver.switchTo().window(s);
        }

        driver.switchTo().frame("login_page");

        WebElement userId = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
        userId.sendKeys("5876783254627");

        WebElement continueBtn = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
        continueBtn.click();

        driver.switchTo().defaultContent();

        WebElement password = driver.findElement(By.xpath("//input[@id='keyboard']"));
        password.sendKeys("asdfghjkl");

        WebElement loginBtn = driver.findElement(By.xpath("//a[text()='LOGIN']"));
        loginBtn.click();

        WebElement error = password.findElement(By.xpath("./following-sibling::p"));

        Assert.assertEquals(error.getText(), "Customer ID/IPIN (Password) is invalid. Please try again.");

        driver.quit();

    }
}
