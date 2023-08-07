import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Consumer;

public class WaitGeneral {
    static WebDriver driver;
    public WaitGeneral(){
        driver=Config.getDriver.get();
    }
    public static Consumer<By> waitClickable=(selector)->{
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(selector));
    };

    public static Consumer<By> waitVisability=(selector)->{
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
    };
}
