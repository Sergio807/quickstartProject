package com.geekbrains.hw6;

import com.geekbrains.lesson6.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Instant;

public class GiftLoginPage extends GiftBasePage {

    public GiftLoginPage(WebDriver driver) {
        super(driver);
    }
    private final static String LOG_IN_LOC_BY_XPATH = "//ancestor::div[@class='label']//input[@name='USER_LOGIN']";
    @FindBy(xpath = LOG_IN_LOC_BY_XPATH)
    private WebElement logIn;
    @FindBy(xpath = "//ancestor::div[@class='label']//input[@name='USER_PASSWORD']")
    private WebElement pasIN;
    @FindBy(xpath = "//ancestor::div[@class='btn']/child::input[@class='btn-send btn-line']")
    private WebElement logButton;

    public GiftLoginPage fillLog(String login){
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOG_IN_LOC_BY_XPATH)));
        logIn.sendKeys(login);
        return this;
    }
    public GiftLoginPage fillPas(String password) throws InterruptedException {
        pasIN.sendKeys(password);
        Thread.sleep(5000);
        return this;
    }
    public GiftMainPage clickLogButton(){
        logButton.click();
        return new GiftMainPage(driver);
    }

}
