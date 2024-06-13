package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    private WebDriver driver;

    @Before
    public void setUp() {
        // Your setup code here, such as initializing WebDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        // Your teardown code here, such as quitting WebDriver
        if (driver != null) {
            driver.quit();
        }
    }
}
