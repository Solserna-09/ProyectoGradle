package com.demo.guru99.stepDefinitions;


import com.demo.guru99.models.DatosRegistro;
import com.demo.guru99.steps.PaginaInicioStep;
import com.demo.guru99.steps.RegistroStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.util.List;


public class RegistroStepDefinition {

    @Steps
    PaginaInicioStep paginaInicioStep;
    @Steps
    RegistroStep registroStep;


    @Dado("^que el usuario se encuentre en la pagina web$")
    public void queElUsuarioSeEncuentreEnLaPaginaWeb() {
        paginaInicioStep.abrirNavegador();


    }

    @Cuando("^el complete la informacion de registro$")
    public void elCompleteLaInformacionDeRegistro(List<DatosRegistro>datosRegistroList) {
        paginaInicioStep.clicRegistro();
        paginaInicioStep.clicRegistro();
        paginaInicioStep.clicRegistro();
        registroStep.escribirNombre(datosRegistroList.get(0).getNombre());
        registroStep.escribirApellido(datosRegistroList.get(0).getApellido());
        registroStep.escribirTelefono(datosRegistroList.get(0).getTelefono());
        registroStep.escribirCorreo(datosRegistroList.get(0).getCorreo());
        registroStep.escribirDireccion(datosRegistroList.get(0).getDireccion());
        registroStep.escribirCiudad(datosRegistroList.get(0).getCiudad());
        registroStep.escribirEstado(datosRegistroList.get(0).getEstado());
        registroStep.escribirCodigoPostal(datosRegistroList.get(0).getCodigoPostal());
        registroStep.seleccionarPais();
        registroStep.escribirUsuario(datosRegistroList.get(0).getUsuario());
        registroStep.escribirClave(datosRegistroList.get(0).getClave());
        registroStep.escribirConfirmacionClave(datosRegistroList.get(0).getConfirmacionClave());
        registroStep.clicEnviar();

    }

    @Entonces("^el visualizara un mensaje de registro de exitoso$")
    public void elVisualizaraUnMensajeDeRegistroDeExitoso() {
        registroStep.validarMensaje();

    }
}
