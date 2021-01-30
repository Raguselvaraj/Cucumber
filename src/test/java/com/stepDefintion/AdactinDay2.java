package com.stepDefintion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.baseClass.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinDay2 extends BaseClass {

/*	WebDriver driver;

	@Given("User open the adactin login page & enter the {string} & {string}")
	public void user_open_the_adactin_login_page_enter_the(String string, String string2) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(string);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(string2);
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}

	@When("User enter the {string},{string},{string},{string},{string},{string},{string},{string} & Click the Search button")
	public void user_enter_the_Click_the_Search_button(String string, String string2, String string3, String string4,
			String string5, String string6, String string7, String string8) {

		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByVisibleText(string);

		WebElement hotels = driver.findElement(By.id("hotels"));
		Select r = new Select(hotels);
		r.selectByVisibleText(string2);

		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select w = new Select(roomtype);
		w.selectByVisibleText(string3);

		WebElement roomnos = driver.findElement(By.id("room_nos"));
		Select q = new Select(roomnos);
		q.selectByVisibleText(string4);

		WebElement checkIn = driver.findElement(By.id("datepick_in"));
		checkIn.clear();
		checkIn.sendKeys(string5);

		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.clear();
		checkout.sendKeys(string6);

		WebElement adult = driver.findElement(By.id("adult_room"));
		Select o = new Select(adult);
		o.selectByVisibleText(string7);

		WebElement child = driver.findElement(By.id("child_room"));
		Select m = new Select(child);
		m.selectByVisibleText(string8);

		WebElement search = driver.findElement(By.id("Submit"));
		search.click();

	}

	@When("User navigate to select hotel page & click the Radio button")
	public void user_navigate_to_select_hotel_page_click_the_Radio_button() {

		WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));
		radiobutton.click();
	}

	@When("user click the continue button")
	public void user_click_the_continue_button() {

		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();

	}

	@When("user should navigate to Book a hotel page & enter {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_navigate_to_Book_a_hotel_page_enter(String string, String string2, String string3,
			String string4, String string5, String string6, String string7, String string8) {

		WebElement first = driver.findElement(By.id("first_name"));
		first.sendKeys(string);

		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys(string2);

		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys(string3);

		WebElement cardnum = driver.findElement(By.id("cc_num"));
		cardnum.sendKeys(string4);

		WebElement cardtype = driver.findElement(By.id("cc_type"));
		Select s = new Select(cardtype);
		s.selectByVisibleText(string5);

		WebElement expDate = driver.findElement(By.id("cc_exp_month"));
		Select w = new Select(expDate);
		w.selectByVisibleText(string6);

		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select o = new Select(year);
		o.selectByVisibleText(string7);

		WebElement cvvnum = driver.findElement(By.id("cc_cvv"));
		cvvnum.sendKeys(string8);
	}

	@When("User Click the Book Now button")
	public void user_Click_the_Book_Now_button() {

		WebElement bookNow = driver.findElement(By.id("book_now"));
		bookNow.click();

	}

	@Then("User Check the order Number")
	public void user_Check_the_order_Number() throws InterruptedException {

		WebElement orderNum = driver.findElement(By.id("order_no"));
		String text = orderNum.getAttribute("value");
		System.out.println("Your order number is" + text);
		
		Thread.sleep(5000);

		driver.close();
	}
*/
	
	

	@Given("User open the adactin login page & enter the {string} & {string}")
	public void user_open_the_adactin_login_page_enter_the(String string, String string2) {

		launchBrowser("GOOGLE");
		launchUrl("https://adactinhotelapp.com/");
		WebElement username = driver.findElement(By.id("username"));
		sendKeys(username, string);
		WebElement password = driver.findElement(By.id("password"));
		sendKeys(password, string2);
		WebElement login = driver.findElement(By.id("login"));
		click(login);
	}

	@When("User enter the {string},{string},{string},{string},{string},{string},{string},{string} & Click the Search button")
	public void user_enter_the_Click_the_Search_button(String string, String string2, String string3, String string4,
			String string5, String string6, String string7, String string8) {

		WebElement location = driver.findElement(By.id("location"));
		dropDownByText(location, string);

		WebElement hotels = driver.findElement(By.id("hotels"));
		dropDownByText(hotels, string2);
		
		WebElement roomtype = driver.findElement(By.id("room_type"));
		dropDownByText(roomtype, string3);
		
		WebElement roomnos = driver.findElement(By.id("room_nos"));
		dropDownByText(roomnos, string4);
		
		WebElement checkIn = driver.findElement(By.id("datepick_in"));
		clearText(checkIn);
		sendKeys(checkIn, string5);
		
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		clearText(checkout);
		sendKeys(checkout, string6);
		
		WebElement adult = driver.findElement(By.id("adult_room"));
		dropDownByText(adult, string7);
		
		WebElement child = driver.findElement(By.id("child_room"));
		dropDownByText(child, string8);
		
		WebElement search = driver.findElement(By.id("Submit"));
		click(search);

	}

	@When("User navigate to select hotel page & click the Radio button")
	public void user_navigate_to_select_hotel_page_click_the_Radio_button() {

		WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));
        click(radiobutton);
	}

	@When("user click the continue button")
	public void user_click_the_continue_button() {

		WebElement cont = driver.findElement(By.id("continue"));
		click(cont);

	}

	@When("user should navigate to Book a hotel page & enter {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_navigate_to_Book_a_hotel_page_enter(String string, String string2, String string3,
			String string4, String string5, String string6, String string7, String string8) {

		WebElement first = driver.findElement(By.id("first_name"));
        sendKeys(first,string);
		
		WebElement lastname = driver.findElement(By.id("last_name"));
		sendKeys(lastname, string2);

		WebElement address = driver.findElement(By.id("address"));
		sendKeys(address, string3);

		WebElement cardnum = driver.findElement(By.id("cc_num"));
        sendKeys(cardnum, string4);
		
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		sendKeys(cardtype, string5);
		
		WebElement expDate = driver.findElement(By.id("cc_exp_month"));
		sendKeys(expDate, string6);
		
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		sendKeys(year, string7);
		
		WebElement cvvnum = driver.findElement(By.id("cc_cvv"));
        sendKeys(cvvnum, string8);
	}

	@When("User Click the Book Now button")
	public void user_Click_the_Book_Now_button() {

		WebElement bookNow = driver.findElement(By.id("book_now"));
		click(bookNow);

	}

	@Then("User Check the order Number")
	public void user_Check_the_order_Number() throws InterruptedException {

		WebElement orderNum = driver.findElement(By.id("order_no"));
		getAttribute(orderNum);
		Thread.sleep(5000);

		driver.close();
	}

}
