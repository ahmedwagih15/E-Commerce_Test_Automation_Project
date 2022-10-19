package stepDefinition;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class ChangeCurrency {
    HomePage homePage=new HomePage(Hooks.driver);
    @When("user click on the currency")

    public void clickCurrency() throws InterruptedException {
        homePage.ClickCurrencyList();
        Thread.sleep(4000);
    }
    @And("user change currency to Euro")

    public void changeToEuro() throws InterruptedException {
        homePage.changeCurrencyTo_Euro();
        Thread.sleep(4000);
    }
    @Then("user found all prices in Euro")

    public void PricesInEuro() throws InterruptedException {
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(true,homePage.itemsInEuro().contains("€"));
        Thread.sleep(4000);
        System.out.println(homePage.itemsInEuro());
    }
    @And("user change currency to dollar")

    public void changeToDollar() throws InterruptedException {
        homePage.changeCurrencyTo_Dollar();
        Thread.sleep(4000);
    }
    @Then("user found all prices in dollar")

    public void PricesInDollar() throws InterruptedException {
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(true,homePage.itemsInDollar().contains("$"));
        Thread.sleep(4000);
        System.out.println(homePage.itemsInEuro());
        softAssert.assertAll();
    }
}
