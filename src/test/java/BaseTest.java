import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    WebDriver driver;
    static String browser = System.getProperty("browser");

    @BeforeAll
    public static void setup(){
        if(browser.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
        }else if(browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
        }
        System.out.println("Test initiated");
    }

    @BeforeEach
    public void beforeMethod(){
        if(browser.equals("firefox")){
            driver = new FirefoxDriver();
        }else if(browser.equals("chrome")){
            driver = new ChromeDriver();
        }
    }

    /*@AfterEach
    public void afterMethod(){
        driver.quit();
    }*/


    /*@AfterAll
    public void tearDown(){
        driver.quit();
        System.out.println("Test finished");
    }*/
}
