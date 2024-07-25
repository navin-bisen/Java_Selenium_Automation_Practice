package TestNg.annotations;

import org.testng.annotations.*;

public class BeforeClassAndAfterClassAnnotations {


    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method 1");
    }

    @Test
    public void testcase1() {
        System.out.println("Case1");
    }

    @Test
    public void testcase2() {
        System.out.println("Case2");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod 1");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }
}

