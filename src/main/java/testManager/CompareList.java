package testManager;

import dataManager.Item;

import java.util.Comparator;
import java.util.List;

public class CompareList implements Comparator<List<Item>> {


    public int compare(List<Item> o1, List<Item> o2) {
        int flag = 0;
        if (o1.size() == o2.size()) {
            for (int i = 0; i < o1.size(); i++) {
                if (o1.get(i).getPositionId().contains(o2.get(i).getPositionId()) &
                        o1.get(i).getName().contains(o2.get(i).getName()) &
                        o1.get(i).getQuantity().contains(o2.get(i).getQuantity())) {
                    flag = 1;
                }
                else flag = 0;
            }
        }
        else flag = 0;
        return flag;
    }
}
