package com.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseClass.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactinFinal extends BaseClass {

	Login1 login1;
	Login2 login2;
	Login3 login3;
	Login4 login4;

	@Given("User open the adactin login page & enter the {string} & {string}")
	public void user_open_the_adactin_login_page_enter_the(String username, String password) {

		launchBrowser("GOOGLE");
		launchUrl("https://adactinhotelapp.com/");
		login1 = new Login1();
		login1.loginPage(username, password);
        driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	}

	@When("User enter the {string},{string},{string},{string},{string},{string},{string},{string} & Click the Search button")
	public void user_enter_the_Click_the_Search_button(String location, String hotels, String roomtype, String room_nos,
			String datepick_in, String datepick_out, String adult_room, String child_room) {
		login2 = new Login2();
		login2.searchPage(location, hotels, roomtype, room_nos, datepick_in, datepick_out, adult_room, child_room);
		
	}

	@When("User navigate to select hotel page & click the Radio button")
	public void user_navigate_to_select_hotel_page_click_the_Radio_button() {

		login3 = new Login3();
	    login3.hotelSelect();
	}

	

	@When("user should navigate to Book a hotel page & enter {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_navigate_to_Book_a_hotel_page_enter(String first_name, String last_name, String address,
			String cc_num, String cc_type, String cc_exp_month, String cc_exp_year, String cvv) throws InterruptedException {

		login4 = new Login4();
		login4.detailsPage(first_name, last_name, address, cc_num, cc_type, cc_exp_month, cc_exp_year, cvv);
	}

	@When("User Click the Book Now button")
	public void user_Click_the_Book_Now_button() {

		click(login4.getBookNow());

	}

	@Then("User Check the order Number")
	public void user_Check_the_order_Number() throws InterruptedException {

		getAttribute(login4.getOrder());

		close(driver);
	}
}
