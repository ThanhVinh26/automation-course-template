package com;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.utils.BasicTest;

public class LoginTest extends BasicTest {


    @Test()
    public void loginTest() throws Exception {
        // Launch website
        String url = "https://www.youtube.com/watch?v=0Acc0OfVyIc";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }

}
