package Login;

import DriverConfig.Config;
import DriverConfig.WaitGeneral;
import Property.ProperityFiles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Login {
    WebDriver driver;
    ProperityFiles prop;
    Properties propFile;
    WaitGeneral waitGen;

    public Login(){
        driver= Config.getDriver.get();
        prop=new ProperityFiles();
        propFile=prop.getProperities.apply("src/main/resources/Data.properities");
        waitGen=new WaitGeneral();

    }

    private Consumer<String> navigate=(url)->{
        driver.navigate().to(url);
    };

    private BiConsumer<String, String> setUserAndPass=(user, pass)->{
        WaitGeneral.waitVisability.accept(By.id("btnContinue"));
        WaitGeneral.waitClickable.accept(By.id("btnContinue"));
        WaitGeneral.waitTillHide.accept(By.cssSelector("div[class=\"preloader opacity-0\"]"));

        driver.findElement(By.id("btnContinue")).click();

        driver.findElement(By.id("Email")).sendKeys(user);
        driver.findElement(By.id("Password")).sendKeys(pass);

        driver.findElement(By.id("btnSubmit")).click();
    };

    public Runnable login=()->{
      navigate.accept(propFile.getProperty("url"));
      setUserAndPass.accept(propFile.getProperty("user"), propFile.getProperty("password"));
    };
}
