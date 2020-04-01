package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {
	public CreateAccount(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Personal Information
	@FindBy(xpath= "//*[@id=\"id_gender1\"]")
	WebElement radioTitleMr;
	
	@FindBy(xpath= "//*[@id=\"id_gender2\"]")
	WebElement radioTitleMrs;
	
	@FindBy(xpath= "//*[@id=\"customer_firstname\"]")
	WebElement txtFirstName;

	@FindBy(xpath= "//*[@id=\"customer_lastname\"]")
	WebElement txtLastName;
	
	@FindBy(xpath= "//*[@id=\"email\"]")
	WebElement txtEmail;
	
	@FindBy(xpath= "//*[@id=\"passwd\"]")
	WebElement txtPassword;
	
	@FindBy(xpath= "//*[@id=\"days\"]")
	WebElement selectDay;
	
	@FindBy(xpath= "//*[@id=\"months\"]")
	WebElement selectMonth;
	
	@FindBy(xpath= "//*[@id=\"years\"]")
	WebElement selectYear;
	
	@FindBy(xpath= "//*[@id=\"newsletter\"]")
	WebElement radioNewsLetter;
	
	@FindBy(xpath= "//*[@id=\"optin\"]")
	WebElement radioOffers;
	
	//Your Address	
	@FindBy(xpath= "//*[@id=\"firstname\"]")
	WebElement txtFirstNameAddress;

	@FindBy(xpath= "//*[@id=\"lastname\"]")
	WebElement txtLastNameAddress;
	
	@FindBy(xpath= "//*[@id=\"company\"]")
	WebElement txtCompany;
	
	@FindBy(xpath= "//*[@id=\"address1\"]")
	WebElement txtAddress;
	
	@FindBy(xpath= "//*[@id=\"address2\"]")
	WebElement txtAddress2;
	
	@FindBy(xpath= "//*[@id=\"city\"]")
	WebElement txtCity;
	
	@FindBy(xpath= "//*[@id=\"id_state\"]")
	WebElement selectState;
	
	@FindBy(xpath= "//*[@id=\"postcode\"]")
	WebElement txtZipCode;
	
	@FindBy(xpath= "//*[@id=\"id_country\"]")
	WebElement selectCountry;
	
	@FindBy(xpath= "//*[@id=\"other\"]")
	WebElement txtAdditionalInfo;
	
	@FindBy(xpath= "//*[@id=\"phone\"]")
	WebElement txtHomePhone;
	
	@FindBy(xpath= "//*[@id=\"phone_mobile\"]")
	WebElement txtMobile;
	
	@FindBy(xpath= "//*[@id=\"alias\"]")
	WebElement txtAddressAlias;
	
	@FindBy(xpath= "//*[@id=\"submitAccount\"]")
	WebElement btnRegister;
	
}
