package stepDefinition;

import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class Login {  HomePage homePage=new HomePage(Hooks.driver);
    LoginPage loginPage=new LoginPage(Hooks.driver);
    @And("user click on login ")

    public void clickLoginLink(){
        homePage.click_login_link();
    }
    @When("user enter valid Email and password")

    public void enterValidData(){
        loginPage.enter_valid_Email_Password(stepDefinition.registration.email,
                stepDefinition.registration.password);
    }
    @And("user clicks on login button")

    public void clickButton(){
        loginPage.click_login_button();
    }

    @Then("user login successfully and go to home page")

    public void userLoginSuccessfullyAndGoToHome() {
        SoftAssert softAssert=new SoftAssert();

        softAssert.assertEquals(Hooks.driver.findElement
                        (By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[2]/div[1]/h2"))
                .getText(),"Welcome to our store");
        softAssert.assertAll();
    }
}
