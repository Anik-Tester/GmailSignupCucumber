package steps;
import Pages.LoginPage;
import Utils.Constants;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.DriverFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class GmailSigninStep extends DriverFactory {

    WebDriver driver = new DriverFactory().createNewDriverInstance();



    @Given("^you have successfully accessed Gmail Sigin page$")
    public void youHaveSuccessfullyAccessedGmailSiginPage() {

      new LoginPage(driver).gotToGmailSignInPage(Constants.GMAIL_URL);
      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }

    @When("^you enter valid inputs$")
    public void youEnterValidInputs() throws Throwable {

      new LoginPage(driver).performLoginUsingValidInput(Constants.EMAIL_ID,Constants.PASSWORD);

    }


    @Then("^user should be logged in successfully and navigated to mailbox$")
    public void userShouldBeLoggedInSuccessfullyAndNavigatedToMailbox() throws Throwable {

    }


}
