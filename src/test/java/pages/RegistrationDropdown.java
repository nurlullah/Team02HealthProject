package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationDropdown {
    public RegistrationDropdown(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[(text()='Register')]")
    public WebElement registerDropdown;

    @FindBy(xpath = "//*[(text()=' Appointment')]")
    public WebElement makeAppointment;

    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "firstPassword")
    public WebElement newPassword;

    @FindBy(id = "strengthBar")
    public WebElement passwordStrength;

    @FindBy(id = "secondPassword")
    public WebElement confirmPassword;

    @FindBy(id = "register-submit")
    public WebElement registerButton;

    @FindBy(className = "Toastify")
    public WebElement alert;
}
