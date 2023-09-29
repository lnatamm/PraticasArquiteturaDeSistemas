package Memento;

import java.util.ArrayList;

public class PlayerMemento {
    private String character;

    private int health;

    private int damage;

    private int multiplier;

    private ArrayList<String> arsenal;

    public PlayerMemento(String character, int health, int damage, int multiplier, ArrayList<String> arsenal) {
        this.character = character;
        this.health = health;
        this.damage = damage;
        this.multiplier = multiplier;
        this.arsenal = arsenal;
    }

    public String getCharacter() {
        return character;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public ArrayList<String> getArsenal() {
        return arsenal;
    }

}