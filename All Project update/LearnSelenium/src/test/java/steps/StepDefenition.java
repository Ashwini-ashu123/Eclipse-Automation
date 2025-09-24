package steps;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;



public class StepDefenition {
	WebDriver driver=new ChromeDriver();
	page testcase=new page(driver);
	
	@Given("Login in Shop page")
	public void Login_in_Shop_page() {
		testcase.login();
		testcase.clickshop();
		
	}
	
	@When("user navigate to shop page")
public void user_navigate_to_shop_page() {
		testcase.clickshop();
		
	}
	
	 @And("user click on Home menu button")
public void  user_click_on_Home_menu_button() {
		 testcase.clickHome();
	
}
	@Then("user validate home page has three Slider only")
public void user_validate_home_page_has_three_Slider_only() {
		int actualslider=testcase.validateslider();
		int expectedslider=3;
		System.out.println("Validate");
		Assert.assertEquals(actualslider, expectedslider);
			
}
@When("user click the image in the arrivals")
public void click_the_image_in_the_arrivals() {
	testcase.clickimg();
}
	
@Then("user validate whether its navigating to next page")
public void navigating_to_next_page() {
	String actualurl= driver.getCurrentUrl();
	System.out.println(driver.getCurrentUrl());
	String expectedUrl="https://practice.automationtesting.in/product/thinking-in-html/";
	Assert.assertEquals(actualurl,expectedUrl);
	
	
}
@When("user click on add to basket")
public void user_click_on_add_to_basket() {
	testcase.clickaddtobasket();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}

@Then("user validate the view the book in the menu item")
public void validate_the_view_the_book_in_the_menu_item() {
	String cart=testcase.checkcart();
	String expectedCart="1 Item";
	Assert.assertEquals(cart, expectedCart);
}

@And("user click on the item link in menu item")
public void click_on_the_item_link() {
	testcase.checkcart.click();
}



@Then("user check it navigate to check out page")
public void user_check_it_navigate_to_check_out_page() {
	String actualurl= driver.getCurrentUrl();
	System.out.println(driver.getCurrentUrl());
	String expectedUrl="https://practice.automationtesting.in/basket/";
	Assert.assertEquals(actualurl,expectedUrl);
}
@When("user enter Coupon code as ‘krishnasakinala’ to get 50rps")
public void enter_Coupon_code() {
	testcase.coupon();
		
}
@Then("user validate the coupon amount is validate")
public void validate_the_coupon() {
	testcase.clickcoupon();
}

	

}
