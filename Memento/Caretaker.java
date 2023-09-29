package Memento;

import java.util.Stack;

public class Caretaker {

    private Stack<PlayerMemento> mementos;

    public Caretaker(){
        mementos = new Stack<>();
    }

    public void save(Player player){
        mementos.push(player.saveState());
    }

    public void restore(Player player){
        player.restoreState(mementos.pop());
    }

}
