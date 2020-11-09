package sample;

import javafx.scene.paint.Color;
import sample.Inventory;
import sample.Inventory;
/******************************************************************************
By Jacobo V

The Player class
******************************************************************************/

public class Player {

    private String name;
    private int level;
    //private Color color;
    private Inventory inv;

    Player(){
        name = "jacob";
        level = 1;
        inv = new Inventory();
    }
    /**************************************
    Displays the player's inventory
    *************************************/
    public void showInventory(){

        inv.showInventory();
    }
    /******************************************
    Adds an item to the players inventory
    Param: newItem - The Item object to be added.
    *****************************************/
    public void addItemToInventory(Item newItem) {

        inv.addItem(newItem);
    }
}
