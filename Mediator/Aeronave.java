package Mediator;

public class Aeronave {
    private String nome;
    private IMediator torreControle;

    public Aeronave(String nome, IMediator torreControle){
        this.nome = nome;
        this.torreControle = torreControle;
        this.torreControle.registrarAeronave(this);
    }

    public void solicitarAterrissagem(){
        System.out.println(nome + " solicitando aterrissagem");
        torreControle.solicitarAterrissagem(this);
    }

    public void receberSolicitacaoAterrissagem(){
        System.out.println(nome + " recebeu solicitação de aterrissagem");
    }

    public void confirmarAterrissagem(){
        System.out.println(nome + " confirmando aterrissagem");
        torreControle.confirmarAterrissagem(this);
    }

    public void concluirAterrissagem(){
        System.out.println(nome + " concluiu aterrissagem");
    }

    public String getNome() {
        return nome;
    }

    public IMediator getTorreControle() {
        return torreControle;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTorreControle(IMediator torreControle) {
        this.torreControle = torreControle;
    }
}
