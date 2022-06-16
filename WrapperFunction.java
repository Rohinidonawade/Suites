package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WrapperFunction {

	private Pojo objPojo;
	
	public WrapperFunction(Pojo pojo) {
		this.objPojo = pojo;		
	}
	
	     //Text
	public boolean setText(By locator, String inpValue) {
		try {
			objPojo.getDriver().findElement(locator).sendKeys(inpValue);
			return true;
		} 
		catch (Exception exception) {
             System.out.println("Error message is :" +exception.getMessage());
             exception.printStackTrace();
             return false;
		}
     }
	
	    //Click, Button
	public boolean setClickButton(By locator) {
		try {
			objPojo.getDriver().findElement(locator).click();
			return true;
		} 
		catch (Exception exception) {
             System.out.println("Error message is :" +exception.getMessage());
             exception.printStackTrace();
             return false;
		}
     }
	
	      //CheckBox
	public boolean verifyCheckBox(By locator) {
		try {
				WebElement checkBox= objPojo.getDriver().findElement(locator);
				System.out.println(checkBox.isSelected());
		        
		        if(checkBox.isSelected())
		      	  System.out.println("Selected");
		        else
		      	  System.out.println("is not selected");
		        return true;
		} 
		catch (Exception exception) {
             System.out.println("Error message is :" +exception.getMessage());
             exception.printStackTrace();
             return false;
		}
     }
	
	       //Dropdown selectTable
	public boolean verifySelectTable(By locator,String inpValue) {
		try {
				Select selectDropDown = new Select(objPojo.getDriver().findElement(locator));
				selectDropDown.selectByVisibleText(inpValue);
				return true;
		} 
		catch (Exception exception) {
             System.out.println("Error message is :" +exception.getMessage());
             exception.printStackTrace();
             return false;
		}
     }
	
	      //Mouse Hover
	public boolean checkMouseHover(By locator,String inpValue) {
		try {
				Actions action = new Actions(objPojo.getDriver());
				WebElement mouseHover = objPojo.getDriver().findElement(locator);
				action.moveToElement(mouseHover).perform();				
				return true;
		} 
		catch (Exception exception) {
             System.out.println("Error message is :" +exception.getMessage());
             exception.printStackTrace();
             return false;
		}
     }
	
	      //Slider
    //Mouse Hover
	public boolean checkSliderMovement(By locator,String inpValue) {
		try {
				Actions action = new Actions(objPojo.getDriver());
				WebElement slider = objPojo.getDriver().findElement(locator);
				action.dragAndDropBy(slider, 100, 200);			
				return true;
		} 
		catch (Exception exception) {
           System.out.println("Error message is :" +exception.getMessage());
           exception.printStackTrace();
           return false;
		}
   }
	
	
	
}
