package Test;

import dataproviders.dataProviders;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.HeaderPage;
import pageObject.Product;
import pageObject.loginPage;
import pojo.ValueCurrency;

import java.util.concurrent.TimeUnit;

public class CurrencyTest extends baseTest{

    @Test(dataProvider = "getCurrency", dataProviderClass = dataProviders.class)
    public void Currency(ValueCurrency _ValueCurrency) throws InterruptedException {
        HeaderPage headerPage = new HeaderPage(baseURL, driver);
        loginPage lp = new loginPage(baseURL, driver);
        Product p = new Product(baseURL, driver);
        headerPage.waitUntilkElementExists(headerPage.displaylabel());
        Assert.assertEquals(headerPage.displaylabel().isDisplayed(), true);
        headerPage.clickMicuenta();
        headerPage.clicklogin();
        lp.insertEmail(_ValueCurrency.getEmail());
        lp.insertPassword(_ValueCurrency.getPass());
        lp.clickLoginButton();
        p.insertProduct(_ValueCurrency.getProduct());
        p.clickbtnSearch();
        p.clickinfoProducto();
        headerPage.clickbtnCurrency();
        headerPage.clickbtnEuro();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        p.displayCurrency().getText().contains(_ValueCurrency.getEuro());

        headerPage.clickbtnCurrency();
        headerPage.clickbtnsterling();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


        p.displayCurrency().getText().contains(_ValueCurrency.getSterling());

        headerPage.clickbtnCurrency();
        headerPage.clickbtnUs();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        p.displayCurrency().getText().contains(_ValueCurrency.getUs());
    }
}
