import org.testng.annotations.*;
import testManager.CreateGetRequest;
import webdriver.InizializeWebDriver;


public class Tests extends InizializeWebDriver {


    @BeforeClass
    public void setUp() {

        //wd = InizializeWebDriver.initializeChromeDriver("http://81.177.48.233:443/@tools/register.html");

    }

    @AfterClass
    public void tearDown() {
        //nizializeWebDriver.quitChromeDriver();
    }
    @Test()
    @Parameters({"amount", "item_1_price", "item_1_name", "item_1_quantity", "item_2_price", "item_2_name", "item_2_quantity",
            "item_3_price", "item_3_name", "item_3_quantity"})
    public void checkGetRequest(String amount, String item_1_price, String item_1_name, String item_1_quantity,
                                String item_2_price, String item_2_name, String item_2_quantity,
                                String item_3_price, String item_3_name, String item_3_quantity) {
        new CreateGetRequest().getRequestBuilder();
    }

}
