import java.util.Scanner;
public class MB_1068 {
    final static public Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        while (S.hasNext()) {
            char[] c = S.next().toCharArray();
            int  qtd1 = 0;
            boolean deuCerto = true;
            for (int i = 0; i < c.length; i++) {
                if (c[i]=='(') {
                    qtd1++;
                }
                if (c[i]==')') {
                    qtd1--;
                    if (qtd1<0) {
                        deuCerto = false;
                        break;
                    } 
                }
            }
            if (deuCerto) {
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
        }
    }
}
