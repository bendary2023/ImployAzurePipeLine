import DriverConfig.ChromeConfig;
import Login.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPipeline {

    WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        ChromeConfig chrome=new ChromeConfig();
        driver=chrome.getInstance();
        driver.manage().window().maximize();
        Assert.assertTrue(driver!=null);
    }

    @Test
    public void navigate(){
        Login l=new Login();
        l.login.run();
        String userName=driver.findElement(By.cssSelector("a[href='/Profile/CompletedProfile']")).getText();
        //Assert.assertEquals(userName, "Salah Hadi");
        Assert.assertTrue(false);
    }
}
