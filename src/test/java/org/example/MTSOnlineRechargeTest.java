package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MTSOnlineRechargeTest {

    WebDriver driver;

    @Test
    public void testBlockTitle() {
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");

        WebElement blockTitle = driver.findElement(By.xpath("//h2[contains(text(),'Онлайн-пополнение без комиссии')]"));
        assertEquals("Онлайн-пополнение без комиссии", blockTitle.getText());

        driver.quit();
    }

    @Test
    public void testPaymentSystemLogos() {
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");

        WebElement paymentSystemLogos = driver.findElement(By.className("payment-systems"));
        assertTrue(paymentSystemLogos.isDisplayed());

        driver.quit();
    }

    @Test
    public void testServiceDetailsLink() {
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");

        WebElement serviceDetailsLink = driver.findElement(By.linkText("Подробнее о сервисе"));
        serviceDetailsLink.click();

        assertEquals("https://www.mts.by/online/popolnenie", driver.getCurrentUrl());

        driver.quit();
    }

    @Test
    public void testRechargeService() {
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");

        WebElement serviceDropdown = driver.findElement(By.id("service"));
        serviceDropdown.sendKeys("Услуги связи");

        WebElement phoneNumberInput = driver.findElement(By.id("phone-number"));
        phoneNumberInput.sendKeys("297777777");

        WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(),'Продолжить')]"));
        continueButton.click();

        // Add assertions for further testing of the recharge process

        driver.quit();
    }
}
