package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	public ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Proceed to checkout")
	WebElement proceedBtn;
	
	@FindBy(css = "button.button.btn.btn-default.button-medium")
	WebElement proceedBtn2;
	
	@FindBy(css = "button.button.btn.btn-default.standard-checkout.button-medium")
	WebElement proceedBtn3;
	
	@FindBy(id = "cgv")
	WebElement agreeCheckBox;
	
	@FindBy(className = "bankwire")
	WebElement bankWireBtn;
	
	@FindBy(className = "page-heading")
	WebElement confirmationTitle;
	
	@FindBy(className = "fancybox-error")
	WebElement agreeError;
	
	public void clickProceed() {
		proceedBtn.click();

	}
	
	public void proceedNAgree() {
		proceedBtn2.click();
		agreeCheckBox.click();
		proceedBtn3.click();
	}
	
	public void proceedNDontAgree() {
		proceedBtn2.click();
		proceedBtn3.click();
	}

	
	public void completeCheckout() {
		proceedNAgree();
		bankWireBtn.click();
		proceedBtn2.click();
	}
	
	public String getConfirmationTitle() {
		System.out.println(confirmationTitle.getText());
		return confirmationTitle.getText();
	}
	public String getAgreeError() {
		return agreeError.getText();
	}
}
