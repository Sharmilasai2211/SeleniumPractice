package org.example.Automation;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGridDemo {

    public static void main(String[] args) throws MalformedURLException {

        String url = "http://localhost:4444/";
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setPlatform(Platform.WIN11);
        cap.setBrowserName("chrome");

        WebDriver driver = new RemoteWebDriver(new URL(url), cap);

        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());

        driver.close();
    }
}
