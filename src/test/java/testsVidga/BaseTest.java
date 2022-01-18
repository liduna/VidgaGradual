
/*
package testsVidga;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTest {


    //public static final long TIMEOUT = 15;
    private WebDriver driver;


    @BeforeSuite
    public void beforeSuite() {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        String headless = System.getProperty("headless");

        ChromeDriverManager.chromedriver();
        if ("true".equals(headless)) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            driver = new ChromeDriver(chromeOptions);
        } else {
            driver = new ChromeDriver();
        }
        this.driver.manage().window().maximize();
    }


/*
       @AfterSuite
        public void afterSuite() {
            if (null != driver) {
                driver.close();
                driver.quit();
            }
        }

    public WebDriver getDriver() {
        return driver;
    }

/*
    public void getAddress(String address) {
        this.driver.get(address);
    }

   */







