package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Wishlist

public class WishListPage {
    WebDriver driver;
    private By Quantities=By.cssSelector("input[class=\"qty-input\"]");

    public WishListPage(WebDriver driver) {
        this.driver = driver;
    }

    public void findQuantities() throws InterruptedException {

        String first=driver.findElements(Quantities).get(0).getAttribute("value");
        System.out.println(first);
        String second=driver.findElements(Quantities).get(1).getAttribute("value");
        System.out.println(second);
        Thread.sleep(5000);
        int total=Integer.parseInt(first)+Integer.parseInt(second);
        System.out.println(total);
    }
}
