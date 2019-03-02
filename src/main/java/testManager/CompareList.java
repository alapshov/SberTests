package testManager;

import dataManager.Item;
import java.util.Comparator;
import java.util.List;

public class CompareList implements Comparator<List<Item>>{


    public int compare(List<Item> o1, List<Item> o2) {
        if(o1.size()==o2.size()){
            for(int i=0; i<o1.size();i++){
               if(o1.get(i).getPositionId()==o2.get(i).getPositionId()){
                   return 1;
               }
            }
        }
        return 0;
    }
}
