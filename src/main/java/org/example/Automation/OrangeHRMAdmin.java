package org.example.Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrangeHRMAdmin {


    @Parameters({"job1","job2"})
    @Test
    public void testAdminDropDown(String job1, String job2) throws InterruptedException {

//        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        List<WebElement> cred = driver.findElements(By.xpath("//p[@class='oxd-text oxd-text--p']"));

        String usernameText = cred.get(0).getText();
        String passwordText = cred.get(1).getText();
        String admin = usernameText.substring(usernameText.indexOf(":")+2);
        String pswd = passwordText.substring(usernameText.indexOf(":")+2);

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(admin);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pswd);

        driver.findElement(By.xpath("//button[text()=' Login ']")).click();

        driver.findElement(By.xpath("//span[text()='Admin']")).click();

//        WebElement userrole = driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]"));
//        userrole.click();
//        userrole.sendKeys(Keys.ARROW_DOWN);
//        userrole.click();
//
//        Assert.assertEquals("Admin",userrole.getText());
//
//        driver.findElement(By.xpath("//button[text()=' Add ']")).click();
//
//        WebElement addUserRole = driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]"));
//        addUserRole.click();
//        addUserRole.sendKeys(Keys.ARROW_DOWN);
//        addUserRole.click();
//
//        Assert.assertEquals("Admin", addUserRole.getText());

        WebElement job = driver.findElement(By.xpath("//span[text()='Job ']"));
        job.click();

        WebElement titles = driver.findElement(By.xpath("//a[text()='Job Titles']"));
        titles.click();

        List<String> al = new ArrayList<>(Arrays.asList(job1,job2));

        for(int i=0; i<al.size();i++){
            WebElement ele = driver.findElement(By.xpath("//div[text()='"+al.get(i)+"']//preceding::span[1]"));

//            if(al.get(i).equals("Account Assistant")) {
//                ele = driver.findElement(By.xpath("//div[text()='Account Assistant']//preceding::span[1]"));
//            }
//            else if(al.get(i).equals("Chief Executive Officer")) {
//                ele = driver.findElement(By.xpath("//div[text()='Chief Executive Officer']//preceding::span[1]"));
//            }
//            else {
//                ele = driver.findElement(By.xpath("//div[text()='Content Specialist']//preceding::span[1]"));
//            }
            new Actions(driver).moveToElement(ele).perform();
            ele.click();
            Thread.sleep(5000);
        }
        driver.quit();
    }
}
