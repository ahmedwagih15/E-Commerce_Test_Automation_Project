package stepDefinition;

import Pages.HomePage;
import Pages.ItemPage;
import Pages.WishListPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class WishList {
    HomePage homePage=new HomePage(Hooks.driver);
    ItemPage itemPage=new ItemPage(Hooks.driver);
    WishListPage wishListPage=new WishListPage(Hooks.driver);
    @Given("user click on wishlist button on specific item")

    public void clickOnWishlistButton() throws InterruptedException {
        homePage.ClickWishlistButton();
        itemPage.clickOnWishlistButton();
    }
    @When("user click on wishlist")

    public void ClickOnWishlist() throws InterruptedException {
        itemPage.ClickWishlistlink();
    }
    @And("user count numbers of quantities")

    public void theNumOFQuantities() throws InterruptedException {
        wishListPage.findQuantities();
    }
}
