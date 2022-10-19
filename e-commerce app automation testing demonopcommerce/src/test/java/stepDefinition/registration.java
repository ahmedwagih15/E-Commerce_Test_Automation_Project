package stepDefinition;

import Pages.HomePage;
import Pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class registration {
    RegistrationPage registrationPage=new RegistrationPage(Hooks.driver);;
    HomePage homePage=new HomePage(Hooks.driver);
    public static String email="testing@example.com ";
    String firstName="username";
    String lastName="test";
    public static String password="P@ssw0rd";
    public static String company="Automation Company";


    @Given("user navigate to home page")

    public void navihome() {
        homePage.navigateToHomePage();
    }
    @And("user click on registration")

    public void clcklink(){
        homePage.click_regis_link();
    }
    @When("user fill Personal info with valid data and password")

    public void pers_info(){

        registrationPage.enter_valid_date(email,password,firstName,lastName,company);

    }
    @And("user click on register button")

    public void cliclOnRegisterButton(){
        registrationPage.click_button();
    }
    @Then("user register successfully")

    public void registerSuccessfully()  {
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(registrationPage.successfullyMessage());
        softAssert.assertAll();
    }
}
