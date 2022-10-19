package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

// Driver

public class TagPage {   WebDriver driver;

    private By pageTitle=By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[1]/h1");

    public TagPage(WebDriver driver) {
        this.driver = driver;
    }

    public void PageTitle() throws InterruptedException {

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(true,driver.findElement(pageTitle).getText()
                .contains("Products tagged with 'awesome'"));
        softAssert.assertAll();
        System.out.println(driver.findElement(pageTitle).getText());
        Thread.sleep(1000);
    }
}
