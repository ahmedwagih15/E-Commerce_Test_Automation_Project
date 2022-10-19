package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Recover

public class RecoverPage {
    WebDriver driver;
    private By Email=By.id("Email");
    private By recoverButton=By.cssSelector("div[class=\"buttons\"] button");
    private By successfullyMessage=By.cssSelector("div[class=\"bar-notification success\"] p");
    public RecoverPage(WebDriver driver) {
        this.driver = driver;
    }
    public void click_recover_button(){
        driver.findElement(recoverButton).click();
    }
    public void enter_email(){
        driver.findElement(Email).sendKeys(stepDefinition.registration.email);
    }
    public String SuccessfullyMessage(){
        return driver.findElement(successfullyMessage).getText();

    }
}
