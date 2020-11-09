package sample;
/***********************************************************************
By Jacob Valenzuela

This is the driver that starts the game.
***********************************************************************/
public class Game {

    public static void main(String[] args) {

        System.out.println("Game Starting!");

        Player player1 = new Player();

        player1.showInventory(); //It's gonna show nothing because it's empty

        Item battle_axe = new Item("A mighty battle axe.");
        player1.addItemToInventory(battle_axe);

        player1.showInventory();//Now it should show a new battle axe

        System.out.println("Game has ended.");
    }
}
