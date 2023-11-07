package com.automatiom.page_objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DirectoryPage {
	
	private static DirectoryPage directoryPageInstance;
	
	private DirectoryPage() {
		
	}
	
	public static DirectoryPage getInstance() {
		
		if(directoryPageInstance==null) {
			directoryPageInstance = new DirectoryPage();
		}
		
		return directoryPageInstance;
	}
	
	@FindBy(xpath="//div[@class='oxd-select-text-input']")
	private WebElement JOB_TITLE;

	@FindBy(xpath="//*[@type='submit']")
	private WebElement SEARCH;
	
	@FindBy(xpath="//*[@class='oxd-text oxd-text--p orangehrm-directory-card-header --break-words']")
	private WebElement NAME;
	
	@FindBy(xpath="//*[contains(text(),'Chief Executive Officer')]")
	private WebElement Job_Search;

	
	public WebElement getJob_Search() {
		return Job_Search;
	}

	public WebElement getJOB_TITLE() {
		return JOB_TITLE;
	}

	public WebElement getSEARCH() {
		return SEARCH;
	}

	public WebElement getNAME() {
		return NAME;
	}

}
