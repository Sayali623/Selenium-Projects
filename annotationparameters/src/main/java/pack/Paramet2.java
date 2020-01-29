package pack;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paramet2 {
	
	@Parameters({"broswer","username"})
	@Test()
	public void Pa(String bro , String user) {
		
		System.out.println(bro);
		System.out.println(user);
	}

}
