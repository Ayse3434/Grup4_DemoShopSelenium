package com.demoShop.stepDefinitions;

import com.demoShop.pages.LoginPage;
import com.demoShop.utilities.ConfigurationReader;
import com.demoShop.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SortBy_step_defs {

    LoginPage loginPage=new LoginPage();

    @Given("kullanıcı web sitesine gider")
    public void kullanıcı_web_sitesine_gider() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("kullanıcı navigate to hover {string} and click {string}")
    public void kullanıcı_navigate_to_hover_and_click(String menu, String hoverMenu) {
        loginPage.navigateMenu(menu, hoverMenu);
    }

}
