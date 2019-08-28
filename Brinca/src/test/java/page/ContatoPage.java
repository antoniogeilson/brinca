package page;

import org.openqa.selenium.WebDriver;

import actions.Actions;

public class ContatoPage {

	private Actions actions;
	
	public ContatoPage(WebDriver driver) {
		actions = new Actions(driver);
	}
	
}
