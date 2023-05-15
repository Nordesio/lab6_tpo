package ru.example;

import org.openqa.selenium.firefox.FirefoxDriver;
import ru.example.Pages.Filter_page;

public class Filter {
    public void negFiltr(){
        FirefoxDriver driver;
        System.setProperty("webdriver.firefox.driver", "D:/geckodriver.exe");
        driver = new FirefoxDriver();
        Filter_page fp = new Filter_page(driver);
        fp.init(driver);
        fp.otr();
        fp.checkExc();


    }
    public void pozFiltr(){
        FirefoxDriver driver;
        System.setProperty("webdriver.firefox.driver", "D:/geckodriver.exe");
        driver = new FirefoxDriver();
        Filter_page fp = new Filter_page(driver);
        fp.init(driver);
        fp.pol();
        fp.checkCard();

    }

}
