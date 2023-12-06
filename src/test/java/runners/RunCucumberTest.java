package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {},
        features = "src/test/resources/features",
        tags = {"~@ignore"},
        glue = {"steps"}
)
public class RunCucumberTest {

    public static WebDriver driver;

    @BeforeClass
    public static void start(){
    //OBS: Você só pode escolher 1 driver, será necessário comentar o outro para que o sistema funcione
    //Descomente para usar o firefox
        driver =new FirefoxDriver();
    //Descomente para usar o Chrome
        // driver = new ChromeDriver();
        //driver.manage().window().maximize();
    }

    @AfterClass
    public static void stop(){
        driver.quit();
    }
}
