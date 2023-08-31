package Strategy;

public class ChoiceConcat implements IChoice{
    @Override
    public void choose(String string1, String string2) {
        System.out.println("You chose concatenate");
        System.out.println("The result of the concatenation is: " + string1 + string2);
    }
}
