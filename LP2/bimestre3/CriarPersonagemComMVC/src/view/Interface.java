package CriarPersonagemComMVC.src.view;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class Interface extends JFrame {

    private JTextField fieldNome;
    private JComboBox<String> caixaClasses;
    private JRadioButton radioFacil, radioMedio, radioDificil;
    private ButtonGroup grupoDificuldade;
    private JCheckBox checkMagia, checkCura, checkFurtividade, checkForca;
    private JSlider sliderNivel;
    private JTextField campoNivel;
    private JTextArea areaResumo;
    private JButton botaoCriar, botaoLimpar;

    public Interface() {
        super("Gerador de Personagem de RPG");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Montagem dos painéis (sua estrutura atual)
        JPanel painelCriar = new JPanel(new GridBagLayout());
        painelCriar.setBorder(BorderFactory.createTitledBorder("Crie seu personagem"));
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);
        c.fill = GridBagConstraints.HORIZONTAL;

        int linha = 0;
        c.gridx = 0; c.gridy = linha; c.gridwidth = 2;
        painelCriar.add(new JLabel("Nome:"), c);

        linha++;
        fieldNome = new JTextField(20);
        c.gridx = 0; c.gridy = linha;
        painelCriar.add(fieldNome, c);

        linha++;
        painelCriar.add(new JLabel("Classe:"), c);

        linha++;
        String[] classes = {"Mago", "Guerreiro", "Arqueiro"};
        caixaClasses = new JComboBox<>(classes);
        c.gridx = 0; c.gridy = linha;
        painelCriar.add(caixaClasses, c);

        // Dificuldade e Habilidades
        JPanel painelDificuldade = new JPanel(new GridLayout(0, 1, 3, 3));
        painelDificuldade.setBorder(BorderFactory.createTitledBorder("Nível de dificuldade"));
        radioFacil = new JRadioButton("Fácil");
        radioMedio = new JRadioButton("Médio");
        radioDificil = new JRadioButton("Difícil");
        grupoDificuldade = new ButtonGroup();
        grupoDificuldade.add(radioFacil);
        grupoDificuldade.add(radioMedio);
        grupoDificuldade.add(radioDificil);
        painelDificuldade.add(radioFacil);
        painelDificuldade.add(radioMedio);
        painelDificuldade.add(radioDificil);

        JPanel painelHabilidades = new JPanel(new GridLayout(0, 1, 3, 3));
        painelHabilidades.setBorder(BorderFactory.createTitledBorder("Habilidades"));
        checkMagia = new JCheckBox("Magia");
        checkCura = new JCheckBox("Cura");
        checkFurtividade = new JCheckBox("Furtividade");
        checkForca = new JCheckBox("Força");
        painelHabilidades.add(checkMagia);
        painelHabilidades.add(checkCura);
        painelHabilidades.add(checkFurtividade);
        painelHabilidades.add(checkForca);

        JPanel painelMeio = new JPanel(new GridLayout(1, 2, 10, 0));
        painelMeio.add(painelDificuldade);
        painelMeio.add(painelHabilidades);

        linha++;
        c.gridx = 0; c.gridy = linha;
        painelCriar.add(painelMeio, c);

        // Nível / Slider
        linha++;
        c.gridx = 0; c.gridy = linha;
        painelCriar.add(new JLabel("Nível inicial:"), c);

        JPanel painelNivel = new JPanel(new BorderLayout(10, 0));
        sliderNivel = new JSlider(1, 10, 1);
        sliderNivel.setMajorTickSpacing(1);
        sliderNivel.setPaintTicks(true);
        sliderNivel.setPaintLabels(true);
        campoNivel = new JTextField("1", 3);
        campoNivel.setEditable(false);
        sliderNivel.addChangeListener(e -> campoNivel.setText(String.valueOf(sliderNivel.getValue())));

        painelNivel.add(sliderNivel, BorderLayout.CENTER);
        painelNivel.add(campoNivel, BorderLayout.EAST);

        linha++;
        c.gridx = 0; c.gridy = linha;
        painelCriar.add(painelNivel, c);

        // Botões
        JPanel painelBotoes = new JPanel(new GridLayout(1, 2, 10, 0));
        botaoCriar = new JButton("Criar Personagem");
        botaoLimpar = new JButton("Limpar");
        painelBotoes.add(botaoCriar);
        painelBotoes.add(botaoLimpar);

        linha++;
        c.gridx = 0; c.gridy = linha;
        painelCriar.add(painelBotoes, c);

        // Painel Resumo
        JPanel painelResumo = new JPanel(new BorderLayout());
        painelResumo.setBorder(BorderFactory.createTitledBorder("Resumo do personagem"));
        areaResumo = new JTextArea();
        areaResumo.setEditable(false);
        painelResumo.add(new JScrollPane(areaResumo), BorderLayout.CENTER);

        setLayout(new BorderLayout());
        add(painelCriar, BorderLayout.WEST);
        add(painelResumo, BorderLayout.CENTER);
        // Sem setVisible(true) aqui!
    }

    // Métodos para o Controller ler os dados
    public String getNome() {
        return fieldNome.getText();
    }

    public String getClasseSelecionada() {
        return (String) caixaClasses.getSelectedItem();
    }

    public String getDificuldadeSelecionada() {
        if (radioFacil.isSelected()) return "Fácil";
        if (radioMedio.isSelected()) return "Médio";
        if (radioDificil.isSelected()) return "Difícil";
        return null;
    }

    public List<String> getNomesHabilidadesSelecionadas() {
        List<String> lista = new ArrayList<>();
        if (checkMagia.isSelected()) lista.add("Magia");
        if (checkCura.isSelected()) lista.add("Cura");
        if (checkFurtividade.isSelected()) lista.add("Furtividade");
        if (checkForca.isSelected()) lista.add("Força");
        return lista;
    }

    public int getNivel() {
        return sliderNivel.getValue();
    }

    public JButton getBotaoCriar() {
        return botaoCriar;
    }

    public JButton getBotaoLimpar() {
        return botaoLimpar;
    }

    // Métodos para o Controller alterar o visual
    public void exibirResumo(String resumo) {
        areaResumo.setText(resumo);
    }

    public void exibirMensagemErro(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem, "Aviso", JOptionPane.WARNING_MESSAGE);
    }

    public void limparFormulario() {
        fieldNome.setText("");
        caixaClasses.setSelectedIndex(0);
        grupoDificuldade.clearSelection();
        checkMagia.setSelected(false);
        checkCura.setSelected(false);
        checkFurtividade.setSelected(false);
        checkForca.setSelected(false);
        sliderNivel.setValue(1);
        campoNivel.setText("1");
        areaResumo.setText("");
    }
}