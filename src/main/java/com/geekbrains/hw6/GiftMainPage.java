package com.geekbrains.hw6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftMainPage extends GiftBasePage {
    public GiftMainPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//ancestor::div[@class='btn']/child::input[@class='btn-send btn-line']")
    private WebElement logButton;
    public GiftLoginPage clickLogButton() throws InterruptedException {
        Thread.sleep(5000);
        logButton.click();
        return new GiftLoginPage(driver);
    }
}
