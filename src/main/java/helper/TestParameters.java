package helper;

public interface TestParameters {

    int expectedResponseCode = 200;
    String testUrl = "https://onee.com";
    String[] userDemoTa = {"oneedemota@gmail.com","Onee.demo.2021"};
    String [] userDevVrpm = {"Oneevrpmdev@gmail.com","Onee1oct.2020"};
    String [] userDevTa = {"Oneetadev@gmail.com","Onee1oct.2020"};
    String propertyId = "10139";
    String country = "Spain";
    String testProperty = "https://onee.com/detail/10474";
    int petCount = 2;
    int childrenCount = 2;
    int adultCount = 2;
    int searchListYachtTotalCount = 21 ;
    int searchListVillaTotalCount = 323;
    int searchListPropertyCount = 24;
    int searchListPropertyTotalCount = 302;
    String searchInstantBookingText = "Show only properties that can accept instant bookings." +
            " These properties have pricing and calendars updated in real time and can be reserved without prior approval.";
    /*******Villa Details******/
    String photoVilla = "background-image: url(\"https://onee-live.b-cdn.net/53ce5b4a-9fcf-4570-b3bd-3b68db6830ad_villa-mozart-in-sierra-blanca-marbella-9.jpg\");";
    String villaName = "Villa Silueta";
    String villaLocation = "Marbella, Spain";
    String villaGuestCount = "12";
    String villaBedRoomCount = "6";
    String villaBathRoomCount = "7";
    /*******Yacht Details******/
    String yachtName = "Fortuna 2 ";
    String yachtLocation = "Marbella, Spain";
    String yachtGuestCount = "16";
    String yachtCabinCount = "8";
    String yachtBathRoomCount = "8";
    String photoYacht = "background-image: url(\"https://onee-live.b-cdn.net/d9f79fbb-40f8-4f7d-8478-1bb172e2e54b_1572347581.jpg\");";


/*
    String testProperty = "https://dev.onee.com/detail/10474";
    String testUrl = "https://dev.onee.com";
    String userEmail = "Oneevrpmdev@gmail.com";
    String password = "Onee1oct.2020";


    String testUrl = "https://admin.onee.com";
    String userEmail = "cengiz.yilmaz@onee.com";
    String password = "Moj17873";

*/

}
