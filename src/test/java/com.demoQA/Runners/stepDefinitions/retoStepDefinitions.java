package com.demoQA.Runners.stepDefinitions;

import Step.AlertasSteps;
import Step.FechaSteps;
import Step.RegistroSteps;
import cucumber.api.java.es.*;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class retoStepDefinitions {

    @Steps
    RegistroSteps registroSteps;
    @Steps
    FechaSteps fechaSteps;
    @Steps
    AlertasSteps alertasSteps;

    @Dado("^Jorse esta en el portal web$")
    public void jorseEstaEnElPortalWeb() {
        registroSteps.abrirNavegador();
    }


    @Cuando("^Jorse ingresa la informacion para el registro$")
    public void jorseIngresaLaInformacionParaElRegistro() throws IOException {
        registroSteps.clickElements();
        registroSteps.clickWebTables();
        registroSteps.clickAdd();
        registroSteps.ingresarFirstName();
        registroSteps.ingresarLastName();
        registroSteps.ingresarEmail();
        registroSteps.ingresarAge();
        registroSteps.ingresarSalary();
        registroSteps.ingresarDepartment();
        registroSteps.clickSubmit();
        registroSteps.clickDelete();
    }

    @Entonces("^Jorse agregò un nuevo registro$")
    public void jorseAgregòUnNuevoRegistro() {
        registroSteps.validarRegistro();
    }

    //Fechas

    @Cuando("^ingresa nuevas fechas$")
    public void ingresaNuevasFechas() throws IOException {
        fechaSteps.clickWidgets();
        fechaSteps.clickDatePicker();
        fechaSteps.clickDate();
        fechaSteps.ingresarDate();
        fechaSteps.clickDateDay();
        fechaSteps.clicksDateTime();
        fechaSteps.ingresarDateAndTime();
    }

    @Entonces("^agrega nuevas fechas$")
    public void agregaNuevasFechas() {
        fechaSteps.validarTextoFecha();
        fechaSteps.validarTextoFechaHora();

    }

    //alertas
    @Cuando("^interactua con las ventanas emergentes$")
    public void  interactuaConLasVentanasEmergentes() throws InterruptedException, IOException {
        alertasSteps.clickAFW();
        alertasSteps.clickAlertas();
        alertasSteps.clickAceptar();
        alertasSteps.clickOk();
        alertasSteps.clickConfirmar();
        alertasSteps.clickPromt();
    }

    @Entonces("^valida sus acciones en la pagina$")
    public void validaSusAccionesEnLaPagina() {
        alertasSteps.validarMsjConfirmar();
        alertasSteps.validarMsjPromt();
    }
}
