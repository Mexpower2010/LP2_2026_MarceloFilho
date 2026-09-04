import java.util.Scanner;
import java.util.Arrays;
public class MB_1179 {
    public final static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        int vPar[] = new int[5];
        int vImpar[] = new int[5];
        int iPar = 0;
        int iImpar = 0;
        for (int i = 0; i < 15; i++) {
            int num = S.nextInt();
            if (num%2==0) {
                if (iPar<=4) {
                    vPar[iPar] = num;
                    iPar++;
                }else{
                    imprimirV(vPar, "par");
                    Arrays.fill(vPar, 0);
                    iPar = 0;
                }
            }else{
                if (iImpar<=4) {
                    vImpar[iImpar] = num;
                    iImpar++;
                }else{
                    imprimirV(vImpar, "impar");
                    Arrays.fill(vImpar, 0);
                    iImpar = 0;
                }
            }
        }
        imprimirV(vImpar, "impar");
        imprimirV(vPar, "par");
    }
    public static void imprimirV(int[]v, String paridade) {
        for (int i = 0; i < v.length; i++) {
            if (v[i]!=0) {
                System.out.println(paridade+"["+i+"] = "+v[i]);
            }
        }
    }

}
