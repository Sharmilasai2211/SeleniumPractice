package org.example.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BrowserStackDemo {

    @Test
    public void runTest() throws MalformedURLException {

        String username = "sharmilasaikalav_DQM9SW";
        String token = "kAjFZSqz32yz87wqsbXM";
        String url = "https://" + username + ":" + token +"@hub.browserstack.com/wd/hub";

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setPlatform(Platform.WIN11);
        cap.setBrowserName("chrome");
        cap.setVersion("138.0");
        cap.setAcceptInsecureCerts(true);


        System.out.println(url);
        WebDriver driver = new RemoteWebDriver(new URL(url), cap);

        driver.get("https://www.browserstack.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement ele = driver.findElement(By.xpath("//h5[contains(text(),'Test websites or web apps')]/following-sibling::div//h4[contains(text(),'Automate')]"));
        System.out.println(ele.getText());

        ele.click();

        String heading = driver.findElement(By.xpath("//h1[contains(text(),'Scale')]")).getText();
        System.out.println(heading);

        driver.close();
    }
}
