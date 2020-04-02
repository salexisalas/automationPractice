package snippet;

public class Snippet {
	 WebElement cMessage = driver.findElement(By.xpath("//p[@class=\"alert alert-success\"]"));
		    Assert.assertTrue(cMessage.getText().equals(message));
}

