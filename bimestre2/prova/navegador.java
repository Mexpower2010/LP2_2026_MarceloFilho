package prova;
import java.util.*;
public class navegador {

    public static final Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        Deque<String> pilha = new ArrayDeque<>();
        boolean continuar = true;
        while (continuar) {
            System.out.println("1 - Abrir página\n" + 
                                "2 - Voltar página\n" + 
                                "3 - Mostrar histórico\n" + 
                                "4 - Adicionar download\n" + 
                                "5 - Processar download\n" + 
                                "6 - Mostrar downloads\n" + 
                                "0 - Sair\n" + 
                                "");
            int o = S.nextInt();
            switch (o) {
                case 1:
                    System.out.println("digite url");
                    pilha.push(S.next());
                    break;
                case 2:
                    if (!pilha.isEmpty()) {
                        pilha.pop();
                        System.out.println("Voce esta na URL: "+ pilha.peek());
                    }else{
                        System.out.println("não há paginas antes dessa");
                    }
                    break;
                case 3:
                    System.out.println(pilha);
                    break;
                case 4:
                    System.out.println("informe o Downlode");
                    String player = S.next();
                    fila.offer(player);
                    break;
                case 5:
                    fila.poll();
                    break;
                case 6:
                    System.out.println(fila);
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    break;
            }
        }
        
    }
    
}