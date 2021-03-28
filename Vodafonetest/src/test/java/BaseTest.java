import PageObjects.*;
import Utils.PropertiesReader;
import Utils.WebDriverSingleton;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

public class BaseTest {

    WebDriver driver;
    SoftAssert softAssert;
    PropertiesReader prop;
    HomePage homePage;
    LoginPage loginPage;
    MyAccount myAccount;
    RegistrationPage registrationPage;
    WomenPage womenPage;

    @BeforeClass
    public void openweb()
    {
        prop=new PropertiesReader();
        WebDriverManager.chromedriver().clearPreferences(); //open chrome
        WebDriverManager.chromedriver().setup();
        //driver=new ChromeDriver();
        WebDriverSingleton.getInstance().getWebDriver().navigate().to(prop.getURL()); //navigate to shop URL
        //  driver.navigate().to(prop.getURL());
        //    driver.manage().window().maximize();
        homePage=new HomePage(WebDriverSingleton.getInstance().getWebDriver());
        loginPage=new LoginPage(WebDriverSingleton.getInstance().getWebDriver());
        myAccount=new MyAccount(WebDriverSingleton.getInstance().getWebDriver());
        registrationPage=new RegistrationPage(WebDriverSingleton.getInstance().getWebDriver());
        womenPage=new WomenPage(WebDriverSingleton.getInstance().getWebDriver());
//        webwait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Sign in")));
        //   WebElement singin=driver.findElement(By.partialLinkText("Sign in"));
    }
}
