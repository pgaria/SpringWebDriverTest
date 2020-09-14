package com.pawangaria.spring.example.springdemo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringBootWithRefactorTest {

    @Autowired
    private WebDriver driver;

    @Test
    void googleSearchWithRefactor() {
        driver.get("https://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(new String[]{"Springboot and WebDriver Refactor Code"});
        element.submit();
    }

    @AfterEach
    void killDriverAfterTest()
    {
        this.driver.quit();
    }
}
