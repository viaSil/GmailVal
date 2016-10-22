package com.steps.serenity;

import com.pages.GmailValPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class GmailValSteps extends ScenarioSteps {

  
	private static final long serialVersionUID = 1L;
	GmailValPage gmailValPage;

   @Step
   public void open_gmail_and_maximize_window() {
	   gmailValPage.open();
	   getDriver().manage().window().maximize();
   }
   
   @Step
   public void type_email(String email){
	   gmailValPage.input_email(email);
   }
   
   @Step
   public void click_next_button(){
	   gmailValPage.click_on_next();
   }
   
   @Step
   public void type_password(String password){
	   gmailValPage.input_pass(password);
   }
   
   @Step
   public void click_on_signin(){
	   gmailValPage.click_sing_in();
   }
   
   @Step
   public void click_usermenu(){
	   gmailValPage.click_on_usermenu();
   }
   
   @Step
   public void click_signout(){
	   gmailValPage.click_on_signout();
   }
   
   @Step
   public void validate_logout(){
	   gmailValPage.logout_validation();
   }
   
}