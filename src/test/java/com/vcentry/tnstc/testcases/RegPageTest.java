package com.vcentry.tnstc.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.vcentry.tnstc.initializer.Initializer;
import com.vcentry.tnstc.inputReader.inputReader;
import com.vcentry.tnstc.pages.RegPage;
import com.vcentry.tnstc.reportGenerator.ScreenshotGenerator;

public class RegPageTest extends Initializer {

	@Test(dataProvider = "RegPageTest")
	
	public void validateRegPage(String tcName, String Username, String Pwd, String Cnfpwd, String Squestion, String Sanswer)
			throws IOException {
		initialize();
		log=reports.startTest(tcName + " Initiated ");
		wd.get(envprop.getProperty("URL"));
		/*
		 * WebElement username =
		 * wd.findElement(By.name("txtUserLoginID"));username.sendKeys("Name");
		 * WebElement pwd = wd.findElement(By.name("txtPassword"));
		 * pwd.sendKeys("Name$$"); WebElement cnfpwd =
		 * wd.findElement(By.name("txtConfirmPassword"));
		 * cnfpwd.sendKeys("Name$$"); WebElement sq =
		 * wd.findElement(By.name("txtSecretQuestion")); Select s = new
		 * Select(sq); s.selectByIndex(3); WebElement sa =
		 * wd.findElement(By.name("txtSecretAnswer")); sa.sendKeys("Answer");
		 */

		/*
		 * WebElement username = wd.findElement(By.name(locatorprop.getProperty(
		 * "REGPAGE_TYPE_USERNAME_NAME"))); username.sendKeys("Name");
		 * WebElement pwd = wd.findElement(By.name(locatorprop.getProperty(
		 * "REGPAGE_TYPE_PASSWORD_NAME"))); pwd.sendKeys("Name$$"); WebElement
		 * cnfpwd = wd.findElement(By.name(locatorprop.getProperty(
		 * "REGPAGE_TYPE_CPASSWORD_NAME"))); cnfpwd.sendKeys("Name$$");
		 * WebElement sq = wd.findElement(By.name(locatorprop.getProperty(
		 * "REGPAGE_SELECT_SQUESTION_NAME"))); Select s = new Select(sq);
		 * s.selectByIndex(3); WebElement sa =
		 * wd.findElement(By.name(locatorprop.getProperty(
		 * "REGPAGE_TYPE_SANSWER_NAME"))); sa.sendKeys("Answer");
		 */
		// getElementByName("REGPAGE_TYPE_USERNAME_NAME").sendKeys("Name");
		/*
		 * getElementByName("REGPAGE_TYPE_PASSWORD_NAME").sendKeys("Name$$");
		 * getElementByName("REGPAGE_TYPE_CPASSWORD_NAME").sendKeys("Name$$");
		 * WebElement dropdown =
		 * getElementByName("REGPAGE_SELECT_SQUESTION_NAME"); Select s = new
		 * Select(dropdown); s.selectByIndex(3);
		 * getElementByName("REGPAGE_TYPE_SANSWER_NAME").sendKeys("Answer");
		 */
		RegPage.enterName(Username);
		RegPage.enterPwd(Pwd);
		RegPage.enterCnfpwd(Cnfpwd);

		RegPage.selectQuestion(Squestion);

		RegPage.enterAnswer(Sanswer);

	}

	@DataProvider(name = "RegPageTest")
	public static Object[][] getData() throws Exception {
		if (inputReader.RunModeVerification("RegPageTest")) {

			Object[][] data = inputReader.selectSingleDataOrMulitiData("RegPageTest");
			/*
			 * Object[][] data = new Object[3][5];
			 * data[0][0] = "Vcentry";
			data[0][1] = "Vcentry$";
			data[0][2] = "Vcentry$";
			data[0][3] = "High school name?";
			data[0][4] = "Vcentry$";

			data[1][0] = "Vcentrya";
			data[1][1] = "Vcentry$";
			data[1][2] = "Vcentry$";
			data[1][3] = "High school name?";
			data[1][4] = "Vcentry$";

			data[2][0] = "Vcentryb";
			data[2][1] = "Vcentry$";
			data[2][2] = "Vcentry$";
			data[2][3] = "High school name?";
			data[2][4] = "Vcentry$";
*/			return data;
		}
		return null;
	}
	@AfterMethod
    public void teardown(ITestResult it) throws IOException{
		ScreenshotGenerator.generateScreenshot(it);
   	 /*Object [] data=it.getParameters();
   	 if(it.isSuccess())
   	 {
   	 String path=takeScreenshot(data[0].toString());
   	 
   	 log.log(LogStatus.PASS, "testcase pass", log.addScreenCapture(path));
   	 }else 
   	 {
       	 String path=takeScreenshot(data[0].toString());
       	 log.log(LogStatus.FAIL, "testcase pass", log.addScreenCapture(path));
         }
   	 reports.endTest(log);
   	 reports.flush();
    */}
	
	}



