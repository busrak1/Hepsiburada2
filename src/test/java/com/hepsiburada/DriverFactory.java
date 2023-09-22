package com.hepsiburada;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverFactory {
    public static WebDriver driver;
    public static WebDriverWait webDriverWait;
    @BeforeEach
    public void DriverFactory() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.get("https://www.hepsiburada.com");
        driver.manage().window().maximize();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }
    @AfterEach
    void killDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}


