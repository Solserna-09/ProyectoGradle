package com.demo.guru99.stepDefinitions;

import com.demo.guru99.models.DatosLogin;
import com.demo.guru99.steps.PaginaInicioStep;
import com.demo.guru99.steps.RegistroStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class LoginStepDefinition {
    @Steps
    PaginaInicioStep paginaInicioStep;



    @Cuando("^el ingrese usuario con la clave$")
    public void elIngreseUsuarioConLaClave(List<DatosLogin>loginList) {
        paginaInicioStep.escribirUsuario(loginList.get(0).getUsuario());
        paginaInicioStep.escribirClave(loginList.get(0).getClave());
        paginaInicioStep.clicIngresar();



    }

    @Entonces("^el visualizara un mensaje de logueo$")
    public void elVisualizaraUnMensajeDeLogueo() {

    }

    @Cuando("^el ingrese el usuario con la clave incorrectos$")
    public void elIngreseElUsuarioConLaClaveIncorrectos(List<DatosLogin>loginList) {
        paginaInicioStep.escribirUsuario(loginList.get(0).getUsuario());
        paginaInicioStep.escribirClave(loginList.get(0).getClave());
        paginaInicioStep.clicIngresar();


    }


    @Entonces("^el visualizara un mensaje de error$")
    public void elVisualizaraUnMensajeDeError() {

    }

}
