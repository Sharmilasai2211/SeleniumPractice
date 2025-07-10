package org.example.JavaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class JavaScriptExecutorEx {
    public static void main(String[] args) {

//        DesiredCapabilities cap = ;
//        cap.setCapability(CapabilityType.BROWSER_NAME,"chrome");

        WebDriver driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://selenium08.blogspot.com/");
        driver.manage().window().maximize();
        /* JS wait */
//        System.out.println(System.currentTimeMillis());
//        js.executeAsyncScript("window.setTimeout(arguments[arguments.length-1],5000);");
//        System.out.println(System.currentTimeMillis());
//        driver.close();
        /* Scroll down by pixel */
//        js.executeScript("window.scrollBy(0,1000)");
//        driver.close();
        /* Scroll down by web element */
        WebElement ele = driver.findElement(By.linkText("Right click Action in Selenium"));
        js.executeScript("arguments[0].scrollIntoView()",ele);
        driver.close();
    }
}
