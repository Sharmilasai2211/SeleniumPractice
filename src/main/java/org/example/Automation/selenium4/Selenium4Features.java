package org.example.Automation.selenium4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Selenium4Features {

    public WebDriver driver;

    @BeforeClass()
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.manage().window().maximize();
        System.out.println("Executed");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    @Test
    public void elementScreenshot() throws IOException {

        WebElement logo = new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions
                        .visibilityOf(driver.findElement(
                                By.xpath("//div[@class='orangehrm-login-branding']/img"))));
        File src = logo.getScreenshotAs(OutputType.FILE);

        File trgt = new File("logo.png");

        FileUtils.copyFile(src,trgt);
    }

    @Test
    public void newWindow(){
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://www.google.com");
        driver.close();
        driver.switchTo().window(driver.getWindowHandles().stream().findFirst().orElseThrow());
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to("https://www.google.com");
        driver.close();
        driver.switchTo().window(driver.getWindowHandles().stream().findFirst().orElseThrow());
    }

    @Test(groups={"smoke","sanity"})
    void objectLocation(){
        WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']/img"));
        System.out.println(logo.getRect().getHeight());
        System.out.println(logo.getRect().getDimension().getHeight());
        System.out.println(logo.getRect().getWidth());
        System.out.println(logo.getRect().getDimension().getWidth());

        System.out.println(logo.getRect().getX());
        System.out.println(logo.getRect().getY());

        System.out.println(logo.getLocation().getX());
        System.out.println(logo.getLocation().getY());
    }

    @AfterClass
    public void clean(){
        driver.close();
    }
}
