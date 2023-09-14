package Mediator;

public class Main {
    public static void main(String[] args) {
        IMediator torreControle = new TorreControle();
        Aeronave aviao1 = new Aeronave("Aviao 1", torreControle);
        Aeronave aviao2 = new Aeronave("Aviao 2", torreControle);
        Aeronave aviao3 = new Aeronave("Aviao 3", torreControle);
        Aeronave aviao4 = new Aeronave("Aviao 4", torreControle);
        aviao1.solicitarAterrissagem();
        aviao3.solicitarAterrissagem();
        aviao2.confirmarAterrissagem();
    }
}
