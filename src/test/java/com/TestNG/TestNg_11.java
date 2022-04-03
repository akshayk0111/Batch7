package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg_11 {

	@Test

	public void test1() {
		System.out.println("Test 1");  // if test 1 is passed then only 2 nd test will pass
	Assert.assertTrue(false);                  // here we fail the test 
	//dependant test will not run then 
	}

	@Test(dependsOnMethods= "test1")  // it will depend on 1st test 1 

	public void test2() {
		System.out.println("Test 2");
	}

}
