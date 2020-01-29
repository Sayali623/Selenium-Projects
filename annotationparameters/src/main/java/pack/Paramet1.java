package pack;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paramet1 {
	
	@Parameters({"browser","username"})
	
	@Test
	
	public void testcaseone (String bro, String user) {
		System.out.println( bro);
		System.out.println( user);
		
	}

}
