package com.pawangaria.spring.example.springdemo.config.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("local-run")
public class LocalWebDriver {

    @Bean
    public WebDriver getChromeDriver()
    {
        //Chrome 85 and Driver version : ChromeDriver 85.0.4183.87
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
        return new ChromeDriver();
    }

}
