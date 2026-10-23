package lista_String;
import java.util.Scanner;
public class aliteracao {
    final static public Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        while (S.hasNext()) {
            String tex = S.nextLine();
            String palavras [] = tex.split(" ");
            int contI = 0;
            boolean sequencia = false;
            for (int i = 1; i < palavras.length; i++) {
                char lastchar = palavras[i-1].toLowerCase().toCharArray()[0];
                char firstchar = palavras[i].toLowerCase().toCharArray()[0];
                if (lastchar==firstchar) {
                    if (!(sequencia)) {
                    contI++;
                    sequencia = true;    
                    }
                }else{
                    sequencia = false;
                }
            }
            System.out.println(contI);
        }
    }
}
