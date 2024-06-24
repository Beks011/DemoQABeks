package com.demoqa.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;

public class TextBox {

    WebDriver driver;
    @BeforeMethod
    public void OpenWeb(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(15)));
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void CloseWeb() throws InterruptedException {

        Thread.sleep(10000);

        driver.close();
        driver.quit();

    }

    @Test(dataProvider = "dataBase")
    void textBoxTest(String url, String fullName,String email,String currentAdress,String permanentAdress) throws InterruptedException {

        driver.get(url); // драйвер открой мне этот сайт , он открывает указанный ресурс, открывает любой сайт
        Thread.sleep(5000);

        fillBase(By.id("userName"),fullName);
        fillBase(By.id("userEmail"),email);
        fillBase(By.id("currentAddress"),currentAdress);
        fillBase(By.id("permanentAddress"),permanentAdress);

        WebElement submit1 = driver.findElement(By.id("submit"));
        Actions actions = new Actions(driver);
        actions.moveToElement(submit1).click().perform();





    }
private void fillBase(By id,String fill){
        WebElement element = driver.findElement(id);
        element.sendKeys(fill);

}

        @DataProvider
                public Object [][] dataBase() {
            return new Object[][]{
                    {"https://demoqa.com/text-box","Алихан","alihandro@gmail.com","Karakol-12street","Karakol"}
            };
        }


    }



