package CriarPersonagemComMVC.src.model;

import java.util.List;

public abstract class Personagem {

    private String nome;
    private Dificuldade dificuldade;
    private List<Habilidade> habilidades;
    private int nivel;

    public Personagem(String nome, Dificuldade dificuldade,
                       List<Habilidade> habilidades, int nivel) {
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.habilidades = habilidades;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public Dificuldade getDificuldade() {
        return dificuldade;
    }

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

    public int getNivel() {
        return nivel;
    }

    // Cada subclasse define sua própria classe/título
    public abstract String getClasse();

    private String listarHabilidades() {
        StringBuilder sb = new StringBuilder();
        for (Habilidade h : habilidades) {
            sb.append(h.getNome()).append(", ");
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 2);
        }
        return sb.toString();
    }

    public String gerarResumo() {
        StringBuilder resumo = new StringBuilder();
        resumo.append("★ PERSONAGEM CRIADO ★\n");
        resumo.append("----\n\n");
        resumo.append("Nome: ").append(nome).append("\n\n");
        resumo.append("Classe: ").append(getClasse()).append("\n\n");
        resumo.append("Dificuldade: ").append(dificuldade).append("\n\n");
        resumo.append("Habilidades: ").append(listarHabilidades()).append("\n\n");
        resumo.append("Nível inicial: ").append(nivel).append("\n\n");
        resumo.append("----");
        return resumo.toString();
    }
}