package pageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Product extends BasePage {
    private By searchTextBox = By.xpath(" //div[@id='search']//input");
    private By btnSearch = By.xpath(" //span[@class='input-group-btn']//button");
    private By lbelMacbook = By.xpath("//div[@id='content']//h1");
    private By innfoProducto = By.xpath("//h4//a[text()='MacBook']");
    private By alertSucess = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    private By btnAddCart = By.id("button-cart");
    private By assertTable = By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[2]");
    private By messagenull = By.xpath("//*[@id=\"checkout-cart\"]/div[1]");
    private By Currency = By.xpath("//ul[@class='list-unstyled']//h2");


    public Product(String url, WebDriver driver) {
        super(url, driver);
    }

    public WebElement searchTextBox() {
        return driver.findElement(this.searchTextBox);
    }

    public WebElement setbtnSearch() {

        return driver.findElement(this.btnSearch);
    }
    public WebElement setinfoProduct() {
        return driver.findElement(this.innfoProducto);

    }
    public WebElement setCurrency() {
        return driver.findElement(this.Currency);

    }
    public WebElement setaddCart() {

        return driver.findElement(this.btnAddCart);
    }
    public WebElement settable() {
        return driver.findElement(this.assertTable);

    }

    @Step
    public void insertProduct(String product) {
        searchTextBox().sendKeys(product);
    }

    @Step
    public void clickbtnSearch() {

        setbtnSearch().click();
    }
    @Step
    public void clickinfoProducto() {
        setinfoProduct().click();

    }

    @Step
    public void ClickaaddCart() {
        setaddCart().click();

    }

    public WebElement displaylbelMacbook() {
        return driver.findElement(lbelMacbook);

    }

    public WebElement displayalertSucess() {
        return driver.findElement(alertSucess);

    }

    public WebElement displaymessagefail() {
        return driver.findElement(messagenull);

    }

    public WebElement displaymessagegood() {

        return driver.findElement(assertTable);

    }

    public WebElement displayCurrency() {

        return driver.findElement(Currency);
    }


}