package Observer;

public interface ISubject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();
    int getFlag();
}
