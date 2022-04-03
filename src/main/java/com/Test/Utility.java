package com.Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Utility {
	
	public static void custom_sendkeys(WebElement element , String value)
	{
		element.sendKeys(value);
	}
	
	public static void custom_click(WebElement element )
	{
		element.click();
	}
	
	public static void custom_handleDropdown(WebElement element , String text)
	{
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	public void custom_Assert(String actual, String expected)
	{
		Assert.assertEquals(actual , expected);
	}
	

}
