package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	public CreateAccount(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Mapping of elements
	
	@FindBy(xpath = "//*[@id=\"id_gender1\"]")
	WebElement radioTitleMr;

	@FindBy(xpath = "//*[@id=\"id_gender2\"]")
	WebElement radioTitleMrs;

	@FindBy(xpath = "//*[@id=\"customer_firstname\"]")
	WebElement txtFirstName;

	@FindBy(xpath = "//*[@id=\"customer_lastname\"]")
	WebElement txtLastName;

	@FindBy(xpath = "//*[@id=\"email\"]")
	WebElement txtEmail;

	@FindBy(xpath = "//*[@id=\"passwd\"]")
	WebElement txtPassword;

	@FindBy(xpath = "//*[@id=\"days\"]")
	WebElement selectDay;

	@FindBy(xpath = "//*[@id=\"months\"]")
	WebElement selectMonth;

	@FindBy(xpath = "//*[@id=\"years\"]")
	WebElement selectYear;

	@FindBy(xpath = "//*[@id=\"newsletter\"]")
	WebElement radioNewsLetter;

	@FindBy(xpath = "//*[@id=\"optin\"]")
	WebElement radioOffers;

	// Your Address
	@FindBy(xpath = "//*[@id=\"firstname\"]")
	WebElement txtFirstNameAddress;

	@FindBy(xpath = "//*[@id=\"lastname\"]")
	WebElement txtLastNameAddress;

	@FindBy(xpath = "//*[@id=\"company\"]")
	WebElement txtCompany;

	@FindBy(xpath = "//*[@id=\"address1\"]")
	WebElement txtAddress;

	@FindBy(xpath = "//*[@id=\"address2\"]")
	WebElement txtAddress2;

	@FindBy(xpath = "//*[@id=\"city\"]")
	WebElement txtCity;

	@FindBy(xpath = "//*[@id=\"id_state\"]")
	WebElement selectState;

	@FindBy(xpath = "//*[@id=\"postcode\"]")
	WebElement txtZipCode;

	@FindBy(xpath = "//*[@id=\"id_country\"]")
	WebElement selectCountry;

	@FindBy(xpath = "//*[@id=\"other\"]")
	WebElement txtAdditionalInfo;

	@FindBy(xpath = "//*[@id=\"phone\"]")
	WebElement txtHomePhone;

	@FindBy(xpath = "//*[@id=\"phone_mobile\"]")
	WebElement txtMobile;

	@FindBy(xpath = "//*[@id=\"alias\"]")
	WebElement txtAddressAlias;

	@FindBy(xpath = "//*[@id=\"submitAccount\"]")
	WebElement btnRegister;
	
	//Method declaration

	public void getTitle() {

	}

	public void getFirstName(String name) {
		txtFirstName.sendKeys(name);
	}

	public void getLastName(String lastName) {
		txtLastName.sendKeys(lastName);
		txtLastNameAddress.sendKeys(lastName);
	}

	public void getEmail(String email) {
		txtEmail.getText().equals(email);
	}

	public void getPassword(String password) {
		txtPassword.sendKeys(password);
	}

	public void getDOB() {

	}

	public void newsLetterClick() {

	}

	public void specialOffersClick() {

	}

	public void getFirstNameAddress(String name) {
		txtFirstNameAddress.getText().equals(name);
	}

	public void getLastNameAddress(String lastName) {
		txtLastNameAddress.getText().equals(lastName);
	}

	public void getCompany() {

	}

	public void getAddress(String address) {
		txtAddress.sendKeys(address);
	}

	public void getAddress2() {

	}

	public void getCity(String city) {
		txtCity.sendKeys(city);
	}

	public void getState(String state) {
		Select selectedState =  new Select(selectState);
		selectedState.selectByVisibleText(state);
	}
	
	public void getZipCode(String zipCode) {
		txtZipCode.sendKeys(zipCode);
	}

	public void getCountry(String country) {
		Select selectedCountry =  new Select(selectCountry);
		selectedCountry.selectByVisibleText(country);
	}

	public void getAdditionalInfo() {

	}

	public void getHomePhone() {

	}

	public void getMobilePhone(String mobile) {
		txtMobile.sendKeys(mobile);
	}
	
	public void getAddressAlias(String addressAlias) {
		txtAddressAlias.clear();
		txtAddressAlias.sendKeys(addressAlias);
	}
	
	public void registerClick() {
		btnRegister.click();
	}

}
