import java.sql.SQLOutput;
import java.util.Scanner;

public class FOR {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        /*TABLA DE MULTIPLICAR*/
        double numero;


        System.out.println("Ingrese un numero: ");
        numero = sc.nextDouble();


        for (int i = 0; i < 11 ; i++) {
            double multiplicacion = i * numero;

            System.out.println("Multiplicacion " +i+ ": "+multiplicacion+ System.lineSeparator());

        }



    }
}
