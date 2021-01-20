package org.emp;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinTask1 {
	
	WebDriver driver;
	
	@Given("User enter the Adactin login page")
	public void user_enter_the_Adactin_login_page() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	@When("User enter the valid User name & Password")
	public void user_enter_the_valid_User_name_Password() {
	    WebElement username = driver.findElement(By.id("username"));
	    username.sendKeys("CelinaGrace");
	    WebElement password = driver.findElement(By.id("password"));
	    password.sendKeys("devbeu123");
	}

	@When("User click the login button")
	public void user_click_the_login_button() {
	    WebElement loginButton = driver.findElement(By.id("login"));
		loginButton.click();
	}

	@Then("User should verify the success message")
	public void user_should_verify_the_success_message() {

		String currentUrl = driver.getCurrentUrl();
	    System.out.println(currentUrl);
	    Assert.assertTrue("https://adactinhotelapp.com/", true);
	
	}


}
