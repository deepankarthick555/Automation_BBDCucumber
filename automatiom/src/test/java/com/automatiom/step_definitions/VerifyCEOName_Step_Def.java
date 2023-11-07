
package com.automatiom.step_definitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.automatiom.constants.Constants;
import com.automatiom.page_objects.DirectoryPage;
import com.automatiom.page_objects.HomePage;
import com.automatiom.page_objects.LoginPage;
import com.automatiom.webdriver_manager.DriverManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyCEOName_Step_Def {

	private static final Logger LOGGER= LogManager.getLogger(VerifyCEOName_Step_Def.class);
	


	@Given("the user is logged in successfully and is on Home Page.")
	public void the_user_is_logged_in_successfully_and_is_on_home_page() throws InterruptedException {
		DriverManager.getDriver().get(Constants.APP_URL);
		  
		Thread.sleep(5000);
		LoginPage.getInstance().getUSERNAME().sendKeys(Constants.USERNAME);
		Thread.sleep(3000);
		LoginPage.getInstance().getPASSWORD().sendKeys(Constants.PASSWORD);
		LoginPage.getInstance().getLOGIN_BUTTON().click();
	

		String URL = DriverManager.getDriver().getCurrentUrl();

		if (URL.contains("dashboard")) {

			LOGGER.info("the user is logged in successfully and is on Home Page.");
		}

	}

	@When("the user clicks on the directory option from the Menu bar")
	public void the_user_clicks_on_the_directory_option_from_the_menu_bar() throws InterruptedException {
		Thread.sleep(3000);
		
		HomePage.getInstance().getDIRECTORY().click();
	
		LOGGER.info("the user clicks on the directory option from the Menu bar");
	}

	@When("the user selects the job title as {string} from the Drop Down")
	public void the_user_selects_the_job_title_as_from_the_drop_down(String jobTitle) throws InterruptedException {
		Thread.sleep(8000);
		
		DirectoryPage.getInstance().getJOB_TITLE().sendKeys(jobTitle);
		Thread.sleep(3000);
		
		LOGGER.info("Done");
		
		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		jse.executeScript("window.scrollBy(0,-650)");
		
		
		DirectoryPage.getInstance().getJob_Search().click();
	}
	@When("clicks the search button")
	public void clicks_the_search_button() throws InterruptedException {
		
		Thread.sleep(3000);
		DirectoryPage.getInstance().getSEARCH().click();
	
		LOGGER.info("clicks the search button");
	}

	@Then("the user should see the CEO name as {string}")
	public void the_user_should_see_the_ceo_name_as(String expectedName) throws InterruptedException {
		Thread.sleep(3000);
		
		String actualName = DirectoryPage.getInstance().getNAME().getText();

		if (actualName.equalsIgnoreCase(expectedName)) {
			LOGGER.info("the user should see the CEO name as John Smith");

		}

	}

}
