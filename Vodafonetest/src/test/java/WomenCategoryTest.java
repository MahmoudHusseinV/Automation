import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WomenCategoryTest extends BaseTest
{
    @BeforeClass
    public void signnedin()
    {
        homePage.clicksignin();
        loginPage.entermail(prop.getEmail());
        loginPage.enterpass(prop.getPassword());
        loginPage.clicksubmit();
    }
    @Test
    public void NavigateToBlousesTest()
    {
        softAssert=new SoftAssert();
        womenPage.hoveronwomensection();
        womenPage.SelectBlouses();
        softAssert.assertTrue(womenPage.getwomenblousesPage().contains("Blouses"));
        softAssert.assertAll();
    }

    @Test(dependsOnMethods = "NavigateToBlousesTest",alwaysRun = true)
    public void SelectBlouseProductTest()
    {
        softAssert=new SoftAssert();
        womenPage.ChooseBlousesProduct();
        softAssert.assertTrue(womenPage.getProductPage().contains("Size"));
        softAssert.assertAll();
    }
    @Test(dependsOnMethods = "SelectBlouseProductTest",alwaysRun = true)
    public void SelectSizeColorTest()
    {
        softAssert=new SoftAssert();
        womenPage.selectSize();
        womenPage.selectColor();
        womenPage.AddToCart();
        softAssert.assertTrue(womenPage.getProductSucessmessage().contains("Product successfully added to your shopping cart"));
        softAssert.assertAll();
    }

    @Test (dependsOnMethods = "SelectSizeColorTest" ,alwaysRun = true)
    public void CheckoutTest()
    {
        softAssert=new SoftAssert();
        womenPage.ProcceedCheckout();
        softAssert.assertTrue(womenPage.ConfirmOrderMessage().contains("Your order on My Store is complete."));
        softAssert.assertAll();

    }
@Test (dependsOnMethods = "CheckoutTest" ,alwaysRun = true)
    public void ValidateOrderPlaceTest()
    {
        softAssert=new SoftAssert();
        womenPage.OpenHistoryOrders();
        softAssert.assertTrue(womenPage.ValidateOrderPlace().contains("On backorder"));
        softAssert.assertAll();

    }
}
