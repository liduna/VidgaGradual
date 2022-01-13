package testsVidga;

import org.testng.annotations.Test;
import pageObjects.IkeaTitlePageObject;
import pageObjects.VidgaPageObject;

public class FirstTest extends BaseTest {


    @Test
    public void ikeaHomepageTests() {
        IkeaTitlePageObject ikea = new IkeaTitlePageObject(getDriver());
        ikea.getAddress  ("https://www.ikea.se");
        ikea.managePage();
        ikea.verifyIsPresent();
        ikea.clickOnPictureTitle();

    }

    @Test
    public void firstTestinginLive() {


        VidgaPageObject vidga = new VidgaPageObject(getDriver());
        vidga.getAddress("https://www.ikea.com/se/sv/planner/vidga-planner/");
        vidga.managePage();
        vidga.verifyPageIsLoaded();
        vidga.verifySwitchFrame();
        vidga.addLayer();
        vidga.confirmMeasurementsNoInput();
        vidga.add15CM();
        vidga.chooseCeiling();
        vidga.verifySummaryPresent();

    }
}





