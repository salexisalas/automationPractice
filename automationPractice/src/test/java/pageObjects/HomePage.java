package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Mapping of elements
	
	@FindBy(className = "product_img_link")
	WebElement productBtn;
	
	@FindBy(xpath = "//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[2]")
	WebElement nameProd;
	
	@FindBy(className = "quick-view")
	WebElement viewBtn;
	
	@FindBy(xpath = "//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]/span")
	WebElement addBtn;
	
	@FindBy(linkText = "Proceed to checkout")
	WebElement proceedBtn;
	
	//Methods declaration
	
	public void clickProduct(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(productBtn).perform();
	}
	
	public void productClick() {
	nameProd.click();
	}
	
	public void clickAdd() {
		addBtn.click();
	}
	
	public void clickProceed() {
		proceedBtn.click();

	}
	
	
}
