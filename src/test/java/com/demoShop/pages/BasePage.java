package com.demoShop.pages;

import com.demoShop.utilities.BrowserUtils;
import com.demoShop.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//a[contains(text(),'Computers')])[1]")
    public WebElement menu;
    @FindBy(xpath = "(//a[contains(text(),'Cell phones')])[1]")
    public WebElement hoverMenu;

    public void navigateMenu(String menu, String hoverMenu) {
        BrowserUtils.waitFor(1);
        WebElement element = Driver.get().findElement(By.xpath("(//a[contains(text(),'"+menu+"')])[1]"));
        if (menu.equals("Computers") || menu.equals("Electronics")) {
            BrowserUtils.hover(element);
            Driver.get().findElement(By.xpath("(//a[contains(text(),'"+hoverMenu+"')])[1]")).click();
        } else {
            element.click();
        }

    }


}
