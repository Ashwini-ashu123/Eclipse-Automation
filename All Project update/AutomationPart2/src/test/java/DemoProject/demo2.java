package DemoProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo2 {

    public static void main(String[] args) throws InterruptedException {
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.navigate().to("https://practice.automationtesting.in/");
        
        List<WebElement> listOfElement = driver.findElements(By.xpath("//ul[@id='main-nav']//a"));
        int count = listOfElement.size();
        System.out.println("Total menu items: " + count);
        
        for(int i = 1; i <= 3; i++) {
            WebElement element = driver.findElement(By.xpath("(//ul[@id='main-nav']//a)[" + i + "]"));
            
            String text = element.getText().trim();
            System.out.println("Count " + i + " → Title: " + text);
            
            element.click();
            
            String url = driver.getCurrentUrl(); 
            String title = driver.getTitle();
            
            System.out.println("URL: " + url);
            System.out.println("Page Title: " + title);
            
        
            switch(text.toLowerCase()) {
            
                case "shop":
                    String refineText = driver.findElement(By.xpath("//aside/div/h4[contains(text(),'Refine By')]")).getText();
                    if(refineText.equalsIgnoreCase("Refine By >")) {
                        System.out.println(" Landed on the Shop page");
                    } else {
                        System.out.println("Not navigated to Shop page");
                    }
                    break;
                    
                case "my account":
                    String loginText = driver.findElement(By.xpath("//div/h2[contains(text(),'Login')]")).getText();
                    if(loginText.equalsIgnoreCase("Login")) {
                        System.out.println(" Landed on the My Account page");
                    } else {
                        System.out.println(" Not navigated to My Account page");
                    }
                    break;
                    
                case "test cases":
                    String testCaseText = driver.findElement(By.xpath("(//div/h2/span)[1]")).getText();
                    if(testCaseText.equalsIgnoreCase(testCaseText)) {
                        System.out.println("Landed on the Test Cases page");
                    } else {
                        System.out.println(" Not navigated to Test Cases page");
                    }
                    break;
                    
                default:
                    System.out.println(" No verification rule for: " + text);
                    break;
            }
            
            
            driver.navigate().back();
            Thread.sleep(1000); 
        }
        
        driver.quit();
        
      
    }
}
