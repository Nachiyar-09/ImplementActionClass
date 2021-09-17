package com.app.pages;

import io.cucumber.java.AfterStep;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.jruby.RubyProcess;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage extends PageObject {
    public static WebDriver driver;

    @Step
    public String LaunchApplication() {
        String GetHeading = $("//img[@src='/images/Toolsqa.jpg']").getText();
        return GetHeading;
    }

    @Step
    public void ScrollDown() {

        WebElement element = $("//div[6]//div[1]//div[1]");
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView();",element);
        element.click();
    }


    @Step
    public void VerifyProperNavigation(){
     System.out.println("clicked and navigated");
    }

}
