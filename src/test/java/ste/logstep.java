package ste;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.PendingException;

public class logstep {
    @Given("user on login page")
    public void userOnLoginPage() {
        System.out.println("userOnLoginPage");
    }


    @When("user enter username and password")
    public void userEnterUsernameAndPassword() {
        System.out.println("userEnterUsernameAndPassword");

    }

    @And("clicks on login button")
    public void clicksOnLoginButton() {
        System.out.println("clicksOnLoginButton");

    }

    @Then("user navigated to homepage")
    public void userNavigatedToHomepage() {
        System.out.println("userNavigatedToHomepage");

    }

    @Then("error displayed")
    public void errorDisplayed() {
        System.out.println("errorDisplayed");
    }
}
