package com.demoqa.helper;

import org.openqa.selenium.WebDriver;

public class IframeHelper {
    private  WebDriver driver;


    public IframeHelper(WebDriver driver){
        this.driver = driver;
    }

    public void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }

    public void switchToFrame(String nameOrId){
        driver.switchTo().frame(nameOrId );
    }


}
