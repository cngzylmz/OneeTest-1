package helper;

import org.testng.annotations.DataProvider;

public class DataProviderClass implements TestParameters {

    @DataProvider(name = "SearchCardDetails")
    static public Object[][] cardDetails() {
        return new Object[][]{
                {villaName, villaLocation, villaGuestCount, villaBedRoomCount, villaBathRoomCount, photoVilla},
//                {yachtName, yachtLocation, yachtGuestCount, yachtCabinCount, yachtBathRoomCount, photoYacht},
        };
    }
}
