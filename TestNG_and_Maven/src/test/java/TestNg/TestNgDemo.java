package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgDemo {

@Test

    public void testCase1() throws InterruptedException {

    System.setProperty("webDriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.abhibus.com/");
    driver.manage().window().maximize();
    driver.close();
}


    @Test

    public void testCase2() throws InterruptedException {

        System.setProperty("webDriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.close();
    }



    @Test

    public void testCase3() throws InterruptedException {

        System.setProperty("webDriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.close();
    }


    @Test

    public void testCase4() throws InterruptedException {

        System.setProperty("webDriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();

       WebElement element = driver.findElement(By.xpath("//input[@id='search']"));
       element.sendKeys("Saadgi toh Hamari zara Dekhiye");

       driver.findElement(By.id("search-icon-legacy"));
       driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();



        // Click on the first video link
        WebElement firstVideoLink = driver.findElement(By.cssSelector("a#video-title"));
        firstVideoLink.click();

        // Wait for the video to start playing
        try {
            Thread.sleep(5000); // Adjust the wait time as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Thread.sleep(10000 );
        // Close the browser
        driver.quit();
    }




}






