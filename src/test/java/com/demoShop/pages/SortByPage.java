package com.demoShop.pages;

import com.demoShop.utilities.BrowserUtils;
import com.demoShop.utilities.Driver;
import com.google.common.collect.Ordering;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SortByPage extends BasePage{
    @FindBy(id = "products-orderby")
    public WebElement position;

    @FindBy(id = "products-orderby")
    public WebElement order;
    public boolean isimlereGoreSiparis_mtd() {
        String isim = "";
        List<String> isimList = new ArrayList<>();
        WebElement webElement;
        for (int i = 1; i < 8; i++) {
            BrowserUtils.scrollToElement(Driver.get().findElement(By.xpath("(//h2[@class='product-title'])[" + i + "]")));
            webElement = Driver.get().findElement(By.xpath("(//h2[@class='product-title'])[" + i + "]"));
            isim = webElement.getText();
            isimList.add(i - 1, isim);
        }
        return Ordering.natural().isOrdered(isimList);
    }
    public boolean fiyataGoreSiparis_mtd() {
        String fiyat = "";
        List<String> tumFiyat = new ArrayList<>();
        WebElement webElement;
        for (int i = 1; i < 8; i++) {
            BrowserUtils.scrollToElement(Driver.get().findElement(By.xpath("(//h2[@class='product-title'])[" + i + "]")));
            webElement = Driver.get().findElement(By.xpath("(//h2[@class='product-title'])[" + i + "]"));
           fiyat = webElement.getText();
            tumFiyat.add(i - 1, fiyat);
        }
        return Ordering.natural().isOrdered(tumFiyat);
    }
}
