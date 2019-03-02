package testManager;

import dataManager.Item;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CartListCreator {

    private ArrayList<Item> cartPageList = new ArrayList<Item>();
    private ArrayList<Item> cartTestDataList = new ArrayList<Item>();

    public ArrayList<Item> getCartPageList() {
        return cartPageList;
    }

    public ArrayList<Item> getCartTestDataList() {
        return cartTestDataList;
    }

    /**
     * Формирует список детализации корзины со страницы сайта
     */
    public void createCartPageList(List<WebElement> elements) {
        for (WebElement element : elements) {
            cartPageList.add(new Item(element.findElement(By.className("order-count")).getText().replace(".",""),
                    element.findElement(By.className("order-describe")).getText(),
                    element.findElement(By.tagName("nobr")).getText()));
        }

    }

    /**
     * Формирует список детализации корзины с testing XML
     */
    public void creatCartTestDateList(String measure, String item_1_positionID, String item_1_name, String item_1_quantity,
                                                 String item_2_positionID, String item_2_name, String item_2_quantity,
                                                 String item_3_positionID, String item_3_name, String item_3_quantity) {

        cartTestDataList.add(new Item(item_1_positionID, item_1_name, item_1_quantity + " " + measure));
        cartTestDataList.add(new Item(item_2_positionID, item_2_name, item_2_quantity + " " + measure));
        cartTestDataList.add(new Item(item_3_positionID, item_3_name, item_3_quantity + " " + measure));

    }
}
