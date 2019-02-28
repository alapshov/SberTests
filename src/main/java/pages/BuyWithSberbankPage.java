package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import testManager.SelectTab;
import webdriver.InizializeWebDriver;
import java.util.List;

public class BuyWithSberbankPage extends InizializeWebDriver {

    private List<WebElement> elements;
    private SelectTab selectTab = new SelectTab();


    /**
     * Поиск позиций
     *
     * @return
     */
    public List<WebElement> getDetailedElements() {
        elements = wd.findElements(By.cssSelector(".order-row"));
        int i = elements.size();
        return elements;
    }

    /**
     * Получаем сумму заказа
     *
     * @return
     */
    public String getAmount() {
        selectTab.tabSelector(wd);
        return wd.findElement(By.xpath("//*[@id=\"amount\"]")).getText();
    }

    /**
     * Клик по кнопке подать заявку через сбербанк онлайн
     */
    public AutorizationPage applyButton() {
        selectTab.tabSelector(wd);
        wd.findElement(By.xpath("/html/body/div[2]/div[2]/button")).click();
        return new AutorizationPage();
    }

}
