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

public class Authorisation_page {
    FirefoxDriver driver;
    WebDriverWait wait;


    public Authorisation_page(FirefoxDriver driver){
        this.driver = driver;
        driver.get("http://wildberries.ru");
        System.out.printf("Переходим на страницу Wildberries\n");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(xpath = "//div[@class='main-page__blocks-wrap']")
    private WebElement promo;
    @FindBy(xpath = "//a[@data-wba-header-name='Login']")
    private WebElement buttonLogin;
    @FindBy(xpath = "//input[@class='input-item']")
    private WebElement input;
    @FindBy(xpath = "//button[@id='requestCode']")
    private WebElement buttonRequest;
    @FindBy(xpath = "//input[@class='input-item j-b-charinput']")
    private WebElement inputCode;
    public void clickLoginButton(){
        driver.manage().timeouts().implicitlyWait(5000,
                TimeUnit.MILLISECONDS);
        System.out.printf("Кликаем по кнопке войти\n");
        buttonLogin.click();

    }
    public void setInputString(String text){
        driver.manage().timeouts().pageLoadTimeout(10000,
                TimeUnit.MILLISECONDS);
        System.out.printf("Вводим номер телефона\n");
        input.clear();
        input.sendKeys(text);
        System.out.printf("Введите код, который вы получили в приложении: ");
    }
    public void clickRequestButton(){
        driver.manage().timeouts().pageLoadTimeout(5000,
                TimeUnit.MILLISECONDS);

        buttonRequest.click();
    }
    public void setCodeString(String text){
        driver.manage().timeouts().implicitlyWait(5000,
                TimeUnit.MILLISECONDS);
        System.out.printf("Вводим код\n");
        inputCode.sendKeys(text);
    }
    public void WaitPromo(){
        driver.manage().timeouts().implicitlyWait(5000,
                TimeUnit.MILLISECONDS);
        if(promo.isEnabled()){
            System.out.printf("Вы вошли");
        }else{
            System.out.printf("Вы не вошли");
        }
    }
    public void init(FirefoxDriver driver){
        PageFactory.initElements(driver, this);
    }
}
