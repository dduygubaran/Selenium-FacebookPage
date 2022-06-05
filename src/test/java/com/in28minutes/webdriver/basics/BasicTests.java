package com.in28minutes.webdriver.basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BasicTests {
    protected WebDriver driver;

    @BeforeTest
    public WebDriver bTest() {
        //Download the web driver executable
        WebDriverManager.chromedriver().setup();

        //Create an instance of your web driver - Chrome
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    @AfterTest
    public void aTest() throws InterruptedException {

        Thread.sleep(2000);
        driver.quit();
        Thread.sleep(2000);
    }
}
