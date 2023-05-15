package ru.example.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;
public class Cart_page {
    FirefoxDriver driver;


    public Cart_page(FirefoxDriver driver){
        this.driver = driver;
        driver.get("https://www.wildberries.ru/catalog/11991237/detail.aspx");
        System.out.printf("Переходим на страницу Wildberries с товаром\n");

    }


    @FindBy(xpath = "//div[@class='navbar-pc__item j-item-basket']")
    private WebElement cart;
    @FindBy(xpath = "//div[@class='basket-section__basket-list basket-list']")
    private WebElement basket;
    @FindBy(xpath = "//div[@class='product-page']//div[@class='product-page__grid']//div[@class='product-page__order']//div[@class='product-page__order-container']//div[@class='order']")
    private WebElement add;

    public void clickAddButton(){
        driver.manage().timeouts().implicitlyWait(5000,
                TimeUnit.MILLISECONDS);
        System.out.printf("Кликаем на кнопку добавить в корзину\n");
        add.click();

    }

    public void clickCartButton(){

        System.out.printf("Кликаем на кнопку перехода в корзину\n");
        cart.click();
    }
    public void waitCard(){
        if(basket.isEnabled()){
            System.out.printf("Вы в корзине, продолжите покупку\n");
        }else{
            System.out.printf("Корзина пуста\n");
        }
    }
    public void init(FirefoxDriver driver){
        PageFactory.initElements(driver, this);
    }
}
