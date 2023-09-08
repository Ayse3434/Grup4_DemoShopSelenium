package com.demoShop.stepDefinitions;

import com.demoShop.pages.RegisterPage;
import com.demoShop.utilities.ConfigurationReader;
import com.demoShop.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Register_step_defs {
    RegisterPage registerPage=new RegisterPage();
    @Given("The user navigate to web page url")
    public void the_user_navigate_to_web_page_url() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
    }
    @When("The user Click to register link")
    public void the_user_click_to_register_link() {

        registerPage.registerLinkBtn.click();
    }
    @When("The user click to gender button")
    public void the_user_click_to_gender_button() {
        registerPage.genderCheckBtn.click();
    }
    @When("The user enters to first name box")
    public void the_user_enters_to_first_name_box() {
        registerPage.firstNameInbox.sendKeys("grup4");
    }
    @When("The user enters to last name box")
    public void the_user_enters_to_last_name_box() {
        registerPage.lastNameInbox.sendKeys("test");
    }
    @When("The user enters to email box")
    public void the_user_enters_to_email_box() {
        registerPage.emailInbox.sendKeys("grup4@gmail.com");
    }
    @When("The user enters to password box")
    public void the_user_enters_to_password_box() {
        registerPage.passwordInbox.sendKeys("123456");
    }
    @When("The user enters to confirm password box")
    public void the_user_enters_to_confirm_password_box() {
        registerPage.confirmPasswordInbox.sendKeys("123456");
    }

    @When("The user click to register button")
    public void the_user_click_to_register_button() {
        registerPage.registerBtn.click();

    }

    @Then("Verify to text message Your registration completed")
    public void verifyToTextMessageYourRegistrationCompleted() {
        registerPage.registerCompleteText.isDisplayed();

    }

    @When("And The user enters credentials {string}, {string}, {string}, {string},{string} in field")
    public void andTheUserEntersCredentialsInField(String firstName, String lastName, String email, String password, String confirmpassword) {
        registerPage.firstNameInbox.sendKeys(firstName);
        registerPage.lastNameInbox.sendKeys(lastName);
        registerPage.emailInbox.sendKeys(email);
        registerPage.passwordInbox.sendKeys(password);
        registerPage.confirmPasswordInbox.sendKeys(confirmpassword);

    }

    @Then("The warning message contains {string}")
    public void theWarningMessageContains(String message) {
        Assert.assertTrue(registerPage.firstNameWrongMsj.isDisplayed());
        registerPage.lastNameWrongMsj.isDisplayed();
        registerPage.emailWrongMsj.isDisplayed();
        registerPage.emailWrongMsj2.isDisplayed();
        registerPage.passwordWrongMsj.isDisplayed();
        registerPage.confirmPasswordWrongMsj.isDisplayed();
        registerPage.confirmPasswNotMatchWrongMsj.isDisplayed();

    }
}
