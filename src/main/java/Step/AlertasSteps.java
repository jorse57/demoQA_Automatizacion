package Step;

import Utils.Datos;

import Utils.Scroll;
import net.thucydides.core.annotations.Step;
import PageObjects.AlertasPageObjects;
import org.hamcrest.Matchers;

import java.io.IOException;


import static org.hamcrest.MatcherAssert.assertThat;

public class AlertasSteps {
    AlertasPageObjects alertasPageObjects = new AlertasPageObjects();
    Datos datos = new Datos();
    Scroll scroll = new Scroll();


    @Step
    public void clickAFW(){
        scroll.scrollAlElemento(alertasPageObjects.getDriver(),alertasPageObjects.getDivAFW());
        alertasPageObjects.getDriver().findElement(alertasPageObjects.getDivAFW()).click();
    }
    public void clickAlertas(){
        scroll.scrollAlElemento(alertasPageObjects.getDriver(),alertasPageObjects.getDivAlertas());
        alertasPageObjects.getDriver().findElement(alertasPageObjects.getDivAlertas()).click();
    }
    public void clickAceptar()  {
        alertasPageObjects.getDriver().findElement(alertasPageObjects.getBtnAlerta()).click();
        alertasPageObjects.getDriver().switchTo().alert().accept();
    }
    public void clickOk() throws InterruptedException {
        alertasPageObjects.getDriver().findElement(alertasPageObjects.getBtnAlertaTiempo()).click();
        //alertasPageObjects.getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        Thread.sleep(5000);
        alertasPageObjects.getDriver().switchTo().alert().accept();
    }

    public void clickConfirmar(){
        alertasPageObjects.getDriver().findElement(alertasPageObjects.getBtnConfirmar()).click();
        alertasPageObjects.getDriver().switchTo().alert().accept();
    }
    // en caso de querer  dar cancelar
    // alertasPageObjects.getDriver().switchTo().alert().dismiss();
    public void validarMsjConfirmar(){
        assertThat(alertasPageObjects.getDriver().findElement(alertasPageObjects.getMsjResultado()).isDisplayed(), Matchers.is(true));
    }
    public void clickPromt() throws IOException {
        alertasPageObjects.getDriver().findElement(alertasPageObjects.getBtnPromt()).click();
        alertasPageObjects.getDriver().switchTo().alert().sendKeys(datos.obtenerDatos("Parametros", "Datos.xlsx", 1, 0));
        alertasPageObjects.getDriver().switchTo().alert().accept();
    }
    public void validarMsjPromt(){
        assertThat(alertasPageObjects.getDriver().findElement(alertasPageObjects.getMsjPrompt()).isDisplayed(), Matchers.is(true));
    }

}
