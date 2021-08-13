package coading.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CoadingPage{



WebDriver driver;	



      private WebElement welcomePage;


	public CoadingPage(WebDriver driver) {
	
		PageFactory.initElements(driver, this); 

	}

   @FindBy (how = How.XPATH,using = "//*[@class='login']")  
   private static  WebElement SignInButton;

   @FindBy (how = How.XPATH,using = "//*[@id='email']" )
   
   
   private static WebElement emailaddress;


   @FindBy (how = How.XPATH,using = "//*[@type='password']")      
	private static WebElement password;


   @FindBy (how = How.XPATH,using = "//*[@id='SubmitLogin']")
   private static WebElement SignInBtn1; 


  // @FindBy (how = How.XPATH,using = "//*[@title = 'Contact Us']")
  // private static WebElement welcomePage1;


   @FindBy (how = How.XPATH,using = "(//*[@title='Dresses'])[2]")   
   private static WebElement DressesBtn;

   @FindBy (how = How.XPATH, using= ("//*[@class='product-desc']/following-sibling::div[1]")) /*(actualTitle));*/
   private static WebElement price5;
	

   

public void clickOnSignInButton() {

	SignInButton.click();	
	
	
}

public void enterEmailAddressAndPassword() {

	emailaddress.sendKeys("zamankabir1571@gmail.com");
	password.sendKeys("Tanishatayma1$");

}

public void userClickOnSignInButton() {
	

	SignInBtn1.click();
	
}

public void userNevigateToWelcomePage() {

	
	welcomePage.click();
	
	
	
}

public void clickOnTheUpperLeftCornerDresses() {
	
	
	DressesBtn.click(); 
	
}
public void pricevaluedecendingshortedorder() {
	
	
	List<WebElement> AllPrices = driver.findElements(By.xpath("//*[@class='product-desc']/following-sibling::div[1]")); /*(actualTitle));*/
    ArrayList<String> NewList = new ArrayList<String>();
       
		    for (int i = 0; i < AllPrices.size(); i++) {
            NewList.add(AllPrices.get(i).getText().toString());
            }
		 
		//sorting ArrayList in desending order;
		Collections.sort(NewList, Collections.reverseOrder());
    System.out.println("List of the prices in sorted order: " + NewList);
		
    String SecondPrice = NewList.get(1);
		System.out.println("Price of second dress: " + SecondPrice);
		
		driver.findElement(By.xpath("(//*[contains(text(),'" + SecondPrice + "')])[2] ")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("(//*[contains(text(),'Proceed to checkout')])")).click();

		driver.findElement(By.xpath("(//*[@id='category'])")).click();
		
		
		Double expected = Double.parseDouble(SecondPrice.replace("$", "")) + 2;
		System.out.println("The Expected price is: " + expected);
		
		driver.findElement(By.xpath("//*[@class='logout']")).click();
		
	 price5.click();	
	 
	 driver.quit();
	 
	
}

public void SelectTheSecondDressFromTheList() {
	
	
}

public void ClickOnAddToCart() {
	
	
}

public void verifyTotalPriceWithShippingIsThere() {
	
	
}

public void signOut() {
	
	
}

}


