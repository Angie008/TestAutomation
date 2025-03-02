package main.java.tests;

import main.java.config.DriverManager;
import org.openqa.selenium.WebDriver;
import main.java.pages.LoginPage;
import main.java.pages.OTPVerificationPage;
import main.java.utils.WaitUtils;

public class LoginTest {
    public static void main(String[] args) {
        WebDriver driver = DriverManager.getDriver();
        try {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.login();

            WaitUtils.waitForUrl(driver, "/auth/verify");
            OTPVerificationPage otpPage = new OTPVerificationPage(driver);
            otpPage.enterOTP();

            WaitUtils.waitForUrl(driver, "dashboard");

            System.out.println("Login successful!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            WaitUtils.waitBeforeQuit(driver, 15);
            DriverManager.quitDriver();
        }
    }
}