package TestNg.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

    @Test

    public void hardAssert(){
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        SoftAssert  softAssert = new SoftAssert();
        WebElement loginTextbox = driver.findElement(By.id("login1"));
        softAssert.assertEquals(title,"rediffmail","Title should be matched");
        softAssert.assertFalse(loginTextbox.isDisplayed(),"login textbox should be visible");
        System.out.println("Hello");
        softAssert.assertAll(); //log print of asserted statement
        driver.close();
}
}
//Subsequent statement executed here even if assert statement os false.