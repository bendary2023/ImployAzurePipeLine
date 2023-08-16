package DriverConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeConfig extends Config{

    public WebDriver getInstance(){
        if(driver==null){
            ChromeOptions options=new ChromeOptions();
            options.addArguments("--disable-notifications");
            driver=new ChromeDriver(options);
        }
        return driver;
    };


}
