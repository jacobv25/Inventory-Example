package sample;

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

    public String getDescription(){ return description; }
}
