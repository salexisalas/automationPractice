package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage {

	
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
	
	
//	public void clickProceed() {
//		proceedBtn.click();
//		proceedBtn2.click();
//		agreeCheckBox.click();
//		proceedBtn3.click();
//		bankWireBtn.click();
//	}
//	
//	public void clickConfirm() {
//		proceedBtn2.click();	
//	}
//	
//	public String getConfirmationTitle() {
//		System.out.println(confirmationTitle.getText());
//		return confirmationTitle.getText();
//	}
}
