package XeroApplicationFrameWork;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Functions extends ReuseFunctions {
	public static void TestID01A() throws InterruptedException, IOException {
		initialize_driver();
		//String path ="test-output/xero1A.html";
		testpath("xero1A");
		launchurl("https://www.xero.com/us/");
		Thread.sleep(3000);
		WebElement loginbutton=FindElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"),"login");
		clickObj(loginbutton,"login");
		String actualmsg=driver.getTitle();
		System.out.println(""+actualmsg);
		validatemsg(actualmsg,"Login | Xero Accounting Software");
		WebElement username=FindElement(By.id("email"),"username");
		
       enterText(username,"bindukonda89@gmail.com", "username");
      
       WebElement password=FindElement(By.id("password"),"Password");

       enterText(password,"Password89","Password");
       WebElement login=FindElement(By.id("submitButton"),"login");
       clickObj(login,"login");

		//login();
		String actualmsg1=driver.getCurrentUrl();
		System.out.println(""+actualmsg1);
		validatemsg(actualmsg1,"https://go.xero.com/Dashboard/");
		endreport();
		
	}
	public static void TestID01B() throws InterruptedException {
		initialize_driver();
		//String path ="test-output/xero1B.html";
		testpath("xero1B");
		launchurl("https://www.xero.com/us/");
		Thread.sleep(3000);
		WebElement loginbutton=FindElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"),"login");
		clickObj(loginbutton,"login");
		String actualmsg=driver.getTitle();
		System.out.println(""+actualmsg);
		validatemsg(actualmsg,"Login | Xero Accounting Software");
		WebElement username=FindElement(By.id("email"),"username");
		enterText(username,"bindukonda89@gmail.com", "username");
		
		WebElement password=FindElement(By.id("password"),"Password");
		enterText(password,"Password","Password");
		WebElement login=FindElement(By.id("submitButton"),"login");
		
		clickObj(login,"login");
		Thread.sleep(3000);
		WebElement errormsg=FindElement(By.xpath("//p[contains(text(),'Your email or password is incorrect')]"),"error");
		System.out.println(errormsg.getText());
		String actualmsg1=errormsg.getText();
		String errormsg2 ="Your email or password is incorrect";
		validatemsg(actualmsg1,errormsg2);
	     endreport();
		
	}

	public static void TestID01C() throws InterruptedException {
		initialize_driver();
		//String path ="test-output/xero1C.html";
		testpath("xero1C");
		launchurl("https://www.xero.com/us/");
		Thread.sleep(3000);
		WebElement loginbutton=FindElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"),"login");
		clickObj(loginbutton,"login");
		String actualmsg=driver.getTitle();
		System.out.println(""+actualmsg);
		validatemsg(actualmsg,"Login | Xero Accounting Software");
		WebElement username=FindElement(By.id("email"),"username");
		enterText(username,"abcd@gmail.com", "username");
		
		WebElement password=FindElement(By.id("password"),"Password");
		enterText(password,"Password89","Password");
		WebElement login=FindElement(By.id("submitButton"),"login");
		
		clickObj(login,"login");
		Thread.sleep(3000);
		WebElement errormsg=FindElement(By.xpath("//p[contains(text(),'Your email or password is incorrect')]"),"error");
		System.out.println(errormsg.getText());
		String actualmsg1=errormsg.getText();
		String errormsg2 ="Your email or password is incorrect";
		validatemsg(actualmsg1,errormsg2);
	     endreport();
	}
	public static void TestID01D() throws InterruptedException {
		initialize_driver();
		//String path ="test-output/xero1D.html";
		testpath("xero1D");
		launchurl("https://www.xero.com/us/");
		Thread.sleep(3000);
		WebElement loginbutton=FindElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"),"login");
		clickObj(loginbutton,"login");
		String actualmsg=driver.getTitle();
		System.out.println(""+actualmsg);
		validatemsg(actualmsg,"Login | Xero Accounting Software");
		
		WebElement forgotpwd=FindElement(By.xpath("//a[@class='forgot-password-advert']"),"forgotpwd");
		
		clickObj(forgotpwd,"login");
		Thread.sleep(3000);
		WebElement errormsg=FindElement(By.xpath("//p[contains(text(),'To reset your password, enter the email address yo')]"),"error");
		System.out.println(errormsg.getText());
		String actualmsg1=errormsg.getText();
		String errormsg2 ="To reset your password, enter the email address you use to login to Xero. A link will be emailed to this address which will let you reset your password.";
		validatemsg(actualmsg1,errormsg2);
	     endreport();
	}
	public static void TestID02A() throws InterruptedException {
		initialize_driver();
		//String path ="test-output/xero2A.html";
		testpath("xero2A");
		launchurl("https://www.xero.com/us/");
		Thread.sleep(3000);
		WebElement trial=FindElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"),"freetrial");
		clickObj(trial,"freetrial");
		WebElement firstname=FindElement(By.xpath("//input[@name='FirstName']"),"firstname");
		enterText(firstname,"BINDU","firstname");
		WebElement lastname=FindElement(By.name("LastName"),"lastname");
		enterText(lastname,"KONDA","lastname");
		WebElement email=FindElement(By.name("EmailAddress"),"email");
		enterText(email,"bindukonda89@gmail.com","email");
		WebElement country=FindElement(By.name("LocationCode"),"country");
		SelectByValue(country,"United States");
		WebElement phonenumber=FindElement(By.name("PhoneNumber"),"phonenumber");
		enterText(phonenumber,"123-456-7890","phonenumber");
		WebElement acceptterms=FindElement(By.name("TermsAccepted"),"acceptterms");
		clickObj(acceptterms,"acceptterms");
		WebElement getstarted=FindElement(By.xpath("//span[@class='g-recaptcha-submit']"),"getstarted");
		clickObj(getstarted,"getstarted");
		System.out.println("Inbox page is displayed.");
		endreport();
	}
	public static void TestID02B() throws InterruptedException {
		initialize_driver();
		//String path ="test-output/xero2B.html";
		testpath("xero2B");
		launchurl("https://www.xero.com/us/");
		Thread.sleep(3000);
		WebElement trial=FindElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"),"freetrial");
		clickObj(trial,"freetrial");
		WebElement getstarted=FindElement(By.xpath("//span[@class='g-recaptcha-submit']"),"getstarted");
		clickObj(getstarted,"getstarted");
		WebElement errormsgfirstname=FindElement(By.id("signup-form-error-message-1"),"errormsgfirstname");
		String actualmsg1=errormsgfirstname.getText();
		validatemsg(actualmsg1,"First name can't be empty");
		WebElement errormsglastname=FindElement(By.id("signup-form-error-message-2"),"errormsglastname");
		String actualmsg2=errormsglastname.getText();
		validatemsg(actualmsg2,"Last name can't be empty");
		WebElement errormsgemail=FindElement(By.id("signup-form-error-message-3"),"errormsgemail");
		String actualmsg3=errormsgemail.getText();
		validatemsg(actualmsg3,"Email address can't be empty");
		WebElement errormsgphonenumber=FindElement(By.id("signup-form-error-message-4"),"errormsgphonenumber");
		String actualmsg4=errormsgphonenumber.getText();
		validatemsg(actualmsg4,"Phone number can't be empty");
		WebElement email=FindElement(By.name("EmailAddress"),"email");
		enterText(email,"bindugmail.com","email");
		WebElement getstarted2=FindElement(By.xpath("//span[@class='g-recaptcha-submit']"),"getstarted");
		clickObj(getstarted2,"getstarted");
		WebElement errormsgemail1=FindElement(By.id("signup-form-error-message-3"),"errormsgemail");
		String actualmsg5=errormsgemail1.getText();
		validatemsg(actualmsg5,"Email address is invalid");
		WebElement terms=FindElement(By.name("TermsAccepted"),"terms");
		//String actualmsg6=terms.getText();
		System.out.println("I have read and I agree to the terms of use, privacy notice and offer details is highlighted");
		//validatemsg(actualmsg6,"I have read and I agree to the terms of use, privacy notice and offer details");
		endreport();
		}
	public static void TestID02C() throws InterruptedException {
		initialize_driver();
		//String path ="test-output/xero2C.html";
		testpath("xero2C");
		launchurl("https://www.xero.com/us/");
		Thread.sleep(3000);
		WebElement trial=FindElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"),"freetrial");
		clickObj(trial,"freetrial");
		WebElement termsofuse=FindElement(By.xpath("//a[contains(text(),'terms of use')]"),"terms of use");
		clickObj(termsofuse,"terms of use");
		
		Set<String>getAllWindows=driver.getWindowHandles();
		String[] getwin=getAllWindows.toArray(new String[getAllWindows.size()]);
		System.out.println(getAllWindows.size());
		driver.switchTo().window(getwin[1]);
		
		String termsurl=driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		validatemsg(termsurl,"https://www.xero.com/us/about/terms/");
		
		driver.switchTo().window(getwin[0]);
		WebElement privacy=FindElement(By.xpath("//a[contains(text(),'privacy notice')]"),"privacy");
		clickObj(privacy,"privacy");
		/*try {Set<String>getAllWindows1=driver.getWindowHandles();
		String[] getwin1=getAllWindows.toArray(new String[getAllWindows.size()]);
		System.out.println(getAllWindows.size());
		
			driver.switchTo().window(getwin[2]);
			
			//driver.switchTo().window(getwin[1]);
			String privacyurl=driver.getCurrentUrl();
			System.out.println(driver.getCurrentUrl());*/
			
			endreport();
	}
	
		
		
		public static void TestID02D() throws InterruptedException {
		initialize_driver();
		//String path ="test-output/xero2D.html";
		testpath("xero2D");
		launchurl("https://www.xero.com/us/");
		Thread.sleep(3000);
		WebElement trial=FindElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"),"freetrial");
		clickObj(trial,"freetrial");
		WebElement fulloffers=FindElement(By.xpath("//a[contains(text(),'offer details')]"),"fulloffers");
		clickObj(fulloffers,"fulloffers");
		Thread.sleep(3000);
		
		Set<String>getAllWindows=driver.getWindowHandles();
		String[] getwin=getAllWindows.toArray(new String[getAllWindows.size()]);
		System.out.println(getAllWindows.size());
		driver.switchTo().window(getwin[1]);
		String actualmsg6=driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		validatemsg(actualmsg6,"https://www.xero.com/us/signup/offer-details/");
		endreport();
		driver.quit();
		}
	public static void TestID02E() throws InterruptedException {
		initialize_driver();
		//String path ="test-output/xero2E.html";
		testpath("xero2E");
		launchurl("https://www.xero.com/us/");
		Thread.sleep(3000);
		WebElement trial=FindElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"),"freetrial");
		clickObj(trial,"freetrial");
		WebElement accountantandbookkeeper=FindElement(By.xpath("//a[contains(text(),'accountant or bookkeeper')]"),"accountantandbookkeeper");
		clickObj(accountantandbookkeeper,"accountantandbookkeeper");
		//h2[@class='title title-2']
		String actualmsg=driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
			validatemsg(actualmsg,"https://www.xero.com/us/partner-programs/partners/signup/");
		endreport();
		driver.quit();
	}
	public static void TestID03A() throws InterruptedException {
		initialize_driver();
		//String path ="test-output/xero3A.html";
		testpath("xero3A");
		launchurl("https://www.xero.com/us/");
		Thread.sleep(3000);
		WebElement loginbutton=FindElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"),"login");
		clickObj(loginbutton,"login");
		String actualmsg=driver.getTitle();
		System.out.println(""+actualmsg);
		validatemsg(actualmsg,"Login | Xero Accounting Software");
		WebElement username=FindElement(By.id("email"),"username");
		enterText(username,"bindukonda89@gmail.com", "username");
		
		WebElement password=FindElement(By.id("password"),"Password");
		enterText(password,"Password89","Password");
		WebElement login=FindElement(By.id("submitButton"),"login");
		clickObj(login,"login");
		Thread.sleep(3000);
		 WebElement dashboard=FindElement(By.xpath("//a[@class='xrh-focusable xrh-tab--body xrh-tab--body-is-selected']"),"DashBoard");
		 clickObj(dashboard,"DashBoard");
		 WebElement business=FindElement(By.xpath("//a[@class='xrh-focusable xrh-tab--body xrh-tab--body-is-selected']"),"Business");
		 clickObj(business,"Business");
		 FindElement(By.xpath("//a[contains(text(),'Invoices')]"),"Invoices").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'Quotes')]"),"Quotes").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'Bills to pay')]"),"Bills to pay").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'Purchase orders')]"),"Purchase orders").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'Purchases overview')]"),"Purchases overview").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'Expense claims')]"),"Expense claims").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'Expense claims')]"),"Expense claims").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'Checks')]"),"Checks").isDisplayed();
		 WebElement account=FindElement(By.xpath("//button[contains(text(),'Accounting')]"),"Account");
		 clickObj(account,"Account");
		 FindElement(By.xpath("//a[contains(text(),'Bank accounts')]"),"Bank accounts").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'Reports')]"),"Reports").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'Advanced')]"),"Advanced").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'Account Transactions')]"),"Account Transactions").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'Aged Payables Summary')]"),"Aged Payables Summary").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'Aged Receivables Summary')]"),"Aged Receivables Summary").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'Balance Sheet')]"),"Balance Sheet").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'Income Statement')]"),"Income Statement").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'Sales Tax Report')]"),"Sales Tax Report").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'Chart of accounts')]"),"Chart of accounts").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'Fixed assets')]"),"Fixed assets").isDisplayed();
		 WebElement reports=FindElement(By.xpath("//a[contains(text(),'Reports')]"),"Reports");
		 clickObj(reports,"Reports");
		 WebElement contact=FindElement(By.xpath("//button[contains(text(),'Contacts')]"),"Contacts");
		 clickObj(contact,"Contacts");
		 FindElement(By.xpath("//a[contains(text(),'All contacts')]"),"All contacts").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'Customers')]"),"Customers").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'Suppliers')]"),"Suppliers").isDisplayed();
		 WebElement abc=FindElement(By.xpath("//div[@class='xrh-appbutton--body']"),"abc");
		 clickObj(abc,"abc");
		 FindElement(By.xpath("//a[contains(text(),'Files')]"),"Files").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'Settings')]"),"Settings").isDisplayed();
		 Thread.sleep(3000);
		 FindElement(By.xpath("//a[contains(text(),'Subscription and billing')]"),"Subscription and billing").isDisplayed();
		FindElement(By.xpath("//a[@title='Demo Company']"),"Demo Company").isDisplayed();
		 FindElement(By.xpath("//a[@class='xrh-verticalmenuitem--body xrh-verticalmenuitem--body-blue']"),"Add new Organization").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'Payroll powered by Gusto')]"),"Payroll powered by Gusto").isDisplayed();
		 
		 Thread.sleep(3000);
		 FindElement(By.xpath("//a[contains(text(),'Projects')]"),"Projects").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'WorkflowMax')]"),"WorkflowMax").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'App marketplace')]"),"App marketplace").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'My Xero')]"),"My Xero").isDisplayed();
		 
		 WebElement setting =FindElement(By.xpath("//a[contains(text(),'Settings')]"),"Setting");
		 clickObj(setting,"Setting");
		 WebElement plus=FindElement(By.xpath("//button[@title='Create new']//div[@class='xrh-focusable--child xrh-iconwrapper']"),"CreateNew");
		 clickObj(plus,"CreateNew");
		 FindElement(By.xpath("//div[@class='xrh-dropdown-layout xrh-addon--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionright']//a[@class='xrh-verticalmenuitem--body'][contains(text(),'Invoice')]"),"Invoice").isDisplayed();
		 FindElement(By.xpath("//div[@class='xrh-dropdown-layout xrh-addon--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionright']//a[@class='xrh-verticalmenuitem--body'][contains(text(),'Bill')]"),"Bill").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'Contact')]"),"Contact").isDisplayed();
		 FindElement(By.xpath("//div[@class='xrh-dropdown-layout xrh-addon--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionright']//a[@class='xrh-verticalmenuitem--body'][contains(text(),'Quote')]"),"Quote").isDisplayed();
		 FindElement(By.xpath("//div[@class='xrh-dropdown-layout xrh-addon--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionright']//a[@class='xrh-verticalmenuitem--body'][contains(text(),'Purchase order')]"),"Purchase order").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'Spend money')]"),"Spend money").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'Receive money')]"),"Receive money").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'Transfer money')]"),"Transfer money").isDisplayed();
		 
		 WebElement abc1 =FindElement(By.xpath("//div[@class='xrh-appbutton--body']"),"abc1 ");
		 clickObj(abc1,"abc1");
		 WebElement files =FindElement(By.xpath("//a[contains(text(),'Files')]")," Files");
		 clickObj(files,"Files");
		 
		 
		 WebElement notifications =FindElement(By.xpath("//button[@title='Notifications']//div[@class='xrh-focusable--child xrh-iconwrapper']"),"Notifications ");
		 
		 WebElement search =FindElement(By.xpath("//button[@title='Search']//div[@class='xrh-focusable--child xrh-iconwrapper']"),"search");
		 clickObj(search,"search");
		 WebElement help =FindElement(By.xpath("//button[@title='Help']//div[@class='xrh-focusable--child xrh-iconwrapper']"),"help ");
		 clickObj(help,"help");
		/* FindElement(By.xpath("//a[contains(text(),'Show or hide bank accounts on the dashboard')]"),"Show or hide bank accounts on the dashboard").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'Your Practice Manager dashboard')]"),"Your Practice Manager dashboard").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'Your Xero dashboard')]"),"Your Xero dashboard").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'KPI dashboard in Practice Manager')]"),"KPI dashboard in Practice Manager").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'Help Center')]"),"Help Center").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'Hide Getting Started')]"),"Hide Getting Started").isDisplayed();
		 FindElement(By.xpath("//a[contains(text(),'Find an advisor')]"),"Find an advisor").isDisplayed();*/
		 endreport();
	}

	public static void TestID04A() throws InterruptedException {
		initialize_driver();
		//String path ="test-output/xero4A.html";
		testpath("xero4A");
		launchurl("https://www.xero.com/us/");
		Thread.sleep(3000);
		WebElement loginbutton=FindElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"),"login");
		clickObj(loginbutton,"login");
		String actualmsg=driver.getTitle();
		System.out.println(""+actualmsg);
		validatemsg(actualmsg,"Login | Xero Accounting Software");
		WebElement username=FindElement(By.id("email"),"username");
		enterText(username,"bindukonda89@gmail.com", "username");
		WebElement password=FindElement(By.id("password"),"Password");
		enterText(password,"Password89","Password");
		WebElement login=FindElement(By.id("submitButton"),"login");
		clickObj(login,"login");
		Thread.sleep(3000);
	    WebElement userMenu=FindElement(By.xpath("//abbr[@class='xrh-avatar xrh-avatar-color-9']"),"usermenu");
		//driver.findElement(By.xpath("//abbr[@class='xrh-avatar xrh-avatar-color-9']")).click();
	    clickObj(userMenu,"usermenu");
	   
	    WebElement logout=FindElement(By.xpath("//div[@class='xrh-dropdown-layout xrh-addon--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionright']//a[@class='xrh-verticalmenuitem--body'][contains(text(),'Log out')]  "),"Logout");
	    clickObj(logout,"Logout");
	    Thread.sleep(3000);
	    WebElement name=FindElement(By.id("email"),"Username");
	   String actual=name.getText();
	    System.out.println("mailid is not seen");
	   String expected="bindukonda89@gmail.com";
	    validatemsg(actual,expected);
	    endreport();

	}
	public static void TestID08D() throws InterruptedException {
		initialize_driver();
		//String path ="test-output/xero8D.html";
		testpath("xero8D");
		launchurl("https://www.xero.com/us/");
		Thread.sleep(3000);
		WebElement loginbutton=FindElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"),"login");
		clickObj(loginbutton,"login");
		String actualmsg=driver.getTitle();
		System.out.println(""+actualmsg);
		validatemsg(actualmsg,"Login | Xero Accounting Software");
		WebElement username=FindElement(By.id("email"),"username");
		enterText(username,"bindukonda89@gmail.com", "username");
		WebElement password=FindElement(By.id("password"),"Password");
		enterText(password,"Password89","Password");
		WebElement login=FindElement(By.id("submitButton"),"login");
		//login.click();
		clickObj(login,"login");
		WebElement usermenu=FindElement(By.xpath("//div[@class='xrh-appbutton--body']"),"usermenu");
		clickObj(usermenu,"usermenu");
		WebElement myxero=FindElement(By.xpath("//a[contains(text(),'My Xero')]"),"myxero");
		clickObj(myxero,"myxero");
		
		endreport();

}}
