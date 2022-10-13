package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Appointments {
    public Appointments(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

   @FindBy(css = "svg[data-icon='eye']")
    public WebElement viewButton;

    @FindBy (css = "svg[data-icon='arrow-left']")//viewe tıkladıktan sonra
    public WebElement backButton;                //Create and Edit an Appointment a tıkladıktan sonra

    @FindBy (css = "svg[data-icon='pencil-alt']")//direk edit için ve
    public WebElement editButton;                //viewe tıkladıktan sonraki edit için

    @FindBy (css = "svg[data-icon='trash']")
    public WebElement deleteButton;

    @FindBy (css = "svg[data-icon='ban']") //delete e tıkladıktan sonra
    public WebElement confirmDeleteOperationPopupCANCEL;

    @FindBy(css = "#jhi-confirm-delete-appointment") //delete e tıkladıktan sonra
    public WebElement confirmDeleteOperationPopupDELETE;

    @FindBy(css = ".Toastify")  //Delete e tıkladıktan sonrası için
    public WebElement alert;    //Save e tıkladıktan sonrası için

    @FindBy (css = "svg[data-icon='plus']")
    public WebElement createNewAppointmentButton;

    @FindBy(css = "input[name='startDate']")
    public WebElement startDateBox;

    @FindBy(css = "input[name='endDate']")
    public WebElement endDateBox;

    @FindBy(css = "select[name='status']")
    public WebElement statusBox;

    @FindBy(css = "#appointment-anamnesis")
    public WebElement anemnesisBox;

    @FindBy(css = "#appointment-treatment")
    public WebElement treatmentBox;

    @FindBy(css = "@appointment-diagnosis")
    public WebElement diagnosisBox;

    @FindBy(css = "#appointment-prescription")
    public WebElement prescriptionBox;

    @FindBy(css = "#appointment-description")
    public WebElement descriptionBox;

    @FindBy(css = "select[name='physician.id']")
    public WebElement physicianBox;

    @FindBy(css = "select[name='patient.id']")
    public WebElement patientBox;

    @FindBy(css = "#save-entity")
    public WebElement saveButton;

}
