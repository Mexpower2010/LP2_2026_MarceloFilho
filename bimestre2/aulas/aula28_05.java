package aulas;
import java.util.*;

/*
    DEMONSTRAÇÃO COMPLETA DAS ESTRUTURAS
    E CONCEITOS IMPORTANTES EM JAVA
*/

public class aula28_05 {

    public static void main(String[] args) {

        // =====================================================
        // ARRAY
        // =====================================================

        System.out.println("===== ARRAY =====");

        int[] numeros = {10, 20, 30};

        System.out.println(numeros[0]);

        // =====================================================
        // ARRAYLIST
        // =====================================================

        System.out.println("\n===== ARRAYLIST =====");

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Marcelo");
        nomes.add("Ana");
        nomes.add("Carlos");

        System.out.println("Primeiro nome: " + nomes.get(0));

        nomes.set(1, "Julia");

        nomes.remove("Carlos");

        System.out.println("Lista:");
        for(String nome : nomes) {
            System.out.println(nome);
        }

        // =====================================================
        // LINKEDLIST
        // =====================================================

        System.out.println("\n===== LINKEDLIST =====");

        LinkedList<Integer> listaLigada = new LinkedList<>();

        listaLigada.add(100);
        listaLigada.add(200);
        listaLigada.addFirst(50);

        for(Integer n : listaLigada) {
            System.out.println(n);
        }

        // =====================================================
        // STACK (PILHA)
        // =====================================================

        System.out.println("\n===== STACK =====");

        Stack<Integer> pilha = new Stack<>();

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Topo: " + pilha.peek());

        System.out.println("Removendo: " + pilha.pop());

        System.out.println("Novo topo: " + pilha.peek());

        // =====================================================
        // DEQUE COMO PILHA MODERNA
        // =====================================================

        System.out.println("\n===== DEQUE COMO PILHA =====");

        Deque<Integer> pilhaModerna = new ArrayDeque<>();

        pilhaModerna.push(1);
        pilhaModerna.push(2);
        pilhaModerna.push(3);

        System.out.println(pilhaModerna.pop());

        // =====================================================
        // QUEUE (FILA)
        // =====================================================

        System.out.println("\n===== QUEUE =====");

        Queue<String> fila = new LinkedList<>();

        fila.add("João");
        fila.add("Maria");
        fila.add("Pedro");

        System.out.println("Primeiro: " + fila.peek());

        System.out.println("Removido: " + fila.poll());

        System.out.println("Novo primeiro: " + fila.peek());

        // =====================================================
        // DEQUE
        // =====================================================

        System.out.println("\n===== DEQUE =====");

        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("Inicio");
        deque.addLast("Fim");

        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());

        // =====================================================
        // VECTOR
        // =====================================================

        System.out.println("\n===== VECTOR =====");

        Vector<Integer> vetor = new Vector<>();

        vetor.add(10);
        vetor.add(20);

        for(Integer v : vetor) {
            System.out.println(v);
        }

        // =====================================================
        // HASHMAP
        // =====================================================

        System.out.println("\n===== HASHMAP =====");

        HashMap<String, Integer> idades = new HashMap<>();

        idades.put("Marcelo", 20);
        idades.put("Ana", 25);

        System.out.println("Idade Marcelo: " + idades.get("Marcelo"));

        for(String chave : idades.keySet()) {
            System.out.println(chave + " -> " + idades.get(chave));
        }

        // =====================================================
        // HASHSET
        // =====================================================

        System.out.println("\n===== HASHSET =====");

        HashSet<Integer> numerosUnicos = new HashSet<>();

        numerosUnicos.add(10);
        numerosUnicos.add(10);
        numerosUnicos.add(20);

        System.out.println(numerosUnicos);

        // =====================================================
        // TREESET
        // =====================================================

        System.out.println("\n===== TREESET =====");

        TreeSet<Integer> ordenados = new TreeSet<>();

        ordenados.add(30);
        ordenados.add(10);
        ordenados.add(20);

        System.out.println(ordenados);

        // =====================================================
        // PRIORITYQUEUE
        // =====================================================

        System.out.println("\n===== PRIORITYQUEUE =====");

        PriorityQueue<Integer> prioridade = new PriorityQueue<>();

        prioridade.add(50);
        prioridade.add(10);
        prioridade.add(30);

        System.out.println(prioridade.poll());

        // =====================================================
        // ITERATOR
        // =====================================================

        System.out.println("\n===== ITERATOR =====");

        Iterator<String> iterator = nomes.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // =====================================================
        // GENERICS
        // =====================================================

        System.out.println("\n===== GENERICS =====");

        ArrayList<Double> notas = new ArrayList<>();

        notas.add(8.5);
        notas.add(9.0);

        for(Double nota : notas) {
            System.out.println(nota);
        }

        // =====================================================
        // COMPARABLE
        // =====================================================

        System.out.println("\n===== COMPARABLE =====");

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Carlos", 30));
        pessoas.add(new Pessoa("Ana", 20));
        pessoas.add(new Pessoa("Marcelo", 25));

        Collections.sort(pessoas);

        for(Pessoa p : pessoas) {
            System.out.println(p.nome + " - " + p.idade);
        }

        // =====================================================
        // COMPARATOR
        // =====================================================

        System.out.println("\n===== COMPARATOR =====");

        pessoas.sort(new ComparatorNome());

        for(Pessoa p : pessoas) {
            System.out.println(p.nome + " - " + p.idade);
        }


        // =====================================================
        // CONTAINS / SIZE / CLEAR
        // =====================================================

        System.out.println("\n===== OUTROS MÉTODOS =====");

        System.out.println("Contém Marcelo? " + nomes.contains("Marcelo"));

        System.out.println("Tamanho: " + nomes.size());

        nomes.clear();

        System.out.println("Lista limpa: " + nomes);

        // =====================================================
        // FIM
        // =====================================================

        System.out.println("\n===== FIM DO PROGRAMA =====");
    }
}

// =====================================================
// COMPARABLE
// =====================================================

class Pessoa implements Comparable<Pessoa> {

    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {

        // ORDENA POR IDADE
        return this.idade - outraPessoa.idade;
    }
}

// =====================================================
// COMPARATOR
// =====================================================

class ComparatorNome implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {

        // ORDENA POR NOME
        return p1.nome.compareTo(p2.nome);
    }
}