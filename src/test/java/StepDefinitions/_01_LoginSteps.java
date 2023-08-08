package StepDefinitions;
import Pages.DialogContent;
import Utilities.BaseDriver;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _01_LoginSteps {
    DialogContent dc =new DialogContent();
    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        BaseDriver.getDriver().get("https://test.mersys.io/");
    }
    @Given("Enter username and password")
    public void enter_username_and_password() {
        DialogContent dc =new DialogContent();
        dc.username.sendKeys("turkeyts");
        dc.password.sendKeys("TechnoStudy123");

    }
    @When("Click on login button")
    public void click_on_login_button() {
        dc.loginButton.click();


    }
    @Then("Usesr should login succesfully")
    public void usesr_should_login_succesfully() {
        WebDriverWait wait= new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(dc.dashBoard));
        Assert.assertTrue(dc.dashBoard.isDisplayed());

    }



}
