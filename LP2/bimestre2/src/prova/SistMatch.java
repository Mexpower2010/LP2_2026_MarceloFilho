package prova;
import java.util.*;
public class SistMatch {

    public static final Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        boolean continua = true;
        while (continua) {
            System.out.println("1 - Entrar jogador\n" + 
                                "2 - Atender jogador\n" + 
                                "3 - Mostrar fila\n" + 
                                "0 - Sair\n"+
                                "players em espera: "+mostraQtdFila(fila));
            int opcao = S.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("informe o nome do meliante que devia ta estudando");
                    String player = S.next();
                    addPlayer(fila, player);
                    break;
                case 2:
                    AtenderPlayer(fila);
                    break;
                case 3:
                    mostraFila(fila);
                    break;
                case 0:
                    continua = false;
                    break;
                default:
                    break;
            }
        }

    }
    public static int mostraQtdFila(Queue<String> fila) {
        return fila.size();
    }
    public static Queue<String> mostraFila(Queue<String> fila) {
        System.out.println(fila);
        return fila;
    }
    public static Queue<String> AtenderPlayer(Queue<String> fila) {
        if (fila.peek()==null) {
            System.out.println("fila vazia");
        }else{
            fila.poll();
        }
        return fila;
    }
    public static Queue<String> addPlayer(Queue<String> fila, String Player) {
        fila.add(Player);
        System.out.println("Player adicionado com sucesso");
        return fila;
    }
}