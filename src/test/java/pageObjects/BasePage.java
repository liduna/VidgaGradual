package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testsVidga.BaseTest;

public class BasePage {

    private static final int TIMEOUT = 10;

    protected WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;

        wait = new WebDriverWait(driver,TIMEOUT);
        PageFactory.initElements(driver, this);
    }

  /*  public void getAddress(String address){
        this.driver.get(address);
    }
    public void managePage(){
        this.driver.manage().window().maximize();
    }
*/
  public void switchToFrame(WebElement element){
      this.driver.switchTo().frame(element);
  }

    public void useJavaScriptExecutor(WebElement element){
        JavascriptExecutor jse = (JavascriptExecutor) this.driver;
        jse.executeScript("arguments[0].click()", element);
    }

    protected void waitForElementToAppear(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void waitForElementToBeClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }



}
