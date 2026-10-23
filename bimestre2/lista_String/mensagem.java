package lista_String;
import java.util.Scanner;
public class mensagem {
    final static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        int n = S.nextInt();
        S.nextLine();
        for (int i = 0; i < n; i++) {
            char tex [] = S.nextLine().toCharArray();
            boolean emPalavra = false;
            StringBuilder mensagem = new StringBuilder();
            for (int j = 0; j < tex.length; j++) {
                if (Character.isLetter(tex[j])) {
                    if (!emPalavra) {
                        mensagem.append(tex[j]);
                        emPalavra = true;
                    }
                }else{
                    emPalavra = false;
                }
            }
            System.out.println(mensagem);
        }   
    }
}
