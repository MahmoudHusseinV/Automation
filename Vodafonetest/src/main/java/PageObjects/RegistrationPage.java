package PageObjects;

import Utils.OpjectRepo;
import Utils.PropertiesReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {

    WebDriver driver;
    WebDriverWait webwait;
    Actions action;
    PropertiesReader propertiesReader;

    public RegistrationPage(WebDriver driver) {
        propertiesReader=new PropertiesReader();
        this.driver = driver;
        webwait= new WebDriverWait(this.driver,PropertiesReader.getTimeOut());
    }
    public String getpageheadertitle()
    {
        webwait.until(ExpectedConditions.visibilityOfElementLocated(OpjectRepo.Registrationpageheaderlocator));
        WebElement registrationtitle=driver.findElement(OpjectRepo.Registrationpageheaderlocator);
        return registrationtitle.getText();
    }
    public void fillfirstname()
    {
        webwait.until(ExpectedConditions.elementToBeClickable(OpjectRepo.Firstnamelocator));
        WebElement firstname=driver.findElement(OpjectRepo.Firstnamelocator);
        firstname.sendKeys(propertiesReader.getfirstname());
    }
    public void filllastname()
    {
        webwait.until(ExpectedConditions.elementToBeClickable(OpjectRepo.Lastnamelocator));
        WebElement Lastname=driver.findElement(OpjectRepo.Lastnamelocator);
        Lastname.sendKeys(propertiesReader.getlastname());
    }
    public void fillpassword()
    {
        webwait.until(ExpectedConditions.elementToBeClickable(OpjectRepo.registerpasslocator));
        WebElement pass=driver.findElement(OpjectRepo.registerpasslocator);
        pass.sendKeys(propertiesReader.getPasswordregistration());
    }
    public void filladdress()
    {
        webwait.until(ExpectedConditions.elementToBeClickable(OpjectRepo.Addresslocator));
        WebElement Address=driver.findElement(OpjectRepo.Addresslocator);
        Address.sendKeys(propertiesReader.getAddress());
    }
    public void fillCity()
    {
        webwait.until(ExpectedConditions.elementToBeClickable(OpjectRepo.Citylocator));
        WebElement city=driver.findElement(OpjectRepo.Citylocator);
        city.sendKeys(propertiesReader.getCity());
    }
    public void selectstate()
    {
        Select state=new Select(driver.findElement(OpjectRepo.Statelocator));
        state.selectByIndex(1);

    }
    public void fillzipcode()
    {
        webwait.until(ExpectedConditions.visibilityOfElementLocated(OpjectRepo.zipcodelocator));
        WebElement postcode=driver.findElement(OpjectRepo.zipcodelocator);
        postcode.sendKeys(propertiesReader.getZipCode());
    }
    public void selectcountry()
    {
        //webwait.until(ExpectedConditions.visibilityOfElementLocated(OpjectRepo.Countrylocator));
        Select country=new Select(driver.findElement(OpjectRepo.Countrylocator));
        country.selectByIndex(1);
    }
    public void fillphonenumber()
    {
        webwait.until(ExpectedConditions.elementToBeClickable(OpjectRepo.mobilenumberlocator));
        WebElement phone=driver.findElement(OpjectRepo.mobilenumberlocator);
        phone.sendKeys(propertiesReader.getphone());
    }
    public void fillpackupaddress()
    {
        webwait.until(ExpectedConditions.elementToBeClickable(OpjectRepo.Address2locator));
        WebElement Address2=driver.findElement(OpjectRepo.Address2locator);
        Address2.clear();
        Address2.sendKeys(propertiesReader.getanotheraddress());
    }
    public void Clickregister()
    {
        webwait.until(ExpectedConditions.elementToBeClickable(OpjectRepo.Registerbtnlocator));
        WebElement registerbtn=driver.findElement(OpjectRepo.Registerbtnlocator);
        registerbtn.click();
    }


}
