package testlayer;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import amazon_1.Amazonbaseclass;
import pompackage.POMmousehover;
import testdata.Excelsheet;

public class Amazontest extends Amazonbaseclass{
	
	POMmousehover hover;
	public Amazontest() {
		
		super();
	}
	
@BeforeMethod
public void initsetup() {
	
	initiate();
	hover=new POMmousehover();
	
}
@DataProvider
public Object[][] Details(){
	
	Object result[][]=Excelsheet.readdata("Sheet1");
	return result;

}


@Test(priority=1, dataProvider="Details")
public void Signin1(String email,String password)  {
hover.GotoAccountList();	
hover.Enteremail(email);
hover.clickbtn();
hover.Enterpassword(password);
hover.Checkbox1();
hover.Login1();

}

@Test(priority=2)
public void Search() {
hover.Searchbox(prop.getProperty("data"));
hover.Searchbtn();
hover.selectHeater();
hover.Addingtocart();
driver.navigate().back();
hover.selectHeater();
hover.Addingtocart();
hover.Searchbox(prop.getProperty("data"));
hover.Searchbtn();

}
@Test(priority=3)
public void Filter() {
	hover.Filterbyreview();
	hover.Filterbyprice();
	hover.Selectotherheater1();
	hover.Addingtocartagain();
	hover.Proceedtocheckout();
}

@Test(priority=4)
public void AddressField(String name,String address,String city,String pcode) {
	hover.Selectcountryname();
	hover.Entername(name);
	hover.Enterphone();
	hover.EnterAddress(address);
	hover.EnterCity(city);
	hover.SelectProvince();
	hover.EnterPostal(pcode);
	hover.Checkboxdefault();
	hover.usethisaddress();
}
@Test(priority=5)
public void PaymentMethod() {
	hover.Pay();
	hover.Creditcard(prop.getProperty("creditcard"));
	hover.Nameoncard(prop.getProperty("NameC"));
	hover.EnterMonthofExpiry();
	hover.EnterYearofExpiry();
	hover.EnterCVVnum(prop.getProperty("cvv"));
	hover.addingpayment();
	Alert alert = driver.switchTo().alert();
	alert.accept();
	hover.addingpayment();
	hover.placingorder();
	driver.navigate().to("https://www.amazon.ca/?ref_=nav_ya_signin");
	
}

@Test (priority=6)
public void YourorderModule() {
	hover.mousehoving();
	hover.yourorders();
	hover.Selectpastorder();
	hover.Buyingagain();
	hover.orderscancelled();
	
	
}




@AfterMethod
public void close() {
	
	driver.close();
	
	
}
	
	
	
}




