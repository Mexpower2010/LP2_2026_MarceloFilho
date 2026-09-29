package CriarPersonagemComMVC.src.model;

public class Habilidade {

    private final String nome;

    public Habilidade(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}