package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utils.BasicTest;
import com.utils.Utils;

public class LoginTest extends BasicTest {


    @Test()
    public void loginTest() throws Exception {
        // Launch website
        String url = "https://bantheme.xyz/hathanhauto/tai-khoan/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
        Utils.hardWait();
         //email
        WebElement email=driver.findElement(By.xpath("//input[@id='username']"));
        email.sendKeys("thanhvinh231198@gmail.com");

        //pass
        Utils.hardWait();
        WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
        pass.sendKeys("Vinhkute98@");
        //CLickbtn
        Utils.hardWait(3);
        WebElement click=driver.findElement(By.xpath("//button[@name='login']"));
        click.click();
        WebElement content=driver.findElement(By.xpath("//div[@class='woocommerce-MyAccount-content']"));
        Assert.assertTrue(content.getText().contains("thanhvinh231198"));
    }

}
