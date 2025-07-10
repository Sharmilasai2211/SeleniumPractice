package org.example.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

public class AmazonDemo {
    static WebDriver driver = new ChromeDriver();
    AmazonDemo(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Mobiles']")
    static WebElement mobile;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        driver.get("https://www.amazon.in/");

        driver.manage().window().maximize();
        mobile.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement results = driver.findElement(By.xpath(("//span[text()='See all results']")));
        Actions act = new Actions(driver);
        act.moveToElement(results).click().build().perform();

        List<WebElement> ele = driver.findElements(By.xpath("//div[@class='a-section a-spacing-small puis-padding-left-small puis-padding-right-small']"));

        for (WebElement e : ele) {
            // . in xpath will verify only the descendants of web element e. Instead of driver.findElement, we use e.findElement
            List<WebElement> spans = e.findElements(By.xpath(".//span"));
            for(WebElement span:spans){
                if(span.getText().contains("37% off")){
                    // . in xpath will verify only the descendants of web element e. Instead of driver.findElement, we use e.findElement
                    System.out.println(e.findElement(By.xpath(".//div/a/h2/span")).getText());
                }
            }

        }
        /** Another xpath of above scenario:
        *      //span[contains(text(),'(42% off)')]/ancestor::div[3]/preceding-sibling::div[2]//span
         **/

        /** xpath of review element of items which are of free delivery:
        *      //span[text()='FREE delivery ']//ancestor::div[3]/preceding-sibling::div[2]//descendant::span[3]
         **/
    }
}
