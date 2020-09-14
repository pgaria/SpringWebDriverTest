package com.pawangaria.spring.example.springdemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootWithWebDriverApplicationTests {

    private WebDriver driver;

    @Test
    void googleSearch() {
        //Chrome 85 and Driver version : ChromeDriver 85.0.4183.87
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(new String[]{"Springboot and WebDriver"});
        element.submit();
    }

    @AfterEach
    void killDriverAfterTest()
    {
        this.driver.quit();
    }

}
