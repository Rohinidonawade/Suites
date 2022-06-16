package com.flows;

import com.generic.BaseTest;
import com.generic.Pojo;
import com.pageFactory.HomePage;
import com.pageFactory.LoginPage;

public class HomePageFlow extends BaseTest{
	

	private Pojo objPojo;
	private HomePage objHomePage;
	
	public HomePageFlow(Pojo pojo) {
		this.objPojo = pojo;
		objHomePage = new HomePage(objPojo);
	}
	
	public void checkHomePage() {
	//	objHomePage.getHomeTextOnHomePage();
        objHomePage.verifyHomeTextIsDisplayedInHomePage();
}
}
