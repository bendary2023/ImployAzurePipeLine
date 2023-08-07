import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.function.Supplier;

public class ChromeConfig extends Config{

    public WebDriver getInstance(){
        if(driver==null){
            driver=new ChromeDriver();
        }
        return driver;
    };


}
