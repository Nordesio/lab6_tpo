package ru.example.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class Filter_page {
    FirefoxDriver driver;

    String minPrice = "0";
    String maxPrice = "0";


    public Filter_page(FirefoxDriver driver){
        this.driver = driver;
        System.out.printf("Переходим на страницу с фильтром\n");

    }

    @FindBy(xpath = "//b[@class='not-found-result__title']")
    private WebElement exception;
    @FindBy(xpath = "//a[@class='product-card__link j-card-link j-open-full-product-card']")
    private WebElement card;

    public void otr(){
        minPrice = "0";
        maxPrice = "150";
        driver.get("https://www.wildberries.ru/catalog/obuv/muzhskaya/kedy-i-krossovki?sort=pricedown&page=1&priceU=" + minPrice + "%3B" + maxPrice);

    }

    public void pol(){
        minPrice = "20000";
        maxPrice = "100000";
        driver.get("https://www.wildberries.ru/catalog/obuv/muzhskaya/kedy-i-krossovki?sort=pricedown&page=1&priceU=" + minPrice + "%3B" + maxPrice);

    }

    public void checkExc(){
        driver.manage().timeouts().implicitlyWait(5000,
                TimeUnit.MILLISECONDS);
        System.out.printf("Фильтруем\n");
        if(exception.isDisplayed() == true){
            System.out.printf("Не нашлось подходящих товаров");

        }else{
            System.out.printf("Товары нашлись");
        }
    }

    public void checkCard(){
        driver.manage().timeouts().implicitlyWait(5000,
                TimeUnit.MILLISECONDS);
        if(exception.isDisplayed() == false){
            System.out.printf("Товары нашлись");

        }else{
            System.out.printf("Товаров нет");
        }
    }
    public void init(FirefoxDriver driver){
        PageFactory.initElements(driver, this);
    }
}
