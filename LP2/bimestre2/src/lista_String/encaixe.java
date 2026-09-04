package lista_String;
import java.util.Scanner;
public class encaixe     {
    final static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        int n = S.nextInt();
        for (int i = 0; i < n; i++) {
            String numA = S.next();
            String numB = S.next();
            if (numA.length()>=numB.length()) {
                if (numA.endsWith(numB)) {
                    System.out.println("encaixa");
                }else{
                    System.out.println("nao encaixa");
                }
            }else{
                    System.out.println("nao encaixa");
            }
        }   
    }
}
