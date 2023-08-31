package Observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer = new Observer(subject);
        Observer observer1 = new Observer(subject);
        subject.setFlag(10);
        subject.setFlag(25);
        subject.setFlag(19);
        subject.unregister(observer1);
        subject.setFlag(2);
    }
}
