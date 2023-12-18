package testngSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionsConcept {

			String name;
			
		 @Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class, ArrayIndexOutOfBoundsException.class})
		public void cal() 
		{
			int i = 10/0;
			ExpectedExceptionsConcept obj = new ExpectedExceptionsConcept();
			obj.name=null;
			
			
		}
		
		
	

}
