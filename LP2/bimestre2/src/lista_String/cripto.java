package lista_String;
import java.util.Scanner;
public class cripto {
    final static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        int n = S.nextInt();
        S.nextLine();
        for (int i = 0; i < n; i++) {
            char[] c = S.nextLine().toCharArray();
            for (int j = 0; j < c.length; j++){ 
                if (c[j]>='a'&&c[j]<='z'||c[j]>='A'&&c[j]<='Z') {
                    c[j] = (char)((int)c[j]+3);
                }
            }
            String sb = new StringBuilder(new String(c)).reverse().toString();
            c = sb.toCharArray();
            for (int j = c.length/2; j < c.length; j++) {
                c[j]=(char)((int)c[j]-1);
            }
            sb = new String(c);
            System.out.println(sb);
            }   
    }
}
