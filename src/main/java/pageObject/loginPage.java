package pageObject;


import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class loginPage extends BasePage {

    private By emailTextBox = By.id("input-email");

    private By passwordTextBox = By.id("input-password");

    private By loginButton = By.xpath("//input[@type='submit']");

    public loginPage(String url, WebDriver driver) {
        super(url, driver);

    }

    public WebElement setEmailTextBox() {
        return driver.findElement(this.emailTextBox);

    }

    public WebElement setPasswordTextBox() {
        return driver.findElement(this.passwordTextBox);

    }

    public WebElement setLoginButton() {
        return driver.findElement(this.loginButton);

    }

    @Step
    public void insertEmail(String username) {
        setEmailTextBox().sendKeys(username);

    }

    @Step
    public void insertPassword(String password) {
        setPasswordTextBox().sendKeys(password);
    }

    @Step
    public void clickLoginButton() {
        setLoginButton().click();

    }


}
