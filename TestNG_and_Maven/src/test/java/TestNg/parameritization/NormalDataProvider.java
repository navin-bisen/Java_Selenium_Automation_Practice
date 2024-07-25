package TestNg.parameritization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NormalDataProvider {
    @DataProvider(name = "test-data")
    public Object[][] testData(){
        return new Object[][]{
                {"Selenium","Pune"},{"Java","Nashik"}
        };
 }
    @Test(dataProvider = "test-data")
    public void verifyGoogleSearch2(String courseName, String cityName) throws InterruptedException {

        System.setProperty("webDiver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys(courseName + cityName);
        googleSearchBox.sendKeys(Keys.ENTER);

        Thread.sleep(5000);
        driver.close();
    }
}