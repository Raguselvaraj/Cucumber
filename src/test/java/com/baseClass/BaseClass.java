package com.baseClass;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAndHoldAction;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	// BROWSER LAUNCH
	public void launchBrowser(String browser) {

		if (browser.equalsIgnoreCase("google")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\acer\\eclipse-workspace\\TShirtElephant\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Greens-12\\eclipse-workspace\\ragu\\TestNG\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.internetexplorer.driver",
					"C:\\Users\\Greens-12\\eclipse-workspace\\hari\\Greens\\Drivers\\geckodriver.exe");
			driver = new InternetExplorerDriver();
		}
		maximize();
		implicitWait();

	}

	// IMPLICIT WAIT
	public void implicitWait() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	// MAXIMIZE
	public void maximize() {

		driver.manage().window().maximize();
	}

	// URL
	public void launchUrl(String url) {

		driver.get(url);
	}

	// SEND KEYS
	public void sendKeys(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	// FORWARD
	public void forward() {

		driver.navigate().forward();
	}

	// BACK
	public void backward() {

		driver.navigate().back();
	}

	// REFRESH
	public void refresh() {

		driver.navigate().refresh();
	}

	// DROP DOWN(TEXT)
	public void dropDownText(WebElement element, String text) {

		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	// CLICK
	public void click(WebElement element) {

		element.click();
	}

	// QUIT
	public static void quit(WebDriver driver) {

		driver.quit();

	}

	// GET TEXT
	public void getText(WebElement element) {

		String text2 = element.getText();
		System.out.println(text2);

	}

	// GET ATTRIBUTE
	public void getAttribute(WebElement element) {

		String attribute = element.getAttribute("value");
		System.out.println("Your Value ::"+attribute);

	}

	// SCREEN SHOT
	public void screenShot(String name) throws Throwable {

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Greens-12\\eclipse-workspace\\ragu\\TestNG\\Screenshot\\" + name + ".png");
		FileUtils.copyFile(source, dest);
	}

	// CLEAR TEXT
	public void clearText(WebElement element) {

		element.clear();
	}

	// CLOSE
	public void close(WebDriver driver) {
		driver.close();

	}

	// SELECT
	// SELECT BY VISIBLE TEXT
	public void dropDownByText(WebElement element, String text) {

		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	// DE-SELECT BY VISIBLE TEXT
	public void dropDownDeselectText(WebElement element, String text) {

		Select select = new Select(element);
		select.deselectByVisibleText(text);

	}

	// SELECT BY INDEX VALUE
	public void dropDownByIndex(WebElement element, int num) {

		Select select = new Select(element);
		select.selectByIndex(num);
	}

	// SELECT BY INDEX VALUE
	public void dropDownDeselectIndex(WebElement element, int num) {

		Select select = new Select(element);
		select.deselectByIndex(num);

	}

	// SELECT BY VALUE
	public void dropDownByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);

	}

	// SELECT BY VALUE
	public void dropDownDeSelectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);

	}

	// DESELECT ALL
	public void deSelectAll(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectAll();

	}

	// GET ALL SELECTED OPTIONS
	public List<String> getAllSelectedOptions(WebElement element, String value) {
		List<String> l = new ArrayList<String>();
		List<WebElement> allSelectedOptions = new Select(element).getAllSelectedOptions();

		for (WebElement all : allSelectedOptions) {
			String text = all.getText();
			l.add(text);
		}
		System.out.println(l);
		return l;

	}

	// GET OPTIONS
	public List<String> getOptions(WebElement element, String value) {
		List<String> l = new ArrayList<String>();
		List<WebElement> options = new Select(element).getOptions();
		for (WebElement getoptions : options) {
			String text = getoptions.getText();

		}
		System.out.println(l);
		return l;

	}

	// GET FIRST SELECTED OPTIONS
	public WebElement getFirstSelectedOptions(WebElement element, String value) {

		WebElement option = new Select(element).getFirstSelectedOption();
		System.out.println(option);
		return option;
	}

	// IS MULTIPLE
	public boolean isMultiple(WebElement element) {

		boolean multiple = new Select(element).isMultiple();
		System.out.println(multiple);
		return multiple;
	}

	// ACTIONS
	// CLICK IN ACTION
	public void actionClick() {

		Actions ac = new Actions(driver);
		ac.click().build().perform();

	}

	// CLICK BY WEBELEMENT(WEB ELEMENT)
	public void actionClickByWebElement(WebElement target) {

		Actions a = new Actions(driver);
		a.click(target).perform();

	}

	// CLICK & HOLD
	public void ClickAndHoldAction() {

		Actions a = new Actions(driver);
		a.clickAndHold().build().perform();

	}

	// CLICK & HOLD(WEB ELEMENT)
	public void ClickAndHoldActionWebElement(WebElement target) {

		Actions a = new Actions(driver);
		a.clickAndHold(target).build().perform();
	}

	// CONTEXT CLICK
	public void contextClick() {

		Actions a = new Actions(driver);
		a.contextClick().build().perform();
	}

	// CONTEXT CLICK(WEB ELEMENT)
	public void contextClickWebElement(WebElement target) {

		Actions a = new Actions(driver);
		a.contextClick(target).build().perform();
	}

	// DOUBLE CLICK
	public void doubleclick() {

		Actions a = new Actions(driver);
		a.doubleClick().build().perform();
	}

	// DOUBLE CLICK(WEB ELEMENT)
	public void doubleclickWebElement(WebElement target) {

		Actions a = new Actions(driver);
		a.doubleClick(target).build().perform();
	}

	// CLICK & HOLD
	public void clickHold() {

		Actions a = new Actions(driver);
		a.clickAndHold().build().perform();

	}

	// CLICK & HOLD(WEB ELEMENT)
	public void clickHoldWebElement(WebElement target) {

		Actions a = new Actions(driver);
		a.clickAndHold(target).build().perform();

	}

	// Action
	public void action(WebElement target) {

		Actions a = new Actions(driver);
		a.moveToElement(target);

	}
	
	//SEND KEYS
    public void sendKeysAction(String text) {

    	Actions a=new Actions(driver);
    	a.sendKeys(text);
    	
	}
	
    //SEND KEYS
    public void sendKeysActionweb(WebElement target,String text) {

    	Actions a=new Actions(driver);
    	a.sendKeys(target, text);
	}
    
	
	// DRAG & DROP
	public void dragDrop(WebElement source, WebElement target) {

		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
	}

	// IS DISPLAYED
	public boolean isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
		return displayed;
	}

	// IS ENABLED
	public boolean isEnabled(WebElement element) {
		boolean displayed = element.isEnabled();
		System.out.println(displayed);
		return displayed;
	}

	// IS SELECTED
	public boolean isSelected(WebElement element) {
		boolean displayed = element.isSelected();
		System.out.println(displayed);
		return displayed;
	}

	//

}
