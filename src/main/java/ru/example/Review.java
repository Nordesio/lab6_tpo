package ru.example;

import org.openqa.selenium.firefox.FirefoxDriver;
import ru.example.Pages.Review_page;

public class Review {
    public void CantReview() {
        FirefoxDriver driver;
        System.setProperty("webdriver.firefox.driver", "D:/geckodriver.exe");
        driver = new FirefoxDriver();
        Review_page rp = new Review_page(driver);
        rp.init(driver);
        rp.clickReview();

    }
}
