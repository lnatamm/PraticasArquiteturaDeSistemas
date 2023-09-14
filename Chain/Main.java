package Chain;

public class Main {
    public static void main(String[] args) {

        AbstractHandler suportLevel1 = new SuportLevel1();
        AbstractHandler suportLevel2 = new SuportLevel2();
        AbstractHandler suportLevel3 = new SuportLevel3();
        suportLevel1.setNextHandler(suportLevel2);
        suportLevel2.setNextHandler(suportLevel3);

        suportLevel1.processRequisition("Simple");
        suportLevel1.processRequisition("Medium");
        suportLevel1.processRequisition("Complex");

    }
}