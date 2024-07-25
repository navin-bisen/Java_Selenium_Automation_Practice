package TestNg.priority;

import org.testng.annotations.Test;

public class WithoutPriority {

    @Test
    public void testScriptA(){
        System.out.println("test script A");
    }

    @Test
    public void testScriptC(){
        System.out.println("test script C");
    }

    @Test
    public void testScriptE(){
        System.out.println("test script E");
    }

    @Test
    public void testScriptB(){
        System.out.println("test script B");
    }

    @Test
    public void testScriptD(){
        System.out.println("test script D");
    }
}
