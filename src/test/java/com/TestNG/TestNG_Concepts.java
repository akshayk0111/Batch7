package com.TestNG;

import org.testng.annotations.Test;

public class TestNG_Concepts {
	@Test(priority = 3) // priority bases execution //but default it is alphabetical

	public void D() { // A TO d CHANGE NAME
		System.out.println("D");
	}

	@Test(priority = -1 , enabled = false) // negative is as first priority // priority can be minus also
						// enables will not execute test case //by default it is true
	public void B() { // Execute test case according alphabetical order
		System.out.println("B");
	}

	@Test(invocationCount = 3) // it will execute test 3 times

	public void C() {
		System.out.println("C");
	}
	

	@Test() 

	public void A() {
		System.out.println("C");
	}
}
