package PageObjects;

import Utils.Datos;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.io.IOException;

@DefaultUrl("https://demoqa.com/")

public class RegistroPageObjects extends PageObject {

    Datos datos = new Datos();

    By divElements = By.xpath("//h5[text()='Elements']");
    By divWebTables = By.xpath("//span[contains(.,'Web Tables')]");
    By btnAdd = By.xpath("//*[@id='addNewRecordButton']");
    By txtFirstName = By.xpath("//*[@placeholder='First Name']");
    By txtLastName = By.xpath("//*[@placeholder='Last Name']");
    By txtUserEmail = By.xpath("//*[@id='userEmail']");
    By txtAge = By.xpath("//*[@placeholder='Age']");
    By txtSalary = By.xpath("//*[@id='salary']");
    By txtDepartment = By.xpath("//*[@id='department']");
    By btnSubmit = By.xpath("//*[@id='submit']");
    By btnDelete = By.xpath("//*[@id='delete-record-" + datos.obtenerDatos("Parametros", "Datos.xlsx", 1, 6) + "']");
    By txtUser = By.xpath("//div[text()='" + datos.obtenerDatos("Parametros", "Datos.xlsx", 1, 0) + "']");

    public By getTxtUser() {
        return txtUser;
    }

    public RegistroPageObjects() throws IOException {
    }

    public By getDivElements() {
        return divElements;
    }

    public By getDivWebTables() {
        return divWebTables;
    }

    public By getBtnAdd() {
        return btnAdd;
    }

    public By getTxtFirstName() {
        return txtFirstName;
    }

    public By getTxtLastName() {
        return txtLastName;
    }

    public By getTxtUserEmail() {
        return txtUserEmail;
    }

    public By getTxtAge() {
        return txtAge;
    }

    public By getTxtSalary() {
        return txtSalary;
    }

    public By getTxtDepartment() {
        return txtDepartment;
    }

    public By getBtnSubmit() {
        return btnSubmit;
    }

    public By getBtnDelete() {
        return btnDelete;
    }
}
