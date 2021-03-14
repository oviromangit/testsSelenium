package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

    @Test
   public void registerTest () {
       System.setProperty("webdriver.chrome.driver" , "C:\\webdrivers\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();

       driver.get("http://testfasttrackit.info/selenium-test/");

       driver.findElement(By.linkText("ACCOUNT")).click();
       driver.findElement(By.linkText("Register")).click();

       driver.findElement(By.id("firstname")).sendKeys("Dumitru");
       driver.findElement(By.id("middlename")).sendKeys("O");
       driver.findElement(By.id("lastname")).sendKeys("Roman");
       driver.findElement(By.name("email")).sendKeys("oviroman77@gmail.com");
       driver.findElement(By.name("password")).sendKeys("Magento1");
       driver.findElement(By.name("confirmation")).sendKeys("Magento1");
       driver.findElement(By.className("checkbox")).click();





       }
}


