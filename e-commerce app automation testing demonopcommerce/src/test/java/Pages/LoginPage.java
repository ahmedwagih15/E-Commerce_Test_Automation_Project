package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Login
public class LoginPage {
        WebDriver driver;
        private By Email = By.id("Email");
        private By Paasword = By.id("Password");
        private By loginButton = By.cssSelector("button[class=\"button-1 login-button\"]");
        private By forgetPasswordLink = By.cssSelector("span[class=\"forgot-password\"] a");

        public LoginPage(WebDriver driver) {
            this.driver = driver;
        }

        public void enter_valid_Email_Password(String email, String password) {
            setText(Email, email);
            setText(Paasword, password);
        }

        public void setText(By element, String value) {
            driver.findElement(element).sendKeys(value);
        }

        public void click_forgetPassword_link() {
            driver.findElement(forgetPasswordLink).click();
        }

        public void click_login_button() {
            driver.findElement(loginButton).click();

        }
    }

