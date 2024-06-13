package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import utils.ConfigFileReader;

public class LoginSteps {
    WebDriver driver;
        LoginPage loginPage;

    @Given("I open the login page")
    public void i_open_the_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        String browser = ConfigFileReader.getProperty("browser");
        driver = new ChromeDriver();
        String url = ConfigFileReader.getProperty("url");
        driver.get(url);
        loginPage = new LoginPage(driver);
    }

    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) {
        loginPage.enterEmail(username);
        loginPage.enterPassword(password);
    }

    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("I should see the login result as {string}")
    public void i_should_see_the_login_result_as(String expectedResult) throws InterruptedException {
        // Add assertions here to verify the login result based on the expectedResult parameter
        // For example:
        String actualResult = loginPage.getLoginResult();
        Assert.assertEquals(expectedResult, actualResult);
        driver.quit();
    }
        }



