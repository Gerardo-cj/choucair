package com.choucair.stepDefinitions.web;

import com.choucair.step.web.ChoucairStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class WebStepDefinitions {

    @Steps
    ChoucairStep choucairStep;


    @When("^que el usuario accede a la web de choucair$")
    public void queElUsuarioAccedeALaWebDeChoucair() {
        choucairStep.openChoucairHome();
    }

    @And("^click en la opcion Empleos$")
    public void clickEnLaOpcionEmpleos() {
        choucairStep.clickEmpleos();
    }


    @And("^escribo la busqueda \"([^\"]*)\"$")
    public void escriboLaBusqueda(String v) throws Throwable {
        choucairStep.escriboBusqueda(v);
    }

    @And("^escribo la Ubicacion \"([^\"]*)\"$")
    public void escriboLaUbicacion(String v) throws Throwable {
        choucairStep.escriboUbicacion(v);
    }

    @Then("^click en la opcion Busqueda$")
    public void clickEnLaOpcionBusqueda() throws Throwable {
        choucairStep.clickEnBusqueda();
        Thread.sleep(500);
    }


}
