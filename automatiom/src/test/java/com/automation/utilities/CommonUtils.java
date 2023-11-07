package com.automation.utilities;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.automatiom.constants.Constants;
import com.automatiom.page_objects.DirectoryPage;
import com.automatiom.page_objects.HomePage;
import com.automatiom.page_objects.LoginPage;
import com.automatiom.webdriver_manager.DriverManager;

public class CommonUtils {

	public void loadProperties() {



		Properties properties = new Properties();

		try {

			properties.load(getClass().getResourceAsStream("/config.properties"));

		} catch (Exception e) {
			e.printStackTrace();

		}
	
		Constants.APP_URL = properties.getProperty("APP_URL");
		Constants.BROWSER = properties.getProperty("Browser");
		Constants.USERNAME = properties.getProperty("UserName");
		Constants.PASSWORD = properties.getProperty("Password");
		Constants.CHROME_DRIVER_LOCATION = properties.getProperty("CHROME_DRIVER_LOCATION");
		Constants.FIREFOX_DRIVER_LOCATION = properties.getProperty("FIREFOX_DRIVER_LOCATION");
		Constants.EDGE_DRIVER_LOCATION = properties.getProperty("EDGE_DRIVER_LOCATION");
		Constants.IE_DRIVER_LOCATION = properties.getProperty("IE_DRIVER_LOCATION");
	}
	
	public void initWebElements() {
		PageFactory.initElements(DriverManager.getDriver(), LoginPage.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), HomePage.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), DirectoryPage.getInstance());
	}
}
