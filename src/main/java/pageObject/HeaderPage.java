package pageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage {

    private By ddMicuenta = By.xpath("//li[@class='dropdown']//a[@href='https://demo.opencart.com/index.php?route=account/account']");
    private By opRegistrar = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[@href='https://demo.opencart.com/index.php?route=account/register']");
    private By assertLabel = By.id("logo");
    private By assertlabelCreated = By.xpath("//div[@id='content']//h1");
    private By btnlogout = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[@href='https://demo.opencart.com/index.php?route=account/logout']");
    private By login = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[@href='https://demo.opencart.com/index.php?route=account/login']");
    private By ShoppingCart = By.xpath("//a[@href='https://demo.opencart.com/index.php?route=checkout/cart']");
    private By btnCurrency = By.xpath("//button[@class='btn btn-link dropdown-toggle']");
    private By opEuro = By.xpath("//*[@id=\"form-currency\"]/div/ul/li[1]/button");
    private By opSterling = By.xpath("//*[@id=\"form-currency\"]/div/ul/li[2]/button");
    private By opUs = By.xpath("//*[@id=\"form-currency\"]/div/ul/li[3]/button");


    public HeaderPage(String url, WebDriver driver) {
        super(url, driver);
    }


    public WebElement setddMicuenta() {
        return driver.findElement(this.ddMicuenta);
    }

    public WebElement setopRegistrar() {
        return driver.findElement(this.opRegistrar);
    }

    public WebElement setbtnlogout() {
        return driver.findElement(this.btnlogout);
    }

    public WebElement setlogin() {
        return driver.findElement(this.login);
    }


    public WebElement setShoppingCart() {
        return driver.findElement(this.ShoppingCart);
    }

    public WebElement setbtncurrency() {
        return driver.findElement(this.btnCurrency);
    }

    public WebElement setopEuro() {
        return driver.findElement(this.opEuro);
    }

    public WebElement setopster() {
        return driver.findElement(this.opSterling);
    }

    public WebElement setopUs() {
        return driver.findElement(this.opUs);
    }


    @Step
    public void clickMicuenta() {
        setddMicuenta().click();

    }

    @Step
    public void clickopRegistrar() {
        setopRegistrar().click();

    }

    @Step
    public void clicklogout() {
        setbtnlogout().click();

    }

    @Step
    public void clicklogin() {
        setlogin().click();

    }


    @Step
    public void clickbtnShoppingCart() {
        setShoppingCart().click();
    }

    @Step
    public void clickbtnCurrency() {
        setbtncurrency().click();
    }

    @Step
    public void clickbtnEuro() {
        setopEuro().click();
    }

    @Step
    public void clickbtnsterling() {
        setopster().click();
    }

    @Step
    public void clickbtnUs() {
        setopUs().click();
    }

    public WebElement displaylabel() {
        return driver.findElement(assertLabel);

    }

    public WebElement displaylabelcreated() {
        return driver.findElement(assertlabelCreated);

    }

}
