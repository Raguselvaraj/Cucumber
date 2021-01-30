package com.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;

public class Login4 extends BaseClass {

	@FindBy(id = "first_name")
	private WebElement first_name;

	@FindBy(id = "last_name")
	private WebElement last_name;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement cc_num;

	@FindBy(id = "cc_type")
	private WebElement cc_type;

	@FindBy(id = "cc_exp_month")
	private WebElement cc_exp_month;

	@FindBy(id = "cc_exp_year")
	private WebElement cc_exp_year;

	@FindBy(id = "cc_cvv")
	private WebElement cvv;

	@FindBy(id = "book_now")
	private WebElement bookNow;

	@FindBy(id = "order_no")
	private WebElement order;

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_num() {
		return cc_num;
	}

	public WebElement getCc_type() {
		return cc_type;
	}

	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}

	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public WebElement getOrder() {
		return order;
	}

	public Login4() {

		PageFactory.initElements(driver, this);
	}

	public void detailsPage(String first_name, String last_name, String address, String cc_num, String cc_type,
			String cc_exp_month, String cc_exp_year, String cvv) throws InterruptedException {

		sendKeys(getFirst_name(), first_name);
		sendKeys(getLast_name(), last_name);
		sendKeys(getAddress(), address);
		sendKeys(getCc_num(), cc_num);
		dropDownByText(getCc_type(), cc_type);
		dropDownByText(getCc_exp_month(), cc_exp_month);
		dropDownByText(getCc_exp_year(), cc_exp_year);
		sendKeys(getCvv(), cvv);

		click(getBookNow());
		getAttribute(getOrder());

	}

}
