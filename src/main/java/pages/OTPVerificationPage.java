package main.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import main.java.utils.WaitUtils;
import java.util.Scanner;

public class OTPVerificationPage {
    private WebDriver driver;

    private By otpField = By.id("verification-code");
    private By continueButton = By.xpath("//button[contains(text(), 'Continue')]");

    public OTPVerificationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterOTP() {
        WebElement otpInput = WaitUtils.waitForElement(driver, otpField);
        System.out.print("Enter the OTP received on your phone: ");
        Scanner scanner = new Scanner(System.in);
        String otpCode = scanner.nextLine();
        otpInput.sendKeys(otpCode);
        driver.findElement(continueButton).click();
    }
}