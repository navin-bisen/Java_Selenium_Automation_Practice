package TestNg.priority;

import org.testng.annotations.Test;

public class WithPriority {

    @Test(priority =1)
    public void testScriptA(){
        System.out.println("test script A");
    }

    @Test(priority= -2)
    public void testScriptC(){
        System.out.println("test script C");
    }

    @Test   //default priority 0 if not assigned
    public void testScriptE(){
        System.out.println("test script E");
    }

    @Test(priority = -6) // negative priority can also be assigned.
    public void testScriptB(){
        System.out.println("test script B");
    }

    @Test(priority = 0)
    public void testScriptD(){
        System.out.println("test script D");
    }

    @Test(priority= 'c')  //char can be assigned as priority but will execute at last (AISCC value)
    public void testScriptF(){
        System.out.println("test script C");
    }
}

//By default, priority follows alphabetical order...
//if two testcase have same priority i.e p0-p0 or p1-p1 then their alphabetical order will decide...
//Float value cannot be defined as priority.
//