package com.demoqa.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FoodList {

    @Test
    void findFoodlist(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(15)));
        driver.manage().window().maximize();

        driver.get("https://nambafood.kg/kukhnya-na-rayone");

        List<WebElement> foodlist = driver.findElements(By.xpath("//div[@class='card--item-info']/div[2]"));

        for (WebElement food:foodlist){
            System.out.println(food.getText());
        }
        System.out.println(foodlist.size());
    }
}
