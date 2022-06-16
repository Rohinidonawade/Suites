package com.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.generic.BaseTest;
import com.generic.Pojo;

public class DashboardPage extends BaseTest{
	
	private Pojo objPojo;
	
	public DashboardPage(Pojo pojo) {
		this.objPojo = pojo;
	}

	By Loc_butEBsConfig = By.xpath("//div[text()='eBS config Portfolio']");
    By Loc_selQuotesSelectForFilter = By.xpath("//div[@id='viewContainer']/following::select[@id='drpViewModeLoad']");


    public void checkPortFolio() {
    	Assert.assertTrue(objPojo.getObjWrapperFunction().setClickButton(Loc_butEBsConfig));
    	
	//	objPojo.getDriver().findElement(Loc_butEBsConfig).click();
	}
	
    public void selectQuotes() {
    	Assert.assertTrue(objPojo.getObjWrapperFunction().verifySelectTable(Loc_selQuotesSelectForFilter, "Compare"));

 //   	WebElement element = objPojo.getDriver().findElement(Loc_selQuotesSelectForFilter);
 //   	Select selectFilter = new Select(element);
 //   	selectFilter.selectByVisibleText("Classic"); 
 //   	Assert.assertNotNull(element,"Classic");
    	}
    
}



    
//    public void checkPremeraProduct() {
//		objPojo.getDriver().findElement(Loc_butPremeraProduct).click();
//	}
    
 //   public void checkPackageBuild() {
//		objPojo.getDriver().findElement(Loc_butPackageBuild).click();
//	}

