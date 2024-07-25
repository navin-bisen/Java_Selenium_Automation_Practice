package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.Set;

public class Assignment {

    @Test

    public void sampleBuying() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        SoftAssert softAssert = new SoftAssert();
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //clicking login page
        WebElement loginBtn = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
        loginBtn.click();

        //Signing in
        WebElement numberTxtBox = driver.findElement(By.xpath("//input[@id='ap_email']"));
        numberTxtBox.sendKeys("9589120674");

        WebElement continueBtn = driver.findElement(By.xpath("//input[@id='continue']"));
        continueBtn.click();

        WebElement passTxtBox = driver.findElement(By.xpath("//input[@id='ap_password']"));
        passTxtBox.sendKeys("Samplepassword95");

        WebElement signBtn = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
        signBtn.click();


        //Searching product
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("nike shoes");

        WebElement searchBtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        searchBtn.click();


        //Click on product
        WebElement nike = driver.findElement(By.xpath("//span[text()='Mens Downshifter 13 Running Shoe']"));
        nike.click();

        //Handling new window opened
        String parentId = driver.getWindowHandle();
        Set<String> allId = driver.getWindowHandles();

        for (String s : allId) {

            if (!s.equalsIgnoreCase(parentId)) {
                driver.switchTo().window(s);
            }
        }

        //Printing Product title.
        try {
            String productTitile = driver.findElement(By.xpath("//span[@id='productTitle']")).getText();
            System.out.println(productTitile);
        } catch (Exception e) {
            e.printStackTrace();
        }



        Thread.sleep(3000);

        //Printing Price tag
        try {
            String productPrice = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='3,393'])[1]"))).getText();
            System.out.println(productPrice);
        } catch (Exception e) {
            e.printStackTrace();
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='nav-cart-icon nav-sprite']")))

        //Checkout
        WebElement proceedToBuy = driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
        proceedToBuy.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //  WebElement checkoutBtn = driver.findElement(By.xpath("//span[@id='sc-buy-box-ptc-button-announce']"));


        //Add new Address
        WebElement addressNew = driver.findElement(By.xpath("//a[@id='add-new-address-popover-link']"));
        addressNew.click();


        WebElement name = driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressFullName']"));
        name.sendKeys("Amit Kumar");

        WebElement mobNo = driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressPhoneNumber']"));
        mobNo.sendKeys("9589120676");

        WebElement pinCode = driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressPostalCode']"));
        pinCode.sendKeys("411027");

        WebElement houseName = driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressLine1']"));
        houseName.sendKeys("Flat no. 201, Ekvira");

        Thread.sleep(3000);

        WebElement areaStreet = driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressLine2']"));
        areaStreet.sendKeys("Shudharshan Nagar, Lane no. 03");

        WebElement useThisAddress = driver.findElement(By.xpath("//input[@aria-labelledby='address-ui-widgets-form-submit-button-announce']"));

        try {
            webDriverWait.until(ExpectedConditions.elementToBeClickable(useThisAddress)).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
       /* Alert alert = driver.switchTo().alert();
        alert.accept();*/

        //Selecting COD option.
        try {
            WebElement codOption = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'Cash on Delivery')]")));
            codOption.click();
        } catch (Exception e) {
            e.printStackTrace();
        }

       /* WebElement useThisPayment = driver.findElement(By.xpath("//span[@id='pp-ISr7dv-154-announce']"));
       useThisPayment.click();

        WebElement placeYourOrder = driver.findElement(By.xpath("(//input[@name='placeYourOrder1'])[1]']"));
        placeYourOrder.click();

        softAssert.assertEquals("Order placed, thank you!","Order placed, thank you!","Text should match");
*/
        Thread.sleep(3000);
        driver.close();
        driver.quit();
    }
}




