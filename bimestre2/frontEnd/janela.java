package frontEnd;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class janela {
    public static void main(String[] args) {    
    JFrame janela = new JFrame("Cadastro");
    JPanel painel = new JPanel();
    painel.setLayout(new GridLayout(4,2));
    JLabel lNome = new JLabel("Nome");
    JTextField campoNome = new JTextField();
    JLabel lEmail = new JLabel("Email");
    JTextField campoEmail = new JTextField();
    JButton btLimpa = new JButton("mogador de betas");
    JButton btSair = new JButton("Desista Beta");

    painel.add(lNome);
    painel.add(campoNome);
    painel.add(lEmail);
    painel.add(campoEmail);
    painel.add(btLimpa);
    painel.add(btSair);

    btLimpa.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            limparTela(campoNome,campoEmail);
        }
        
    });

    btSair.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    });

    janela.add(painel);
    janela.setSize(600,300);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janela.setLocationRelativeTo(null);
    janela.setVisible(true);
    }   
    public static void limparTela(JTextField nome, JTextField email) {
        nome.setText("**");
        email.setText("***");
        nome.requestFocus();
    }
}
