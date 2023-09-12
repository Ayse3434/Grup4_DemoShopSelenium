package com.demoShop.stepDefinitions;

import com.demoShop.pages.LoginPage;
import com.demoShop.pages.SortByPage;
import com.demoShop.utilities.BrowserUtils;
import com.demoShop.utilities.ConfigurationReader;
import com.demoShop.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class SortBy_step_defs {

    LoginPage loginPage = new LoginPage();

    SortByPage sortByPage = new SortByPage();



    @Given("kullanıcı web sitesine gider")
    public void kullanıcı_web_sitesine_gider() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("Kullanici navigate to hover {string} and click {string}")
    public void kullanici_navigate_to_hover_and_click(String menu, String hoverMenu) {
        loginPage.navigateMenu(menu, hoverMenu);
    }

    @Then("Siralamanin görüntülendiğini ve Position olarak seçildiğini doğrulayın olarak seçildiğini doğrulayın")
    public void siralamanin_görüntülendiğini_ve_position_olarak_seçildiğini_doğrulayın_olarak_seçildiğini_doğrulayın() {
        Select select = new Select(sortByPage.order);
        Assert.assertTrue(sortByPage.position.isDisplayed());
        String actSelect = select.getFirstSelectedOption().getText();
        Assert.assertEquals("Position", actSelect);
    }

    @When("Kullanici sıralama türünü {string} ye göre seçer")
    public void kullanici_sıralama_türünü_ye_göre_seçer(String sortType) {
        Select select = new Select(sortByPage.order);
        select.selectByVisibleText(sortType);
        BrowserUtils.waitFor(2);
    }

    @Then("Ürünlerin Name \\(A-Z) göre siralandiğini doğrulayin")
    public void ürünlerin_name_a_z_göre_siralandiğini_doğrulayin() {
        Assert.assertFalse(sortByPage.isimlereGoreSiparis_mtd());
    }

    @Then("Ürünlerin Name \\(Z-A) göre siralandığını doğrulayin")
    public void ürünlerin_name_z_a_göre_siralandığını_doğrulayin() {
        Assert.assertTrue(sortByPage.isimlereGoreSiparis_mtd());
    }

    @Then("Ürünlerin Price \\(Low-High) göre siralandiğini doğrulayin")
    public void ürünlerin_price_low_high_göre_siralandiğini_doğrulayin() {
        Assert.assertTrue(sortByPage.fiyataGoreSiparis_mtd());
    }
    @Then("Ürünlerin Price \\(High > Low) göre siralandiğini doğrulayin")
    public void ürünlerin_price_high_low_göre_siralandiğini_doğrulayin() {
        Assert.assertTrue(sortByPage.fiyataGoreSiparis_mtd());
    }







}
