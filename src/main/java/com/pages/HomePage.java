package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {
    
    public HomePage(WebDriver givenDriver) { // constructor
        super(givenDriver);
    }

    // Locators
    private By clickSearch=By.xpath("//input[@id='s'])[1]");
    private By selectitem =By.xpath("//a[text()=\"Bơm nước xe \"]");
    private By selectitem1 =By.xpath("//select[@id=\"pa_xuat-xu\"]");
    private By selecoption =By.xpath("//option[@value=\"england\"]");
    private By clickbtn=By.xpath("(//button[@type=\"submit\"])[2]");


    // Methods
    public void clickSearch(String keyword) {
        findElement(clickSearch).sendKeys(keyword);
    }

    public void clickItem() {
        findElement(selectitem).click();
    }

    public void clickItem1() {
        findElement(selectitem1).click();
    }
    public void selectOption(){
        findElement(clickbtn).click();
    }

  
}