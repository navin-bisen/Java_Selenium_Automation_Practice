package TestNg.parameritization;

import com.google.common.collect.Table;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;


public class DataProviderWithExcel{

    @DataProvider(name = "test-data")
    public Object[][] dataProviderFun() throws IOException {
        Object[][] arrObj = getExcelData("C:\\Users\\navin\\OneDrive\\Desktop\\desktop\\TestDataSheet.xlsx", "testCase1");

        return arrObj;
    }
    public String[][] getExcelData(String fileName, String sheetName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        XSSFWorkbook wb = new XSSFWorkbook(fileInputStream);
    XSSFSheet sh = wb.getSheet(sheetName);
    XSSFRow row = sh.getRow(0);
    int numOfRow = sh.getPhysicalNumberOfRows();
    int numOfColumn = row.getLastCellNum();
    Cell cell;
    String[][] data = new String[numOfRow-1][numOfColumn];

    for (int i=1; i<numOfRow-1;i++){              //row

        for (int j=0; j<numOfColumn;j++){      //column
            row = sh.getRow(i);
            cell = row.getCell(j);
            data[i-1][j]=cell.getStringCellValue();
        }
    }
    return data;
}
@Test(dataProvider = "test-data")
    public void verifyGoogleSearch2(String courseName, String cityName) throws InterruptedException {

        System.setProperty("webDriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
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


