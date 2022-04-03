package com.Asserts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_1 {

	@Test
	
	
	public void verifyAsserts() {
		SoftAssert soft = new SoftAssert();
		System.out.println("Browser Open");
		System.out.println("Email Enter");
		System.out.println("Password enter");
		System.out.println("Click on Login button");
		//consider login is successful 
		
//		Assert.assertEquals("Test1", "Test"); //assert pass  //test case will not execute 
//						//test case fail
//		System.out.println("Browser closed");
		
		//soft assert 
		soft.assertEquals("Test", "Test1"); // but here test case is pass //it will complete all test cases 
		System.out.println("Browser closed");//
		
		
		
		soft.assertAll();  // it will collect all exceptions and ommit them 
	}
	@Test
	public void test_2() {
		System.out.println("Test2");
	}

}
