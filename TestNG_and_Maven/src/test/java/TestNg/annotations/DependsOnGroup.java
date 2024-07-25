package TestNg.annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.GregorianCalendar;

public class DependsOnGroup {

    @Test(groups = "Smoke")
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("Verify login");
    }
    @Test(dependsOnGroups = {"Smoke"})
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

