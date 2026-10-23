package CriarPersonagemComMVC.src.model;

import java.util.List;

public class Guerreiro extends Personagem {

    public Guerreiro(String nome, Dificuldade dificuldade,
                      List<Habilidade> habilidades, int nivel) {
        super(nome, dificuldade, habilidades, nivel);
    }

    @Override
    public String getClasse() {
        return "Guerreiro";
    }
}