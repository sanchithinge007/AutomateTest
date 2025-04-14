package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.slf4j.event.Level.INFO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	WebDriver driver;
	private static final Logger LOW_LEVEL_LOGGER = LoggerFactory.getLogger(Login.class);
	@Given("open the demo website")
	public void open_the_demo_website() {
		
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
	}

	@Then("enter userid {string} and password {string}")
	public void enter_userid_and_password(String string, String string2) {
	    driver.get("https://practice.expandtesting.com/register");
	    LOW_LEVEL_LOGGER.info("Hi");
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("sanchit");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Hinge");
	    try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("click on logout")
	public void click_on_logout() {
	   System.out.println("Logout");
	}
}
