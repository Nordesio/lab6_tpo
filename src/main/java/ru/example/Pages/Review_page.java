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
public class Review_page {
    FirefoxDriver driver;


    public Review_page(FirefoxDriver driver){
        this.driver = driver;
        System.out.printf("Переходим на Wildberries с товаром\n");
        driver.get("https://www.wildberries.ru/catalog/66908136/feedbacks?imtId=5112342&size=116029117");
    }

    @FindBy(xpath = "//button[@class='non-comments__btn btn-base']")
    private WebElement buttonReview;

    public void clickReview(){
        driver.manage().timeouts().implicitlyWait(5000,
                TimeUnit.MILLISECONDS);
        try {
            System.out.printf("Жмем на кнопку оставить отзыв\n");
            buttonReview.click();
        }catch (Exception ex){}
        System.out.printf("Вы не авторизованы\n");
    }

    public void init(FirefoxDriver driver){
        PageFactory.initElements(driver, this);
    }
}
