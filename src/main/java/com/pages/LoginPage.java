package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase {
    
    public LoginPage(WebDriver givenDriver) { // constructor
        super(givenDriver);
    }

    // Locators
    private By usernameFiled=By.xpath("//input[@id='username']");
    private By passwordFiled=By.xpath("//input[@name='password']");
    private By loginbtn=By.xpath("//button[@name='login']");
    private By mgserror=By.xpath("//ul[@class='woocommerce-error']");

    // Methods
    public void enterUsername(String username) {
        findElement(usernameFiled).sendKeys(username);
    }

    public void enterPassword(String password) {
        findElement(passwordFiled).sendKeys(password);
    }

    public void clickLoginButton() {
        findElement(loginbtn).click();
    }

    public String getErrorMessage() {
        return findElement(mgserror).getText();
    }
}