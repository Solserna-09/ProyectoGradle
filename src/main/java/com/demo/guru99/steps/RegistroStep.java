package com.demo.guru99.steps;

import com.demo.guru99.pageObjects.RegistroPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class RegistroStep {

    RegistroPageObject registroPageObject = new RegistroPageObject();

    @Step
    public void escribirNombre(String nombre) {
        registroPageObject.getDriver().findElement(registroPageObject.getTxtNombre()).sendKeys(nombre);
    }

    @Step
    public void escribirApellido(String apellido) {
        registroPageObject.getDriver().findElement(registroPageObject.getTxtApellido()).sendKeys(apellido);
    }

    @Step
    public void escribirTelefono(String telefono) {
        registroPageObject.getDriver().findElement(registroPageObject.getTxtTelefono()).sendKeys(telefono);

    }

    @Step
    public void escribirCorreo(String correo) {
        registroPageObject.getDriver().findElement(registroPageObject.getTxtCorreo()).sendKeys(correo);
    }

    @Step
    public void escribirDireccion(String direccion) {
        registroPageObject.getDriver().findElement(registroPageObject.getTxtDireccion()).sendKeys(direccion);

    }

    @Step
    public void escribirCiudad(String ciudad) {
        registroPageObject.getDriver().findElement(registroPageObject.getTxtCiudad()).sendKeys(ciudad);

    }

    @Step
    public void escribirEstado(String estado) {
        registroPageObject.getDriver().findElement(registroPageObject.getTxtEstado()).sendKeys(estado);

    }

    @Step
    public void escribirCodigoPostal(String codigoPostal) {
        registroPageObject.getDriver().findElement(registroPageObject.getTxtCodigoPostal()).sendKeys(codigoPostal);

    }

    @Step
    public void seleccionarPais() {
        registroPageObject.getDriver().findElement(registroPageObject.getLstPais()).click();

    }

    @Step
    public void escribirUsuario(String usuario) {
        registroPageObject.getDriver().findElement(registroPageObject.getTxtUsuario()).sendKeys(usuario);

    }

    @Step
    public void escribirClave(String clave) {
        registroPageObject.getDriver().findElement(registroPageObject.getTxtClave()).sendKeys(clave);

    }

    @Step
    public void escribirConfirmacionClave(String confirmacionclave) {
        registroPageObject.getDriver().findElement(registroPageObject.getTxtConfirmarClave()).sendKeys(confirmacionclave);

    }

    @Step
    public void clicEnviar() {
        registroPageObject.getDriver().findElement(registroPageObject.getBtnEnviar()).click();
    }

    @Step
    public void validarMensaje (){
        Assert.assertThat(registroPageObject.getDriver().findElement(registroPageObject.getMsjValidacion())
                .isDisplayed(), Matchers.is(true));
    }
}
