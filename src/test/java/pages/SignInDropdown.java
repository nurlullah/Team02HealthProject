package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignInDropdown {
    public SignInDropdown(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "login-item")
    public WebElement signIn;

    @FindBy(name = "username")
    public WebElement usernameBox;

    @FindBy(name = "password")
    public WebElement passwordBox;

    @FindBy(css = "input#rememberMe")
    public WebElement rememberMeCheckbox;

    @FindBy(xpath = "//*[(text()='Did you forget your password?')]")
    public WebElement forgetPasswordButton;

    @FindBy(id = "email")//forget password e basınca çıkıyor
    public WebElement resetPasswordEmail;

    @FindBy(xpath = "//*[@type='submit']")//forget password e basınca çıkıyor
    public WebElement resetPasswordButton;

    @FindBy(className = "Toastify")//forget password e basınca çıkıyor
    public WebElement resetPasswordAlert;

    @FindBy(xpath = "//*[(text()='Register a new account')]")
    public WebElement registerNewAccountButton;

    @FindBy(xpath = "//*[(text()='Cancel')]")
    public WebElement cancelButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInSubmitButton;

}
