package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
//        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));

//        wait.until(ExpectedConditions.ele)
        Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
        driver.navigate().to("https://www.google.com");
        Wait fluent_wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(30))
                        .pollingEvery(Duration.ofSeconds(5))
                                .ignoring(NoSuchElementException.class);
        driver.findElement(By.id("APjFqb")).sendKeys("Java");
        WebElement e = driver.findElement(By.name("btnK"));
        wait.until(ExpectedConditions.elementToBeClickable(e));
        e.click();
        driver.close();

    }
}