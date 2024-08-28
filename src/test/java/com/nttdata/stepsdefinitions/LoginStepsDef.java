package com.nttdata.stepsdefinitions;

import com.nttdata.steps.InventorySteps;
import com.nttdata.steps.LoginSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;


public class LoginStepsDef {

    private WebDriver driver;


    private InventorySteps inventorySteps(WebDriver driver){
        return new InventorySteps(driver);
    }

    @Dado("estoy en la página de la tienda MyStore")
    public void estoy_en_la_página_de_la_tienda_MyStore() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store");
        screenShot();
    }

    @Y("me logueo con mi usuario: {string} y clave: {string}")
    public void meLogueoConMiUsuarioUsuarioYClaveContrasena(String usuario, String clave) {
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.irLoggin(); //ir a pagina de inicio de sesion
        loginSteps.typeUser(usuario);
        loginSteps.typePassword(clave);
        loginSteps.login(); //clic en inicio de sesion
        screenShot();
    }

    @Cuando("navego a la categoria: {string} y subcategoria: {string}")
    public void navego_a_la_categoria_y_subcategoria() {
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.elegirCategoria();
        loginSteps.elegirSubCategoria();
        screenShot();
    }

    @Y("agrego 2 unidades del primer producto al carrito")
    public void agrego_2_unidades_del_primer_producto_al_carrito(){
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.elegirProducto();
        loginSteps.elegirCantidad();
        screenShot();

    }

    @Entonces("valido en el popup la confirmación del producto agregado")
    public void valido_en_el_popup_la_confirmacion_del_producto_agregado() {

    }

    @Y("valido en el popup que el monto total sea calculado correctamente")
    public void valido_en_el_popup_que_el_monto_total_sea_calculado_correctamente() {

    }

    @Cuando("finalizo la compra")
    public void finalizo_la_compra() {

    }

    //valida autenticacion con la info del usuario
    @Entonces("valido el titulo de la pagina del carrito")
    public void valido_el_titulo_de_la_pagina_del_carrito(String expectedTitle) {
        String title = driver.getTitle(); // Obtener el título de la página
        Assertions.assertEquals(expectedTitle, title);
    }

    @Y("vuelvo a validar el calculo de precios en el carrito")
    public void vuelvo_a_validar_el_calculo_de_precios_en_el_carrito() {

    }


}
