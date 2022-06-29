package basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    protected static WebDriver driver;

    @BeforeSuite
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void openHomePage(){
        driver.get("http://localhost:8080");
    }

    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }

    @AfterSuite
    public void quitDriver(){
        driver.quit();
    }
}
