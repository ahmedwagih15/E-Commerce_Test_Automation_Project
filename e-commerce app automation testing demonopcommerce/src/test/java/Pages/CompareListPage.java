package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 // Compare list
public class CompareListPage {
    WebDriver driver;
    public CompareListPage(WebDriver driver) {
        this.driver = driver;
    }
    private By item1NumName= By.xpath("/html/body/div[6]/div[3]/div/div[2]/" +
            "div/div[2]/div/table/tbody/tr[3]/td[3]/a");
    public String item1_Num_Name(){
        return driver.findElement(item1NumName).getText();
    }
}
