package customDataProvider;

import org.testng.annotations.DataProvider;

public class DPswedishType {

    //This class provides data for testing of vidga planners "swedish type", that is with only one layer, no pannels
    /** This providers sends data to test case in test class where it is called by "name" of the provider*/


    @DataProvider (name = "browser/SWETypeLocation")
    public static Object [][] getData (){

        Object[][] data= {{"chrome", "https://www.ikea.com/se/sv/planners/vidga-planner/"}, {"chrome", "https://www.ikea.com/au/en/planners/vidga-planner/"}};
        return data;
    }

}
