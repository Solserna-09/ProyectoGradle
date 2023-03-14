package com.demo.guru99.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegistroPageObject extends PageObject {

    By txtNombre = By.name("firstName");
    By txtApellido = By.name("lastName");
    By txtTelefono = By.name("phone");
    By txtCorreo = By.id("userName");
    By txtDireccion = By.name("address1");
    By txtCiudad = By.name("city");
    By txtEstado = By.name("state");
    By txtCodigoPostal = By.name("postalCode");
    By lstPais = By.xpath("//select/option[@value='ALGERIA']");
    By txtUsuario = By.id("email");
    By txtClave = By.name("password");
    By txtConfirmarClave = By.name("confirmPassword");
    By btnEnviar = By.name("submit");
    By msjValidacion = By.xpath("//b[contains(text(),'Note: Your user name is')]");

    public By getTxtNombre() {
        return txtNombre;
    }

    public By getTxtApellido() {
        return txtApellido;
    }

    public By getTxtTelefono() {
        return txtTelefono;
    }

    public By getTxtCorreo() {
        return txtCorreo;
    }

    public By getTxtDireccion() {
        return txtDireccion;
    }

    public By getTxtCiudad() {
        return txtCiudad;
    }

    public By getTxtEstado() {
        return txtEstado;
    }

    public By getTxtCodigoPostal() {
        return txtCodigoPostal;
    }

    public By getLstPais() {
        return lstPais;
    }

    public By getTxtUsuario() {
        return txtUsuario;
    }

    public By getTxtClave() {
        return txtClave;
    }

    public By getTxtConfirmarClave() {
        return txtConfirmarClave;
    }

    public By getBtnEnviar() {
        return btnEnviar;
    }

    public By getMsjValidacion() {
        return msjValidacion;
    }
}

