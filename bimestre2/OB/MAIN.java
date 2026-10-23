package OB;
import java.util.*;
public class MAIN{
    public final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        CLASSE: é um modelo que define as características e comportamentos de um objeto.
        Ela serve como um molde para criar objetos específicos.
        OBJETO: é uma instância de uma classe, representando uma entidade específica
        com suas próprias características (variáveis) e comportamentos (métodos).
        */
        /*
        Atividade fazer varias classes dai brinca usando os metodso dela
         */

        //Cliente
        Cliente eu2 = new Cliente();
        eu2.nome = "sinep";
        eu2.cpf = "numedatuaconta";
        eu2.telefone = "perguntapraminhanamorada";
        //sobrecarga de construtores
        Cliente eu3 = new Cliente("Marcelo", "1331231321", "2342343242");

        //amor n entendi muito bem ela passou varios conceitos sem aprofundar muito,
        //vou deixar alguns desses conceitos aqui pra estuda dps (alguns dos topicos eu q pesquisei)

        //topicos marcelo(m) topicos roberta (r)
        //topicos: sobrecarga de construtores(), associação(r), encapsulamento(r), herança(r), polimorfismo(m),
        //interfaces(m), classes abstratas(r), métodos estáticos(m), coleções(m), exceções(m), generics(m), lambdas(m) e streams(m).
        
    }
}