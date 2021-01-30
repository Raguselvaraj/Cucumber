package com.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;

public class Login2 extends BaseClass {

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(id = "room_type")
	private WebElement roomtype;

	@FindBy(name = "room_nos")
	private WebElement room_nos;

	@FindBy(id = "datepick_in")
	private WebElement datepick_in;

	@FindBy(id = "datepick_out")
	private WebElement datepick_out;

	@FindBy(id = "adult_room")
	private WebElement adult_room;

	@FindBy(id = "child_room")
	private WebElement child_room;

	@FindBy(id = "Submit")
	private WebElement submit;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}

	public WebElement getDatepick_in() {
		return datepick_in;
	}

	public WebElement getDatepick_out() {
		return datepick_out;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	public WebElement getChild_room() {
		return child_room;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public Login2() {

		PageFactory.initElements(driver, this);
	}
	
	public void searchPage(String location,String hotels,String roomtype,String room_nos,String datepick_in,String datepick_out,String adult_room,String child_room) {

		dropDownByText(getLocation(),location);
		dropDownByText(getHotels(), hotels);
		dropDownByText(getRoomtype(),roomtype);
		dropDownByText(getRoom_nos(),room_nos);
	    sendKeys(getDatepick_in(), datepick_in);
        sendKeys(getDatepick_out(), datepick_out);
		dropDownByText(getAdult_room(),adult_room);
		dropDownByText(getChild_room(), child_room);
		click(getSubmit());	
		
	}

}