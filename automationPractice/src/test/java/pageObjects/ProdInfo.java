

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProdInfo {

	public ProdInfo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Mapping of Elements

	@FindBy(id = "send_friend_button")
	WebElement friendbtn;

	@FindBy(id = "friend_name")
	WebElement namelbl;

	@FindBy(id = "friend_email")
	WebElement emaillbl;

	@FindBy(id = "sendEmail")
	WebElement sendbtn;

	@FindBy(xpath = "//*[@id=\"send_friend_form_content\"]/p/a")
	WebElement cancel;

	@FindBy(xpath = "//*[@id=\"product\"]/div[2]/div/div/a")
	WebElement close;

	@FindBy(xpath = "//*[@id=\"product_comments_block_extra\"]/ul/li/a")
	WebElement review;

	@FindBy(id = "comment_title")
	WebElement titlerev;

	@FindBy(id = "content")
	WebElement comment;

	@FindBy(id = "submitNewMessage")
	WebElement submitrev;

	@FindBy(xpath = "//*[@id=\"new_comment_form_footer\"]/p[2]/a")
	WebElement cancelrev;

	@FindBy(xpath = "//*[@id=\"product\"]/div[2]/div/div/a")
	WebElement closerev;

	@FindBy(xpath = "//*[@id=\"add_to_cart\"]/button")
	WebElement addcart;

	@FindBy(xpath = "//*[@id=\"criterions_list\"]/li/div[1]/div[6]/a")
	WebElement fivestars;
	
	//Methods declaration

	public void friendemailbtn() {
		friendbtn.click();
	}

	public void fillFields(String name, String email) {
		namelbl.sendKeys(name);
		emaillbl.sendKeys(email);
	}

	public void sendFriendemail() {
		sendbtn.click();
	}

	public void cancelFriendemail() {
		cancel.click();
	}

	public void closeFriendemail() {
		close.click();
	}

	public void reviewBtn() {
		review.click();
	}

	public void FillReview(String title, String Comment) {
		titlerev.sendKeys(title);
		comment.sendKeys(Comment);
		fivestars.click();
	}

	public void submitMessage() {
		submitrev.click();
	}

	public void cancelMessage() {
		cancelrev.click();
	}

	public void closeMessage() {
		closerev.click();
	}

	public void Addcartbtn() {
		addcart.click();
	}

}
