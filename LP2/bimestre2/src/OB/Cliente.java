package OB;

public class Cliente {
    String nome;
    String cpf;
    String telefone;
    //sobrecarga de construtores: se n definir um metodo construtor fica auto no nomal (sem nada nos 
    //parenteses) se vc definir se precisa fazer oq se quer + o padrao:)
    public Cliente(){

    }
    public Cliente(String name, String cpf, String telefone){
        this.nome = name;
        this.cpf = cpf;
        this.telefone = telefone;
    }
}
