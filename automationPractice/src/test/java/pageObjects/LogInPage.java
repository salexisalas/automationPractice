package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String createEmail = "";
	
	//Mapping of Elemets
	
	@FindBy(id = "email")
	WebElement emaillbl;
	
	@FindBy(id = "passwd")
	WebElement passwdlbl;
	
	@FindBy(id = "SubmitLogin")
	WebElement submitBtn;
	
	@FindBy(className = "icon-home")
	WebElement homeBtn;
	
	@FindBy(id = "email_create")
	WebElement emailCreatelbl;
	
	@FindBy(id = "SubmitCreate")
	WebElement createBtn;
	
	//Methods declaration
	
	public void createAccount(String email) {
		emailCreatelbl.sendKeys(email);
		createEmail = email;
		this.createBtn.click();
	}
	public void signIn(String email,String pass) {
		emaillbl.sendKeys(email);
		passwdlbl.sendKeys(pass);
		submitBtn.click();
	}
	


}


