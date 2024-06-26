package com.demoqa.pages;

import  com.demoqa.entities.TextBoxEntity;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Locale;


public class TextBoxPage extends BasePage {
    //  внутри этого класса мы будем хранить только те элементы которые будут пренадлежать только этому классу в нашем случае это TextBox

    @FindBy(id = "userName")
    public WebElement userNameInput;

    @FindBy(id = "userEmail")
    public WebElement userEmailInput;

    @FindBy(id = "currentAddress")
    public WebElement currentAddressInput;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddressInput;

    @FindBy(id = "submit")
    public WebElement submitBtn;



    public TextBoxPage fillUpTextBoxForm(String fullName,String email,String currentAddress,String permanentAddress){
    webElementActions.sendKeys(userNameInput,fullName)
            .sendKeys(userEmailInput,email)
            .sendKeys(currentAddressInput,currentAddress)
            .sendKeys(permanentAddressInput,permanentAddress)
            .click(submitBtn);
    return this;

    }
    public TextBoxPage fillUpTextBoxForm(TextBoxEntity textBoxEntity){
        webElementActions.sendKeys(userNameInput,textBoxEntity.getFullName())
                .sendKeys(userEmailInput,textBoxEntity.getEmail())
                .sendKeys(currentAddressInput,textBoxEntity.getCurrentAddress())
                .sendKeys(permanentAddressInput,textBoxEntity.getPermanentAddress())
                .click(submitBtn);
        return this;
    }
}
