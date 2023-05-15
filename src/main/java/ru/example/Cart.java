package ru.example;

import org.openqa.selenium.firefox.FirefoxDriver;
import ru.example.Pages.Cart_page;

public class Cart {

    public void AddToCart(){
        FirefoxDriver driver;
        System.setProperty("webdriver.firefox.driver", "D:/geckodriver.exe");
        driver = new FirefoxDriver();
        Cart_page cp = new Cart_page(driver);
        cp.init(driver);
        cp.clickAddButton();
        cp.clickCartButton();
        cp.waitCard();
    }

}
