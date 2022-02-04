package com.geekbrains.lesson5;

import com.geekbrains.hw6.GiftMainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.element.Element;
import java.time.Duration;

public class GiftShopTest {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;
    private final static String GIFTSHOP_URL = "https://vpodarkov.ru/";

    //Регистрируем драйвер
    @BeforeAll
    static void registerDriver(){
        WebDriverManager.chromedriver().setup();
    }
    //Инициализируем драйвер под те действия/команды, которые будем с ним выполнять
    @BeforeEach
    void initDriver(){
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        actions = new Actions(driver);
        driver.get(GIFTSHOP_URL);
        driver.manage().window().maximize();
    }
    @Test
    void chancePuchLogButton() throws InterruptedException {
        new GiftMainPage(driver)
                .clickLogButton()
                .fillLog("QAQ")
                .fillPas("Test60test")
                .clickLogButton();
    }
    //void giftCookieTest() throws InterruptedException {
        //Cookie cookie = new Cookie("PHPSESSID", "18ec14c55db3073db138499c33c1c209");
        //driver.manage().addCookie(cookie);
        //driver.navigate().refresh();
        //WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(8));
        //Thread.sleep(10000);}

    //Очень трудно что-либо делать не понимая где, как и какой метод можно использовать
    //Хотел проверить возможность удаления элемента с помощью теста, но не знаю какой метод assertion использовать
    //@Test
    //void giftClearCart(){
        //driver.findElement(By.xpath("//span[@class='delete']")).click();
    //}

    //@Test
    //void giftBannerTest(){
        //driver.findElement(By.xpath("//a[@title='ООО «Время подарков» - интернет магазин эксклюзивных сувениров и подарков.']")).click();
        //Assertions.assertTrue(driver.findElement(By.xpath("//a[@title='ООО «Время подарков» - интернет магазин эксклюзивных сувениров и подарков.']")).isDisplayed());
        //new WebDriverWait(driver, Duration.ofSeconds(8));}




    @AfterEach
    void tearDown(){
        driver.quit();
    }
}
