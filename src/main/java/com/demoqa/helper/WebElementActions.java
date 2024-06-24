package com.demoqa.helper;

import com.demoqa.drivers.DriverManager;
import net.bytebuddy.dynamic.scaffold.TypeWriter;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.security.Key;
import java.security.SecureRandom;
import java.sql.Driver;
import java.time.Duration;

public class WebElementActions {
    public Actions actions;
    @BeforeClass(alwaysRun = true)
    public void init(){
        actions = new Actions(DriverManager.getDriver());
    }
    public WebElementActions click(WebElement element){
        waitElementToBeClickAble(element);
        scrollToElement(element);
        element.click();
        return this;

    }



    public WebElementActions sendKeys(WebElement element,String txt){
        element.sendKeys(txt);
        return this;
    }

    public WebElementActions waitElementToBeClickAble(WebElement element) {
        new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;

    }

    public WebElementActions waitElementToBeVisible(WebElement element){
        new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(element));
        return this;

    }

    public WebElementActions scrollToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",element);
        return this;
    }
    public WebElementActions sendKeysWithEnter(WebElement element,String txt){
        waitElementToBeVisible(element);
        scrollToElement(element);
        element.sendKeys(txt);
        element.sendKeys(Keys.ENTER);
        return this;
    }

    public WebElementActions jsClick(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("arguments[0].click();",element);
        return this;
    }
    public WebElementActions highlightElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("arguments[0].style.border='3px solid red'",element);
        return this;
    }
}
