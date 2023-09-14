package Mediator;

import java.util.ArrayList;
import java.util.List;

public class TorreControle implements IMediator{
    private ArrayList<Aeronave> aeronaves = new ArrayList<>();
    @Override
    public void registrarAeronave(Aeronave aeronave) {
        aeronaves.add(aeronave);
    }

    @Override
    public void solicitarAterrissagem(Aeronave aeronave) {
        for(Aeronave i : aeronaves){
            if(!i.equals(aeronave)){
                i.receberSolicitacaoAterrissagem();
            }
        }
    }

    @Override
    public void confirmarAterrissagem(Aeronave aeronave) {
        aeronave.concluirAterrissagem();
    }
}
