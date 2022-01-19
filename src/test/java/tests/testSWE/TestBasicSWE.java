package tests.testSWE;

import customDataProvider.DPswedishType;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.SWE.POSweType;



public class TestBasicSWE {


    /**
     * in the brackets there is allocation of dataProvider, specified by name and class, which fetches the data for the test
     */

    POSweType.Initializer browser = new POSweType.Initializer();

    @Test(dataProvider = "browser/SWETypeLocation", dataProviderClass = DPswedishType.class)
    public void first_test_Swedish_Live(String browserName, String address) {

        /** Here I initialize objects and pass parameters*/

        POSweType vidgaSE = browser.startApp(browserName);

        vidgaSE.navigateToPage(vidgaSE.getAddres(address));
        vidgaSE.verifyPage();

        /** here is the testcase itself*/

        vidgaSE.addLayer();
        vidgaSE.confirmMeasurementsNoInput();
        vidgaSE.add15CM();
        vidgaSE.chooseCeiling();

        /** assertion */

        Assert.assertTrue(vidgaSE.getSummary().isDisplayed());
        System.out.println("Summary of the products is displayed");

    }

    @Test(dataProvider = "browser/SWETypeLocation", dataProviderClass = DPswedishType.class)
    public void parameterizedSWE(String browserName, String address) {

        //POSweType.Initializer browser = new POSweType.Initializer();
        POSweType vidgaSE = browser.startApp(browserName);

        vidgaSE.navigateToPage(vidgaSE.getAddres(address));
        vidgaSE.verifyPage();

        vidgaSE.addLayer();
        vidgaSE.confirmMeasurementsNoInput();
        vidgaSE.add15CM();
        vidgaSE.chooseCeiling();

        Assert.assertTrue(vidgaSE.getSummary().isDisplayed());
        System.out.println("Summary of the products is displayed");


    }
    /*
    @After
    public void afterEach() {
        browser.quit();
*/

    }

