package PageObjectTest;

import pageObjects.BusinessPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utility.Constant;
import utility.ExcelUtils;

public class BusinessPageTest {
	private static String countryName;

	public static void SetUpExcel() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "AddBusiness");
	}

	public static String AddBusinessTest(WebDriver driver) throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "AddBusiness");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String Business_Name = ExcelUtils.getCellData(1, 1);
		//System.out.println(Business_Name);
		String countryName = ExcelUtils.getCellData(1, 2);
		//System.out.println(countryName);
		String City = ExcelUtils.getCellData(1, 3);
		//System.out.println(City);
		String Street = ExcelUtils.getCellData(1, 4);
		//System.out.println(Street);
		String ZIP = ExcelUtils.getCellData(1, 5);
		//System.out.println(ZIP);
		String Register_Number = ExcelUtils.getCellData(1, 6);
		//System.out.println(Register_Number);

		String Bank_Name = ExcelUtils.getCellData(1, 8);
		//System.out.println(Bank_Name);
		String Account_Number = ExcelUtils.getCellData(1, 9);
		//System.out.println(Account_Number);
		String Swift_Number = ExcelUtils.getCellData(1, 10);
		//System.out.println(Swift_Number);
		String Payment_Instructions = ExcelUtils.getCellData(1, 10);
		//System.out.println(Payment_Instructions);
		String Currency = ExcelUtils.getCellData(1, 11);
		//System.out.println(Currency);

		BusinessPage.getAddNewBusiness(driver).click();
		//System.out.println("Setting Business");
		BusinessPage.setBusiness_Name(driver, Business_Name);
		//System.out.println("Setting Business Name");
		BusinessPage.setCountries(driver, countryName);
		//System.out.println("Setting Country");
		BusinessPage.setCity(driver, City);
		//System.out.println("Setting City");
		BusinessPage.setStreet(driver, Street);
		//System.out.println("Setting Street");
		BusinessPage.setZIP(driver, ZIP);
		//System.out.println("Setting ZIP");
		BusinessPage.setRegister_Number(driver, Register_Number);
		//System.out.println("Setting Register Number");
		
		BusinessPage.setAddBankAccount(driver);
		BusinessPage.setBank_Name(driver, Bank_Name);
		BusinessPage.setAccount_Number(driver, Account_Number);
		BusinessPage.setSwift_Number(driver, Swift_Number);
		BusinessPage.setPayment_Instructions(driver, Payment_Instructions);
		BusinessPage.setCurrency(driver, Currency);
		BusinessPage.setAddBankAccount1(driver);
		BusinessPage.setSave(driver);
		System.out.println("Business page is entered Successfully.");
		return "pass";
	
	}
	

}


