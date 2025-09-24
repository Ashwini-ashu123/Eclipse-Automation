package AllPages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class loginCred {
	
	WebDriver driver;
	
	
	public loginCred(WebDriver driver) {
		this.driver = driver;
		driver.manage().window().maximize();
	    PageFactory.initElements(driver,this);
		}
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="Login")
	WebElement Login;
	
	@FindBy(xpath="//h1//span[@class='slds-truncate']")
	WebElement title;
	
	@FindBy(xpath="//span[text()='App Launcher']/ancestor::button")
	WebElement dot;
	
	@FindBy(xpath="(//*[text()='All Warehouses'])[4]")
	WebElement AWHTab;
	
	@FindBy(xpath="(//span[contains(text(),'Enquiries')])[1]")
//	                (//span[text()='Enquiries'])[1]
	WebElement Enq;
	
	
	public void  saleforceURL() {
		driver.get("https://test.salesforce.com/");
	}
	
	public void UserNameAndPassword(String Username,String Password) {
		username.sendKeys(Username);
		password.sendKeys(Password);
		}
	
	public void loginButton() throws Exception {
		Login.click();
		Thread.sleep(10000);
		}
	
	public void verifyText(String Atitle) throws Exception {
		String Heading = title.getText();
		Thread.sleep(5000);
		String ActualHeads = Atitle;
		Assert.assertEquals(Heading, ActualHeads, "We are not landed on the correct page");
		Thread.sleep(5000);
	}
	
	public void EnqClick() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		dot.click();
		wait.until(ExpectedConditions.elementToBeClickable(AWHTab)).click();
		Thread.sleep(10000);
		Enq.click();
		String EText = Enq.getText();
		System.out.println(EText);
		 
	}

	
		
}
	
	


