package helpers;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory  {

    WebDriver driver;

    public WebDriver createNewDriverInstance() {
        System.getProperty("webdriver.gecko.driver", "/src/main/resource/geckodriver.exe");
        driver = new FirefoxDriver();

        return driver;
    }


    public void destroyDriver(WebDriver driver) {
        driver.close();
        driver.quit();

        driver = null;
    }
}