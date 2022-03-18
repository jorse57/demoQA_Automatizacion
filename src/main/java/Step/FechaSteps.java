package Step;

import PageObjects.FechaPageObjects;
import Utils.Datos;
import Utils.Scroll;
import Utils.ListasDesplegables;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.openqa.selenium.Keys;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;

public class FechaSteps {
    FechaPageObjects fechaPageObjects = new FechaPageObjects();
    Datos datos = new Datos();
    Scroll scroll = new Scroll();
    ListasDesplegables listasDesplegables = new ListasDesplegables();

    public FechaSteps() throws IOException {
    }

    @Step
    public void clickWidgets() {
        scroll.scrollAlElemento(fechaPageObjects.getDriver(), fechaPageObjects.getDivWidgets());
        fechaPageObjects.getDriver().findElement(fechaPageObjects.getDivWidgets()).click();
    }

    @Step
    public void clickDatePicker() {
        scroll.scrollAlElemento(fechaPageObjects.getDriver(), fechaPageObjects.getDivDatePicker());
        fechaPageObjects.getDriver().findElement(fechaPageObjects.getDivDatePicker()).click();
    }

    @Step
    public void clickDate() {
        fechaPageObjects.getDriver().findElement(fechaPageObjects.getTxtDate()).click();
    }

    @Step
    public void ingresarDate() throws IOException {
        listasDesplegables.seleccionarValorSelect(fechaPageObjects.getDriver(), fechaPageObjects.getLstMonth(), datos.obtenerDatos("Parametros", "Datos.xlsx", 1, 7));
        listasDesplegables.seleccionarValorSelect(fechaPageObjects.getDriver(), fechaPageObjects.getLstYear(), datos.obtenerDatos("Parametros", "Datos.xlsx", 1, 8));

    }

    @Step
    public void clickDateDay() {
        fechaPageObjects.getDriver().findElement(fechaPageObjects.getDivDay()).click();
    }

    @Step
    public void clicksDateTime() {
        fechaPageObjects.getDriver().findElement(fechaPageObjects.getTxtDateAndTime()).click();
        fechaPageObjects.getDriver().findElement(fechaPageObjects.getBtnMonth()).click();
    }

    @Step
    public void ingresarDateAndTime() throws IOException {
        fechaPageObjects.getDriver().findElement(fechaPageObjects.getTxtDateAndTime()).sendKeys(Keys.CONTROL,"a");
        fechaPageObjects.getDriver().findElement(fechaPageObjects.getTxtDateAndTime()).sendKeys(datos.obtenerDatos("Parametros", "Datos.xlsx", 1, 14));
        fechaPageObjects.getDriver().findElement(fechaPageObjects.getTxtDateAndTime()).sendKeys(Keys.chord(Keys.ENTER));
    }
    public void validarTextoFecha(){
        assertThat(fechaPageObjects.getDriver().findElement(fechaPageObjects.getTxtDate()).isDisplayed(), Matchers.is(true));
    }

    public void validarTextoFechaHora(){
        assertThat(fechaPageObjects.getDriver().findElement(fechaPageObjects.getTxtDateAndTime()).isDisplayed(), Matchers.is(true));
    }

}
