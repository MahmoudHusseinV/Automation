package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSingleton {

    private static WebDriverSingleton webDriverSingleton=null;
    private WebDriver webDriver;

    private WebDriverSingleton() {
        WebDriverManager.chromedriver().clearPreferences();
        WebDriverManager.chromedriver().setup();
        webDriver=new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    public static WebDriverSingleton getInstance()
    {
        if(webDriverSingleton==null)
        {
            webDriverSingleton=new WebDriverSingleton();
        }
        return webDriverSingleton;
    }

    public WebDriver getWebDriver()
    {
        return webDriver;
    }
}
