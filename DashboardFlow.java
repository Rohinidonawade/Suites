package com.flows;

import com.generic.Pojo;
import com.pageFactory.DashboardPage;

public class DashboardFlow {

	private Pojo objPojo;
	private DashboardPage objDashboardPage;
	
	public DashboardFlow(Pojo pojo) {
		this.objPojo = pojo;
		objDashboardPage = new DashboardPage(objPojo);
	}
	
	public void check() {
		objDashboardPage.checkPortFolio();
		objDashboardPage.selectQuotes();
	}
}

