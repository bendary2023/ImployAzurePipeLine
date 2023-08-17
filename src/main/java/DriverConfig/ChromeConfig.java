package DriverConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeConfig extends Config{

    public WebDriver getInstance(){
        if(driver==null){
            ChromeOptions options=new ChromeOptions();
            options.addArguments("--disable-notifications");
            options.addArguments("--headless");
            //options.addArguments("--disable-gpu");
            options.addArguments("--window-size=1280,800");
            //options.addArguments("--allow-insecure-localhost");
            driver=new ChromeDriver(options);
        }
        return driver;
    };


}
