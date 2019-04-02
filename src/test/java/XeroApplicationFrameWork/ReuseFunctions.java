package XeroApplicationFrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReuseFunctions {
	static ExtentTest logger;
	static ExtentReports report;
	static WebDriver driver;
	
public static void initialize_driver() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dsp40\\eclipse-workspace\\Selenium\\chromedriver.exe");
	 driver = new ChromeDriver();
	 report = new ExtentReports(System.getProperty("user.dir")+"test-output/Xeroextentreport.html",true);
	 
	}
	public static void launchurl( String url) {
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		logger.log(LogStatus.PASS,"xero page is launched");
		
	}

		public static  void testpath(String TestName)

		{
			
		// report = new ExtentReports(path);
			logger = report.startTest(TestName);
		///
		}
		


		
		public static void maximize() {
			driver.manage().window().maximize();
		}
		
		
		public static void delaytime(){
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
		
		
		public static void endreport() {
			report.endTest(logger);
			report.flush();
			driver.close();
		}
		
		
	public static WebElement FindElement(By location,String objname) {
		WebElement obj=null;{}
		try {
			obj=driver.findElement(location);
			System.out.println("PASS: " +objname+" found on page");
			logger.log(LogStatus.PASS," " +objname+"found on page");
		}
		catch(org.openqa.selenium.NoSuchElementException e){
			System.out.println("FAIL: " +objname+"  not found on page");
			logger.log(LogStatus.FAIL,""+ objname+ "  not found on page");
		}
		
		return obj;
		
	}
	 
	/*public static void login() throws InterruptedException, IOException {
			WebElement username=FindElement(By.id("email"),"username");
			//String[][] readdata= readExcelData("C:\\Users\\dsp40\\eclipse-workspace\\XeroApplication\\xero.xls","Sheet3");
	enterText(username,"bindukonda89@gmail.com", "username");
	enterText(username,"readdata[1][0]", "username");
	WebElement password=FindElement(By.id("password"),"Password");
	//enterText(password,"readdata[1][1]","Password");
	enterText(password,"Password89","Password");
	WebElement login=FindElement(By.id("submitButton"),"login");
	clickObj(login,"login");}*/
	
	
	
	/* name of the method:   entertext
	 * BriefDescription  :   entering textvalue for textbox
	 * Arguments         :  obj-->object
	 *                      textval--->to be entered 
	 *                      objName--->object name
	 *  createdby        :  Automation team 
	 *  created date     :02/13/19 
	 *  LastModified Date:02/13/19          
	 */
	public static void enterText(WebElement obj,String textval,String objName) throws InterruptedException

	{
		if(obj.isDisplayed())
		{
			Thread.sleep(4000);
			obj.sendKeys(textval);
			System.out.println("pass: "+textval+"value is entered in "+objName+"field");
			logger.log(LogStatus.PASS,textval+"value is entered in "+objName+"field");
			
		}
		else
		{
			System.out.println("fail:" +objName+ "field does not exist please check application");
			logger.log(LogStatus.FAIL,textval+objName+"field does not exist please check application");
		}
	}
	
	/* name of the method:   clickobject--->Button
	 * BriefDescription  :   clicking a button
	 * Arguments         :  obj-->object,objName--->object name
	 *  createdby        :  Automation team 
	 *  created date     :02/13/19 
	 *  LastModified Date:02/13/19          
	 */
	public static void clickObj(WebElement obj,String objName)
	{
		if(obj.isDisplayed())
		{
			obj.click();
			System.out.println("pass :" +objName + "button is clicked");
			logger.log(LogStatus.PASS, objName + "button is clicked");
		}
		else
		{
			System.out.println("Fail:" +objName+"button is not displayed ,please check the application");
			logger.log(LogStatus.FAIL, objName+ "button is not displayed ,please check the application");
		}
	}
	

/*
 * Name of the method: selectCheckBox
 * Brief Description: Select the checkbox
 * Arguments: obj --> web object, objName--> name of the object
 * Created by: Automation team
 * Creation Date: Feb 12 2019
 * Last Modified: Feb 12 2019
 * */
	public static void selectCheckBox(WebElement obj, String objName) {
		
		if(obj.isDisplayed()) {
			
			if(obj.isSelected()) {
				System.out.println("Pass: "+objName+" is already selected");
			}else{
			obj.click();
			System.out.println("Pass: "+objName+" is selected");
			logger.log(LogStatus.PASS, objName + "is selected");
		    }}
			else {
			System.out.println("Fail:"+objName+" is not present.Please chk application");	
			logger.log(LogStatus.FAIL, objName+ " is not displayed ,please check the application");
		}	
	}
	
	/*
	 * Name of the method: selectDropdown
	 * Brief Description: Select the Dropdown list
	 * Arguments: obj --> web object, objName--> name of the object
	 * Created by: Automation team
	 * Creation Date: Feb 12 2019
	 * Last Modified: Feb 12 2019
	 * */
	public static void selectDropdown(WebElement obj, String objName) {
		
		if(obj.isDisplayed()) {
				
				if(obj.isSelected()) {
					System.out.println("Pass: "+objName+" is already selected");
				}else{
				obj.click();
				System.out.println("Pass: "+objName+" is selected");
				logger.log(LogStatus.PASS, objName + "is selected");
			    }}
				else {
				System.out.println("Fail:"+objName+" is not present.Please chk application");	
				logger.log(LogStatus.FAIL, objName+ " is not present, please check the application");
					
			}	
			
		}
	
	/*
	 * Name of the method: validateErrormsg
	 * Brief Description: to validate the error msg 
	 * Arguments: actualmsg --> name of the object, errormsg--> name of the object
	 * Created by: Automation team
	 * Creation Date: Feb 12 2019
	 * Last Modified: Feb 12 2019
	 * */
	
	public static void validatemsg(String actualmsg, String errormsg) {
		
		if(actualmsg.equals(errormsg))
		{
			System.out.println("TestCase is passed");
			logger.log(LogStatus.PASS,  "TestCase is passed" );
		}else
	    {
		System.out.println("TestCase is failed");
		logger.log(LogStatus.FAIL,  "TestCase is failed" );
	    }
	}

/* name of the method:   iFrame
 * BriefDescription  :   iframe using webelement 
 * Arguments         :  driver--->driver 
 *                      obj--->webelement
 *  createdby        :  Automation team 
 *  created date     :02/13/19 
 *  LastModified Date:02/13/19          
 */
public static void switchFrame( WebDriver driver,WebElement obj) {
	 
    if(obj.isDisplayed()) {
     driver.switchTo().frame(obj);
     System.out.println("Pass: we can switch to the "+obj+ " frame");
     logger.log(LogStatus.PASS,  "Switch to frame" );
     
    }else {
     System.out.println("fail: we can't switch to the "+obj+ " frame");
     logger.log(LogStatus.FAIL,  "Cannot Switch to frame" );
    }
}

/* name of the method:   switchFrameid
 * BriefDescription  :   iframe using webelement 
 * Arguments         :  driver--->driver 
 *                      obj--->iframe id
 *  createdby        :  Automation team 
 *  created date     :02/13/19 
 *  LastModified Date:02/13/19          
 */

public static void switchFrameid( WebDriver driver,String obj) {
	 
     driver.switchTo().frame(obj);
     System.out.println("Pass: we can switch to the "+obj+ " frame");
     logger.log(LogStatus.PASS,  "we can switch to the frame" );
     
    }

/* name of the method:   switchdefaultFrame
 * BriefDescription  :   iframe for switching back to default frame 
 * Arguments         :  driver--->driver 
 *  createdby        :  Automation team 
 *  created date     :02/13/19 
 *  LastModified Date:02/13/19          
 */ 
public static void switchdefaultFrame( WebDriver driver)
{
driver.switchTo().defaultContent();
System.out.println("Pass: we can switch to the "+ driver + " back to frame");
logger.log(LogStatus.PASS,  "we can switch back to the frame" );
}

/* name of the method:   mouseOver
 * BriefDescription  :   mouseOver  
 * Arguments         :  obj,index 
 *  createdby        :  Automation team 
 *  created date     :02/13/19 
 *  LastModified Date:02/13/19          
 */ 

public static void mouseOver(WebDriver driver,WebElement obj) {
	if(obj.isDisplayed()) {
   Actions action=new Actions(driver);
   action.moveToElement(obj).build().perform();
	System.out.println("Pass: "+obj+" is present");
	logger.log(LogStatus.PASS,  "obj is present" );
	}
 else {
		System.out.println("Fail:"+obj+" is not present.Please chk application");
		logger.log(LogStatus.FAIL,  "obj is not present.Please chk application" );
	}
}

/* name of the method:   selectbyText
 * BriefDescription  :   selected by clicking the dropdown 
 * Arguments         :  obj,objName 
 *  createdby        :  Automation team 
 *  created date     :02/13/19 
 *  LastModified Date:02/13/19          
 */ 
public static void SelectbyText(WebElement we, String VisibleText){
	   if(we.isDisplayed())
	   {
		   Select selObj=new Select(we);
           selObj.selectByVisibleText(VisibleText);
	           System.out.println("Pass: "+VisibleText+ " is Selected by VisibleText" );
	           logger.log(LogStatus.PASS, " is Selected by VisibleText" );
	           
	   } 
	   else
	   {
	    System.out.println("Fail: "+VisibleText+ " is not available");
	    logger.log(LogStatus.FAIL, " is not Selected by VisibleText" );
	    
	   }
	   
	   
}

/* name of the method:   SelectByValue
 * BriefDescription  :   selectedByValue by clicking the dropdown 
 * Arguments         :  obj,index 
 *  createdby        :  Automation team 
 *  created date     :02/13/19 
 *  LastModified Date:02/13/19          
 */ 
public static void SelectByValue(WebElement obj, String val) {
	  //if(obj.isSelected()) {
	if(obj.isDisplayed()) {
	   Select selObj=new Select(obj);
	    
	   selObj.selectByValue(val);
	  System.out.println("pass:"+val + " is selected from drop down ");
	  logger.log(LogStatus.PASS, " is selected from drop down " );
	 
	  }else {
	   System.out.println("Fail:"+val+"is not selected");
	   logger.log(LogStatus.FAIL, " is not selected from drop down " );
	  }
	 }	  


/* name of the method:   SelectByindex
 * BriefDescription  :   selected by clicking the dropdown 
 * Arguments         :  obj,index 
 *  createdby        :  Automation team 
 *  created date     :02/13/19 
 *  LastModified Date:02/13/19          
 */ 
public static void selectByIndex(WebElement obj, int index) {
	  if(obj.isDisplayed()) {
	   Select selObj=new Select(obj);
	  selObj.selectByIndex(index);
	  
	  System.out.println("pass:"+index + " is selected from drop down ");
	  logger.log(LogStatus.PASS, " is selected from drop down " );
	  }else {
	   System.out.println("Fail:"+index+"is not selected");
	   logger.log(LogStatus.FAIL, " is not selected from drop down " );
	  }
	 }

public static void selectByVisibleText(WebElement obj, String Name) {
	if(obj.isDisplayed()) {
		 Select drop = new Select(obj);
		 drop.selectByVisibleText(Name);
	 System.out.println("Pass: dropdown is selected");
	 }else {
	 System.out.println("Fail: dropdown is not available check your application");
	 }
	 }



/*
 * Name of the method: Radiobutton
 * Brief Description: To click on the radio button 
 * Arguments: obj --> web object, objName--> name of the object
 * Created by: Automation team
 * Creation Date: Feb 12 2019
 * Last Modified: Feb 12 2019
 * */
public static void Radiobutton(WebElement obj, String objName) {
	
	if(obj.isDisplayed() ){
		obj.click();
		System.out.println("Pass: "+objName+" is clicked");
	}else {
		System.out.println("Fail:"+objName+" is not displayed .Please check your application");			
	}
}

/* name of the method:   switchtoAlert
 * BriefDescription  :   Switch to alert
 * Arguments         :  driver
 *  createdby        :  Automation team 
 *  created date     :02/13/19 
 *  LastModified Date:02/13/19          
 */ 
public static void switchtoAlert(WebDriver driver) {
	 driver.switchTo().alert().accept();
	 System.out.println("Pass: alert is present and accept");
}
public static String[][] readExcelData(String dataTablePath,String sheetName)throws IOException{
	/* get the excel path*/
	File xLFile=new File(dataTablePath);
	/* access the excel file*/
	
	FileInputStream xlDoc=new FileInputStream(xLFile);
	/*access the workbook*/
	HSSFWorkbook wb=new HSSFWorkbook (xlDoc);	
	/* access the sheet */
	HSSFSheet sheet =wb.getSheet(sheetName);
	
	int iRowCount=sheet.getLastRowNum()+1;
	int iColoCount =sheet.getRow(0).getLastCellNum();
	String[][] xlData=new String[iRowCount][iColoCount];
	for(int i=0;i<iRowCount;i++) {
		for(int j=0;j<iColoCount;j++) {
			/*int cellType=sheet.getRow(i).getCell(j).getCellType();
			if(cellType==HSSFCell.CELL_TYPE_NUMERIC){

				int val=(int)sheet.getRow(i).getCell(j).getNumericCellValue();

				xlData[i][j]=String.valueOf(val);

			}

			else

				//xlData[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();*/
	xlData[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();	
}}
	return xlData;
}


}



