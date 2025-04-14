package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends PageBase {
    
    public RegisterPage(WebDriver givenDriver) { // constructor
        super(givenDriver);
    }

    // Locators
    private By usernameRegister=By.xpath("//input[@id='reg_email']");
    private By passwordRegister=By.xpath("//input[@name='reg_password']");
    private By registerbtn=By.xpath("//button[@class='woocommerce-Button woocommerce-button button woocommerce-form-register__submit']");
    private By mgserrorregister=By.xpath("//ul[@class='woocommerce-error']//li");

    // Methods
    public void enterUsername(String username) {
        findElement(usernameRegister).sendKeys(username);
    }

    public void enterPassword(String password) {
        findElement(passwordRegister).sendKeys(password);
    }

    public void clickLoginButton() {
        findElement(registerbtn).click();
    }

    public String getErrorMessage() {
        return findElement(mgserrorregister).getText();
    }
}