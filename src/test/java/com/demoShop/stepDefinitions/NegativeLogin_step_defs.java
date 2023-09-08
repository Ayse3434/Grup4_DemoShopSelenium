package com.demoShop.stepDefinitions;

import com.demoShop.pages.HomePage;
import com.demoShop.pages.LoginPage;
import com.demoShop.utilities.ConfigurationReader;
import com.demoShop.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NegativeLogin_step_defs {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    @Given("kullanıcı {string} anasayfasina gider")
    public void kullanıcı_anasayfasina_gider(String url) {
        Driver.get().get(ConfigurationReader.get(url));
    }
    @Then("anasayfada login linline click yapar")
    public void anasayfada_login_linline_click_yapar() {
        homePage.loginLink.click();
    }
    @Then("email kutusuna {string} yazar ve password kutusuna {string} yazar")
    public void email_kutusuna_yazar_ve_password_kutusuna_yazar(String email, String password) {
        loginPage.emailBtn.sendKeys(email);
        loginPage.passwordBtn.sendKeys(password);
    }
    @When("login butonuna basar")
    public void login_butonuna_basar() {
        loginPage.loginBtn.click();
    }
    @Then("başarısız mesaj {string} aldığını test eder")
    public void başarısız_mesaj_aldığını_test_eder(String mesaj) {

    }
}
