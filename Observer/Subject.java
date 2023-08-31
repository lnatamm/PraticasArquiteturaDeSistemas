package Observer;

import java.util.List;
import java.util.ArrayList;

public class Subject implements ISubject{
    List<Observer> observerList = new ArrayList<>();
    private int flag;
    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer i : observerList){
            i.update();
        }
    }

    public void setFlag(int flag){
        this.flag = flag;
        notifyObservers();
    }

    @Override
    public int getFlag() {
        return flag;
    }
}
