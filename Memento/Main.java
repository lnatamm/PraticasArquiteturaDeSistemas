package Memento;

public class Main {
    public static void main(String[] args) {

        Caretaker saveManager = new Caretaker();
        Player player = new Player("Isaac");
        player.takeDamage(1);
        saveManager.save(player);

        /*Caretaker saveManager1 = new Caretaker();
        Caretaker saveManager2 = new Caretaker();
        Player player1 = new Player("Isaac");
        Player player2 = new Player("Magdalene");
        player1.addItem("Brimstone");
        player1.addItem("Sacred Hearth");
        player1.displayStatus();
        player2.displayStatus();
        saveManager1.save(player1);
        saveManager2.save(player2);
        player1.takeDamage(1);
        player2.addItem("Brimstone");
        player1.attack(1, player2);
        player1.displayStatus();
        player2.displayStatus();
        saveManager1.save(player1);
        saveManager2.save(player2);
        player1.takeDamage(1);
        player2.takeDamage(1);
        player1.attack(1, player2);
        player1.addItem("Magic Mushroom");
        player1.displayStatus();
        player2.displayStatus();
        saveManager1.restore(player1);
        saveManager2.restore(player2);
        player1.displayStatus();
        player2.displayStatus();
        saveManager1.restore(player1);
        saveManager2.restore(player2);
        player1.displayStatus();
        player2.displayStatus();*/
    }
}
