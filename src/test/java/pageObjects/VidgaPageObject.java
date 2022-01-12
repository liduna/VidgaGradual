package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class VidgaPageObject extends BasePage {

    /**THESE ARE INTRODUCTORY ELEMENTS*/

    @FindBy(id = "f2e60fe1-c4f4-11eb-9eb1-7b097c951065")
    WebElement pageIkeaTitle;

    @FindBy(className = "pub__curated-gallery__item")
    WebElement pictureTitle;

    @FindBy(className = "page-title")
    WebElement pageTitle;

    @FindBy(id = "application-iframe")
    WebElement testFrame;

    @FindBy(id = "vidga-application")
    WebElement prodFrame;

    @FindBy (xpath ="//*[@id='root']/div/div[1]/img")
    WebElement introPicutre;

    @FindBy(css = "#root > div > div.WhatsIncluded_wrapper__2Y0in > h3")
    WebElement summary;
    /*******************************/



    /**THESE ARE CLICKABLE ELEMENTS - how to implement swiper??*/

    @FindBy(id = "add_layer_button")
    WebElement addingLayer;

    @FindBy(id = "Layer_removeButtonSingleOption__CITWh")
    WebElement removingLayer;


    @FindBy(id = "next_button_layer_options")//(id = "next_button_layer_options")#next_button_layer_options //*[@id="next_button_layer_options"]
    WebElement nextButtonLayer;

    @FindAll({
            @FindBy(className = "inputContainer"),
            @FindBy(className = "WidthInput_WidthInput__31nio")
    })
    WebElement inputField;

    @FindBy(id = "next_button_measurements")
    WebElement nextButtonMeasure;

    @FindBy(id = "true")
    WebElement adding15cm;

    @FindBy(id = "false")
    WebElement notAdding15CM;

    @FindBy(id = "next_button_addional_measurements")
    //(id = "next_button_addional_measurements")
    WebElement nextButtonAdditional;

    @FindBy(id = "ceiling")
    WebElement ceilingPicker;

    @FindBy(id = "wall")
    WebElement wallPicker;

    @FindBy(id = "single")
    WebElement singleRailswall;

    @FindBy(id = "wall_6cm")
    WebElement fitting6cm;

    @FindBy(id = "wall_12cm")
    WebElement fitting12cm;

    @FindBy(id = "single_single")
    WebElement singleRailsTwoSpar;

    @FindBy(id = "triple_single")
    WebElement threeRails;

    @FindBy(id = "white")
    WebElement colourPicker;

    /*********************/

    /**INTRODUCTORY METHODS*/

    public VidgaPageObject(WebDriver driver) {
        super(driver);
    }

    public void verifyPageIsLoaded() {
        waitForElementToAppear(By.className("page-title"));
        Assert.assertTrue(pageTitle.isDisplayed());
        System.out.println("title is displayed");
    }

    public void verifySwitchFrame() {
        waitForElementToAppear(By.id("application-iframe"));
        switchToFrame(testFrame);
        waitForElementToAppear(By.xpath("//*[@id='root']/div/div[1]/img"));
        Assert.assertTrue(introPicutre.isDisplayed());
        if ((introPicutre.isDisplayed())){System.out.println("picture");}


    }

    public void verifyIsPresent() {
        waitForElementToAppear(By.id("next_button_layer_options"));
        Assert.assertTrue(nextButtonLayer.isDisplayed());
        System.out.println("next is displayed");
    }

    /**INTERCEPTING ELEMENTS METHODS*/

    public void addLayer() {
        addingLayer.click();
        waitForElementToAppear(By.id("next_button_layer_options"));
        useJavaScriptExecutor(nextButtonMeasure);

    }

    public void confirmMeasurementsNoInput(){
        waitForElementToAppear(By.id("next_button_measurements"));
        if (nextButtonMeasure.isDisplayed()){System.out.println("next Measurements");}


    }

    public void add15CM(){

        useJavaScriptExecutor(adding15cm);
        Assert.assertTrue(adding15cm.isSelected());
        System.out.println("adding 15 cm");
        nextButtonAdditional.click();

    }

    public void chooseCeiling(){
        ceilingPicker.click();

    }

    public void verifySummaryPresent(){
        //waitForElementToAppear(By.cssSelector("#root > div > div.WhatsIncluded_wrapper__2Y0in > h3"));
        Assert.assertTrue(summary.isDisplayed());
        System.out.println("Summary of the products is displayed");
    }


}
