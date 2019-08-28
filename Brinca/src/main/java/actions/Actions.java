package actions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Actions {

	private WebDriver driver;

	public Actions(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement findById(String idElement) {
		
		WebElement element = driver.findElement(By.id(idElement));
			return element;	
	}
	
	public WebElement findByName(String nameElement) {
		
		WebElement element = driver.findElement(By.name(nameElement));
			return element;	
	}
	
	public void AssertTextValue(String expectedTextValue, WebElement element){
		Assert.assertEquals(expectedTextValue, element.getText());
	}	
	
	
}
