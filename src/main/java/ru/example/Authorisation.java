package ru.example;

import org.openqa.selenium.firefox.FirefoxDriver;
import ru.example.test.test_class;

import java.util.Scanner;
import ru.example.Pages.Authorisation_page;
public class Authorisation extends test_class {


    public void authorisation(){
        FirefoxDriver driver;
        System.setProperty("webdriver.firefox.driver", "D:/geckodriver.exe");
        driver = new FirefoxDriver();
        Authorisation_page ap = new Authorisation_page(driver);
        ap.init(driver);
        ap.clickLoginButton();
        ap.setInputString("+79510974294");
        ap.clickRequestButton();
        Scanner in = new Scanner(System.in);
        String code = in.next();
        ap.setCodeString(code);
        ap.WaitPromo();


    }





}
