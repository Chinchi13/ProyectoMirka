package Test;

import dataproviders.dataProviders;
import org.testng.Assert;

import org.testng.annotations.*;
import pageObject.HeaderPage;
import pageObject.RegisterPage;
import pojo.RegisterData;

public class registerTest extends baseTest {


    @Test(dataProvider = "getWrongUserDataFromJson", dataProviderClass = dataProviders.class)
    public void allow_to_registrer(RegisterData _RegisterData) throws InterruptedException {
        HeaderPage headerPage = new HeaderPage(baseURL, driver);
        RegisterPage registerPage = new RegisterPage(baseURL, driver);

        headerPage.waitUntilkElementExists(headerPage.displaylabel());

        Assert.assertEquals(headerPage.displaylabel().isDisplayed(), true);

        headerPage.clickMicuenta();
        headerPage.clickopRegistrar();

        Assert.assertEquals(registerPage.displayAlertMessage().isDisplayed(), true);
        registerPage.insertName(_RegisterData.getName());
        registerPage.insertLastname((_RegisterData.getLastname()));

        registerPage.insertEmail(_RegisterData.getEmail());
        registerPage.insertelephone(_RegisterData.getTelephone());
        registerPage.insertpass(_RegisterData.getRepass());
        registerPage.insertRepass(_RegisterData.getRepass());
        registerPage.clickradioButtonNo();
        registerPage.clickprivacyBox();
        registerPage.clickbtnContinuo();

        Assert.assertEquals(headerPage.displaylabelcreated().isDisplayed(), true);

        headerPage.clickMicuenta();
        Assert.assertEquals(headerPage.setbtnlogout().isDisplayed(), true);

        headerPage.clicklogout();

    }

}
