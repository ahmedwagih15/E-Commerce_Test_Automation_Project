package stepDefinition;

import Pages.ApparelShoesPage;
import Pages.TagPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectTag {
    TagPage tagPage=new TagPage(Hooks.driver);
    ApparelShoesPage apparelShoesPage=new ApparelShoesPage(Hooks.driver);
    @When("user should select item with Tag")

    public void selctTag(){
        apparelShoesPage.selectTag();
    }
    @Then("user navigate to Tag page")

    public void naviToTagPage() throws InterruptedException {
        tagPage.PageTitle();
    }

}
