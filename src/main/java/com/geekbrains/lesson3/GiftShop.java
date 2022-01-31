package com.geekbrains.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GiftShop {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://vpodarkov.ru/test_auth.php");
        //Thread.sleep(5000);
        new WebDriverWait(driver, Duration.ofSeconds(10));
        //driver.findElement(By.xpath("//a[.='Каталог']")).click();
        //driver.findElement(By.xpath("//img[@alt='Живопись']")).click();
        //driver.findElement(By.xpath("//a[@href='/catalog/328/?action=ADD2BASKET&id=3775']")).click();
        new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(By.xpath("//ancestor::div[@class='label']//input[@name='USER_LOGIN']")).sendKeys("QAQ");
        driver.findElement(By.xpath("//ancestor::div[@class='label']//input[@name='USER_PASSWORD']")).sendKeys("Test60test");
        driver.findElement(By.xpath("//ancestor::div[@class='btn']/child::input[@class='btn-send btn-line']")).click();
        driver.findElement(By.xpath("//span[@class='name']")).click();
        //driver.findElement(By.xpath("//ancestor::div[@class='topCart']/child::a[@href='/personal/cart/']"));
        driver.findElement(By.xpath("//span[@class='delete']")).click();
       //В коде страницы есть по 2 значения полей логин и пароль и 2 значения кнопки "Войти".Пришлось немного подумать
        Thread.sleep(10000);
        driver.quit();
    }
}
