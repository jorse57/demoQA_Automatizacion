package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ListasDesplegables {
    public void seleccionarValorSelect (WebDriver driver, By elemento, String valor){
        Select seleccionar = new Select(driver.findElement(elemento));
        seleccionar.selectByVisibleText(valor);
    }
}
