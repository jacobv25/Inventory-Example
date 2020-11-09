package sample;

import javafx.scene.paint.Color;
import sample.Inventory;

import sample.Inventory;

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

    public void showInventory(){

        inv.showInventory();
    }

    public void addItemToInventory(Item newItem) {

        inv.addItem(newItem);
    }
}
