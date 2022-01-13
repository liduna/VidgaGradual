package testsVidga;

import org.testng.annotations.Test;
import pageObjects.ITA.VidgaPOItaly;
import pageObjects.SWE.IkeaTitlePageObject;
import pageObjects.SWE.VidgaPOSweden;

public class FirstTest extends BaseTest {


    @Test
    public void ikeaHomepageTests() {
        IkeaTitlePageObject ikea = new IkeaTitlePageObject(getDriver());
        ikea.navigateToPage  ("https://www.ikea.se");
        ikea.verifyIsPresent();
        ikea.clickOnPictureTitle();

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
    public void first_test_Italian_Live() {


        VidgaPOItaly vidgaIT = new VidgaPOItaly(getDriver());
        vidgaIT.navigateToPage(vidgaIT.getAddres());
        vidgaIT.verifyPageIsLoaded();
        vidgaIT.verifySwitchFrame();
        vidgaIT.addLayer();
        vidgaIT.confirmMeasurementsNoInput();
        vidgaIT.add15CM();
        vidgaIT.chooseCeiling();
        vidgaIT.chooseSilver();
        vidgaIT.verifySummaryPresent();

    }
}





