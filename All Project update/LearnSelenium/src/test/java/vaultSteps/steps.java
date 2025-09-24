package vaultSteps;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class steps {
	WebDriver driver=new ChromeDriver();
	page veeva=new page(driver);
	
	@Given("Open the chrome browser {string}")
	public void open_the_chrome_browser(String url) {
	    veeva.openbrowser(url);
	}

	@When("user login using {string} and {string}")
	public void user_login_using_and(String string, String string2) {
		veeva.enterCredential(string, string2);
	    
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	   veeva.login();
	}


	
	

	@When("User validate its Prana-Quality Suite vault")
	public void user_select_prana_quality_suite_vault() {
	   veeva.check_Prana_Quality();
	}

	@When("user select More create option and select create Document")
	public void user_select_more_create_option_and_select_create_document() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user Select Placholder and Select Continue")
	public void user_select_placholder_and_select_continue() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user verify its open Create placeholder page")
	public void user_verify_its_open_create_placeholder_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}




}
