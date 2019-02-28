package testManager;

import org.openqa.selenium.WebDriver;
import pages.BuyWithSberbankPage;

import java.util.ArrayList;

public class SelectTab {

    /**
     * Получаем все открытые вкладки
     * @return
     */
    private ArrayList<String> getTabs(WebDriver wd){
        return new ArrayList<String>(wd.getWindowHandles());
    }

    /**
     *Переключение на новую вкладку
     */
    public BuyWithSberbankPage tabSelector(WebDriver wd){
        wd.switchTo().window(getTabs(wd).get(getTabs(wd).size()-1));
        return new BuyWithSberbankPage();
    }
}
