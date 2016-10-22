package com.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.GmailValSteps;

@RunWith(SerenityRunner.class)
public class GmailValTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;
    
    @Steps
    public GmailValSteps login; 

   
   @Test
   public void enter_email(){
	   login.open_gmail_and_maximize_window();
	   login.type_email("silvixmqps@gmail.com");
	   login.click_next_button();
	   login.type_password("automation");
	   login.click_on_signin();
	   login.click_usermenu();
	   login.click_signout();
	   login.validate_logout();
   }
} 