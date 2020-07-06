package Test;

import dataproviders.dataProviders;
import org.testng.Assert;

import org.testng.annotations.*;
import pageObject.HeaderPage;
import pageObject.Product;
import pageObject.loginPage;
import pojo.searchProduct;

import java.util.concurrent.TimeUnit;

public class SearchProductTest extends baseTest {
    @Test(dataProvider = "getSearchProduct", dataProviderClass = dataProviders.class)
    public void searchProduct(searchProduct _searchProduct) throws InterruptedException {
        
        
        
        HeaderPage headerPage = new HeaderPage(baseURL, driver);
        loginPage lp = new loginPage(baseURL, driver);
        Product p = new Product(baseURL, driver);
        headerPage.waitUntilkElementExists(headerPage.displaylabel());

        Assert.assertEquals(headerPage.displaylabel().isDisplayed(), true);

        headerPage.clickMicuenta();
        headerPage.clicklogin();
        lp.insertEmail(_searchProduct.getEmail());
        lp.insertPassword(_searchProduct.getPass());
        lp.clickLoginButton();
        p.insertProduct(_searchProduct.getProduct());
        p.clickbtnSearch();
        p.clickinfoProducto();
        p.ClickaaddCart();
        headerPage.clickbtnShoppingCart();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assert.assertEquals(p.displaymessagegood().isDisplayed(),true);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        Assert.assertEquals(p.displaymessagefail().getText(),"Products marked with *** are not available in the desired quantity or not in stock!\n" +
                "×");
    }
}
