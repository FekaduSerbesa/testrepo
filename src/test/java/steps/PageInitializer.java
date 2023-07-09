package steps;

import pages.DashBoardPage;
import pages.LoginPage;

public class PageInitializer {
    public static LoginPage loginPage;
    public static DashBoardPage dash;


    //    initalize all the page objects
    public static void initializePageObjects() {
        loginPage = new LoginPage();
        dash=new DashBoardPage();
    }
}
