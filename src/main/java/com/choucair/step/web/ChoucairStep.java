package com.choucair.step.web;

import com.choucair.page.web.ChoucairHome;
import net.thucydides.core.annotations.Step;

public class ChoucairStep {

    ChoucairHome choucairHome;

    @Step
    public void openChoucairHome() {
        choucairHome.open();
    }

    @Step
    public void clickEmpleos() {
        choucairHome.accedoEmpleos();
    }

    @Step
    public void escriboBusqueda(String v) {
        choucairHome.ingresoBusqueda(v);
    }

    @Step
    public void escriboUbicacion(String v) {
        choucairHome.ingresoUbicacion(v);
    }

    @Step
    public void clickEnBusqueda() {
        choucairHome.Busqueda();
    }



}
