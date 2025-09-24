package StepDefn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.ShopPage;
import io.cucumber.java.en.*;


public class loginSteps {
	
	WebDriver driver;
	
	ShopPage SP ;
	
	public loginSteps() {
        driver = new ChromeDriver();  // create driver only once here
        SP = new ShopPage(driver);    // pass the same driver to ShopPage
    }
    
	@Given("^user navigate to the given URL$")
	public void user_navigate_to_the_given_URL() {
		SP.openWithURL();
		}
	
	@When("^user click on the Shop and Home tab$")
	public void user_click_on_the_Shop_and_Home_tab() {
		SP.ShopAndHomeClick();
		}
	
	@Then("^user check the size of the slider$")
	public void user_check_the_size_of_the_slider() {
		SP.sliderView();
	}
	
	@And("^validate on the size of the slider$")
	public void validate_on_the_size_of_the_slider() {
		SP.validateSliderView();
	}
	
	@Given("^user navigate to the given salesforce URL$")
	public void  user_navigate_to_the_given_salesforce_URL() {
		SP.saleforceURL();
	}
	
	
	@When("^user click on the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_click_on_the_Username_and_Password(String username, String password) {
	    SP.UserNameAndPassword(username, password);
	}
	
	
	@Then("^Click on the Login button$")
	public void Click_on_the_Login_button() {
		SP.loginButton();
	}
	
	@And("^Verify the user is able to login to application$")
	public void Verify_the_user_is_able_to_login_to_application() {
		
	}

	
}
