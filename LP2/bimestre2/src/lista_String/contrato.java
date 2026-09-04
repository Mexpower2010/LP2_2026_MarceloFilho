package lista_String;
import java.util.Scanner;
public class contrato {
    public final static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        while (true){
            String d = s.next();
            String a = s.next();
            if (d.equals("0") && a.equals("0")) {
                break;
            }
            a.replace(d, "");
            a.replaceFirst("^0+", "");
            if(a.isEmpty()){
                System.out.println("0");
            }else{
                System.out.println(a);
            }

        }
    }
}
