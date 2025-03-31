package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utils.BasicTest;
import com.utils.Utils;

public class Bai16_RegisterTest extends BasicTest {
    @Test()
    public void  registerTest() throws Exception {
        // Launch website
        String url = "https://bantheme.xyz/hathanhauto/tai-khoan/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
        Utils.hardWait();
         //email
        WebElement email=driver.findElement(By.xpath("//input[@id='reg_email']"));
        email.sendKeys("testtest@gmail.com");
        //CLickbtn
        Utils.hardWait(3);
        WebElement click=driver.findElement(By.xpath("//button[@class='woocommerce-Button woocommerce-button button woocommerce-form-register__submit']"));
        click.click();
        WebElement content=driver.findElement(By.xpath("//div[@class='woocommerce-notices-wrapper']"));
        Assert.assertEquals(content.getText(), "Lỗi: An account is already registered with your email address. Please log in.");
    }
    
}
