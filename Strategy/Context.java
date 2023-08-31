package Strategy;

public class Context {
    private IChoice myChoice;
    public void setChoice(IChoice myChoice){
        this.myChoice = myChoice;
    }
    public void showChoice(String string1, String string2){
        myChoice.choose(string1, string2);
    }
}
