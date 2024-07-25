package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Practice {


    @Test
            public void testPage(){

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

       WebElement element =  driver.findElement(By.xpath("//a[text()='Mobiles']"));

       element.click();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals("Latest launches in Mobiles & Accessories","Latest launches in Mobiles & Accessories","Text should be matched");

        softAssert.assertAll();

        driver.close();
    }



    @Test

    public void validateLoginPage(){

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/ref=nav_logo");

                driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();

                SoftAssert softAssert = new SoftAssert();

                softAssert.assertEquals("Sign in","Sign in");

                softAssert.assertAll();
                driver.close();

    }


    @Test
    public void handleAlert() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
        WebElement element = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
        element.click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();



        alert.sendKeys("Hi Navin.");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        Thread.sleep(3000);

        alert.accept();

        driver.close();
    }




    @Test

    public void DragAndDrop(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Static.html");
        Actions actions = new Actions(driver);

    }
}




