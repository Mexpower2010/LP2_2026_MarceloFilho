package lista_String;
import java.util.Scanner;
public class irmao     {
    final static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        int n = S.nextInt();
        for (int i = 0; i < n; i++) {
            String num = S.next();
            if (num.length()==5) {
                System.out.println("3");
            }else{
                if (contarDiff(num, "two")>1) {
                    System.out.println("1");
                }else{
                    System.out.println("2");
                }
            }
        }   
    }
    public static int contarDiff(String palavra1, String palavra2) {
        int qtdDiff = 0;
            for (int j = 0; j < 3; j++) {
                if (palavra1.charAt(j)!=palavra2.charAt(j)) {
                        qtdDiff++;
                    }
            }
        return qtdDiff;
    }
}
