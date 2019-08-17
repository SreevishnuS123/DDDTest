package com.vcentry.tnstc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.vcentry.tnstc.initializer.Initializer;

public class RegPage extends Initializer {
	
	public static void enterName(String Username){
		getElementByName("REGPAGE_TYPE_USERNAME_NAME").sendKeys(Username);
		
	}
	
	public static void enterPwd(String Pwd){
		getElementByName("REGPAGE_TYPE_PASSWORD_NAME").sendKeys(Pwd);

		
	}

	public static void enterCnfpwd(String Cnfpwd){
		getElementByName("REGPAGE_TYPE_CPASSWORD_NAME").sendKeys(Cnfpwd);

		
	}

	public static void selectQuestion(String SQ){
		
		WebElement dropdown = getElementByName("REGPAGE_SELECT_SQUESTION_NAME");
		Select s = new Select(dropdown);
		s.selectByVisibleText(SQ);
		
		
	}
	public static void enterAnswer(String Answer){
		
		getElementByName("REGPAGE_TYPE_SANSWER_NAME").sendKeys(Answer);

		
		
	}
}
