package pages;

import org.openqa.selenium.By;
import testManager.SelectTab;
import webdriver.InizializeWebDriver;

public class AutorizationPage extends InizializeWebDriver {

    public void findElementsAutorizationPage() {
        new SelectTab().tabSelector(wd);
        wd.findElement(By.id("enterLogin"));
    }
}
