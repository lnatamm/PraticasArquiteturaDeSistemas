package Strategy;

public class ChoiceSum implements IChoice{
    @Override
    public void choose(String string1, String string2) {
        System.out.println("You chose sum");
        System.out.println("The result of the sum is: " + (Integer.parseInt(string1) + Integer.parseInt(string2)));
    }
}