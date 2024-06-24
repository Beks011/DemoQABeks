package com.demoqa.pages;

import com.demoqa.drivers.DriverManager;
import com.demoqa.entities.PractiseFormEntity;
import com.demoqa.helper.DropDownHelper;
import com.demoqa.utils.RandomUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PracticeFormPage extends BasePage{
    @FindBy(id = "firstName")
    public WebElement firstNameInput;

    @FindBy(id = "lastName")
    public WebElement lastnameInput;

    @FindBy(id = "userEmail")
    public WebElement userEmailInput;

    @FindBy(xpath = "//label[contains(@for, 'gender-radio')]")
    public List <WebElement> genderBtn;

    @FindBy(id = "userNumber")
    public WebElement userNumberInput;

    @FindBy(id = "dateOfBirthInput")
    public WebElement birthInput;

    @FindBy(id = "subjectsInput")
    public WebElement subjectsInput;

    @FindBy(xpath = ("//label[contains(text(),'Sports')]"))
    public WebElement hobbiesInput;

    @FindBy(id = "currentAddress")
    public WebElement currentAddressInput;

    @FindBy(id = "react-select-3-input")
    public WebElement stateInput;

    @FindBy(id = "react-select-4-input")
    public WebElement cityInput;

    @FindBy(id = "submit")
    public WebElement submitBtn;

    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement closeAlert;

    @FindBy(className = "react-datepicker__input-container")
    public WebElement datePickerBtn;



    public PracticeFormPage fillUpPracticeFormPage(PractiseFormEntity practiseFormEntity){
        webElementActions.sendKeys(firstNameInput,practiseFormEntity.getFirstName())
                .sendKeys(lastnameInput,practiseFormEntity.getLastName())
                .sendKeys(userEmailInput,practiseFormEntity.getEmail())
                .click(genderBtn.get(random.nextInt(genderBtn.size())))
                .sendKeys(userNumberInput,practiseFormEntity.getNumber())
                .sendKeys(subjectsInput,practiseFormEntity.getSubject())
                .click(hobbiesInput)
                .sendKeys (currentAddressInput,practiseFormEntity.getCurrentAddress())
                .sendKeysWithEnter(stateInput,practiseFormEntity.getState())
                .sendKeysWithEnter(cityInput,practiseFormEntity.getCity())
                .click(submitBtn)
                .click(closeAlert);
        return this;


    }

    public PracticeFormPage selectDateMonthYear(String dateMonthYear){
        String [] dateMonthYearParts = dateMonthYear.split(" ");
        String date = dateMonthYearParts[0];
        String month = dateMonthYearParts[1];
        String year= dateMonthYearParts[2];

        webElementActions.click(datePickerBtn);

        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        WebElement monthDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("react-datepicker__month-select")));
        WebElement yearDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("react-datepicker__year-select")));
        dropDownHelper.selectByVisibleText(monthDropDown,month)
                .selectByVisibleText(yearDropDown,year);
        WebElement day = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath(
"//div[contains(@class,'react-datepicker__day') and not (contains(@class,'react-datepicker__day--outside-month')) and text()='4']"
                )

        ));
        webElementActions.click(day);
        return this;
    }
}
