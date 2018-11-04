package appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn_Page {
	public static WebElement getEmail(WebDriver driver) {
		WebElement getEmail = driver.findElement(By.xpath("//input[@id='login-form-email']"));
		return getEmail;
	}

	public static void setEmail(WebDriver driver, String Email) {
		getEmail(driver).sendKeys(Email);
	}

	public static WebElement getPassword(WebDriver driver) {
		WebElement getPassword = driver.findElement(By.xpath("//input[@id='login-pass']"));
		return getPassword;
	}

	public static void setPassword(WebDriver driver, String Password) {
		getPassword(driver).sendKeys(Password);

	}

	public static WebElement getLogIn(WebDriver driver) {
		WebElement getLogIn = driver.findElement(By.xpath("//div[@class='v-btn__content']"));
		return getLogIn;
	}

	public static void setLogIn(WebDriver driver, String LogIn) {
		getLogIn(driver).click();

	}

}