package pages;

import org.openqa.selenium.By;
import pages.BuyWithSberbankPage;
import testManager.CreateGetRequest;
import webdriver.InizializeWebDriver;

public class UrlAreaPage extends InizializeWebDriver {

    public UrlAreaPage executeGetRequest(String amount, String item_1_name, String item_1_quantity, String item_1_amount, String item_1_price,
                                  String item_2_name, String item_2_quantity, String item_2_amount, String item_2_price,
                                  String item_3_name, String item_3_quantity, String item_3_amount, String item_3_price) {
        wd.findElement(By.id("urlTextarea")).clear();
        wd.findElement(By.id("urlTextarea")).sendKeys(new CreateGetRequest().getRequestBuilder(amount, item_1_name, item_1_quantity,
                item_1_amount, item_1_price, item_2_name, item_2_quantity, item_2_amount, item_2_price, item_3_name, item_3_quantity, item_3_amount,
                item_3_price));
        wd.findElement(By.xpath("/html/body/button")).click();
        /**
         * Поставил таймаут для ожидания выполнения Get запроса
         */
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new UrlAreaPage();
    }

    /**
     * Открываем страницу с детализаций заказа
     * @return
     */
    public BuyWithSberbankPage openRBSPage() {

        wd.findElement(By.id("redirectLink")).click();
        return new BuyWithSberbankPage();
    }

}
