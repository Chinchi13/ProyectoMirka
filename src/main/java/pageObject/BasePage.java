package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class BasePage {
    public String pageURL;
    public WebDriver driver;
    WebDriverWait wait;

    public BasePage(String _pageURL, WebDriver _driver){
        this.pageURL = _pageURL;
        this.driver = _driver;
        wait = new WebDriverWait(driver, 20);
    }
    public BasePage(WebDriver _driver){
        this.driver = _driver;

    }
    public void loadPage() {
        driver.navigate().to(pageURL) ;


    }

    public void moveMouse(WebElement element) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfAllElements(element));

        wait.until(ExpectedConditions.visibilityOf(element));

        wait.until(ExpectedConditions.elementToBeClickable(element));
        TimeUnit.SECONDS.sleep(3);

        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }
    public void waitUntilkElementExists(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(element));

    }



    protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }






}


