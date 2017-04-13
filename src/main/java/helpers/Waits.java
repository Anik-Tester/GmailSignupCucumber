package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

    WebDriverWait wait;

    public WebDriverWait waitFor(WebDriver driver,int time) {
        return  wait = new WebDriverWait(driver,time);
    }
}
