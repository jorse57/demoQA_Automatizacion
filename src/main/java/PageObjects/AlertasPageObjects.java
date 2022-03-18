package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demoqa.com/")


public class AlertasPageObjects  extends PageObject {
    By divAFW = By.xpath("//h5[text()='Alerts, Frame & Windows']");
    By divAlertas = By.xpath("//span[text()='Alerts']");
    By btnAlerta = By.xpath("//*[@id='alertButton']");
    By btnAlertaTiempo = By.xpath("//*[@id='timerAlertButton']");
    By btnConfirmar = By.xpath("//*[@id='confirmButton']");
    By msjResultado = By.xpath("//*[@id='confirmResult']");
    By btnPromt = By.xpath("//*[@id='promtButton']");
    By msjPrompt = By.xpath("//*[@id='promptResult']");


    public By getMsjResultado() {
        return msjResultado;
    }

    public By getMsjPrompt() {
        return msjPrompt;
    }
    public By getDivAFW() {
        return divAFW;
    }

    public By getDivAlertas() {
        return divAlertas;
    }

    public By getBtnAlerta() {
        return btnAlerta;
    }

    public By getBtnAlertaTiempo() {
        return btnAlertaTiempo;
    }

    public By getBtnConfirmar() {
        return btnConfirmar;
    }

    public By getBtnPromt() {
        return btnPromt;
    }
}
