package Memento;

import java.util.ArrayList;

public class Player {
    private String character;

    private int health;

    private int damage;

    private int multiplier;

    private ArrayList<String> arsenal;

    public Player(String character){
        this.character = character;
        arsenal = new ArrayList<>();
        defineAttributes();
        multiplier = 1;
    }

    public void displayStatus(){
        System.out.println("Character: " + character);
        System.out.println("Health: " + health);
        System.out.println("Damage: " + damage);
        System.out.println("Multiplier: " + multiplier);
        System.out.println("Arsenal:");
        for(String i : arsenal){
            System.out.println(i);
        }
    }

    public PlayerMemento saveState(){
        return new PlayerMemento(character, health, damage, multiplier, arsenal);
    }

    public void restoreState(PlayerMemento memento){
        character = memento.getCharacter();
        health = memento.getHealth();
        damage = memento.getDamage();
        multiplier = memento.getMultiplier();
        arsenal = memento.getArsenal();
    }

    public void takeDamage(int damage){
        health-=damage;
    }

    public void attack(int damage, Player enemy){
        enemy.takeDamage(damage);
    }

    private void defineAttributes(){
        if(character.equals("Isaac")){
            health = 3;
            damage = 3;
            arsenal.add("D6");
        }
        if(character.equals("Magdalene")){
            health = 4;
            damage = 3;
            arsenal.add("Yum Hearth");
        }
        if(character.equals("Azazel")){
            health = 1;
            damage = 5;
            arsenal.add("Brimstone");
        }
    }

    public void addItem(String item){
        arsenal.add(item);
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

    public void setCharacter(String character) {
        this.character = character;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }

}
