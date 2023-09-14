package Mediator;

public interface IMediator {
    void registrarAeronave(Aeronave aeronave);
    void solicitarAterrissagem(Aeronave aeronave);
    void confirmarAterrissagem(Aeronave aeronave);
}
