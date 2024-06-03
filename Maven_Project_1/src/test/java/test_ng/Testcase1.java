package test_ng;

import org.testng.annotations.Test;

public class Testcase1 
{
       @Test(invocationCount=12)
       public static void add()
       {
    	   System.out.println("roohi");
       }
       @Test(enabled=false)
       void mul()
       {
    	   System.out.println("Asaf");
       }
    //   @Test
       Testcase1()
       {
    	   System.out.println("Sweet");
       }
       @Test
       public void num()
       {
    	   System.out.println("jyoti");
       }
       
       
      
}
