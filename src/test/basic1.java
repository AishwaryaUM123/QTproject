package test;

import java.io.IOException;

import org.testng.annotations.Test;

public class basic1 extends globalvar {
	@Test
	public void webcreditcardmethod1()
	{
		System.out.println("this is the credit card web test case");
	}
	@Test
	public void webcreditcardmethod2()
	{
		System.out.println("this is the credit card web test case");
		
	}
	@Test
	public void launchbrowser() throws IOException
	{
		login();
	}
	

}
