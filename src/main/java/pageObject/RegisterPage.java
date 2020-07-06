package pageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage extends BasePage {
    private By firsNametextBox = By.id("input-firstname");
    private By lastNametextBox = By.id("input-lastname");
    private By emailtextBox = By.id("input-email");
    private By telephone = By.id("input-telephone");
    private By passwordtextBox = By.id("input-password");
    private By passwordConfirmTextBox = By.id("input-confirm");
    private By radioButtonNo = By.name("newsletter");
    private By privacyBox = By.name("agree");
    private By btnContinuo = By.xpath("//div[@class='pull-right']//input[@value='Continue']");
    private By lblRegister = By.xpath("//div[@id='content']/child::h1");

    public RegisterPage(String _pageURL, WebDriver _driver) {
        super(_pageURL, _driver);
    }

    public WebElement setfirsNametextBox() {
        return driver.findElement(this.firsNametextBox);
    }

    public WebElement setlastNametextBox() {
        return driver.findElement(this.lastNametextBox);
    }

    public WebElement setemailtextBox() {
        return driver.findElement(this.emailtextBox);
    }

    public WebElement settelephone() {
        return driver.findElement(this.telephone);
    }

    public WebElement setpasswordtextBox() {
        return driver.findElement(this.passwordtextBox);
    }

    public WebElement setpasswordConfirmTextBox() {
        return driver.findElement(this.passwordConfirmTextBox);
    }

    public WebElement setprivacyBox() {
        return driver.findElement(this.privacyBox);
    }

    public WebElement setradioButtonNo() {
        return driver.findElement(this.radioButtonNo);
    }

    public WebElement setbtnContinuo() {
        return driver.findElement(this.btnContinuo);
    }

    public WebElement displayAlertMessage() {
        return driver.findElement(lblRegister);

    }


    @Step
    public void insertName(String name) {
        setfirsNametextBox().sendKeys(name);
    }

    @Step
    public void insertLastname(String lastname) {
        setlastNametextBox().sendKeys(lastname);
    }

    @Step
    public void insertEmail(String email) {
        setemailtextBox().sendKeys(getSaltString() + email);

    }

    @Step
    public void insertelephone(String telephone) {
        settelephone().sendKeys(telephone);
    }

    @Step
    public void insertpass(String pass) {
        setpasswordtextBox().sendKeys(pass);
    }

    @Step
    public void insertRepass(String repass) {
        setpasswordConfirmTextBox().sendKeys(repass);
    }

    @Step
    public void clickradioButtonNo() {
        setradioButtonNo().click();
    }

    @Step
    public void clickprivacyBox(){
        setprivacyBox().click();
    }

    @Step
    public void clickbtnContinuo(){
        setbtnContinuo().click();
    }



}
