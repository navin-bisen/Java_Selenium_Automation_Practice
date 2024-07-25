package TestNg.annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {


    @Test
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("Verify login");
    }
    @Test(dependsOnMethods = {"verifyLogin"})
    public void verifyHomePage(){
        System.out.println("Verify home Page");
    }

    @Test
    public void verifyFundsTransfer(){
        System.out.println("Verify FundsTransfer");
    }

    @Test
    public void verifyBankTransfer(){
        System.out.println("Verify BankTransfer");
    }
}
//very less used...bcoz when cases execute parallel then cannot be executed