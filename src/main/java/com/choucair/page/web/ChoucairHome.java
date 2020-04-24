package com.choucair.page.web;

import com.choucair.generic.WebDriverDOM;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DefaultUrl("https://www.choucairtesting.com")
public class ChoucairHome extends WebDriverDOM {

    @FindBy(xpath = "/html/body/div[2]/header/div/div/div/div[2]/nav/div/ul/li[5]/a")
    WebElementFacade Empleos;


    @FindBy(id = "search_keywords")
    WebElementFacade Busqueda;

    @FindBy(id = "search_location")
    WebElementFacade Ubicacion;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/div/div/section[12]/div/div/div/div/div/div[2]/div/div/div/form/div[1]/div[4]/input")
    WebElementFacade Busquedas;

    public void accedoEmpleos() {
        clickElement(Empleos);
    }

    public void ingresoBusqueda(String v) {
        sendKeyElement(Busqueda, v);
    }

    public void ingresoUbicacion(String v) { sendKeyElement(Ubicacion, v);}

    public void Busqueda() {
        clickElement(Busquedas);
        }

}
