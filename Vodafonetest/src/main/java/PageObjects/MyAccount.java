package PageObjects;

import Utils.OpjectRepo;
import Utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAccount {
    WebDriver driver;
    WebDriverWait webwait;
    PropertiesReader propertiesReader;
    Actions action;
//    RegistrationPage registrationPage;


    public MyAccount(WebDriver driver) {
        propertiesReader=new PropertiesReader();
        this.driver = driver;
        webwait= new WebDriverWait(this.driver,propertiesReader.getTimeOut());
    }


    /*
    public void hoveroncartslider()
    {
        action = new Actions(driver);
        webwait.until(ExpectedConditions.visibilityOfElementLocated(OpjectRepo.cartsliderlocator));
        WebElement cart=driver.findElement(OpjectRepo.cartsliderlocator);
        action.moveToElement(cart).build().perform();
        // Thread.sleep(5000);
        //   cart.click();
    }
*/
    public void clicksignout()
    {
        webwait.until(ExpectedConditions.visibilityOfElementLocated(OpjectRepo.signoutlocator));
        WebElement signoutbtn=driver.findElement(OpjectRepo.signoutlocator);
        signoutbtn.click();

    }
/*
    public void navigatetomyhomepage()
    {
        WebElement dashboard=driver.findElement(OpjectRepo.dashboardheaderimglocator);
        dashboard.click();
    }

    public String getshoppingcartsummery()
    {
        WebElement shoppingcartsumm=driver.findElement(OpjectRepo.shopingcartsummarylocator);
        return shoppingcartsumm.getText();
    }
*/
    public String getmyaccount()
    {
        webwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"center_column\"]")));
        WebElement MyAccountName=driver.findElement(By.xpath("//*[@id=\"center_column\"]"));
        return MyAccountName.getText();
    }

    public boolean myacountismyname()
    {
        webwait.until(ExpectedConditions.elementToBeClickable(OpjectRepo.AccountName));
        WebElement MyAccountName=driver.findElement(OpjectRepo.AccountName);
       return MyAccountName.getText().contains(propertiesReader.getfirstname());
    }
}
