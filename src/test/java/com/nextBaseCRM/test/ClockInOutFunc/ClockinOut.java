package com.nextBaseCRM.test.ClockInOutFunc;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClockinOut {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://login2.nextbasecrm.com/");
        driver.findElement(By.name("USER_LOGIN")).sendKeys("helpdesk3@cybertekschool.com");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser"+ Keys.ENTER);


        driver.findElement(By.id("timeman-container")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("tm-popup-button-handler")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("tm-popup-button-handler")).click();









    }
}
