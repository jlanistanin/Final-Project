package PageObjectTest;

import pageObjects.ClientsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import utility.Constant;
import utility.ExcelUtils;

public class ClientsPageTest {
	public static void SetUpExcel() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "AddNewClient");
	}

	public static String AddNewClientTest(WebDriver driver) throws Exception {
Thread.sleep(2000);
ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "AddNewClient");
		String Client_Name = ExcelUtils.getCellData(1, 0);
		//System.out.println(Client_Name);
		String Contact_Name = ExcelUtils.getCellData(1, 1);
		//System.out.println(Contact_Name);
		String Email = ExcelUtils.getCellData(1, 2);
		//System.out.println(Email);
		String Registry_Number = ExcelUtils.getCellData(1, 3);
		//System.out.println(Registry_Number);
		String Countries = ExcelUtils.getCellData(1, 4);
		//System.out.println(Countries);
		String City = ExcelUtils.getCellData(1, 5);
		//System.out.println(City);
		String Street = ExcelUtils.getCellData(1, 6);
		//System.out.println(Street);
		String ZIP = ExcelUtils.getCellData(1, 7);
		//System.out.println(ZIP);
		String Date = ExcelUtils.getCellData(1, 8);
		//System.out.println(Date);
		String code = ExcelUtils.getCellData(1, 9);
		//System.out.println(Code);
		String Agreement_Date = ExcelUtils.getCellData(1, 10);
		//System.out.println(Agreement_Date);
		String Status = ExcelUtils.getCellData(1, 12);
		//System.out.println(Status);
  
		
		ClientsPage.setClient(driver);
		Thread.sleep(500);
		ClientsPage.setAddNewClient(driver);
		
		ClientsPage.setClient_Name(driver, Client_Name);

		ClientsPage.setContact_Name(driver, Contact_Name);

		ClientsPage.setEmail(driver, Email);

		ClientsPage.setRegistry_Number(driver, Registry_Number);

		ClientsPage.setCountries(driver, Countries);

		ClientsPage.setCity(driver, City);

		ClientsPage.setStreet(driver, Street);

		ClientsPage.setZIP(driver, ZIP);
		
		ClientsPage.setCode(driver, code);
		Thread.sleep(2000);

		// ClientsPage.setDateAdded(driver, Date);

		// ClientsPage.setAgreement_Day(driver, Agreement_Day);

		//ClientsPage.setStatus(driver, Status);

		ClientsPage.setSave(driver);
		
		Thread.sleep(2000);
		System.out.println("Clients page is entered Successfully.");
		return "Pass";
	}
}
