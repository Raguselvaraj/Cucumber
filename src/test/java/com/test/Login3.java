package com.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;

public class Login3 extends BaseClass {

	@FindBy(id = "radiobutton_0")
	private WebElement radioButton;

	@FindBy(id = "continue")
	private WebElement cont;

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getCont() {
		return cont;
	}
	
	public void hotelSelect() {

		click(getRadioButton());
		click(getCont());
	}

	public Login3() {
	
      PageFactory.initElements(driver,this);
	}

}
