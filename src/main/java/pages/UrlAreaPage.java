package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webdriver.InizializeWebDriver;
import java.util.List;

public class UrlAreaPage extends InizializeWebDriver {

    private List<WebElement> elements;

    /**
     * Поиск позиций
     * @return
     */
    public List<WebElement> getDetailedElements() {
        elements =  wd.findElements(By.cssSelector(".order-row"));
        int i = elements.size();
        return elements;
    }

    /**
     * Получаем сумму заказа
     * @return
     */
    public String getAmount() {
        return wd.findElement(By.id("amount")).getText();
    }

    public void applyButton() {

    }

}
