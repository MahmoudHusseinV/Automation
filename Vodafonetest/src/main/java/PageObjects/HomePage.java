package PageObjects;

import Utils.OpjectRepo;
import Utils.PropertiesReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    //By loginlocator= By.partialLinkText("Sign in");
    WebDriver driver;
    WebDriverWait webwait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        webwait= new WebDriverWait(this.driver, PropertiesReader.getTimeOut());
    }



    public void clicksignin()
    {
     webwait.until(ExpectedConditions.visibilityOfElementLocated(OpjectRepo.loginlocator));

        WebElement singin=driver.findElement(OpjectRepo.loginlocator);
        singin.click();
      webwait.until(ExpectedConditions.visibilityOfElementLocated(OpjectRepo.pageheaderlocator));

    }




}
