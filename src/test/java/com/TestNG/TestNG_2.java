package com.TestNG;

import org.testng.annotations.Test;

public class TestNG_2 {
	// Only execute sanity test
	//when we have multiple test cases use groups method
	@Test(groups= {"Sanity"})
	public void m1() { // consider it is sanity testing
		System.out.println("m1");
	}

	@Test(groups= {"Regression"})
	public void m2() { // this is regression testing
		System.out.println("m2");
	}

	@Test(groups="Regression")
	public void m3() { // this is regression
		System.out.println("m3");
	}

	@Test(groups= {"Sanity"})
	public void m4() { // regression testing
		System.out.println("m4");
	}

}
