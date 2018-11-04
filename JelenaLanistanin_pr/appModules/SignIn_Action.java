package appModules;

import org.openqa.selenium.WebDriver;

import utility.Constant;
import utility.ExcelUtils;

// Now this method does not need any arguments

public class SignIn_Action {

	public static void Execute(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "LogIn");

		String sEmail = ExcelUtils.getCellData(1, 0);

		String sPassword = ExcelUtils.getCellData(1, 1);

		LogIn_Page.setEmail(driver, sEmail);
		Thread.sleep(2000);

		LogIn_Page.setPassword(driver, sPassword);
		Thread.sleep(2000);

		LogIn_Page.getLogIn(driver).click();
		
		ExcelUtils.setCellData("Pass", 1, 2);
		
		System.out.println("Login Successfully.");
	}
}