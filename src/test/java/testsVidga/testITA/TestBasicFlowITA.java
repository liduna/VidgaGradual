package testsVidga.testITA;

import org.testng.annotations.Test;
import pageObjects.ITA.VidgaPOItaly;
import testsVidga.BaseTest;

public class TestBasicFlowITA extends BaseTest {

    @Test
    public void testAddPanel1(){
        VidgaPOItaly vidgaIT = new VidgaPOItaly(getDriver());
        vidgaIT.navigateToPage(vidgaIT.getAddres());
        vidgaIT.verifyPageIsLoaded();
        vidgaIT.verifySwitchFrame();
        vidgaIT.selectPanelOnFirst();



    }

    /**this is a problem since these element dont have their ID's. Necessary to implement ASAP
     *
     */
    @Test
    public void testAddPanel2(){
        VidgaPOItaly vidgaIT = new VidgaPOItaly(getDriver());
        vidgaIT.navigateToPage(vidgaIT.getAddres());
        vidgaIT.verifyPageIsLoaded();
        vidgaIT.verifySwitchFrame();
        vidgaIT.selectPanelOnSecond();
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

    @Test
    public void dropDown_test_Italian_Live() {


        VidgaPOItaly vidgaIT = new VidgaPOItaly(getDriver());
        vidgaIT.navigateToPage(vidgaIT.getAddres());
        vidgaIT.verifyPageIsLoaded();
        vidgaIT.verifySwitchFrame();
        vidgaIT.selectPanelOnFirst();
        vidgaIT.confirmMeasurementsNoInput();
        vidgaIT.add15CM();
        vidgaIT.chooseCeiling();
        vidgaIT.choosTripleRailings();
        vidgaIT.chooseSilver();
        vidgaIT.verifySummaryPresent();
    }


}
