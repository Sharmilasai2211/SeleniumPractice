package org.example.Automation;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

public class UploadFile {



    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
//        Logger logger = LoggerFactory.getLogger(UploadFile.class);
        driver.navigate().to("https://demo.guru99.com/test/upload/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();

        UploadFilePage page = new UploadFilePage(driver);
        page.uploadFile("C:\\Users\\UX507801\\Documents\\Bugs raised.txt");
        page.setAccept_terms();
        page.clickSubmit();

        TakesScreenshot shot = ((TakesScreenshot) driver);
        File src = shot.getScreenshotAs(OutputType.FILE);

        File dest = new File("src\\main\\resources\\Dest.png");
        FileUtils.copyFile(src,dest);
        driver.close();
    }
}
