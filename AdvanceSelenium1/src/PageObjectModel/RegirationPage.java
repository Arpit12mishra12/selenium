package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegirationPage extends BasePage{

	public RegirationPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(linkText = "Register")
	private WebElement regbutton;

	public WebElement getRegbutton() {
		return regbutton;
	}
	
	@FindBy(id = "gender-male")
	private WebElement gender;

	public WebElement getGender() {
		return gender;
	}
	
	@FindBy(id = "FirstName")
	private WebElement firstname;

	public WebElement getFirstname() {
		return firstname;
	}
	
	@FindBy(id = "LastName")
	private WebElement lastname;

	public WebElement getLastname() {
		return lastname;
	}
	@FindBy(id = "Email")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}
	
	@FindBy(id = "Password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmpasswpord;

	public WebElement getConfirmpasswpord() {
		return confirmpasswpord;
	}
	
	@FindBy(id = "register-button")
	private WebElement registerbutton;

	public WebElement getRegisterbutton() {
		return registerbutton;
	}
	
	
	
	
}
