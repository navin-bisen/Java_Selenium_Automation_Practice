package TestNg.manualapproachfailedtests;

import TestNg.retryanalysis.IRetryAnalyzerExample;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestCases {


    @Test(retryAnalyzer = IRetryAnalyzerExample.class)
    public void verifyLogin() {
        Assert.assertTrue(false);
        System.out.println("Verify login");
    }

    @Test(retryAnalyzer = IRetryAnalyzerExample.class)
    public void verifyHomePage() {
        Assert.assertTrue(false);
        System.out.println("Verify home Page");
    }

    @Test(retryAnalyzer = IRetryAnalyzerExample.class)
    public void verifyFundsTransfer() {
        System.out.println("Verify FundsTransfer");
    }

    @Test(retryAnalyzer = IRetryAnalyzerExample.class)
    public void verifyBankTransfer() {
        System.out.println("Verify BankTransfer");
    }
}
