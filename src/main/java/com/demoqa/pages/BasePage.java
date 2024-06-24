package com.demoqa.pages;

import com.demoqa.drivers.DriverManager;
import com.demoqa.helper.DropDownHelper;
import com.demoqa.helper.WebElementActions;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(DriverManager.getDriver(),this);
    }


    public WebElementActions webElementActions = new WebElementActions();

    public DropDownHelper dropDownHelper = new DropDownHelper(DriverManager.getDriver());
    Random random = new Random();
}
