package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BusinessPage {
	public static WebElement getBusiness(WebDriver driver) {
		WebElement getBusiness = driver.findElement(By.xpath("//*[@id=\"nav-bar-business\"]/div"));
		return getBusiness;
	}

	public static void setBusiness(WebDriver driver) {
		getBusiness(driver).click();
	}

	public static WebElement getAddNewBusiness(WebDriver driver) {
		WebElement getAddNewBusiness = driver
				.findElement(By.xpath("//a[@id='add-new-business']//div[@class='v-btn__content']"));

		return getAddNewBusiness;

	}

	public static void setAddNewBusiness(WebDriver driver) {
		getAddNewBusiness(driver).click();

	}

	public static WebElement getBusiness_Name(WebDriver driver) {
		WebElement getBusiness_Name = driver.findElement(By.xpath("//input[@id='business-form-name']"));
		return getBusiness_Name;
	}

	public static void setBusiness_Name(WebDriver driver, String Business_Name) {
		getBusiness_Name(driver).sendKeys(Business_Name);
	}

	public static WebElement getCountries(WebDriver driver) {
		WebElement getCountries = driver.findElement(By.xpath("//input[@id='business-form-country']"));
		return getCountries;
	}

	public static void setCountries(WebDriver driver, String countryName) throws InterruptedException {
		Actions builder = new Actions(driver);
		Actions country = builder.moveToElement(getCountries(driver)).click().sendKeys(countryName);
		country.sendKeys(Keys.DOWN).sendKeys(Keys.RETURN);
		country.perform();
	}

	public static WebElement getCity(WebDriver driver) {
		WebElement getCity = driver.findElement(By.xpath("//input[@id='business-form-city']"));
		return getCity;

	}

	public static void setCity(WebDriver driver, String City) {
		getCity(driver).sendKeys(City);
	}

	public static WebElement getStreet(WebDriver driver) {
		WebElement getStreet = driver.findElement(By.xpath("//*[@id=\"business-form-street\"]"));
		return getStreet;
	}

	public static void setStreet(WebDriver driver, String Street) {
		getStreet(driver).sendKeys(Street);
	}

	public static WebElement getZIP(WebDriver driver) {
		WebElement getZIP = driver.findElement(By.xpath("//*[@id=\"business-form-zip\"]"));
		return getZIP;

	}

	public static void setZIP(WebDriver driver, String ZIP) {
		getZIP(driver).sendKeys(ZIP);
	}

	public static WebElement getRegister_Number(WebDriver driver) {
		WebElement getRegister_Number = driver.findElement(By.xpath("//*[@id=\"business-form-reg-num\"]"));
		return getRegister_Number;
	}

	public static void setRegister_Number(WebDriver driver, String Register_Number) {
		getRegister_Number(driver).sendKeys(Register_Number);
	}

	public static WebElement getAddBankAccount(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		WebElement getAddBankAccount = driver
				.findElement(By.xpath("//button[@id='business-form-add-bank-btn']//div[@class='v-btn__content']"));
		return getAddBankAccount;
	}

	public static void setAddBankAccount(WebDriver driver) throws InterruptedException {
		getAddBankAccount(driver).click();

	}

	public static WebElement getBank_Name(WebDriver driver) {
		WebElement getBank_Name = driver.findElement(By.xpath("//input[@id='bank-dialog-name']"));
		return getBank_Name;

	}

	public static void setBank_Name(WebDriver driver, String Bank_Name) {
		getBank_Name(driver).sendKeys(Bank_Name);
	}

	public static WebElement getAccount_Number(WebDriver driver) {
		WebElement getAccount_Number = driver.findElement(By.xpath("//input[@id='bank-dialog-num']"));
		return getAccount_Number;
	}

	public static void setAccount_Number(WebDriver driver, String Account_Number) {
		getAccount_Number(driver).sendKeys(Account_Number);
	}

	public static WebElement getSwift_Number(WebDriver driver) {
		WebElement getSwift_Number = driver.findElement(By.xpath("//input[@id='bank-dialog-swf-num']"));
		return getSwift_Number;
	}

	public static void setSwift_Number(WebDriver driver, String Swift_Number) {
		getSwift_Number(driver).sendKeys(Swift_Number);
	}

	public static WebElement getPayment_Instructions(WebDriver driver) {
		WebElement getPayment_Instructions = driver.findElement(By.xpath("//textarea[@id='bank-dialog-pay-inst']"));
		return getPayment_Instructions;
	}

	public static void setPayment_Instructions(WebDriver driver, String Payment_Instructions) {
		getPayment_Instructions(driver).sendKeys(Payment_Instructions);
	}

	public static WebElement getCurrency(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement getCurrency = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='v-select__selections']")));
		return getCurrency;
	}

	public static List<WebElement> getCurrencyLabel(WebDriver driver) {
		List<WebElement> currencyList = new ArrayList<WebElement>();
		currencyList.add(driver.findElement(By.xpath("//div[contains(text(),'Dinar')]")));
		currencyList.add(driver.findElement(By.xpath("//div[contains(text(),'Euro')]")));
		currencyList.add(driver.findElement(By.xpath("//div[contains(text(),'US Dollar')]")));
		return currencyList;
	}

	public static void setCurrency(WebDriver driver, String currencyName) {
		Actions builder = new Actions(driver);
		WebElement currencyList = getCurrency(driver);
		Actions currency = builder.moveToElement(currencyList).click();
		currency.perform();
		List<WebElement> CurrencyLabel = getCurrencyLabel(driver);
		for (WebElement e : CurrencyLabel) {
			if (e.getText().equals(currencyName)) {
				e.click();
			}
		}
	}

	public static WebElement getSave(WebDriver driver) {
		WebElement getSave = driver.findElement(By.xpath("//div[contains(text(),'Save')]"));
		return getSave;
	}

	public static void setSave(WebDriver driver) {
		getSave(driver).click();
	}

	public static WebElement getCancel(WebDriver driver) {
		WebElement getCancel = driver.findElement(By.xpath("//div[contains(text(),'Cancel')]"));
		return getCancel;
	}

	public static void setCancel(WebDriver driver, String Cancel) {
		getCancel(driver).click();

	}

	public static WebElement getAddBankAccount1(WebDriver driver) {
		WebElement getAddBankAccount1 = driver.findElement(By.xpath("//div[contains(text(),'Add bank account')]"));
		return getAddBankAccount1;
	}

	public static void setAddBankAccount1(WebDriver driver) {
		getAddBankAccount1(driver).click();
	}
}
