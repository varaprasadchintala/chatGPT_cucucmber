package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;

    @FindBy(id = "input-email")
    WebElement emailField;

    @FindBy(id = "input-password")
    WebElement passwordField;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement loginButton;

    @FindBy(css = ".alert")
    WebElement loginResult; // Assuming the login result is displayed in an alert element

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

//    public boolean isRedirectedToMyAccountPage() {
//        WebDriverWait wait = new WebDriverWait(driver, 20);
//                // Increased timeout to 20 seconds
//        return wait.until(ExpectedConditions.urlContains("myaccount"));
//    }
    public String getLoginResult() throws InterruptedException {
        Thread.sleep(3000);
        return loginResult.getText();
//                // Increased timeout to 20 seconds
//        return wait.until(ExpectedConditions.urlContains("myaccount"));

   }
}
