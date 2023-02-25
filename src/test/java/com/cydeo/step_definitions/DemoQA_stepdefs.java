package com.cydeo.step_definitions;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoQA_stepdefs {
    @Given("Navigate to {string} page")
    public void navigate_to_page(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("demo.qa.url"));
    }
    @When("Double click on button")
    public void double_click_on_button() {

    }
    @Then("Verify text double click message {string} should be visible")
    public void verify_text_double_click_message_should_be_visible(String string) {

    }
    @Then("Right click on button")
    public void right_click_on_button() {

    }
    @Then("Verify text right click message {string} should be visible")
    public void verify_text_right_click_message_should_be_visible(String string) {

    }
    @Then("Click Me button")
    public void click_me_button() {

    }
    @Then("Verify text click me message {string} should be visible")
    public void verify_text_click_me_message_should_be_visible(String string) {

    }
}
