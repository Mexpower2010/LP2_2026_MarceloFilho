package lista_String;
import java.util.Scanner;
public class cifraCesariana {
    public final static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            char[] c = s.next().toCharArray();
            int k = s.nextInt();
            sb.setLength(0);
            for (int j = 0; j < c.length; j++) {
                c[j] = (char)(((((int)c[j] - 65)+k)%26)+65);
                sb.append(c[j]);
            }
            System.out.println(sb);
        }
    }
}
