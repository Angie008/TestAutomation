package main.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import main.java.utils.WaitUtils;
import main.java.utils.Constants;

public class LoginPage {
    private WebDriver driver;

    private By emailField = By.name("email");
    private By passwordField = By.name("password");
    private By loginButton = By.xpath("//button[@type='submit']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login() {
        driver.get(Constants.LOGIN_URL);
        WaitUtils.waitForElement(driver, emailField).sendKeys(Constants.EMAIL);
        driver.findElement(passwordField).sendKeys(Constants.PASSWORD);
        driver.findElement(loginButton).click();
    }
}