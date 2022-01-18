package testsVidga.testSWE;

import org.testng.annotations.Test;
import pageObjects.SWE.VidgaPOSweden;


public class testBasicFlowSWE  {


    @Test
    public void first_test_Swedish_Live() {

        VidgaPOSweden.Initializer browser = new VidgaPOSweden.Initializer();
        VidgaPOSweden vidgaSE = browser.startApp("chrome");
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
