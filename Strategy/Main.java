package Strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Strategy ***");
        IChoice choice;
        Context context = new Context();
        String input1, input2;
        int operation;
        while (true) {
            choice = null;
            System.out.print("Input a value: ");
            input1 = sc.nextLine();
            System.out.print("Input a value: ");
            input2 = sc.nextLine();
            System.out.println("Type your choide: 1-Concatenate | 2-Sum");
            operation = Integer.parseInt(sc.nextLine());
            switch (operation) {
                case 1:
                    choice = new ChoiceConcat();
                    break;
                case 2:
                    choice = new ChoiceSum();
                    break;
                default:
                    break;
            }
            context.setChoice(choice);
            try {
                context.showChoice(input1, input2);
            }
            catch (NullPointerException e){

            }
            System.out.println("*** Pattern End ***");
        }
    }
}
