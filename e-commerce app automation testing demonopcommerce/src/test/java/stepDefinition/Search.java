package stepDefinition;

import Pages.HomePage;
import Pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
    SearchPage searchPage=new SearchPage(Hooks.driver);
    HomePage homePage=new HomePage(Hooks.driver);
    @When("user click on search field")

    public void clickSearch(){
        homePage.click_Search_field();
    }
    @And("^user search with Item name\"(.*?)\"")

    public void searchWithItemName(String itemName){

        homePage.Enter_item_Name(itemName);
    }
    @And("user click on search button")

    public void clickSearchButton(){
        homePage.clickSearchButton();
    }
    @Then("user should find relative result")

    public void findResults(){
        searchPage.results();



    }
}
