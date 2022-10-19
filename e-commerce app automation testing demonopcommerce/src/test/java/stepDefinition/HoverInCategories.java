package stepDefinition;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class HoverInCategories {
    HomePage homePage=new HomePage(Hooks.driver);
    @When("user hover in categories")

    public void hovcat() throws InterruptedException {
        homePage.hover_in_categories();
    }
    @And("user hover in subcategories and clicks in one")

    public void Subcat() throws InterruptedException {
        homePage.click_on_subcategory();
    }
    @Then("user navigate to subcategory pages")

    public void navSubcat() throws InterruptedException {
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(true,homePage.getUrl().contains("shoes"));
        System.out.println(homePage.getUrl());
        softAssert.assertAll();
    }
}
