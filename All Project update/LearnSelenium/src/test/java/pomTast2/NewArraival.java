package pomTast2;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewArraival {
	WebDriver driver;
	
	@FindBy(linkText = "Shop")
	WebElement shopclick;
	
	@FindBy(linkText = "Home")
	WebElement homeClick;
	
	@FindBy(xpath = "//div[@class='col3-1 first sub_column sub_column_1-0-2-0 sub_column_post_22']/..//img")
	List<WebElement> listarravial;
	
	public NewArraival(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void shopClick() {
		shopclick.click();
	}
	public void homeClick() {
		homeClick.click();
	}

	public int arrivals() {
		return listarravial.size();
	}
	
}
