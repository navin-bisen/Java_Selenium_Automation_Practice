package TestNg.annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterMethod {

    public WebDriver driver;

    @BeforeMethod
    public void beforeMethodExample() {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testcase1() {
        driver.get("https://www.abhibus.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void testcase2() {
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void testcase3() {
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void afterMethodExample() {
        driver.close();
    }
}