package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import amazon_1.Amazonbaseclass;

public class POMmousehover extends Amazonbaseclass {
	
	@FindBy(xpath="//*[@id=\"nav-link-accountList-nav-line-1\"]") WebElement Accountlist;
	@FindBy(id="ap_email") WebElement Email;
	@FindBy(id="continue") WebElement Continue;
	@FindBy(id="ap_password")  WebElement Password;
	@FindBy(name="rememberMe") WebElement Check;
	@FindBy(id="signInSubmit") WebElement Signin;
	@FindBy(id="twotabsearchtextbox") WebElement Search;
	@FindBy(id="nav-search-submit-button")WebElement Submit;
	@FindBy(xpath="//*[@id=\"search\"]") WebElement Heater;
	@FindBy(id="add-to-cart-button") WebElement AddtoCart;
    @FindBy(css="#p_72\\/11192170011 > span > a > section > i") WebElement Review;
	@FindBy(xpath="//*[@id=\"p_36/12035761011\"]/") WebElement Price;
	@FindBy(xpath="//*[@id=\"search\"]") WebElement Heater1;
    @FindBy(id="add-to-cart-button") WebElement AddtoCartagain;
    @FindBy(name="proceedToRetailCheckout") WebElement Checkout;
    @FindBy(css="#address-ui-widgets-countryCode > span > span") WebElement dropdown;
    @FindBy(id="address-ui-widgets-enterAddressFullName") WebElement Fullname;
    @FindBy(id="address-ui-widgets-enterAddressPhoneNumber") WebElement Phone;
    @FindBy(id="address-ui-widgets-enterAddressLine1")WebElement Address;
	@FindBy(id="address-ui-widgets-enterAddressCity") WebElement City;
	@FindBy(css="#address-ui-widgets-enterAddressStateOrRegion > span > span > span") WebElement dropdownprovince;
	@FindBy(id="address-ui-widgets-enterAddressPostalCode") WebElement Postal;
	@FindBy(id="address-ui-widgets-use-as-my-default") WebElement Default;
	@FindBy(css="#address-ui-widgets-form-submit-button > span > input") WebElement Useaddress;
	@FindBy(partialLinkText="Add a credit or debit card") WebElement Payment;
	@FindBy(id="pp-Pa3HDz-16") WebElement Cardnum;
	@FindBy(id="pp-nYQkJQ-18") WebElement Cardname;
	@FindBy(xpath="#pp-nYQkJQ-22 >") WebElement Month;
	@FindBy(css="#pp-nYQkJQ-23 > span > span > span") WebElement YearEx;
	@FindBy(id="pp-y2yes9-25") WebElement CVV;
	@FindBy(name="ppw-widgetEvent:AddCreditCardEvent") WebElement Addtopay;
	@FindBy(name="ppw-widgetEvent:SetPaymentPlanSelectContinueEvent") WebElement Usingpayment;
	@FindBy(id="nav-link-accountList-nav-line-1") WebElement mousehover;
	@FindBy(name="placeYourOrder1") WebElement Orderplace;
	@FindBy(xpath="//*[@id=\"nav_prefetch_yourorders\"]/span") WebElement Yourorder;
	@FindBy(id="a-autoid-1-announce") WebElement pastorders;
	@FindBy(partialLinkText="Buy Again") WebElement Buyagain;
	@FindBy(css="#orderTypeMenuContainer > ul > li.selected > span > span") WebElement Cancelorders;
	
	public POMmousehover() {
		
		PageFactory.initElements(driver, this);
		
	}
	public void GotoAccountList() {
		Accountlist.click();
		
	}


	public void Enteremail(String emailid) {
		
		Email.sendKeys(emailid);
	}
	
	public void clickbtn() {
		
		Continue.click();
		
	}
	public void Enterpassword(String password) {
		
		Password.sendKeys(password);
		}
	public void Checkbox1() {
		Check.click();
		
	}

public void Login1() {
	
	Signin.click();
	
}
public void Searchbox(String data) {
	Search.sendKeys(data);
	
}

public void Searchbtn() {
	Submit.click();
	
}

public void selectHeater() {
	// TODO Auto-generated method stub
	
}

public void Addingtocart() {

	AddtoCart.click();
	
}
public void Filterbyreview() {
	Review.click();
	
}
public void Filterbyprice() {
	Price.click();
}

	public void Selectotherheater1() {
		Heater1.click();
		
	}
	public void Addingtocartagain() {
		AddtoCartagain.click();
		
	}

	public void Proceedtocheckout() {
		
		Checkout.click();
	}
	public void Selectcountryname() {
	Select country=  new Select(dropdown);
	country.selectByVisibleText("Canada");
	}
	public void Entername(String name) {
		
		Fullname.sendKeys(name);
	}
 public void Enterphone() {
	 
 }	
 public void EnterAddress(String address) {
	 Address.sendKeys(address);
 }
 
 public void EnterCity(String city) {
	 City.sendKeys(city);
 }
 public void SelectProvince() {
	 Select province= new Select(dropdownprovince);
	 province.selectByVisibleText("Ontario");
 }
 
 public void EnterPostal(String pcode) {
	 Postal.sendKeys(pcode);
 }
 public void Checkboxdefault() {
	 Default.click();
 }
 public void usethisaddress() {
	 Useaddress.click();
	 
 }
 public void Pay() {
	Payment.click(); 
 }
 public void Creditcard(String creditcard) {
	 Cardnum.sendKeys(creditcard);
 }
 public void Nameoncard(String NameC) {
	 Cardname.sendKeys(NameC);
 }
 public void EnterMonthofExpiry() {
	 Select Mon=new Select(Month );
	 Mon.deselectByIndex(5);
 }
 public void EnterYearofExpiry() {
	Select Year =new Select (YearEx);
	Year.deselectByIndex(2);
	
 }
 public void EnterCVVnum(String cvv) {
	 CVV.sendKeys(cvv);
 }
 public void addingpayment() {
	 Addtopay.click();
 }
 
 public void Usingthispayemnt() {
	 Usingpayment.click();
 }
 public void mousehoving ()
 {
	 Actions action = new Actions(driver);
	 action.moveToElement(mousehover).build().perform();
 } 
 public void placingorder() {
	 Orderplace.click();
 }
 public void yourorders() {
	 Yourorder.click();
	 
 }
 
 
 public void Selectpastorder() {
	 Select ord=new Select(pastorders );
	 ord.deselectByIndex(1);
 }
 public void Buyingagain() {
	 Buyagain.click();
 }
 public void orderscancelled()
 {
	 Cancelorders.click();
 }
 

 
 
 
 
 
 
 
 
 
}
