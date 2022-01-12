package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class IkeaTitlePage extends BasePage {


    @FindBy(id="f2e60fe1-c4f4-11eb-9eb1-7b097c951065")
    WebElement pageTitle;
    @FindBy(className = "pub__curated-gallery__item")
    WebElement pictureTitle;
    public IkeaTitlePage(WebDriver driver) {
        super(driver);
    }
    public void verifyIsPresent() {
        waitForElementToAppear(By.id("f2e60fe1-c4f4-11eb-9eb1-7b097c951065"));
        Assert.assertTrue(pageTitle.isDisplayed());
        System.out.println("title is displayed");
    }

    public void clickOnPictureTitle(){
        waitForElementToAppear(By.className( "pub__curated-gallery__item"));
        Assert.assertTrue(pageTitle.isDisplayed());
        System.out.println("Picture is displayed");
        pictureTitle.click();

    }
}
