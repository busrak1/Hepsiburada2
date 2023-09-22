package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Functions extends DriverFactory {

    public static void waitUntilPresenceOfElementLocatedBy(By by) {
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static void waitUntilVisibilityOfElementLocatedBy(By by) {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void waitUntilClickableOfElementLocatedBy(By by) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void click(By by) {
        findElement(by).click();
    }

    public void sendKeys(By by, String text) {
        findElement(by).sendKeys(text);

    }

    public WebElement findElement(By by) {
        waitUntilPresenceOfElementLocatedBy(by);
        waitUntilVisibilityOfElementLocatedBy(by);
        return driver.findElement(by);
    }
}


