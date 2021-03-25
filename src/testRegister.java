import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testRegister 
{
	@Test
	public void testLoginPage() 
	{
	    beginAt("MyFrame.java"); 
	    assertTitleEquals("Registration");
	    assertLinkPresent("Reset");
	    clickLink("Submit");
	    assertTitleEquals("Register");
	}
}

