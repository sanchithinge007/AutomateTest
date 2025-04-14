package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	WebDriver driver;
	@Given("open the demo website")
	public void open_the_demo_website() {
		
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
	}

	@Then("enter userid {string} and password {string}")
	public void enter_userid_and_password(String string, String string2) {
	    driver.get("https://practice.expandtesting.com/register");
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
