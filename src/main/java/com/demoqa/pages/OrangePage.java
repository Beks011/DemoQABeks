package com.demoqa.pages;

import com.demoqa.drivers.DriverManager;
import com.demoqa.enums.PanelMenu;
import com.demoqa.enums.TopBarMenuEnams;
import com.fasterxml.jackson.databind.ObjectReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;



public class OrangePage extends BasePage {

    @FindBy(xpath = "//div[@class='oxd-topbar-body']")
    public WebElement topBarParent;
    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement userNameInput;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement userPasswordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitBtn;



    public OrangePage fillupRegistration() {
        webElementActions.sendKeys(userNameInput, "Admin")
                .sendKeys(userPasswordInput, "admin123")
                .click(submitBtn);
        return this;
    }

    public OrangePage fillupPanelMenu(PanelMenu panelMenu) {
        WebElement element = DriverManager.getDriver().findElement(By.xpath("//ul[@class='oxd-main-menu']/li/a/span[text()='" + panelMenu.getPanelMenu() + "']"));
        element.click();
        return this;
    }


    public WebElement getNavigationBar() {
        return topBarParent;
    }
    /**
     * Кликает на элемент верхнего меню.
     *
     * @param topBarMenuEnams элемент верхнего меню.
     * @return текущий объект OrangeMenu для цепочного вызова методов.
     */
    public OrangePage clickMainMenuItem(TopBarMenuEnams topBarMenuEnams) {
        WebElement navBar = getNavigationBar();
        WebElement mainMenuItem = navBar.findElement(By.xpath(".//li/span[contains(text(), '" + topBarMenuEnams.getTopBarMenu() + "')]"));
        mainMenuItem.click();
        return this;
    }
    /**
     * Кликает на элемент подменю.
     *
     * @param topBarMenuItems имя элемента подменю.
     * @return текущий объект OrangeMenu для цепочного вызова методов.
     */
    public OrangePage clickSubMenuItem(String topBarMenuItems) {
        WebElement itemsBar = getNavigationBar();
        WebElement subMenuItemElement = itemsBar.findElement(By.xpath(".//li/a[contains(text(), '" +  topBarMenuItems + "')]"));
        subMenuItemElement.click();
        return this;
    }
    /**
     * Кликает на элемент верхнего меню и затем на элемент подменю.
     *
     * @param topBarMenuEnams    элемент верхнего меню.
     * @param topBarMenuItems имя элемента подменю.
     * @return текущий объект OrangeMenu для цепочного вызова методов.
     */
    public OrangePage clickMenuAndSubmenu(TopBarMenuEnams topBarMenuEnams, String topBarMenuItems) {
        clickMainMenuItem(topBarMenuEnams);
        clickSubMenuItem(topBarMenuItems);
        return this;
    }
}













