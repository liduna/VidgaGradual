package pageObjects.SWE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pageObjects.BasePage;

public class IkeaTitlePageObject extends BasePage {

    private String PAGE_TITLE_SWE = "https://www.ikea.com/se/sv/";


    @FindBy(id="f2e60fe1-c4f4-11eb-9eb1-7b097c951065")
    WebElement pageTitle;
    @FindBy(className = "pub__curated-gallery__item")
    WebElement pictureTitle;


    public IkeaTitlePageObject(WebDriver driver) {
        super(driver);
    }

    public String getAddres() {
        return PAGE_TITLE_SWE;
    }


    public void verifyIsPresent() {
        waitForElementToAppear(By.className("hnf-header__logo"));
        Assert.assertTrue(pageTitle.isDisplayed());
        System.out.println("title is displayed");
    }

    public void clickOnPictureTitle(){
        waitForElementToAppear(By.className( "pub__curated-gallery__item"));

    }
    public void verifyItemPageOpened(){
        Assert.assertTrue(pageTitle.isDisplayed());
        System.out.println("Picture is displayed");
        pictureTitle.click();
    }
}
