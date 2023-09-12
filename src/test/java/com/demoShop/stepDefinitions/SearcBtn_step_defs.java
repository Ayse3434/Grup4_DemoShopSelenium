package com.demoShop.stepDefinitions;

import com.demoShop.pages.SearchPage;
import com.demoShop.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SearcBtn_step_defs {
    SearchPage searchPage=new SearchPage();
    
    @Then("{string} icin arama yapar")
    public void icin_arama_yapar(String arananlar) {
       searchPage.searcnBtn.sendKeys(arananlar);
       searchPage.submitBtn.click();
    }
    @Then("sonucun {string} icerdigini test eder")
    public void sonucun_icerdigini_test_eder(String arananlar) {
         Assert.assertTrue(searchPage.arananText.getText().contains(arananlar));
    }

    @Then("Kullanıcı aradıgı ürünü bulamadığında {string} alabilmeli")
    public void kullanıcı_aradıgı_ürünü_bulamadığında_alabilmeli(String hataMsj) {
        Assert.assertEquals(hataMsj,searchPage.msjText.getText());
    }





}
