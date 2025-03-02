package main.java.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class WaitUtils {
    private static final int TIMEOUT = 20;

    public static WebElement waitForElement(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForUrl(WebDriver driver, String partialUrl) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        wait.until(ExpectedConditions.urlContains(partialUrl));
    }

    public static void waitBeforeQuit(WebDriver driver, int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Wait interrupted before quitting.");
        }
    }
}