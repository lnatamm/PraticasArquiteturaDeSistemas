package Observer;

public class Observer {
    private ISubject subject;
    public Observer(ISubject subject){
        this.subject = subject;
        this.subject.register(this);
    }
    public void update(){
        System.out.println("Valor de interesse mudou " + subject.getFlag());
    }
}
