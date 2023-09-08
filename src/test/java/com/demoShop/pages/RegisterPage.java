package com.demoShop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{
    @FindBy(xpath = "//a[text()='Register']")
    public WebElement registerLinkBtn;

    @FindBy(id = "gender-male")
    public WebElement genderCheckBtn;

    @FindBy(id = "FirstName")
    public WebElement firstNameInbox;

    @FindBy(id = "LastName")
    public WebElement lastNameInbox;

    @FindBy(id = "Email")
    public WebElement emailInbox;

    @FindBy(id = "Password")
    public WebElement passwordInbox;

    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPasswordInbox;

    @FindBy(id = "register-button")
    public WebElement registerBtn;

    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    public WebElement registerCompleteText;

    @FindBy(xpath = "//span[@for='FirstName']")
    public WebElement firstNameWrongMsj;

     @FindBy(xpath = "//span[@for='LastName']")
    public WebElement lastNameWrongMsj;

     @FindBy(xpath = "//span[@for='Email']")
    public WebElement emailWrongMsj;

     @FindBy(xpath = "//span[@for='Email']")
    public WebElement emailWrongMsj2;

     @FindBy(xpath = "//span[@for='Password']")
    public WebElement passwordWrongMsj;

    @FindBy(xpath = "//span[@for='ConfirmPassword']")
    public WebElement confirmPasswordWrongMsj;

    @FindBy(xpath = "//span[@for='ConfirmPassword']")
    public WebElement confirmPasswNotMatchWrongMsj;

}
