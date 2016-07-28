package com.eviltester.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Arrays;

/**
 * Created by tronkain on 9.7.2014.
 */
public class MyFirstTest {
    @Test
    public void startWebDriver() {
        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http://seleniumsimplified.com");
        Assert.assertTrue("title should start with Selenium Simplified",
        driver.getTitle().startsWith("Selenium Simplified"));
        driver.close();
        driver.quit();
    }
    @Test
    	public void testSort() {
        	  String[] arr = {"PLMN-PLMN/RNC-4/WBTS-11816/WCEL-1", "PLMN-PLMN/RNC-4/WBTS-11665/WCEL-3", "PLMN-PLMN/RNC-4/WBTS-27/WCEL-2"};
        	  String[] expected = {"a", "b", "c"};
        Arrays.sort(arr); // or whatever your sort method call it like
        	  System.out.println(Arrays.toString(arr));
        	}


}
