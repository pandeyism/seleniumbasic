package pkg1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitConcept1 {
	@Test
	public void abc()
	
	{
		System.out.println("I am the test case");
	}
   
	@After
	public void dd1()
	
	
	{
		System.out.println("I am after teast case");
		
	}
      @Before
	public void ab1()
	
	
 {
	 System.out.println("I am before test case");
 }


}