package com.demoShop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(xpath = "//div[@class='header-logo']")
    public WebElement demoWebLogo;

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement loginLink;

    @FindBy(xpath = "//span[text()='Shopping cart']")
    public WebElement shoppingCartLink;




}
