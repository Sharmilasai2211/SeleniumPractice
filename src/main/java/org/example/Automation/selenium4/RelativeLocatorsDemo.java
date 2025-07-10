package org.example.Automation.selenium4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class RelativeLocatorsDemo {

    WebDriver driver;

    @BeforeClass
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://automationbookstore.dev/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterClass
    public void tearDown(){
        driver.close();
    }

    @Test
    public void relativeLocators(){
//        WebElement book3 = new WebDriverWait(driver, Duration.ofSeconds(20))
//                .until(ExpectedConditions.visibilityOf(driver.findElement(RelativeLocator.with(By.tagName("li"))
//                .above(By.id("pid7")).toRightOf(By.id("pid2")).toLeftOf(By.id("pid4"))
//        )));
//        String id = book3.getDomAttribute("id");
//        System.out.println(id);
//
//        book3 = book3.findElement(By.xpath(".//h2"));
//        System.out.println(book3.getText());
//
//        List<WebElement> book = driver.findElements(RelativeLocator.with(By.tagName("li")).near(By.id("pid2")));
//
//        for(WebElement ele:book){
//            System.out.println(ele.getDomProperty("id"));
//        }

        Assert.assertEquals(driver.findElement(RelativeLocator.with(By.tagName("li"))
                .straightLeftOf(By.id("pid3"))).getDomAttribute("id"), driver.findElement(RelativeLocator.with(By.tagName("li"))
                .straightAbove(By.id("pid6"))).getDomProperty("id"));

    }
}
