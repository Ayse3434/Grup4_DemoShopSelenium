package com.demoShop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{
    @FindBy(xpath = "//input[@id='small-searchterms']")
    public WebElement searcnBtn;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitBtn;

    @FindBy(xpath = "(//h2[@class='product-title'])[1]")
    public  WebElement arananText;

    @FindBy(xpath = "//strong[@class='result']")
    public WebElement msjText;
}
