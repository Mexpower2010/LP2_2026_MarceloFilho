

// Aula sobre Programação Orientada a Objetos (POO)

class Animal {
    // Atributos
    private String nome;
    private int idade;

    // Construtor

    public Animal() {
    }

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para obter o nome
    public String getNome() {
        return nome;
    }

    // Método para obter a idade
    public int getIdade() {
        return idade;
    }

    // Método para fazer o animal falar (abstração)
    public void falar() {
        System.out.println("O animal faz um som.");
    }
}

// Classe Cachorro que herda de Animal
class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    // Sobrescrevendo o método falar (polimorfismo)
    @Override
    public void falar() {
        System.out.println("O cachorro " + getNome() + " diz: Au Au!");
    }
}

// Classe Gato que herda de Animal
class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    // Sobrescrevendo o método falar (polimorfismo)
    @Override
    public void falar() {
        System.out.println("O gato " + getNome() + " diz: Miau!");
    }
}

public class Aula30_07 {
    public static void main(String[] args) {
        // Criando objetos (instâncias) das classes
        Animal cachorro = new Cachorro("Rex", 5);
        Animal gato = new Gato("Mimi", 3);

        // Chamando métodos
        cachorro.falar();
        gato.falar();
    }
}