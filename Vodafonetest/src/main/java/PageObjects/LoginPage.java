package PageObjects;

import Utils.OpjectRepo;
import Utils.PropertiesReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;
    WebDriverWait webwait;
    PropertiesReader propertiesReader;
 //   String email="ahmed3@test.com";
  //  String password="12345";

    public LoginPage(WebDriver driverz) {
        propertiesReader=new PropertiesReader();
        this.driver = driverz;
        webwait= new WebDriverWait(this.driver,propertiesReader.getTimeOut());
    }

    public String getheaderloginpage()
    {
        webwait.until(ExpectedConditions.visibilityOfElementLocated(OpjectRepo.pageheaderlocator));
        WebElement loinpage=driver.findElement(OpjectRepo.pageheaderlocator);
        return loinpage.getText();
    }

    public void entermail(String email)
    {
        webwait.until(ExpectedConditions.elementToBeClickable(OpjectRepo.emaillocator));
        WebElement usernamefaild=driver.findElement(OpjectRepo.emaillocator);
        usernamefaild.sendKeys(email);
    }

    public void enterpass(String password)
    {
        webwait.until(ExpectedConditions.elementToBeClickable(OpjectRepo.passlocator));
        WebElement userpass=driver.findElement(OpjectRepo.passlocator);
        userpass.sendKeys(password);
    }

    public void clicksubmit()
    {
        webwait.until(ExpectedConditions.elementToBeClickable(OpjectRepo.submitlocator));
        WebElement sub=driver.findElement(OpjectRepo.submitlocator);
        sub.click();
    }

    public void entermailtoberegistered()
    {
        webwait.until(ExpectedConditions.elementToBeClickable(OpjectRepo.Registrationmailfieldlocator));
        WebElement toregisteredmail=driver.findElement(OpjectRepo.Registrationmailfieldlocator);
        toregisteredmail.sendKeys(propertiesReader.getmailtoberegistered());

    }
    public void submitmailtoberegistered()
    {
        webwait.until(ExpectedConditions.elementToBeClickable(OpjectRepo.Createaccountbtnlocator));
        WebElement registerbtn=driver.findElement(OpjectRepo.Createaccountbtnlocator);
        registerbtn.click();
    }
}
