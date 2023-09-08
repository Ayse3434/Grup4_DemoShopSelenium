package com.demoShop.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "Email")
    public WebElement emailBtn;
    @FindBy(id = "Password")
    public WebElement passwordBtn;
    @FindBy(xpath = "//input[@class='button-1 login-button']")
    public WebElement loginBtn;
    @FindBy(xpath = "//a[text()='grup4@gmail.com']")
    public WebElement loginVerify;

    public  void loginVerifyMethod(){
        String expectedLogin="grup4@gmail.com";
        String actualLogin=loginVerify.getText();
        Assert.assertTrue(actualLogin.contains(expectedLogin));
    }


}
