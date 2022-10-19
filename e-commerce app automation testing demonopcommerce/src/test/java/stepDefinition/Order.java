package stepDefinition;

import Pages.ConfirmOrder;
import Pages.ShoppingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Order {
    ShoppingPage shoppingPage=new ShoppingPage(Hooks.driver);
    ConfirmOrder confirmOrder=new ConfirmOrder(Hooks.driver);

    @When("user click on Terms and condition checkbox")

    public void termCondition() throws InterruptedException {
        shoppingPage.clickCheckBox();
    }

    @And("user click on checkout")

    public void checkOut() throws InterruptedException {
        shoppingPage.clickCheckoutButton();


    }
    @Then("user complete order process")

    public void confirmOrder() throws InterruptedException {
        confirmOrder.confirmationProcess();
    }
    @And("user complete order and see \"Your order has been successfully processed!\"")

    public void successMessage(){
        confirmOrder.ConfirmMessage();
    }

}
