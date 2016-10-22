package com.pages;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.thucydides.core.pages.PageObject;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

@DefaultUrl("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/?tab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier")
public class GmailValPage extends PageObject {

	@FindBy (css = "input#Email")
	private WebElementFacade inputEmail;

	public void input_email(String email) {
		inputEmail.type(email);
	}

	@FindBy (css = "input#next.rc-button.rc-button-submit")
	private WebElementFacade clickNext;

	public void click_on_next() {
		clickNext.click();
	}
	
	@FindBy (css = "input#Passwd")
	private WebElementFacade inputPass;

	public void input_pass(String password) {
		inputPass.type(password);
	}

	@FindBy (css = "input#signIn")
	private WebElementFacade clickSingin;

	public void click_sing_in() {
		clickSingin.click(); 
	}
	
	@FindBy (css = "span.gb_8a.gbii")
	private WebElementFacade clickUsermenu;

	public void click_on_usermenu() {
		clickUsermenu.click();  
	}
	
	@FindBy (css = "a#gb_71.gb_Fa.gb_Fe.gb_Ne.gb_wb")
	private WebElementFacade clickSignout;

	public void click_on_signout() {
		clickSignout.click();  
	}
	
	@FindBy(css = "h2.hidden-small")
	private static WebElementFacade ValidateLogout;

	public static void logout_validation() {
		ValidateLogout.waitUntilVisible();
		System.out.println("Textul este:" + ValidateLogout.getText());
		Assert.assertEquals("Sign in to continue to Gmail", ValidateLogout.getText());
	}

	  
	  
	
}