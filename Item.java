package sample;
/********************************************************************
By Jacob V

This is the item class. At the moment, the only member variables is a description
of the item. More member variables can be added later.
********************************************************************/
public class Item {

    private String description;

    //DEFAULT CONSTRUCTOR
    Item(){

        description = "no description";
    }
    //FULL CONSTRUCTOR
    Item(String new_description){

        description = new_description;
    }
    //Returns the description data memeber
    public String getDescription(){ return description; }
}
