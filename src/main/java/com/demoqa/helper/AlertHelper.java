package com.demoqa.helper;

import com.demoqa.drivers.DriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;

public class AlertHelper {

    private WebDriver driver = DriverManager.getDriver();
    public AlertHelper(WebDriver driver){
           this.driver=driver;
    }

    public Alert getAlert(){
        return driver.switchTo().alert();
    }

    public void acceptAlert(){
        getAlert().accept();
    }

    public void dismissAlert(){
        getAlert().dismiss();
    }

    public String getAlertText(){
        return getAlert().getText();
    }


}