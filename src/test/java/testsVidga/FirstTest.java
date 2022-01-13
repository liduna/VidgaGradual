package testsVidga;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pageObjects.IkeaTitlePage;
import pageObjects.VidgaPageObject;

public class FirstTest extends BaseTest {


    @Test
    public void ikeaHomepageTests() {
        IkeaTitlePage ikea = new IkeaTitlePage(getDriver());
        getAddress("https://www.ikea.se");
        managePage();
        ikea.verifyIsPresent();
        ikea.clickOnPictureTitle();

    }

    @Test
    public void twoLayersAdditionalCeiling() {


        VidgaPageObject vidga = new VidgaPageObject(getDriver());
        getAddress(" https://ikea-aoa-dev.cybercomhosting.com/addon-app/windowsolutions/master/1.4.1-16-g07e5f8b/m2/");
        managePage();
        vidga.verifyPageIsLoaded();
        vidga.verifySwitchFrame();
        vidga.addLayer();
        vidga.confirmMeasurementsNoInput();
        vidga.add15CM();
        vidga.chooseCeiling();
        vidga.verifySummaryPresent();

    }
}





