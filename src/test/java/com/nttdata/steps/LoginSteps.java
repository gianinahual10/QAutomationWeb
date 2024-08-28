package com.nttdata.steps;

import com.nttdata.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginSteps {

    private WebDriver driver;

    //constructor
    public LoginSteps(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Escribir el usuario
     * @param usuario el usuario
     */
    public void typeUser(String usuario){
        WebElement userInputElement = driver.findElement(LoginPage.emailInput);
        userInputElement.sendKeys(usuario);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.loginButton));


    }

    /**
     * Escribir el password
     * @param password el password del usuario
     */
    public void typePassword(String password){
        this.driver.findElement(LoginPage.passInput).sendKeys(password);
    }

    /**
     * Hacer click en el botón login
     */

    public void irLoggin() {
        this.driver.findElement(LoginPage.iconoButton).click();
    }

    public void login(){
        this.driver.findElement(LoginPage.loginButton).click();
    }

    public void elegirCategoria() {
        this.driver.findElement(LoginPage.iconoCategoria).click();
    }

    public void elegirSubCategoria() {
        this.driver.findElement(LoginPage.iconoSubCategoria).click();
    }

    public void elegirProducto() {
        this.driver.findElement(LoginPage.iconoProducto).click();
    }

    public void elegirCantidad() {
        this.driver.findElement(LoginPage.iconoAgregarProducto).click();
    }
}
