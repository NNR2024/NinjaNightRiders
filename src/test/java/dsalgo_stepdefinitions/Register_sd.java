package dsalgo_stepdefinitions;


//import static org.testng.Assert.assertEquals;
//
//import java.io.IOException;
//import java.time.Duration;
//import java.util.List;
//import java.util.Map;
//import org.testng.Assert;
//
//import dsalgoDrivers.DriverFactory;
//import dsalgo_pagefactory.Register_pf;
//
////import org.apache.logging.log4j.core.util.Assert;
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

public class Register_sd {
	
/*
	//WebDriver driver;
	Register_pf Registerpage=new Register_pf();
	//WebDriver driver = DriverFactory.getdriver();

@Given("The User navigates DSAlgo portal with url")
public void the_user_navigates_ds_algo_portal_with_url() {
	//driver=new FirefoxDriver();
	//driver.manage().window().maximize();
	
	//Registerpage.homepage();
    System.out.println("Navigated to dsalgoportal");
	
	
}

@When("User clicks on Getstarted button")
public void user_clicks_on_get_started_button() throws InterruptedException {
	
	Registerpage.GetStarted();
	Thread.sleep(5000);
	
  
}

@Then("User should be navigated to home page")
public void user_should_be_navigated_to_home_page() {
	
	String hometitle = Registerpage.Homepagetext();
	assertEquals( hometitle, "NumpyNinja", "title match");
	//System.out.println("Error message is displaed " + register.emptyPwdErrorMsg() + " below Password textbox");
	//assertEquals(register.emptyPwdErrorMsg(), expErrorMsg);
	
    }

@Given("The user clicks on Register link in home page")
public void the_user_clicks_on_register_link_in_home_page() {
	
	//driver=new FirefoxDriver();
	//Registerpage=new sampleregister_pf(driver);
	//Registerpage.homepage();
	
	Registerpage.GetStarted();
	Registerpage.Rlink();
	
	//driver.navigate().to("https://dsportalapp.herokuapp.com/register");
	
	
}


@When("^The user enters (.*) and (.*) and (.*)$")
public void the_user_enters_and_and(String username, String password, String confirmpassword) throws InterruptedException {
	
	Registerpage.login(username, password, confirmpassword);
	Thread.sleep(5000);
   // Registerpage.closebrowser();
	
}

@Then("The user should be able to see the error msg {string}")
public void the_user_should_be_able_to_see_the_error_msg(String Errormsg) {
	
	String actualMessage = Registerpage.actMsg();
	Assert.assertEquals("Please fill out this field", Errormsg, actualMessage);
    
}


@Given("The user navigates to Register Page in home page")
public void the_user_navigates_to_register_page_in_home_page() throws InterruptedException {

	//driver=new FirefoxDriver();
	//Registerpage=new sampleregister_pf(driver);
//	Registerpage.homepage();
	Registerpage.GetStarted();
	Thread.sleep(2000);
	Registerpage.Rlink();
}


@When("The user tries to enter  {string} and {string} and {string}")
public void the_user_tries_to_enter_and_and(String username, String password, String confirmpassword) throws InterruptedException {
    
	Registerpage.login(username, password, confirmpassword);
	Thread.sleep(5000);
}

@Then("The user should navigate to Home Page of DS Algo with {string} New Account Created. You are logged in as <username>")
public void the_user_should_navigate_to_home_page_of_ds_algo_with_new_account_created_you_are_logged_in_as_username(String Message) {
    
	System.out.println("valid user:" +Message);
	
}


*/
	
}



	