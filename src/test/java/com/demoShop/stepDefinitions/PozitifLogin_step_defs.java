package com.demoShop.stepDefinitions;

import com.demoShop.pages.HomePage;
import com.demoShop.pages.LoginPage;
import com.demoShop.utilities.ConfigurationReader;
import com.demoShop.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PozitifLogin_step_defs {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Given("Kullanıcı {string} anasayfasina gider")
    public void kullanıcı_anasayfasina_gider(String url) {
        Driver.get().get(ConfigurationReader.get(url));
    }

    @Then("Anasayfada login linline click yapar")
    public void anasayfada_login_linline_click_yapar() {
        homePage.loginLink.click();
    }

    @Then("email kutusuna {string} yazar")
    public void email_kutusuna_yazar(String email) {
        loginPage.emailBtn.sendKeys(email);
    }

    @Then("password kutusuna {string} yazar")
    public void password_kutusuna_yazar(String password) {
        loginPage.passwordBtn.sendKeys(password);
    }

    @When("login butoonuna basar")
    public void login_butoonuna_basar() {
        loginPage.loginBtn.click();
    }

    @Then("başarılı olarak giriş yapabildiğini test eder")
    public void başarılı_olarak_giriş_yapabildiğini_test_eder() {
        loginPage.loginVerifyMethod();
    }

}
