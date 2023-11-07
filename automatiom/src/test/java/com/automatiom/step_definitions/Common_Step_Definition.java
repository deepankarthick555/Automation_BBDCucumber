package com.automatiom.step_definitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.automatiom.webdriver_manager.DriverManager;
import com.automation.utilities.CommonUtils;

import io.cucumber.java.Before;

public class Common_Step_Definition {

	// launchBrowser

	private static final Logger LOGGER= LogManager.getLogger(VerifyCEOName_Step_Def.class);

	@Before
	public void beforeScenario() {
		LOGGER.info("Executed Started");

		try {
			LOGGER.info("Instantiation the CommonUtils");
			CommonUtils commonutils = new CommonUtils();
			LOGGER.info("Logging the Properties File");
			commonutils.loadProperties();

			LOGGER.info("Checking Driver is NULL or NOT?");
			if (DriverManager.getDriver() == null) {
				LOGGER.info("Instantiation launchbrowser");
				DriverManager.launchbrowser();
				commonutils.initWebElements();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
