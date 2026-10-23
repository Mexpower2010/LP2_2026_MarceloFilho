package prova;
import java.util.*;
public class crtlZ {
    public static final Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        Deque<String> pilha = new ArrayDeque<>();
        boolean conti = true;
        while (conti) {
            System.out.println("Exemplo de execução\n" + //
                                "1 - Digitar texto\n" + //
                                "2 - Desfazer\n" + //
                                "3 - Mostrar histórico\n" + //
                                "0 - Sair");
            int opcao = S.nextInt();
            switch (opcao) {
                case 1:
                    S.nextLine();
                    String tex = S.nextLine();
                    pilha.push(tex);                    
                    break;
                case 2:
                if (!pilha.isEmpty()) {
                    System.out.println(pilha.pop());
                }else{
                    System.out.println("Nada para desfazer!");
                }
                break;
                case 3:
                System.out.println(pilha);
                break;
                case 0:
                    conti = false;
                    break;
                default:
                    break;
            }
            limparTela();
        }
    }
    public static void limparTela() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }
}
