package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectTest.BusinessPageTest;
import PageObjectTest.ClientsPageTest;
import appModules.SignIn_Action;
import pageObjects.BusinessPage;
import pageObjects.ClientsPage;
import utility.Constant;
import utility.ExcelUtils;

public class Apache_POI_TC {
	private static WebDriver driver = null;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "LogIn");
		driver.get(Constant.URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SignIn_Action.Execute(driver);
		
		  ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "AddBusiness"); 
		  ExcelUtils.setCellData("Pass", 1, 12);
		  BusinessPage.setBusiness(driver); Thread.sleep(5000);
		  BusinessPageTest.SetUpExcel(); Thread.sleep(5000);
		  BusinessPageTest.AddBusinessTest(driver);
		 

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "AddNewClient");
		ExcelUtils.setCellData("Pass", 1, 12);
		Thread.sleep(2000);
		ClientsPageTest.SetUpExcel();
		ClientsPageTest.AddNewClientTest(driver);

		driver.quit();

	}

}