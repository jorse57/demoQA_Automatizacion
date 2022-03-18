package PageObjects;

import Utils.Datos;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.io.IOException;

@DefaultUrl("https://demoqa.com/")
public class FechaPageObjects extends PageObject {
    Datos datos = new Datos();
    By divWidgets = By.xpath("//h5[text()='Widgets']");
    By divDatePicker = By.xpath("//span[contains(.,'Date Picker')]");
    By txtDate = By.xpath("//*[@id='datePickerMonthYearInput']");
    By txtDateAndTime = By.xpath("//*[@id='dateAndTimePickerInput']");
    By lstMonth = By.xpath("//*[@class='react-datepicker__month-select']");
    By lstYear = By.xpath("//*[@class='react-datepicker__year-select']");
    By divDay = By.xpath("//div[text()='" + datos.obtenerDatos("Parametros", "Datos.xlsx", 1, 9) + "'][1]");
    By btnMonth = By.xpath("//*[@class='react-datepicker__month-read-view']");
    By lstMonthTime = By.xpath("//span[text()='" + datos.obtenerDatos("Parametros", "Datos.xlsx", 1, 10) + "']");
    By btnYear = By.xpath("//*[@class='react-datepicker__year-read-view']");
    By lstYearTime = By.xpath("//div[text()='" + datos.obtenerDatos("Parametros", "Datos.xlsx", 1, 11) + "']");
    By divDayTime = By.xpath("//div[text()='" + datos.obtenerDatos("Parametros", "Datos.xlsx", 1, 12) + "'][1]");
    By lstTime = By.xpath("li[text()='" + datos.obtenerDatos("Parametros", "Datos.xlsx", 1, 13) + "']");

    public FechaPageObjects() throws IOException {
    }

    public By getDivWidgets() {
        return divWidgets;
    }

    public By getDivDatePicker() {
        return divDatePicker;
    }

    public By getTxtDate() {
        return txtDate;
    }

    public By getTxtDateAndTime() {
        return txtDateAndTime;
    }

    public By getLstMonth() {
        return lstMonth;
    }

    public By getLstYear() {
        return lstYear;
    }

    public By getDivDay() {
        return divDay;
    }

    public By getBtnMonth() {
        return btnMonth;
    }

    public By getLstMonthTime() {
        return lstMonthTime;
    }

    public By getBtnYear() {
        return btnYear;
    }

    public By getLstYearTime() {
        return lstYearTime;
    }

    public By getDivDayTime() {
        return divDayTime;
    }

    public By getLstTime() {
        return lstTime;
    }

}
