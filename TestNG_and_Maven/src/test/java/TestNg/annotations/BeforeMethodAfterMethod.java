package TestNg.annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodAfterMethod {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method 1");
    }
    @Test
    public void case1(){
        System.out.println("Case1");
    }

    @Test
    public void case2(){
        System.out.println("Case2");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod 1");

    }
}
