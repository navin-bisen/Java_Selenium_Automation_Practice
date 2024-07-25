package TestNg.parameritization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WithParameterization {

    public WebDriver driver;

    @Parameters({"browserName"})
    @Test
    public void beforeMethodTestDemo(String browserName) throws InterruptedException {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webDriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            System.setProperty("wedriver.gecko.driver", "C:\\Users\\navin\\Downloads\\edgedriver_win64.msedgedriver.exe");

            driver = new EdgeDriver();
        } else {
            throw new RuntimeException("please select correct browser");

        }
    }

    @Parameters({"courseName", "cityName"})
    @Test
    public void verifyGooglesearch(String courseName, String cityName) throws InterruptedException {

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys(courseName + cityName);
        googleSearchBox.sendKeys(Keys.ENTER);

        Thread.sleep(3000);
        driver.close();

    }
}
