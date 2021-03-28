package Utils;

import org.openqa.selenium.By;

public class OpjectRepo {

    public static By loginlocator= By.xpath("//a[@title=\"Log in to your customer account\"]");
    public static By signoutlocator=By.xpath("//a[@title=\"Log me out\"]");
    public static By emaillocator=By.id("email");
    public static By passlocator=By.id("passwd");
    public static By submitlocator=By.id("SubmitLogin");
    public static By pageheaderlocator =By.xpath("//*[@id=\"center_column\"]/h1");//*[@id="center_column"]/h1
    public static By shirtbtnlocator=By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a");
    public static By closebtnincartlocator=By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/div/div/div/dl/dt/span/a");
    public static By cardlocator=By.xpath("//*[@id=\"center_column\"]/ul/li");
    public static By closebtnpopuplocator=By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span");
    public static By cartsliderlocator=By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a");
    public static By popuplocator=By.xpath("//div[@id=\"layer_cart\"]");
    public static By popupsuccessmessagelocator=By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2");
    public static By proceedcheckoutbtn=By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");
    public static By proceedcheckoutfinal=By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span");
    public static By proceedcheckoutAddress=By.xpath("//*[@id=\"center_column\"]/form/p/button");
    public static By proceedcheckoutShipping=By.xpath("//*[@id=\"form\"]/p/button/span");
    public static By PaymentBanklocator=By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a");
    public static By ConfirmOrderbtnlocator=By.xpath("//*[@id=\"cart_navigation\"]/button/span");
    public static By ConfirmOrdermessage=By.xpath("//*[@id=\"center_column\"]/div/p/strong");
    public static By ShippingCheckboxlocator=By.id("uniform-cgv");
    public static By Totallocator=By.xpath("//*[@id=\"cart_summary\"]/tfoot/tr[7]/td[1]/span");
    public static By cartlocator=By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img");
    public static By dashboardheaderimglocator=By.xpath("//*[@id=\"header_logo\"]/a/img");
    public static By shopingcartsummarylocator=By.xpath("//*[@id=\"summary_products_quantity\"]");
    public static By Registrationpageheaderlocator=By.xpath("//*[@id=\"noSlide\"]"); ////*[@id="noSlide"]/h1  //*[@id="noSlide"]
    public static By Registrationmailfieldlocator=By.id("email_create");
    public static By Createaccountbtnlocator=By.id("SubmitCreate");
    public static By Firstnamelocator=By.id("customer_firstname");
    public static By Lastnamelocator=By.id("customer_lastname");
    public static By registerpasslocator=By.id("passwd");
    public static By Addresslocator=By.id("address1");
    public static By Citylocator=By.id("city");
    public static By Statelocator=By.id("id_state");
    public static By selectedstatelocator=By.xpath("//*[@id=\"id_state\"]/option[2]");
    public static By zipcodelocator=By.id("postcode");
    public static By Countrylocator=By.id("id_country");
    public static By mobilenumberlocator=By.id("phone_mobile");
    public static By Address2locator=By.id("alias");
    public static By Registerbtnlocator=By.id("submitAccount");
    public static By AccountName=By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span");
    public static By OrderHistorybtn=By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a");
    public static By HistoryOrderitem=By.xpath("//*[@id=\"order-list\"]/tbody/tr[1]");
    public static By OrderitemStatus=By.xpath("//*[@id=\"order-list\"]/tbody/tr[1]/td[5]/span");
    public static By WomenSectiolocator=By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
    public static By Blousesitemlocator =By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[2]/a");
    public static By BlousesScreenlocator=By.xpath("//*[@id=\"center_column\"]/div[1]/div/div/span");
    public static By BlouseProduct =By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a");
    public static By ProductSizelocator=By.id("group_1");
    public static By ProductSizelabel=By.xpath("//*[@id=\"attributes\"]/fieldset[1]/label");
    public static By ProductColor=By.id("color_8");
    public static By AddtoCartBtn =By.xpath("//*[@id=\"add_to_cart\"]/button/span");
    public static By SelectedWomenCasualitemlocator=By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[1]/a");
    public static By Casualitempagelocator=By.xpath("//*[@id=\"columns\"]/div[1]");
    public static By Womencategorieslocator=By.className("sf-with-ul");
    public static By Comparebtnlocator=By.xpath("//*[@id=\"center_column\"]/div[2]/div[2]/form/button/span/strong");
    public static By DressCardlocator=By.xpath("//*[@id=\"center_column\"]/ul/li/div");
    public static By Addtocmparebtn=By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[3]/div[2]/a");
    public static By Deletecompareitemlocator=By.xpath("//*[@id=\"product_comparison\"]/tbody/tr[1]/td[2]/div[1]/a");

    public static final String GetallPosts = "https://jsonplaceholder.typicode.com/posts";

}
