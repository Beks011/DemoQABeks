package com.demoqa.locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class BasicLocators {
    @Test(description = "Find by ID")
        void findByIdTest(){
            System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(15)));
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/text-box");

        WebElement homeLink = driver.findElement(By.cssSelector("#userName"));
        homeLink.sendKeys("hello@gmail.com");


//        WebElement homeLink = driver.findElement(By.cssSelector("#userName"));
//        homeLink.sendKeys("hello@gmail.com");


//        WebElement homeLink = driver.findElement(By.xpath(" //textarea[@placeholder='Current Address']"));
//        homeLink.sendKeys("hello@gmail.com");

            //Home
//        WebElement homeLink = driver.findElement(By.linkText("Home"));
//        homeLink.click();
      //  WebElement homeLink = driver.findElement(By.partialLinkText("Bad")); // частичный , тоесть если у нас длинный текст к примеру у нас
        // Bad Requast , то мы сейчас напишем Bad и она будет искать что написано с Bad
     //   homeLink.click();


//            WebElement fullNameInput = driver.findElement(By.linkText("input"));
//            fullNameInput.sendKeys("John Doe");
//
//            String textBoxText = driver.findElement(By.tagName("h1")).getText();
//        System.out.println(textBoxText);
        }


}
