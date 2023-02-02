package StepsForHooks;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDemoSteps {

	WebDriver driver = null;

	@Before("@smoke")
	public void browserSetup() {

		System.out.println("===I am inside browser setup====");
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}
	@After
	public void teardown() {
		
		System.out.println("====I am inside teardown====");
		driver.close();
	}
	@BeforeStep
	public void beforesteps() {
		System.out.println("===i am inside before steps======");
	}
	@AfterStep
	public void aftersteps() {
		System.out.println("====i am inside after steps=====");
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {

	}

	@When("user enters valid sername ans password")
	public void user_enters_valid_sername_ans_password() {

	}

	@And("cliks on login button")
	public void cliks_on_login_button() {

	}

	@Then("user is navigatod to home page")
	public void user_is_navigatod_to_home_page() {

	}

}
