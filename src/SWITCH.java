import java.util.Scanner;

public class SWITCH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int elegir;

        while (true) {
            System.out.println("¿Qué deseas hacer?");
            System.out.println("1 : Login");
            System.out.println("2 : Multiplicar");
            System.out.println("3 : Salir");

            elegir = sc.nextInt();
            sc.nextLine();

            switch (elegir) {
                case 1:
                    String usuario_test = "Michael Carrillo";
                    String usuario = "";

                    while (!usuario.equals(usuario_test)) {
                        System.out.println("Ingrese su usuario: ");
                        usuario = sc.nextLine();

                        if (usuario_test.equals(usuario)) {
                            System.out.println("Usuario ingresado con exito.");
                        } else {
                            System.out.println("Usuario fallido intentelo de nuevo.");
                        }
                    }

                    String contrasena_test = "Contraseña123";
                    String contrasena = "";

                    while (!contrasena_test.equals(contrasena)) {
                        System.out.println("Ingrese su contraseña: ");
                        contrasena = sc.nextLine();

                        if (contrasena_test.equals(contrasena)) {
                            System.out.println("Contraseña ingresada con exito.");
                        } else {
                            System.out.println("Contraseña fallida intentelo de nuevo.");
                        }
                    }
                    System.out.println("Login Exitoso");
                    break;

                case 2:
                    int numero;
                    int multiplicacion;

                    System.out.println("Ingrese un numero");
                    numero = sc.nextInt();

                    for (int i = 0; i < 11; i++) {
                        multiplicacion = numero * i;

                        System.out.println("Multiplicacion " + i + " : " + numero + " x " + i + " = " + multiplicacion);
                    }
                    break;

                case 3:
                    System.out.println("Saleindo...");
                    return;

                default:
                    System.out.println("Opción inválida.");
            }

        }
    }
}