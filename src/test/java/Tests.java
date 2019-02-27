import org.openqa.selenium.By;
import org.testng.annotations.*;
import pages.BuyWithSberbankPage;
import testManager.CreateGetRequest;
import testManager.CreateMapElements;
import webdriver.InizializeWebDriver;


public class Tests extends InizializeWebDriver {

    BuyWithSberbankPage sberbankPage;

    @BeforeClass
    public void setUp() {

        wd = InizializeWebDriver.initializeChromeDriver("http://81.177.48.233:443/@tools/register.html");
        sberbankPage = new BuyWithSberbankPage();

    }

    @AfterClass
    public void tearDown() {
        //InizializeWebDriver.quitChromeDriver();
    }

    @Test()
    @Parameters({"amount", "item_1_positionID", "item_1_name", "item_1_quantity", "item_1_amount", "item_1_price",
            "item_2_positionID", "item_2_name", "item_2_quantity", "item_2_amount", "item_2_price",
            "item_3_positionID", "item_3_name", "item_3_quantity", "item_3_amount", "item_3_price"})
    public void checkGetRequest(String amount, String item_1_positionID, String item_1_name, String item_1_quantity, String item_1_amount, String item_1_price,
                                String item_2_positionID, String item_2_name, String item_2_quantity, String item_2_amount, String item_2_price,
                                String item_3_positionID, String item_3_name, String item_3_quantity, String item_3_amount, String item_3_price) {
        sberbankPage.executeGetRequest(amount, item_1_name, item_1_quantity,
                item_1_amount, item_1_price, item_2_name, item_2_quantity, item_2_amount, item_2_price, item_3_name, item_3_quantity, item_3_amount,
                item_3_price);
        sberbankPage.openRBSPage();

        new CreateMapElements().mapElements();

    }

}
