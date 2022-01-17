package testsVidga.testSWE;

import org.testng.annotations.Test;
import pageObjects.SWE.IkeaTitlePageObject;
import pageObjects.SWE.VidgaPOSweden;
import testsVidga.BaseTest;

public class testBasicFlowSWE extends BaseTest {

    @Test
    public void ikeaHomepageTests() {
        IkeaTitlePageObject ikea = new IkeaTitlePageObject(getDriver());
        ikea.navigateToPage  (ikea.getAddres());
        ikea.verifyIsPresent();
        ikea.clickOnPictureTitle();
        ikea.verifyItemPageOpened();

    }

    @Test
    public void first_test_Swedish_Live() {


        VidgaPOSweden vidgaSE = new VidgaPOSweden(getDriver());
        vidgaSE.navigateToPage(vidgaSE.getAddres());
        vidgaSE.verifyPageIsLoaded();
        vidgaSE.verifySwitchFrame();
        vidgaSE.addLayer();
        vidgaSE.confirmMeasurementsNoInput();
        vidgaSE.add15CM();
        vidgaSE.chooseCeiling();
        vidgaSE.verifySummaryPresent();

    }

    @Test
    public void testPriceAmount(){


    }
}
