package stepDefinition;

import Pages.LoginPage;
import Pages.RecoverPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class forgetPassword {
    LoginPage loginPage=new LoginPage(Hooks.driver);
    RecoverPage recoverPage=new RecoverPage(Hooks.driver);
    @When("user click on forget password ")

    public void clickForgetPassword(){
        loginPage.click_forgetPassword_link();
    }
    @And("user write his Email")

    public void enterEmail(){
        recoverPage.enter_email();
    }
    @Then("user click on recover button")

    public void clickRecoverButton(){
        recoverPage.click_recover_button();
    }
    @And("user will see successfully message Email with instructions has been sent to you")

    public void successMessage(){
        String acutalResult="Email with instructions has been sent to you.";
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(true,recoverPage.SuccessfullyMessage().contains(acutalResult));
        softAssert.assertAll();
    }
}
