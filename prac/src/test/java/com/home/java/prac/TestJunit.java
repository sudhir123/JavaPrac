package com.home.java.prac;

import org.junit.Assert;
import org.junit.Test;

public class TestJunit {

	
	String message= "test";
	MessageUtil messageUtil = new MessageUtil(message);
	@Test
	public void testEqual() {
		String str= "ABCD";
		Assert.assertEquals("ABCD", str);
	}
	
	
	@Test
	public void testAdd() {
		String str= "ABCD";
		Assert.assertEquals("ABCD", str);
	}
	
	@Test
	public void testPrintMessage() {
		Assert.assertEquals(message, messageUtil.printMessage());

	}
	
	@Test//(expected "NullPointerException")
	   public void testAssertFuntions() {
	      //test data
	      int num = 5;
	      String temp = null;
	      String str = "Junit is working fine";

	      //check for equality
	      Assert.assertEquals("Junit is working fine", str);
	      
	      //check for false condition
	      Assert.assertFalse(num > 6);

	      //check for not null value
	      Assert.assertNotNull(str);
	   }
	
	
}
