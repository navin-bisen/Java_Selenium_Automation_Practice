package TestNg.annotations;

import org.testng.annotations.Test;

public class InvocationCountExample {

    @Test(invocationCount = 10)

    public void iCountExample() {
        System.out.println("I Count Method");
    }


    @Test(invocationCount = 10,invocationTimeOut = 7) // max time in which invocation count executed
    public void iTimeoutExample() {
        System.out.println("I Timeout Example");
    }
}