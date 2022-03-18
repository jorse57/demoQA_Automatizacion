package Step;

import PageObjects.RegistroPageObjects;
import Utils.Datos;
import Utils.Scroll;
import com.ibm.icu.impl.UResource;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.openqa.selenium.Keys;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;

public class RegistroSteps {
    RegistroPageObjects registroPageObjects = new RegistroPageObjects();
    Datos datos = new Datos();
    Scroll scroll = new Scroll();


    public RegistroSteps() throws IOException {
    }

    @Step
    public void abrirNavegador() {
        registroPageObjects.open();
    }

    @Step
    public void clickElements() {
        scroll.scrollAlElemento(registroPageObjects.getDriver(), registroPageObjects.getDivElements());
        registroPageObjects.getDriver().findElement(registroPageObjects.getDivElements()).click();
    }

    @Step
    public void clickWebTables() {
        scroll.scrollAlElemento(registroPageObjects.getDriver(), registroPageObjects.getDivWebTables());
        registroPageObjects.getDriver().findElement(registroPageObjects.getDivWebTables()).click();
    }

    @Step
    public void clickAdd() {
        registroPageObjects.getDriver().findElement(registroPageObjects.getBtnAdd()).click();
    }

    @Step
    public void ingresarFirstName() throws IOException {
        registroPageObjects.getDriver().findElement(registroPageObjects.getTxtFirstName()).sendKeys(datos.obtenerDatos("Parametros", "Datos.xlsx", 1, 0));
    }

    @Step
    public void ingresarLastName() throws IOException {
        registroPageObjects.getDriver().findElement(registroPageObjects.getTxtLastName()).sendKeys(datos.obtenerDatos("Parametros", "Datos.xlsx", 1, 1));
    }

    @Step
    public void ingresarEmail() throws IOException {
        registroPageObjects.getDriver().findElement(registroPageObjects.getTxtUserEmail()).sendKeys(datos.obtenerDatos("Parametros", "Datos.xlsx", 1, 2));
    }

    @Step
    public void ingresarAge() throws IOException {
        registroPageObjects.getDriver().findElement(registroPageObjects.getTxtAge()).sendKeys(datos.obtenerDatos("Parametros", "Datos.xlsx", 1, 3));
    }

    @Step
    public void ingresarSalary() throws IOException {
        registroPageObjects.getDriver().findElement(registroPageObjects.getTxtSalary()).sendKeys(datos.obtenerDatos("Parametros", "Datos.xlsx", 1, 4));
    }

    @Step
    public void ingresarDepartment() throws IOException {
        registroPageObjects.getDriver().findElement(registroPageObjects.getTxtDepartment()).sendKeys(datos.obtenerDatos("Parametros", "Datos.xlsx", 1, 5));
    }

    @Step
    public void clickSubmit() {
        registroPageObjects.getDriver().findElement(registroPageObjects.getBtnSubmit()).sendKeys(Keys.ENTER);
    }

    @Step
    public void clickDelete() {
        registroPageObjects.getDriver().findElement(registroPageObjects.getBtnDelete()).click();
    }

    @Step
    public void validarRegistro() {
        assertThat(registroPageObjects.getDriver().findElement(registroPageObjects.getTxtUser()).isDisplayed(), Matchers.is(true));

    }
}
