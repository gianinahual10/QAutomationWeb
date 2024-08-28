package com.nttdata.page;

import org.openqa.selenium.By;

public class LoginPage {

    //Localizadores de elementos

    public static By iconoButton = By.id("_desktop_cart");
    public static By emailInput = By.id("field-email");
    public static By passInput = By.id("field-password");
    public static By loginButton = By.id("submit-login");

    public static By iconoCategoria = By.id("category-3");
    public static By iconoSubCategoria = By.id("wrapper");

    public static By iconoProducto = By.id("js-product-list");
    public static By iconoAgregarProducto = By.id("add-to-cart-or-refresh");

    //titulo - nombre de usuario autenticado
    public static By expectedTitle = By.id("_desktop_user_info");

}
