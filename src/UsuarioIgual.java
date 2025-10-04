import java.util.Scanner;

public class UsuarioIgual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Usuario*/
        String usuario_test = "Michael Carrillo";
        String usuario = "";

        while (!usuario_test.equals(usuario)) {
            System.out.println("Ingrese su usuario: ");
            usuario = sc.nextLine();
            if (!usuario_test.equals(usuario)) {
                System.out.println("Usuario fallido, intentelo de nuevo.");
            }
        }
        System.out.println("Usuario ingresado con éxito");


        /*
        System.out.println("Ingrese usuario: ");
        usuario = sc.nextLine();
        */
        /*
        if (usuario_test == usuario){
            System.out.println("Usuario correcto.");
        }
        else {
            System.out.println("Usuario incorrecto.");
        }
        */

        /*Contraseña*/
        String contrasena_test = "Contraseña123";
        String contrasena = "";

        while (!contrasena_test.equals(contrasena)) {
            System.out.println("Ingrese su contraseña: ");
            contrasena = sc.nextLine();
            if (!contrasena_test.equals(contrasena)) {
                System.out.println("Contraseña fallida, intentelo de nuevo.");
            }
        }
        System.out.println("Contraseña ingresada correctamente");
    }
}


        /*
        System.out.println("Ingrese contraseña: ");
        contrasena = sc.nextLine();;
        */

        /*
        System.out.println(contrasena.equals(contrasena_test));
        System.out.println(usuario.equals(usuario_test));
        */

        /*
        if (contrasena == contrasena_test){
            System.out.println("Contraseña correcta.");
        }
        else {
            System.out.println("Contraseña incorrect.");
        }
        */