package com.demoqa.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Cover312Test {
    WebDriver driver;
    @Test
    public void Cover312(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(15)));
        driver.manage().window().maximize();

        driver.get("https://dostavka312.kg/");

        WebElement vyborKafe = driver.findElement(By.xpath("/html/body[1]/section[3]/div/div/div[2]/div[1]/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(vyborKafe).click().perform();

        WebElement  kMenu = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[1]/div[2]/article[2]/div[1]/div[1]/div[2]/div[9]/div[1]/div[2]/div[2]/a"));
        actions.moveToElement(kMenu).click().perform();

        WebElement steikIzBaraniny = driver.findElement(By.xpath("(//button[@class='btn btn-yellow btn-sm btn-addcart'])[1]"));
        steikIzBaraniny.click();
        steikIzBaraniny.click();
      steikIzBaraniny.click();
        steikIzBaraniny.click();

        WebElement ovoshShashlyk = driver.findElement(By.xpath("(//button[@class='btn btn-yellow btn-sm btn-addcart'])[14]"));
        actions.moveToElement(ovoshShashlyk).click().perform();
        ovoshShashlyk.click();
        ovoshShashlyk.click();
      ovoshShashlyk.click();
        ovoshShashlyk.click();

        WebElement setSherfan = driver.findElement(By.xpath("(//button[@class='btn btn-yellow btn-sm btn-addcart'])[21]"));
        actions.moveToElement(setSherfan).click().perform();
        setSherfan.click();
        setSherfan.click();
       setSherfan.click();
       //setSherfan.click();
       //setSherfan.click();

        WebElement korzina = driver.findElement(By.xpath("//div[@class='pulse2']"));
        korzina.click();

        WebElement oformit = driver.findElement(By.xpath("//a[@href='https://dostavka312.kg/cart']"));
        // driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(15)));
        oformit.click();

        WebElement minus = driver.findElement(By.xpath("(//button[@class='btn btn-default btn-xs b_quantity'])[1]"));
        minus.click();
        minus.click();
        minus.click();
        minus.click();

        WebElement plus = driver.findElement(By.xpath("(//button[@class='btn btn-default btn-xs b_quantity'])[2]"));
        plus.click();
        plus.click();
        plus.click();
       plus.click();
        plus.click();
        plus.click();
        plus.click();
        plus.click();

        WebElement fullname = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
        fullname.sendKeys("Барсбек");

        WebElement email = driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
        email.sendKeys("samat.123@gmail.com");

        WebElement telefon = driver.findElement(By.xpath("(//input[@class='form-control'])[3]"));
        telefon.sendKeys("+996999502669");

        WebElement sdacha = driver.findElement(By.xpath("(//input[@class='form-control'])[4]"));
        sdacha.sendKeys("20000");

        WebElement sms = driver.findElement(By.xpath("//textarea[@class='form-control']"));
        sms.sendKeys("Здарвствуйте можете позвонить быстрее");
        driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(25)));
        WebElement button = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
        button.click();



    }

}
