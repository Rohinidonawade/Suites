package com.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.flows.DashboardFlow;
import com.flows.LoginLogoutFlow;
import com.generic.BaseTest;
import com.pageFactory.DashboardPage;

    public class DashboardTest  extends BaseTest{
	
	private DashboardFlow objDashboardFlow;
	private LoginLogoutFlow objLoginLogoutFlow;
	private DashboardPage objDashboardPage;
		
	public void initilizeWebPages() {		
		objDashboardFlow = new DashboardFlow(this);
		objLoginLogoutFlow = new LoginLogoutFlow(this);
		objDashboardPage = new DashboardPage(this);		
	}
	
	@BeforeClass
	public void initializeOfWebEnvir() {
		this.initilizeWebPages();
		this.initilizeOfWebDriver();
	}

	@AfterClass
	public void tearDownEnv() {
		this.tearDown();
	}
	
	@Test
	public void TC_03_VerifyDashBoardPage() {
		objLoginLogoutFlow.doLogin();
		objDashboardPage.checkPortFolio();
		objDashboardPage.selectQuotes();
		objDashboardFlow.check();	
	//	objDashboardPage.checkPremeraProduct();
	//	objDashboardPage.checkPackageBuild();
		
	}

}
