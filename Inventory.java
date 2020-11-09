package sample;

import java.util.ArrayList;
import java.util.List;
/***********************************************************************************
By Jacob Valenzuela

This is the inventory class for the player. The inventory is implemented using an 
Array List. 
************************************************************************************/
public class Inventory {

    List<Item> items;
    //*********Constructor************
    public Inventory(){
        items = new ArrayList<>();
    }
    /********************************************************
    Displays the inventory Array List and prints it to screen
    **********************************************************/
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
    /******************************************************
    Adds an Item object to the inventory Array List
    *******************************************************/
    public void addItem(Item newItem) {

        items.add(newItem);
    }
}
