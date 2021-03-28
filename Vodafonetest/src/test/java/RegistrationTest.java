import Utils.PropertiesReader;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegistrationTest extends BaseTest {

    @BeforeClass
    public void signnedin()
    {
        PropertiesReader.generateupdatedEmail();
        homePage.clicksignin();
        loginPage.entermailtoberegistered();
        loginPage.submitmailtoberegistered();
    }
    @Test
    public void navigatetoregistrationpagetest()
    {
        softAssert=new SoftAssert();
        softAssert.assertTrue(registrationPage.getpageheadertitle().contains("CREATE AN ACCOUNT"));
        softAssert.assertAll();
    }
    @Test(dependsOnMethods = "navigatetoregistrationpagetest",alwaysRun = true)
    public void fillmandatorydatatest()
    {
        softAssert=new SoftAssert();
        registrationPage.fillfirstname();
        registrationPage.filllastname();
        registrationPage.fillpassword();
        registrationPage.filladdress();
        registrationPage.fillCity();
        registrationPage.selectstate();
        registrationPage.fillzipcode();
        registrationPage.selectcountry();
        registrationPage.fillphonenumber();
        registrationPage.fillpackupaddress();
        registrationPage.Clickregister();
        softAssert.assertTrue(myAccount.myacountismyname(),"Should be Mahmoud Hussein");
        softAssert.assertTrue(myAccount.getmyaccount().contains("MY ACCOUNT"),"mfroud yb2a feha my account");
        softAssert.assertAll();

    }
    @Test(dependsOnMethods = "fillmandatorydatatest",alwaysRun = true)
    public void loginwithnewcradentialtest()
    {
        softAssert=new SoftAssert();
        myAccount.clicksignout();
        loginPage.entermail(prop.getmailtoberegistered());
        loginPage.enterpass(prop.getPasswordregistration());
        loginPage.clicksubmit();
        softAssert.assertTrue(myAccount.myacountismyname(),"mfroud tb2a mahmoud hussein");
        softAssert.assertTrue(myAccount.getmyaccount().contains("MY ACCOUNT"),"mfroud yb2a feha my account");
        softAssert.assertAll();
        myAccount.clicksignout();
    }



}
