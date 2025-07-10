package org.example.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFilePage {
    @FindBy(name = "uploadfile_0")
    WebElement choose_file;

    @FindBy(id = "terms")
    WebElement accept_terms;

    @FindBy(id = "submitbutton")
    WebElement submitBtn;


    UploadFilePage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }

    public void uploadFile(CharSequence path){
        choose_file.sendKeys(path);
    }

    public void setAccept_terms(){
        accept_terms.click();
    }

    public void clickSubmit(){
        submitBtn.click();
    }


}
