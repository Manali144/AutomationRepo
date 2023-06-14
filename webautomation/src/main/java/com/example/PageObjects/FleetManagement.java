package com.example.PageObjects;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.example.Utilities.GenericUtils;
import com.example.Utilities.PropertyFileOperations;

import cucumber.app.enums.FileNames;

public class FleetManagement extends GenericUtils{
	
	  PropertyFileOperations locators;
	    public WebDriver driver;
	    
	    public GenericUtils genericUtils;
	    static Logger log = LogManager.getLogger(FleetManagement.class);
	    
	    
	 {
	    locators = new PropertyFileOperations(FileNames.NirogStreetLocator);
	    log.info("STEP: Assets Page Locators loaded into memory");
	}
	

	    public FleetManagement() throws IOException {

	    	   
	    }
	    
	    public  WebDriver getDriver() {
	        return driverThread.get();
    }
   
	    
	    public void clickOnProfileIcon() throws InterruptedException{
	    	clickOnElement(locators.getKey("Profile"));
	        log.info("STEP:Click on Profile Icon Successfully" + "Profile");
	     //   System.out.println("Element" +"SliderButton");
	    }
	    
	    public void userRole()  {
	        boolean test = isElementDisplay(locators.getKey("Corporate_Owner"));
	        if (test) {
	            log.info("STEP: " + "Profession" + " is present on Dashboard screen");
	        } else {
	            log.info("STEP: " + "Profession" + " is not present on Dashboard screen");
	        }
	    }
	    
	    
	    public void clickOnManageGroupModule() throws InterruptedException{
	    	clickOnElement(locators.getKey("Manage_Group"));
	        log.info("STEP:Click on Manage group module  Successfully" + "Manage_Group");
	     //   System.out.println("Element" +"SliderButton");
	    }
	    
	    public void clickOnCreateGroupIcon() throws InterruptedException{
	    	clickOnElement(locators.getKey("Create_Group"));
	        log.info("STEP:Click on create group module  Successfully" + "Create_Group");
	     //   System.out.println("Element" +"SliderButton");
	    }
	    
	    public void enterGroupName(String GroupName){
    	clickOnElement(locators.getKey("Group_name"));
      

	     enterText(locators.getKey("Group_name"), GroupName);
		           log.info("STEP:Enter mobile number successfully" + "Group_name");
	      
    }
	    
	    public void enterGroupDescription(String Description){
	    	clickOnElement(locators.getKey("Group_Description"));
	      

		     enterText(locators.getKey("Group_Description"), Description);
			           log.info("STEP:Enter mobile number successfully" + "Group_Description");
		     
	    }
	    
	    
	    public void clickOnNextButton() throws InterruptedException{
	    	clickOnElement(locators.getKey("Next_button"));
	        log.info("STEP:Click on create group module  Successfully" + "Next_button");
	     //   System.out.println("Element" +"SliderButton");
	    }
	    
	    public void selectFleetManager() throws InterruptedException{
	    	clickOnElement(locators.getKey("Fleet_Manager"));
	        log.info("STEP:Click on create group module  Successfully" + "Fleet_Manager");
	     //   System.out.println("Element" +"SliderButton");
	    }
	    
	    
	    public void selectFleetVehicle() throws InterruptedException{
	    	clickOnElement(locators.getKey("Fleet_Vehicle"));
	        log.info("STEP:Click on create group module  Successfully" + "Fleet_Vehicle");
	     //   System.out.println("Element" +"SliderButton");
	    }
	    
	    
	    
	    public void clickOnCreateGroupButton() throws InterruptedException{
	    	clickOnElement(locators.getKey("Create_Group_Button"));
	        log.info("STEP:Click on create group module  Successfully" + "Create_Group_Button");
	     //   System.out.println("Element" +"SliderButton");
	    }
	    
	    
	    
	    public void verifySuccessMessage()  {
	        boolean test = isElementDisplay(locators.getKey("Success_Message"));
	        if (test) {
	            log.info("STEP: " + "Profession" + " is present on Dashboard screen");
	        } else {
	            log.info("STEP: " + "Profession" + " is not present on Dashboard screen");
	        }
	    }
	    
	    
	    public void clickOnOkButton() throws InterruptedException{
	    	clickOnElement(locators.getKey("Ok_Button"));
	        log.info("STEP:Click on create group module  Successfully" + "Ok_Button");
	     //   System.out.println("Element" +"SliderButton");
	    }
	    
	    
	    
	    

		   
	    
	    
	    
	  









}


