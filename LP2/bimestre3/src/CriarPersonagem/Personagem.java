package CriarPersonagem;

public class Personagem {
    private String nome;
    private String classe;
    private String dificuldade;
    private String habilidades;
    private int nivel;

    public Personagem(String nome, String classe, String dificuldade,
                    String habilidades, int nivel) {
        this.nome = nome;
        this.classe = classe;
        this.dificuldade = dificuldade;
        this.habilidades = habilidades;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public int getNivel() {
        return nivel;
    }

    public String gerarResumo() {
        StringBuilder resumo = new StringBuilder();
        resumo.append("★ BIXO CRIADO ★\n");
        resumo.append("----\n\n");
        resumo.append("Nome: ").append(nome).append("\n\n");
        resumo.append("Classe: ").append(classe).append("\n\n");
        resumo.append("Senioridade: ").append(dificuldade).append("\n\n");
        resumo.append("Soft skills: ").append(habilidades).append("\n\n");
        resumo.append("Anos de exp: ").append(nivel).append("\n\n");
        resumo.append("----");
        return resumo.toString();
    }
}