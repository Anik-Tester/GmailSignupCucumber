package Pages;


import helpers.DriverFactory;

import helpers.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage {


    WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    By emailById = By.id("Email");
    By passwordById=By.id("Passwd");
    By nextById = By.id("next");
    By signInById = By.id("signIn");


    public void gotToGmailSignInPage(String url)
    {
     driver.get(url);
    }

    public void enterEmailAddress(String emailid)
    {
        driver.findElement(emailById).sendKeys(emailid);

    }

    public void enterPassword(String password)
    {
        driver.findElement(passwordById).sendKeys(password);

    }

    private void clickNext()
    {
        driver.findElement(nextById).click();
    }

    private void clickSigin()
    {
        driver.findElement(signInById).click();
    }

    public void performLoginUsingValidInput(String emailid,String password) throws InterruptedException {
        enterEmailAddress(emailid);
        clickNext();
        new Waits().waitFor(driver,10).until(ExpectedConditions.visibilityOfElementLocated(passwordById));
        //Thread.sleep(2000);
        enterPassword(password);
        clickSigin();
    }


}


