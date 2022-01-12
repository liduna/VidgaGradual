/**
package testsVidga;

// import common.PageObject;

import common.Utilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class StepDefinitions {






    @Given("I use {string} as a browser")
    public void i_use_as_a_browser(String browser) {
        utils = new Utilities();
        driver = utils.getBrowser(browser);

    }

    @When("I navigate to a {string}")
    public void iNavigateToA(String url) throws InterruptedException {

        driver.get(url);
        driver.manage().window().maximize();

        waitUntil(driver, By.className("page-title"));

        WebElement pageTitle = driver.findElement(By.className("page-title"));
        if ((pageTitle.isDisplayed())){System.out.println("page title");}















       /* vidga = new VidgaPageObject(driver);
        vidga.waitUntil(driver, By.className("page-title"));

        vidga.switchToFrame("test");



        System.out.println("pageTitle");


        System.out.println("go fuck yourself");


    }

    @When("I confirm one layer curtains by click on next")
    public void i_confirm_one_layer_curtains_by_click_on_next() throws InterruptedException {
        //vidga = new VidgaPageObject(driver);

        driver.switchTo().frame("application-iframe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        WebElement picture = driver.findElement(By.xpath("//*[@id='root']/div/div[1]/img"));
        Assert.assertTrue(picture.isDisplayed());
        if ((picture.isDisplayed())){System.out.println("picture");}


        WebElement nextLayers = driver.findElement(By.id("next_button_layer_options"));
        Assert.assertTrue(nextLayers.isDisplayed());
        nextLayers.click();







        //js.executeScript("window.scrollBy(0,1000)");
//       WebElement addLayer = driver.findElement(By.id("pub__shoppable-image-art,90515132"));
        //      addLayer.click();

        js.executeScript("arguments[0].click();", addLayer);
        WebElement next1 = driver.findElement(By.id("next_button_layer_options"));
        js.executeScript("arguments[0].click();", next1);



        //vidga.clickOnAddLayer();

        System.out.println("button is present");

    }

    @When("I confirm predefined width by a click on next")
    public void i_confirm_predefined_width_by_a_click_on_next() {
        // Write code here that turns the phrase above into concrete actions
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement nextMeasurements = driver.findElement(By.id("next_button_measurements"));
        Assert.assertTrue(nextMeasurements.isDisplayed());
        if (nextMeasurements.isDisplayed()){System.out.println("next Measurements");}


        waitUntilClickable(driver, nextMeasurements);

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("arguments[0].click()", nextMeasurements);

        //nextMeasurements.click();


    }

    @When("I click on add cm")
    public void i_click_on_add_cm() {
        // Write code here that turns the phrase above into concrete actions

        WebElement adding15 = driver.findElement(By.cssSelector("#true"));
        waitUntil(driver, By.cssSelector("#true"));
       System.out.println(adding15.getText());

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", adding15);

        //waitUntil(driver, By.cssSelector("#true"));
        //Assert.assertTrue(adding15.getLocation());
        if (adding15.isSelected()){System.out.println("add15");}
     // <input type="radio" name="additional-width" id="true" value="30">

        //waitUntilClickable(driver, adding15);
       // adding15.click();

    }

    @When("I click on next in additional width")
    public void i_click_on_next_in_additional_width() {
        // Write code here that turns the phrase above into concrete actions

        WebElement nextAdditiional = driver.findElement(By.cssSelector("#next_button_addional_measurements"));
        waitUntil(driver, By.cssSelector("#next_button_addional_measurements"));
        if (nextAdditiional.isDisplayed()){System.out.println("nextAdditional");}
        System.out.println(nextAdditiional.getText());

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", nextAdditiional);

        //waitUntil(driver, By.cssSelector("#true"));
        //Assert.assertTrue(adding15.getLocation());


    }

    @When("I click ceiling")
    public void i_click_ceiling() {
        WebElement ceiling = driver.findElement(By.cssSelector("#ceiling"));
        waitUntil(driver, By.cssSelector("#ceiling"));
        if (ceiling.isDisplayed()){System.out.println("ceiling");}
        System.out.println(ceiling.getText());

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", ceiling);

    }

    @Then("I am able to see items and price of my solution")
    public void i_am_able_to_see_items_and_price_of_my_solution() {

        WebElement includedProducts = driver.findElement(By.className("WhatsIncluded_includedHeader__11942"));
        waitUntil(driver, By.className("WhatsIncluded_includedHeader__11942"));
        if (includedProducts.isDisplayed()){System.out.println("summary");}
        System.out.println(includedProducts.getText());

        Assert.assertTrue(includedProducts.isDisplayed());


        // Write code here that turns the phrase above into concrete actions

    }


}





*/
