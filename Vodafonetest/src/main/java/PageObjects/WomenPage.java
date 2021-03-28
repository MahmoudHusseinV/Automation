package PageObjects;

import Utils.OpjectRepo;
import Utils.PropertiesReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WomenPage {
    WebDriver driver;
    WebDriverWait webwait;
    PropertiesReader propertiesReader;
    Actions action;
    LoginPage login;

    public WomenPage(WebDriver driver) {

        propertiesReader=new PropertiesReader();
        this.driver = driver;
        webwait=new WebDriverWait(driver,PropertiesReader.getTimeOut());
    }
    public void hoveronwomensection()
    {
        action=new Actions(driver);
        webwait.until(ExpectedConditions.visibilityOfElementLocated(OpjectRepo.WomenSectiolocator));
        WebElement Womenbtn=driver.findElement(OpjectRepo.WomenSectiolocator);
        action.moveToElement(Womenbtn).build().perform();
    }
    public void SelectCasualDressitem()
    {
        webwait.until(ExpectedConditions.visibilityOfElementLocated(OpjectRepo.SelectedWomenCasualitemlocator));
      /*  List<WebElement> Womencategories= driver.findElements(OpjectRepo.Womencategorieslocator);
        Womencategories.get(1).click();*/
        WebElement womencasualdressbtn=driver.findElement(OpjectRepo.SelectedWomenCasualitemlocator);
        womencasualdressbtn.click();
    }
    public void SelectBlouses()
    {
        webwait.until(ExpectedConditions.visibilityOfElementLocated(OpjectRepo.Blousesitemlocator));
        WebElement WomenBlouses=driver.findElement(OpjectRepo.Blousesitemlocator);
        WomenBlouses.click();
    }
    public String getwomenblousesPage()
    {
        WebElement Blousescard=driver.findElement(OpjectRepo.BlousesScreenlocator);
              return Blousescard.getText();
    }
    public void ChooseBlousesProduct()
    {
        webwait.until(ExpectedConditions.visibilityOfElementLocated(OpjectRepo.BlouseProduct));
        WebElement BlousesProd=driver.findElement(OpjectRepo.BlouseProduct);
        BlousesProd.click();
    }

    public String getProductPage()
    {
        webwait.until(ExpectedConditions.visibilityOfElementLocated(OpjectRepo.ProductSizelabel));
        WebElement size=driver.findElement(OpjectRepo.ProductSizelabel);
        return  size.getText();

    }

    public void selectSize()
    {
        Select size=new Select(driver.findElement(OpjectRepo.ProductSizelocator));
        size.selectByIndex(1);
    }
    public void selectColor()
    {
        webwait.until(ExpectedConditions.visibilityOfElementLocated(OpjectRepo.ProductColor));
        WebElement color=driver.findElement(OpjectRepo.ProductColor);
        color.click();
    }

    public void AddToCart()
    {
        webwait.until(ExpectedConditions.visibilityOfElementLocated(OpjectRepo.AddtoCartBtn));
        WebElement Cart=driver.findElement(OpjectRepo.AddtoCartBtn);
        Cart.click();
        webwait.until(ExpectedConditions.visibilityOfElementLocated(OpjectRepo.popuplocator));

    }
    public String getProductSucessmessage()
    {
        webwait.until(ExpectedConditions.visibilityOfElementLocated(OpjectRepo.popupsuccessmessagelocator));
        WebElement Sucess=driver.findElement(OpjectRepo.popupsuccessmessagelocator);
        return Sucess.getText();
    }
    public void ProcceedCheckout()
    {
        webwait.until(ExpectedConditions.visibilityOfElementLocated(OpjectRepo.proceedcheckoutbtn));
        WebElement checkout=driver.findElement(OpjectRepo.proceedcheckoutbtn);
        checkout.click();
        webwait.until(ExpectedConditions.visibilityOfElementLocated(OpjectRepo.proceedcheckoutfinal));
        WebElement checkoutfinal =driver.findElement(OpjectRepo.proceedcheckoutfinal);
        checkoutfinal.click();
        webwait.until(ExpectedConditions.visibilityOfElementLocated(OpjectRepo.proceedcheckoutAddress));
        WebElement checkoutAddress =driver.findElement(OpjectRepo.proceedcheckoutAddress);
        checkoutAddress.click();

        webwait.until(ExpectedConditions.elementToBeClickable(OpjectRepo.ShippingCheckboxlocator));
        WebElement ShippingCheckbox =driver.findElement(OpjectRepo.ShippingCheckboxlocator);
        ShippingCheckbox.click();

        webwait.until(ExpectedConditions.visibilityOfElementLocated(OpjectRepo.proceedcheckoutShipping));
        WebElement CheckoutShipping =driver.findElement(OpjectRepo.proceedcheckoutShipping);
        CheckoutShipping.click();
        webwait.until(ExpectedConditions.visibilityOfElementLocated(OpjectRepo.PaymentBanklocator));
        WebElement Paymentbank =driver.findElement(OpjectRepo.PaymentBanklocator);
        Paymentbank.click();
    }
    public String ConfirmOrderMessage()
    {
        webwait.until(ExpectedConditions.visibilityOfElementLocated(OpjectRepo.ConfirmOrderbtnlocator));
        WebElement ConfirmOrder=driver.findElement(OpjectRepo.ConfirmOrderbtnlocator);
        ConfirmOrder.click();
        webwait.until(ExpectedConditions.visibilityOfElementLocated(OpjectRepo.ConfirmOrdermessage));
        WebElement Confirmmessage=driver.findElement(OpjectRepo.ConfirmOrdermessage);
        return Confirmmessage.getText();
    }

    public void OpenHistoryOrders()
    {
        WebElement myAccount=driver.findElement(OpjectRepo.AccountName);
        myAccount.click();

        webwait.until(ExpectedConditions.visibilityOfElementLocated(OpjectRepo.OrderHistorybtn));
        WebElement OrderHistory=driver.findElement(OpjectRepo.OrderHistorybtn);
        OrderHistory.click();
    }

    public String ValidateOrderPlace()
    {
        webwait.until(ExpectedConditions.visibilityOfElementLocated(OpjectRepo.OrderitemStatus));
        WebElement StatusItem=driver.findElement(OpjectRepo.OrderitemStatus);
        return StatusItem.getText();

    }

    public String getselectedwomenitemname()
    {

        WebElement womencasualdressbtn=driver.findElement(OpjectRepo.SelectedWomenCasualitemlocator);
        return womencasualdressbtn.getText();
    }

    public String Getcasualdresspage()
    {
        webwait.until(ExpectedConditions.visibilityOfElementLocated(OpjectRepo.Casualitempagelocator));
        WebElement casualitempage=driver.findElement(OpjectRepo.Casualitempagelocator);
        return casualitempage.getText();
    }

    public void hoveronthedresscard() throws InterruptedException {
        action=new Actions(driver);
        webwait.until(ExpectedConditions.visibilityOfElementLocated(OpjectRepo.Casualitempagelocator));
        WebElement dresscard=driver.findElement(OpjectRepo.DressCardlocator);
        WebElement Comparebtn=driver.findElement(OpjectRepo.Addtocmparebtn);
        action.moveToElement(dresscard).build().perform();
        Comparebtn.click();


    }
    public int getcomparenumber() throws InterruptedException {
       // Thread.sleep(5000);
        WebElement comparenumber=driver.findElement(OpjectRepo.Comparebtnlocator);
        int d=Integer.parseInt(comparenumber.getText());
        String str=new Integer(d+1).toString();
        webwait.until(ExpectedConditions.textToBePresentInElement(comparenumber,str));
        System.out.println(Integer.parseInt(comparenumber.getText()));
   //     return comparenumber.getText();
        return d;
    }
    public void pressoncomparebutton()
    {
        webwait.until(ExpectedConditions.visibilityOfElementLocated(OpjectRepo.Comparebtnlocator));
        WebElement comparenumber=driver.findElement(OpjectRepo.Comparebtnlocator);
        comparenumber.click();
    }
    public void deletecompareitem()
    {
        webwait.until(ExpectedConditions.visibilityOfElementLocated(OpjectRepo.Deletecompareitemlocator));
        WebElement deleteicon=driver.findElement(OpjectRepo.Deletecompareitemlocator);
        deleteicon.click();
    }
}
