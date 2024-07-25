package reportgeneration;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {

        @Test
        public void verifyLogin(){
            Assert.assertTrue(false);
            System.out.println("Verify login");
        }
        @Test
        public void verifyHomePage(){
            Assert.assertTrue(false);
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


