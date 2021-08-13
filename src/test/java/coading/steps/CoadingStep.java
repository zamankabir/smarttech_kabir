package coading.steps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import coading.pages.CoadingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CoadingStep {

	

		WebDriver driver;
		CoadingPage codingPage;

		
		
		
		@Given("^user go to your logo homepage$")
		public void user_go_to_your_logo_homepage() throws Throwable {

			System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();

			driver.get("http://automationpractice.com/index.php");

			driver.manage().window().maximize();

			//codingPage = new CoadingchallangePage(driver);

		}

		@Given("^click on the Sign in button$")
		public void click_on_the_Sign_in_button() throws Throwable {

			
	       codingPage = new CoadingPage (driver);
			codingPage.clickOnSignInButton();

		}

		@When("^user enter valid Email address and password$")
		public void user_enter_valid_Email_address_and_password() throws Throwable {

			codingPage = new CoadingPage(driver);
			codingPage.enterEmailAddressAndPassword();

		}

		@When("^user click on the Sign in button$")
		public void user_click_on_the_Sign_in_button() throws Throwable {

			codingPage.userClickOnSignInButton();
		}

		@Then("^user nevigate to welcome page$")
		public void user_nevigate_to_welcome_page() throws Throwable {

			//codingPage.userNevigateToWelcomePage();

		}

		@Then("^user verify the page title as \"([^\"]*)\"$")
		public void user_verify_the_page_title_as(String title) throws Throwable {

//			String expected = title;
//			String actual = driver.getTitle();
//			Assert.assertTrue("Title does not match", actual.contains(expected));
		}

		@Then("^user click on the upper left corner Dresses$")
		public void user_click_on_the_upper_left_corner_Dresses() throws Throwable {

			codingPage.clickOnTheUpperLeftCornerDresses();
		}

		@Then("^price print value decending sorted order$")
		public void price_print_value_decending_sorted_order() throws Throwable {
		
			
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
			
			
//			Double actual = Double.parseDouble(driver.findElement(By.xpath("//*[@id='total_price']")).getText().replace("$", ""));
//		    Assert.assertTrue("Price does not match", actual.equals(expected));
//			
			
			//driver.findElement(By.xpath("//*[@id='total_price']")).click();
			//String actual= driver.getTitle().trim();  
			
			
			
			
			driver.findElement(By.xpath("//*[@class='logout']")).click();
			//codingPage.clickSortedOrders();
			
				
			
			
			
			
//			
//			 List<WebElement> AllPrices = driver.findElements(By.xpath("//*[@class='product-desc']/following-sibling::div[1]")); /*(actualTitle));*/
	//
//				ArrayList<String> NewList = new ArrayList<String>();
	//
//				for (int i = 0; i < AllPrices.size(); i++) {
	//
//					NewList.add(AllPrices.get(i).getText().toString());
	//
//				}
//				ArrayList<String> Allprice=new ArrayList<String>();
//				Allprice.add("$26.00");
//				Allprice.add("$50.99");
//				Allprice.add("$28.98");
//				Allprice.add("$30.50");
//				Allprice.add("$16.40");
//			Collections.sort(Allprice,Collections.reverseOrder());
	//
//				System.out.println(Allprice);
	//
//				 //sorting ArrayList in desending order
//				Collections.sort(NewList, Collections.reverseOrder());
	//
//				System.out.println("List of the prices in sorted order: " + NewList);
//				String SecondPrice = NewList.get(1);
//				System.out.println("Price of second dress: " + SecondPrice);

			}  
		

		@Then("^user select the second dress from the list$")
		public void user_select_the_second_dress_from_the_list() throws Throwable {

			//codingPage.SelectTheSecondDressFromTheList();

		}

		@Then("^user click on Add to cart$")
		public void user_click_on_Add_to_cart() throws Throwable {

			//codingPage.ClickOnAddToCart();
		}

		@Then("^user verify Total price with shipping is there$")
		public void user_verify_Total_price_with_shipping_is_there() throws Throwable {

			//codingPage.verifyTotalPriceWithShippingIsThere();

		}

		@Then("^user sign out$")
		public void user_sign_out() throws Throwable {

			codingPage.signOut();

		}

		@Then("^user close the browser$")
		public void user_close_the_browser() throws Throwable {

			driver.close();
			driver.quit();
		}

	}


