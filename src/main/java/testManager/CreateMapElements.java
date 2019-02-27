package testManager;
import dataManager.Item;
import org.openqa.selenium.By;
import pages.UrlAreaPage;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;


public class CreateMapElements {

    ArrayList<Item> items = new ArrayList<Item>();
    Item item = new Item();

    public  ArrayList<Item>  mapElements() {

        for (WebElement element : new UrlAreaPage().getDetailedElements()) {
            item.setPositionId(element.findElement(By.className("order-count")).getAttribute("textContent"));
            item.setName(element.findElement(By.className("order-describe")).getAttribute("textContent"));
            item.setQuantity(element.findElement(By.tagName("nobr")).getAttribute("textContent"));
            items.add(item);
        }
        return items;

    }
}
