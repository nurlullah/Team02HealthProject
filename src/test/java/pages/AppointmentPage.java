package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AppointmentPage {
    public AppointmentPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//div[text()='A new Appointment is created with identifier 276391']")
    public WebElement AppointmentCreatedAlert;

    @FindBy(xpath = "//div[text()='A new Test Item is created with identifier 275736']")
    public WebElement testItemsAlert;

    @FindBy(xpath = "//strong[.='Appointment registration saved!']")
    public WebElement physicianAppointmentAlert;

    @FindBy(xpath = "//div[text()='A new Room is created with identifier 275567']")
    public WebElement ANewRoomCreatedAlert;
}
