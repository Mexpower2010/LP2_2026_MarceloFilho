package CriarPersonagemComMVC.src.controller;

import java.util.ArrayList;
import java.util.List;
import CriarPersonagemComMVC.src.model.Dificuldade;
import CriarPersonagemComMVC.src.model.Habilidade;
import CriarPersonagemComMVC.src.model.Personagem;
import CriarPersonagemComMVC.src.model.Mago;
import CriarPersonagemComMVC.src.model.Guerreiro;
import CriarPersonagemComMVC.src.model.Arqueiro;
import CriarPersonagemComMVC.src.view.Interface;

public class PersonagemController {

    private final Interface view;
    // Exigência: manter cadastros em memória com ArrayList<Personagem>
    private final List<Personagem> personagens;

    public PersonagemController(Interface view) {
        this.view = view;
        this.personagens = new ArrayList<>();
        vincularEventos();
    }

    private void vincularEventos() {
        view.getBotaoCriar().addActionListener(e -> criarPersonagem());
        view.getBotaoLimpar().addActionListener(e -> limparFormulario());
    }

    private void criarPersonagem() {
        String nome = view.getNome();
        String difTexto = view.getDificuldadeSelecionada();
        List<String> nomesHabilidades = view.getNomesHabilidadesSelecionadas();
        String classe = view.getClasseSelecionada();
        int nivel = view.getNivel();

        // 1. Validações com JOptionPane
        if (nome == null || nome.trim().isEmpty()) {
            view.exibirMensagemErro("O nome do personagem é obrigatório e não pode conter apenas espaços.");
            return;
        }

        if (difTexto == null) {
            view.exibirMensagemErro("Selecione um nível de dificuldade.");
            return;
        }

        if (nomesHabilidades.isEmpty()) {
            view.exibirMensagemErro("Selecione ao menos uma habilidade.");
            return;
        }

        // 2. Mapeamento para o Enum Dificuldade
        Dificuldade dificuldade;
        if (difTexto.equalsIgnoreCase("Fácil")) {
            dificuldade = Dificuldade.FACIL;
        } else if (difTexto.equalsIgnoreCase("Médio")) {
            dificuldade = Dificuldade.MEDIO;
        } else {
            dificuldade = Dificuldade.DIFICIL;
        }

        // 3. Associação com a classe Habilidade
        List<Habilidade> habilidades = new ArrayList<>();
        for (String nomeHab : nomesHabilidades) {
            habilidades.add(new Habilidade(nomeHab));
        }

        // 4. Aplicação de Polimorfismo e Herança
        Personagem personagem;
        switch (classe) {
            case "Mago":
                personagem = new Mago(nome.trim(), dificuldade, habilidades, nivel);
                break;
            case "Guerreiro":
                personagem = new Guerreiro(nome.trim(), dificuldade, habilidades, nivel);
                break;
            case "Arqueiro":
                personagem = new Arqueiro(nome.trim(), dificuldade, habilidades, nivel);
                break;
            default:
                personagem = new Guerreiro(nome.trim(), dificuldade, habilidades, nivel);
                break;
        }

        // 5. Armazena na lista em memória
        personagens.add(personagem);

        // 6. Atualiza o resumo na View
        view.exibirResumo(personagem.gerarResumo());
    }

    private void limparFormulario() {
        // Limpa a tela, mas preserva a lista 'personagens' intacta
        view.limparFormulario();
    }

    public List<Personagem> getPersonagens() {
        return personagens;
    }
}