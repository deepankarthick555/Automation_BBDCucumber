package com.automatiom.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	private static HomePage homePageInstance;
	
	private HomePage() {
		
	}
	
	public static HomePage getInstance() {
		
		if(homePageInstance==null) {
			homePageInstance = new HomePage();
		}
		
		return homePageInstance;
	}
	
	@FindBy(linkText = "Directory")
	private WebElement DIRECTORY;

	public WebElement getDIRECTORY() {
		return DIRECTORY;
	}
	

}
