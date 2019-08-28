package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import actions.Actions;

public class HomePage {
 
	private Actions actions;
	
	public HomePage(WebDriver driver) {
		actions = new Actions(driver);
	}
	
	public void checkHomePage() {
		//actions.checkContentElementById("abc");
	}
	 
	public void checkHeaderContent() {
		
		WebElement element = actions.findById("header");
		actions.AssertTextValue("abc", element);
		
	}
	
}
