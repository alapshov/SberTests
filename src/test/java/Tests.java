import dataManager.Item;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.UrlAreaPage;
import testManager.CartListCreator;
import webdriver.InizializeWebDriver;

import java.util.ArrayList;
import java.util.List;


public class Tests extends InizializeWebDriver {

    UrlAreaPage urlAreaPage;

    @BeforeMethod
    public void setUp() {

        wd = InizializeWebDriver.initializeChromeDriver("http://81.177.48.233:443/@tools/register.html");
        urlAreaPage = new UrlAreaPage();

    }

    @AfterMethod
    public void tearDown() {
        InizializeWebDriver.quitChromeDriver();
    }

    /**
     * Проверка Amount
     */
    @Test()
    @Parameters({"amount", "measure", "item_1_positionID", "item_1_name", "item_1_quantity", "item_1_amount", "item_1_price",
            "item_2_positionID", "item_2_name", "item_2_quantity", "item_2_amount", "item_2_price",
            "item_3_positionID", "item_3_name", "item_3_quantity", "item_3_amount", "item_3_price"})
    public void checkAmount(String amount, String measure, String item_1_positionID, String item_1_name, String item_1_quantity, String item_1_amount, String item_1_price,
                            String item_2_positionID, String item_2_name, String item_2_quantity, String item_2_amount, String item_2_price,
                            String item_3_positionID, String item_3_name, String item_3_quantity, String item_3_amount, String item_3_price) {
        String expectedAmount = urlAreaPage.executeGetRequest(amount, item_1_name, item_1_quantity,
                item_1_amount, item_1_price, item_2_name, item_2_quantity, item_2_amount, item_2_price, item_3_name, item_3_quantity, item_3_amount,
                item_3_price)
                .openRBSPage()
                .getAmount();

        expectedAmount = expectedAmount.replace(",", "").replace(" ", "");
        Assert.assertEquals(expectedAmount, amount);

    }

    @Test()
    @Parameters({"amount", "measure", "item_1_positionID", "item_1_name", "item_1_quantity", "item_1_amount", "item_1_price",
            "item_2_positionID", "item_2_name", "item_2_quantity", "item_2_amount", "item_2_price",
            "item_3_positionID", "item_3_name", "item_3_quantity", "item_3_amount", "item_3_price"})
    public void checkPositionCart(String amount, String measure, String item_1_positionID, String item_1_name, String item_1_quantity, String item_1_amount, String item_1_price,
                                  String item_2_positionID, String item_2_name, String item_2_quantity, String item_2_amount, String item_2_price,
                                  String item_3_positionID, String item_3_name, String item_3_quantity, String item_3_amount, String item_3_price) {
        List<WebElement> elements = urlAreaPage.executeGetRequest(amount, item_1_name, item_1_quantity,
                item_1_amount, item_1_price, item_2_name, item_2_quantity, item_2_amount, item_2_price, item_3_name, item_3_quantity, item_3_amount,
                item_3_price)
                .openRBSPage()
                .getDetailedElements();
        CartListCreator listCreator = new CartListCreator();
        listCreator.creatCartTestDateList(measure, item_1_positionID, item_1_name, item_1_quantity,
                item_2_positionID, item_2_name, item_2_quantity,
                item_3_positionID, item_3_name, item_3_quantity);
        ArrayList<Item> listTestData = listCreator.getCartTestDataList();
        listCreator.createCartPageList(elements);
        ArrayList<Item> listPageData = listCreator.getCartPageList();


    }

    /**
     * Проверка перехода на страницу авторизации из корзины
     */

    @Test()
    @Parameters({"amount", "measure", "item_1_positionID", "item_1_name", "item_1_quantity", "item_1_amount", "item_1_price",
            "item_2_positionID", "item_2_name", "item_2_quantity", "item_2_amount", "item_2_price",
            "item_3_positionID", "item_3_name", "item_3_quantity", "item_3_amount", "item_3_price"})
    public void checkAutorizationPage(String amount, String measure, String item_1_positionID, String item_1_name, String item_1_quantity, String item_1_amount, String item_1_price,
                                      String item_2_positionID, String item_2_name, String item_2_quantity, String item_2_amount, String item_2_price,
                                      String item_3_positionID, String item_3_name, String item_3_quantity, String item_3_amount, String item_3_price) {
        urlAreaPage.executeGetRequest(amount, item_1_name, item_1_quantity,
                item_1_amount, item_1_price, item_2_name, item_2_quantity, item_2_amount, item_2_price, item_3_name, item_3_quantity, item_3_amount,
                item_3_price)
                .openRBSPage()
                .applyButton()
                .findElementsAutorizationPage();
    }

}
