package steps;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import actions.Actions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.AnunciePage;
import page.AssocieSePage;
import page.ContatoPage;
//import enviroment.Hooks;
import page.HomePage;
import page.SejaVoluntarioPage;
import page.UtilidadesPage;

public class BrincaSteps {

	private WebDriver driver;
	//private Actions actions;
	private HomePage homePage;
	private AnunciePage anunciePage;
	private AssocieSePage associeSePage;
	private ContatoPage contatoPage;
	private SejaVoluntarioPage sejaVoluntarioPage;
	private UtilidadesPage utilidadesPage;

	@Before
	public void Initialize()
	{
		driver = new ChromeDriver();
		//driver.get("http://www.google.com");
		//actions = new Actions(driver);
		homePage = new HomePage(driver);
		anunciePage = new AnunciePage(driver);
		associeSePage = new AssocieSePage(driver);
		contatoPage = new ContatoPage(driver);
		sejaVoluntarioPage = new SejaVoluntarioPage(driver);
		utilidadesPage = new UtilidadesPage(driver);
	}

	@After
	public void Finalize()
	{
		//driver.quit();
	}


	@Given("^I am on brinca Website$")
	public void iAmOnBrincaWebsite() throws Throwable {
		//driver.get("/");
	}

	@When("^I check header content$")
	public void iCheckHeaderContent() throws Throwable {
		homePage.checkHomePage();
	}

	@Then("^I can see header content$")
	public void iCanSeeHeaderContent() throws Throwable {
		System.out.println("abc");
	}

	@When("^I check body content$")
	public void iCheckBodyContent() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@Then("^I can see body content$")
	public void iCanSeeBodyContent() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@When("^I check footer content$")
	public void iCheckFooterContent() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@Then("^I can see footer content$")
	public void iCanSeeFooterContent() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@When("^I click on brinca logo$")
	public void iClickOnBrincaLogo() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@Then("^I can see homepage$")
	public void iCanSeeHomepage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@When("^I check associe_se$")
	public void iCheckAssocie_se() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@Then("^I can see associe_se content$")
	public void iCanSeeAssocie_seContent() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@When("^I check vantagens$")
	public void iCheckVantagens() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@Then("^I can see vantagens content$")
	public void iCanSeeVantagensContent() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@When("^I check depoimentos$")
	public void iCheckDepoimentos() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@Then("^I can see depoimentos content$")
	public void iCanSeeDepoimentosContent() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@When("^I check parceiros$")
	public void iCheckParceiros() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@Then("^I can see parceiros content$")
	public void iCanSeeParceirosContent() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@Given("^I am on associe se$")
	public void iAmOnAssocieSe() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@When("^I fill on fields$")
	public void iFillOnFields() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@Then("^I can see a confirmation message$")
	public void iCanSeeAConfirmationMessage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@When("^I I click on associe_se \\(footer link\\)$")
	public void iIClickOnAssocie_seFooterLink() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@When("^I click on Vantagens Link \\(footer link\\)$")
	public void iClickOnVantagensLinkFooterLink() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@Then("^I can see Vantagens Page$")
	public void iCanSeeVantagensPage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@When("^I click on contato Link \\(footer link\\)$")
	public void iClickOnContatoLinkFooterLink() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@Then("^I can see Contato Page$")
	public void iCanSeeContatoPage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@When("^I I click on associe_se_footer link$")
	public void iIClickOnAssocie_se_footerLink() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^I click on Vantagens_footer link$")
	public void iClickOnVantagens_footerLink() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^I click on contato_footer link$")
	public void iClickOnContato_footerLink() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^I click on seja Voluntario_footer link$")
	public void iClickOnSejaVoluntario_footerLink() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^I can see seja voluntario Page$")
	public void iCanSeeSejaVoluntarioPage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

}
