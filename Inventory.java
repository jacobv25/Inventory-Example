package sample;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    List<Item> items;

    public Inventory(){
        items = new ArrayList<>();
    }

    public void showInventory(){

        System.out.println("Checking inventory...");

        if(items.isEmpty()){//Check if player has no items

            System.out.println("You have no items.");
        }
        else{
            for (Item element: items){

                System.out.println(element.getDescription());
            }
        }
    }

    public void addItem(Item newItem) {

        items.add(newItem);
    }
}
