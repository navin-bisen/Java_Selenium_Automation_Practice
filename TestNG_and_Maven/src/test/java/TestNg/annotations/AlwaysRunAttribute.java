package TestNg.annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRunAttribute {

    @Test(groups = "Smoke")
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("Verify login");
    }
    @Test(dependsOnGroups = {"Smoke"}, alwaysRun = true) //irrespective of parent case execution .
    public void verifyHomePage(){                           //child class will always execute.
        System.out.println("Verify home Page");
    }

    @Test(enabled = false) //it will skip the testcase execution....even no log generated..
    public void verifyFundsTransfer(){
        System.out.println("Verify FundsTransfer");
    }

    @Test
    public void verifyBankTransfer(){
        System.out.println("Verify BankTransfer");
    }
}




