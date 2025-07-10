package org.example.Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class FlipkartSearch {

    @Test
    public void testFlipKartSearch() throws InterruptedException, IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        WebElement search = driver.findElement(By.className("Pke_EE"));
        search.sendKeys("mobiles");

        Thread.sleep(3000);

        List<WebElement> searchOptions = driver.findElements(By.xpath("//li[@class='_3D0G9a']"));
        for(WebElement opt: searchOptions){
            System.out.println(opt.getText());
        }

        searchOptions.get(4).click();

        List<WebElement> elements = driver.findElements(By.tagName("a"));

        for(WebElement e: elements){
            String s = e.getAttribute("href");
            URL url = new URL(s);
            HttpURLConnection http = (HttpURLConnection) url.openConnection();
            http.connect();

            if(http.getResponseCode()!=200)
                System.out.println("Broken");
        }

    }
}
