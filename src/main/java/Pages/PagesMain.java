package Pages;

public class PagesMain {
    public static void main(String[] args) {

        Page loginScreen = new Page("Login", 1, "www.legionIT.com/login");
//        loginScreen.pageId = 1;
//        loginScreen.pageName = "Login";
//        loginScreen.URL = "www.legionIT.com/login";

//        loginScreen.openPage();
//        loginScreen.closePage();
//        loginScreen.clickButton("Login");
//
//        Page aboutScreen = new Page();
//        //aboutScreen.setPageId(1);
//        System.out.println(aboutScreen.getPageId());
//        aboutScreen.setPageName("About");
//        aboutScreen.setURL("www.legionIT.com/about");
//
//        aboutScreen.openPage();
//        aboutScreen.closePage();
//        aboutScreen.clickButton("Exit");

        LoginPage loginPage = new LoginPage();
        loginPage.setPageName("LoginPage");
        loginPage.setURL("http//...");

        loginPage.openPage();
        loginPage.setUsername("name");
        loginPage.setPassword("12345");
        loginPage.populateCredentials();
    }
}
