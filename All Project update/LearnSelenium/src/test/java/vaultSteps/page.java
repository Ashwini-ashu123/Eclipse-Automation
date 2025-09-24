package vaultSteps;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page {
	WebDriver driver;

	public page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "j_username")
	WebElement username;
	
	@FindBy(id="j_password")
	WebElement pass;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement login;
	
	@FindBy(xpath = "//span[text()='Prana-Quality Suite']")
	WebElement pranasuit;
	
	@FindBy(xpath = "//li[@class='vv-navbar-dropdown-menu-item vv-vault-switch-menu-item']/a/span")
	WebElement Check_Prana_Quality_Suite;
	
	@FindBy(xpath = "//button[@aria-label='Select a Vault']")
	WebElement selectvault;
	
	@FindBy(xpath = "//li[@class='vv-navbar-dropdown-menu-item vv-vault-switch-menu-item']/a/span")
	WebElement clickEtmf;
	
	public void openbrowser(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public void enterCredential(String string, String string2) {
		username.clear();
		username.sendKeys(string,Keys.ENTER);
		pass.clear();
		pass.sendKeys(string2);
	}
	
	public void login() {
		login.click();
	}
	
	public  void check_Prana_Quality() {
		String prana=pranasuit.getText();
		System.out.println(prana);
		if(prana.equals("Prana-Quality Suite")) {
			selectvault.click();
			clickEtmf.click();
		}else {
//			pranasuit.click();
//			Check_Prana_Quality_Suite.click();
		}
			
	}

}
