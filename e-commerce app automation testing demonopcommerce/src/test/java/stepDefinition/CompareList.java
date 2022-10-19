package stepDefinition;

import Pages.CellPhonesPage;
import Pages.CompareListPage;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class CompareList {
    HomePage homePage=new HomePage(Hooks.driver);
    CellPhonesPage cellPhonesPage=new CellPhonesPage(Hooks.driver);
    CompareListPage compareListPage=new CompareListPage(Hooks.driver);
    @Given("user add items to compare list")

    public void addItemsCompareList() throws InterruptedException {
        homePage.compareList_button();
        cellPhonesPage.ClickCompareButton();
    }
    @When("user click on compare list")

    public void ClickOnComparelist() throws InterruptedException {
        cellPhonesPage.goToCompareList();
    }
    @Then("user found items in compare list")

    public void foundItems(){
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(CellPhonesPage.item1Number.contains(compareListPage.item1_Num_Name()));
        System.out.println(CellPhonesPage.item1Number);
        System.out.println(compareListPage.item1_Num_Name());
        softAssert.assertAll();
    }
}
