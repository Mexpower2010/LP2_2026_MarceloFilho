package lista_String;
import java.util.Scanner;
public class dancante {
    final static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        while (S.hasNext()) {
            char[] tex = S.nextLine().toLowerCase().toCharArray();
            int cont = 0;
            for (int i = 0; i < tex.length; i++) {
                if(Character.isLetter(tex[i])){
                    if (cont%2==0) {
                        tex[i]=Character.toUpperCase(tex[i]);
                    }
                    cont++;
                }
            }
            System.out.println(new String(tex));
        }
    }
}
