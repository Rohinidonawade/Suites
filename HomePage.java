package com.pageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.BaseTest;
import com.generic.Pojo;

public class HomePage extends BaseTest{

	private Pojo objPojo;
	
	public HomePage(Pojo pojo) {
		this.objPojo = pojo;
	}
	
	By Loc_txtHomeInHomePage = By.xpath("//div[@class='pull-left hometext']");

	public String getHomeTextOnHomePage() {
	String strHomeText = objPojo.getDriver().findElement(Loc_txtHomeInHomePage).getText();
	return strHomeText;
	}
	
	public void verifyHomeTextIsDisplayedInHomePage() {
		Assert.assertEquals(this.getHomeTextOnHomePage(),"Home");
	}

}



