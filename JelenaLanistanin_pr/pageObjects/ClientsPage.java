package pageObjects;

import java.time.LocalDate;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Constant;
import utility.DateTimeUtils;
import utility.ExcelUtils;

public class ClientsPage {
	public static void SetUpExcel() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "AddNewClient");
	}
	
	public static WebElement getClient(WebDriver driver) throws InterruptedException {

		WebElement getClient = driver.findElement(By.xpath("//*[@id=\"nav-bar-clients\"]/div"));
		return getClient;
	}

	public static void setClient(WebDriver driver) throws InterruptedException {
		getClient(driver).click();

	}

	public static WebElement getAddNewClient(WebDriver driver) {
		WebElement getAddNewClient = driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[3]/main/div/div/div[1]/div/div/a/div"));
		return getAddNewClient;
	}

	public static void setAddNewClient(WebDriver driver) {
		getAddNewClient(driver).click();
	}

	public static WebElement getClient_Name(WebDriver driver) {
		WebElement getClient_Name = driver.findElement(By.xpath(
				"//body/div[@id='app']/div[@class='application--wrap']/main[@class='v-content']/div[@class='v-content__wrap']/div[@class='container']/div[@class='mt-1 white v-card']/div[@class='v-card__actions']/div[@class='layout column']/div[@class='layout']/div[@class='flex secondary xs12']/form[@class='ma-2 pa-3 text-xs-center']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		return getClient_Name;

	}

	public static WebElement getContact_Name(WebDriver driver) {
		WebElement getContact_Name = driver.findElement(By.xpath(
				"//form[@class='ma-2 pa-3 text-xs-center']//div[1]//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		return getContact_Name;
	}

	public static WebElement getEmail(WebDriver driver) {
		WebElement getEmail = driver.findElement(By.xpath("//div[@class='flex xs6 mr-2']//input[@type='text']"));
		return getEmail;
	}

	public static WebElement getRegistry_Number(WebDriver driver) {
		WebElement getRegistry_Number = driver.findElement(By.xpath("//form[@class='ma-2 pa-3 text-xs-center']//div[2]//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		return getRegistry_Number;
	}

	public static WebElement getCountries(WebDriver driver) {
		WebElement getCountries = driver.findElement(By.xpath("//div[@class='v-select__slot']//input[@type='text']"));
		return getCountries;
	}

	public static WebElement getCity(WebDriver driver) {
		WebElement getCity = driver.findElement(By.xpath("//*[@id=\"app\"]/div[6]/main/div/div/div[2]/div[2]/div/div[1]/div/form/div[3]/div[2]/div/div[2]/div[1]/div/input"));
		return getCity;
	}

	public static WebElement getStreet(WebDriver driver) {
		WebElement getStreet = driver.findElement(By.xpath("//body/div[@id='app']/div[@class='application--wrap']/main[@class='v-content']/div[@class='v-content__wrap']/div[@class='container']/div[@class='mt-1 white v-card']/div[@class='v-card__actions']/div[@class='layout column']/div[@class='layout']/div[@class='flex secondary xs12']/form[@class='ma-2 pa-3 text-xs-center']/div[@class='layout']/div[3]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		return getStreet;
	}

	public static WebElement getZIP(WebDriver driver) {
		WebElement getZIP = driver.findElement(By.xpath("//div[@class='layout']//div[@class='layout']//div[4]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		return getZIP;

	}

//	public static WebElement getDate(WebDriver driver) {
//		WebElement getDate = driver.findElement(
//				By.xpath("//div[@class='flex xs3']//div[@class='v-dialog__container']//input[@type='text']"));
//		return getDate;
	//}

	public static WebElement getCancel(WebDriver driver) {
		WebElement getCancel = driver.findElement(By.xpath(
				"//div[@class='v-dialog v-dialog--active v-dialog--persistent']//div[@class='v-btn__content'][contains(text(),'Cancel')]"));
		return getCancel;
	}

	public static WebElement getOK(WebDriver driver) {
		WebElement getOK = driver.findElement(By.xpath(
				"//div[@class='v-dialog v-dialog--active v-dialog--persistent']//div[@class='v-btn__content'][contains(text(),'OK')]"));
		return getOK;
	}

	public static WebElement getCode(WebDriver driver) {
		WebElement getCode = driver.findElement(By.xpath("//*[@id=\"app\"]/div[6]/main/div/div/div[2]/div[2]/div/div[1]/div/form/div[4]/div[2]/div/div[2]/div[1]/div/input"));
		return getCode;
	}

	public static WebElement getAgreement_Date(WebDriver driver) {
		WebElement getAgreement_Date = driver
				.findElement(By.xpath("//div[@class='flex xs3 ml-3']//input[@type='text']"));
		return getAgreement_Date;
	}

	public static WebElement getStatus_Active(WebDriver driver) {
		WebElement getStatus_Active = driver
				.findElement(By.xpath("//div[@class='v-input--selection-controls__ripple']"));
		return getStatus_Active;
		

	}

	public static WebElement getSave(WebDriver driver) {
		WebElement getSave = driver.findElement(By.xpath("//div[contains(text(),'Save')]"));
		return getSave;
	}

	public static WebElement getBackToClientList(WebDriver driver) {
		WebElement getBackToClientList = driver.findElement(By.xpath("//i[contains(text(),'arrow_back')]"));
		return getBackToClientList;
	}

	public static void setClient_Name(WebDriver driver, String Client_Name) {

		getClient_Name(driver).sendKeys(Client_Name);
		// wait.until(ExpectedConditions.elementToBeClickable(Client_Name));

	}

	public static void setContact_Name(WebDriver driver, String Contact_Name) {

		getContact_Name(driver).sendKeys(Contact_Name);
	}

	public static void setEmail(WebDriver driver, String Email) {
		getEmail(driver).sendKeys(Email);
	}

	public static void setRegistry_Number(WebDriver driver, String Registry_Number) {
		getRegistry_Number(driver).sendKeys(Registry_Number);
	}

	public static void setCountries(WebDriver driver, String Countries) {
		Actions builder = new Actions(driver);
		Actions country = builder.moveToElement(getCountries(driver)).click().sendKeys(Countries);
		country.sendKeys(Keys.DOWN).sendKeys(Keys.RETURN);
		country.perform();
	}

	public static void setCity(WebDriver driver, String City) {
		getCity(driver).sendKeys(City);
	}

	public static void setStreet(WebDriver driver, String Street) {
		getStreet(driver).sendKeys(Street);
	}

	public static void setZIP(WebDriver driver, String ZIP) {
		getZIP(driver).sendKeys(ZIP);
	}

			
	public static void setCode(WebDriver driver, String code) {
		getCode(driver).sendKeys(code);
	}

	public static void setAgreement_Day(WebDriver driver, String Agreement_Day) {
		getAgreement_Date(driver).sendKeys(Agreement_Day);
	}

//	public static void setStatus(WebDriver driver, String status) {
//		String currentStatus = getStatus_Active(driver).getText();
//		String cs = currentStatus.split(":")[1].trim();
//		if (!status.equals(cs)) {
//			getStatus_Active(driver).click();
//		}
	

	public static void setSave(WebDriver driver) {
		getSave(driver).click();
	}

			
	}

