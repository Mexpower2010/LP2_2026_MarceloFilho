package CriarPersonagem;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Interface extends JFrame {

    private JTextField fieldNome;
    private JComboBox<String> caixaClasses;

    private JRadioButton radioFacil, radioMedio, radioDificil;
    private JCheckBox checkMagia, checkCura, checkFurtividade, checkForca;

    private JSlider sliderNivel;
    private JTextField campoNivel;

    private JTextArea areaResumo;

    public Interface() {
        super("Gerador de Personagem de RPG");
        setSize(1440, 923);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // ---------------- Painel da esquerda ----------------
        JPanel painelCriar = new JPanel();
        painelCriar.setLayout(new GridBagLayout());
        painelCriar.setBorder(BorderFactory.createTitledBorder("Crie seu bixo"));

        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);
        c.anchor = GridBagConstraints.WEST;
        c.fill = GridBagConstraints.HORIZONTAL;

        int linha = 0;

        // nome
        c.gridx = 0; c.gridy = linha; c.gridwidth = 2;
        painelCriar.add(new JLabel("Nome:"), c);

        linha++;
        fieldNome = new JTextField("Linus", 20);
        c.gridx = 0; c.gridy = linha; c.gridwidth = 2;
        painelCriar.add(fieldNome, c);

        // classe
        linha++;
        c.gridx = 0; c.gridy = linha; c.gridwidth = 2;
        painelCriar.add(new JLabel("Classe:"), c);

        linha++;
        String[] classes = {"Programador", "CafeFraco", "VsCodeBugado"};
        caixaClasses = new JComboBox<>(classes);
        c.gridx = 0; c.gridy = linha; c.gridwidth = 2;
        painelCriar.add(caixaClasses, c);

        // dificuldade + habilidades lado a lado
        JPanel painelDificuldade = new JPanel();
        painelDificuldade.setLayout(new GridLayout(0, 1, 3, 3));
        painelDificuldade.setBorder(BorderFactory.createTitledBorder("Nível de dificuldade"));

        radioFacil = new JRadioButton("Fácil");
        radioMedio = new JRadioButton("Médio");
        radioDificil = new JRadioButton("Difícil");
        radioFacil.setSelected(true);

        ButtonGroup grupoDificuldade = new ButtonGroup();
        grupoDificuldade.add(radioFacil);
        grupoDificuldade.add(radioMedio);
        grupoDificuldade.add(radioDificil);

        painelDificuldade.add(radioFacil);
        painelDificuldade.add(radioMedio);
        painelDificuldade.add(radioDificil);

        JPanel painelHabilidades = new JPanel();
        painelHabilidades.setLayout(new GridLayout(0, 1, 3, 3));
        painelHabilidades.setBorder(BorderFactory.createTitledBorder("Soft skils"));

        checkMagia = new JCheckBox("tanka patrao");
        checkCura = new JCheckBox("Debuga mentalmente");
        checkFurtividade = new JCheckBox("Faze cafe");
        checkForca = new JCheckBox("Insonia");

        painelHabilidades.add(checkMagia);
        painelHabilidades.add(checkCura);
        painelHabilidades.add(checkFurtividade);
        painelHabilidades.add(checkForca);

        JPanel painelDificuldadeHabilidades = new JPanel();
        painelDificuldadeHabilidades.setLayout(new GridLayout(1, 2, 10, 0));
        painelDificuldadeHabilidades.add(painelDificuldade);
        painelDificuldadeHabilidades.add(painelHabilidades);

        linha++;
        c.gridx = 0; c.gridy = linha; c.gridwidth = 2;
        painelCriar.add(painelDificuldadeHabilidades, c);

        // nivel inicial (label acima, slider + campo pequeno lado a lado)
        linha++;
        c.gridx = 0; c.gridy = linha; c.gridwidth = 2;
        painelCriar.add(new JLabel("Anos de exp:"), c);

        JPanel painelNivel = new JPanel();
        painelNivel.setLayout(new BorderLayout(10, 0));

        sliderNivel = new JSlider(1, 10, 1);
        sliderNivel.setMajorTickSpacing(1);
        sliderNivel.setPaintTicks(true);
        sliderNivel.setPaintLabels(true);

        campoNivel = new JTextField("1", 3);
        campoNivel.setEditable(false);

        sliderNivel.addChangeListener(e -> {
            int nivelAtual = sliderNivel.getValue();
            campoNivel.setText(String.valueOf(nivelAtual));
        });

        painelNivel.add(sliderNivel, BorderLayout.CENTER);
        painelNivel.add(campoNivel, BorderLayout.EAST);

        linha++;
        c.gridx = 0; c.gridy = linha; c.gridwidth = 2;
        painelCriar.add(painelNivel, c);

        // botoes
        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new GridLayout(1, 2, 10, 0));

        JButton botaoCriar = new JButton("Criar Bixo");
        JButton botaoLimpar = new JButton("Limpar");

        painelBotoes.add(botaoCriar);
        painelBotoes.add(botaoLimpar);

        linha++;
        c.gridx = 0; c.gridy = linha; c.gridwidth = 2;
        painelCriar.add(painelBotoes, c);

        // empurra tudo pra cima (sobra de espaço embaixo)
        linha++;
        c.gridx = 0; c.gridy = linha; c.weighty = 1;
        painelCriar.add(new JLabel(), c);

        // ---------------- Painel da direita ----------------
        JPanel painelResumo = new JPanel();
        painelResumo.setLayout(new BorderLayout());
        painelResumo.setBorder(BorderFactory.createTitledBorder("Resumo do azarado"));

        areaResumo = new JTextArea();
        areaResumo.setEditable(false);
        JScrollPane scrollResumo = new JScrollPane(areaResumo);
        painelResumo.add(scrollResumo, BorderLayout.CENTER);

       
        // ---------------- Monta a janela ----------------
        setLayout(new BorderLayout());
        add(painelCriar, BorderLayout.WEST);
        add(painelResumo, BorderLayout.CENTER);

        // ---------------- Ações dos botões ----------------
        botaoCriar.addActionListener(e -> criarPersonagem());
        botaoLimpar.addActionListener(e -> limparCampos());

        setVisible(true);
    }

    private void criarPersonagem() {
        String nome = fieldNome.getText();
        String classe = (String) caixaClasses.getSelectedItem();

        String dificuldade = "";
        if (radioFacil.isSelected()) {
            dificuldade = "Fácil";
        } else if (radioMedio.isSelected()) {
            dificuldade = "Médio";
        } else if (radioDificil.isSelected()) {
            dificuldade = "Difícil";
        }

        StringBuilder habilidades = new StringBuilder();
        if (checkMagia.isSelected()) {
            habilidades.append("Magia, ");
        }
        if (checkCura.isSelected()) {
            habilidades.append("Cura, ");
        }
        if (checkFurtividade.isSelected()) {
            habilidades.append("Furtividade, ");
        }
        if (checkForca.isSelected()) {
            habilidades.append("Força, ");
        }
        if (habilidades.length() > 0) {
            habilidades.setLength(habilidades.length() - 2);
        }

        int nivel = sliderNivel.getValue();

        Personagem personagem = new Personagem(
                nome, classe, dificuldade, habilidades.toString(), nivel);

        areaResumo.setText(personagem.gerarResumo());
    }

    private void limparCampos() {
        fieldNome.setText("");
        caixaClasses.setSelectedIndex(0);
        radioFacil.setSelected(true);
        checkMagia.setSelected(false);
        checkCura.setSelected(false);
        checkFurtividade.setSelected(false);
        checkForca.setSelected(false);
        sliderNivel.setValue(1);
        campoNivel.setText("1");
        areaResumo.setText("");
    }
}