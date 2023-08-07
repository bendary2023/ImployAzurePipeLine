import org.openqa.selenium.WebDriver;

import java.util.function.Supplier;

public abstract class Config {
    protected static WebDriver driver;
    public abstract WebDriver getInstance();

    public static Supplier<WebDriver> getDriver=()->driver;
}
