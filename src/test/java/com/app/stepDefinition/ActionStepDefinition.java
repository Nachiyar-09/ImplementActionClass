package com.app.stepDefinition;

import com.app.pages.LandingPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ActionStepDefinition {

     @Steps
    LandingPage landingPage;

    @Given("User navigates to the application")
    public void user_navigates_to_the_application() {
        landingPage.open();
      landingPage.LaunchApplication();

    }
    @When("User scroll down to the page")
    public void user_scroll_down_to_the_page() {
        landingPage.ScrollDown();
    }

    @Then("user click on the Bank card available in the bottom of the page")
    public void user_click_on_the_bank_card_available_in_the_bottom_of_the_page() {
    landingPage.VerifyProperNavigation();
    }
}
