package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example {

	@BeforeSuite

	public void BS() {
		System.out.println("Before suite ");
	}

	@BeforeClass
	public void BC() {
		System.out.println("Before class");
	}

	@BeforeTest
	public void BT() {
		System.out.println("Before Test");
	}

	@BeforeMethod
	public void BM() {
		System.out.println("Before Method");
	}

	@Test
	public void verifying() {
		System.out.println("Test 1");
	}

	@Test
	public void verifying2() {
		System.out.println("Test 2");
	}

	// After

	@AfterMethod
	public void AM() {
		System.out.println("After Method");
	}

	@AfterClass
	public void AC() {
		System.out.println("After Class");
	}

	@AfterTest
	public void AT() {
		System.out.println("After Test");
	}

	@AfterSuite
	public void AS() {
		System.out.println("After Suite");
	}

}
