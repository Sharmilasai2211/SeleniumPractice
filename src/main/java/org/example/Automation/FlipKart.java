package org.example.Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class FlipKart {

    public static void main(String[] args) throws ArithmeticException, InterruptedException {

//        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");

        driver.manage().window().maximize();

        WebElement search = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
        search.sendKeys("laptop");

        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].value='laptop'",search);
        search.submit();

        driver.findElement(By.xpath("//div[text()='Brand']")).click();
        driver.findElement(By.xpath("//div[text()='Lenovo']")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[text()='Lenovo']"))));

        List<WebElement> listOfNames = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
        List<WebElement> listOfPrices = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));

        String laptop = listOfNames.get(1).getText();
        driver.findElement(By.partialLinkText(laptop)).click();

        for(int i=0;i<5;i++){
            System.out.println(listOfNames.get(i).getText()+" "+listOfPrices.get(i).getText());
        }

        Set<String> driverSet = driver.getWindowHandles();
        String current = driver.getWindowHandle();
        for(String s: driverSet){
            if(!(current.equals(s))){
                System.out.println(s);
                driver.switchTo().window(s);
            }
        }

        Thread.sleep(2000);
        WebElement button = driver.findElement(By.xpath("//button[text()='Buy Now']"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);

        int x = button.getLocation().getX();
        int y = button.getLocation().getY();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(arguments[0],arguments[1])",x,y);


        System.out.println(button.getText());

        driver.quit();
    }
}
