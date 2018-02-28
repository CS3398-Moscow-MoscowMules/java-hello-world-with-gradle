package hello;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;



public class TestGreeter {

   private Greeter g;
	
   @Before
   public void setUp() throws Exception 
   {
      g = new Greeter();
   }

   @Test
   public void testGreeterEmpty() 
   {
      assertEquals(g.getName(),"");
      assertEquals(g.sayHello(),"Hello!");
   }
	
   @Test
   public void testGreeter() 
   {
      g.setName("World War");
      assertEquals(g.getName(),"World War");
      assertEquals(g.sayHello(),"Hello World War!");
   }
	
   @Test
   public void newtestSJGreeterPass() 
   {
      g.setName("Definitely not null!");
      assertNotNull(g.getName());
      assertNotNull(g.sayHello());
   }
	
   @Test
   public void newtestSJGreeterFail() {
      g.setName("null"); //definitely not null!
      assertNull(g.getName());
   }
}
