package com.demo.guru99.steps;

import com.demo.guru99.pageObjects.PaginaInicioPageObject;
import net.thucydides.core.annotations.Step;

public class PaginaInicioStep {

    PaginaInicioPageObject paginaInicioPageObject = new PaginaInicioPageObject();

    @Step
    public void abrirNavegador (){
        paginaInicioPageObject.open();
    }

    @Step
    public void clicRegistro (){
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getBtnRegistro()).click();
    }

    @Step
    public void escribirUsuario (String usuario){
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getTxtUsuario()).sendKeys(usuario);

    }

    @Step
    public void escribirClave (String clave){
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getTxtClave()).sendKeys(clave);
    }

    @Step
    public void clicIngresar (){
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getBtnIngresar()).click();
    }

}

