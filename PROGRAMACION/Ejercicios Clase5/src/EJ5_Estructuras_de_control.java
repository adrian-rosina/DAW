import java.util.Scanner;

public class EJ5_Estructuras_de_control {
    //Ejercicio 5: Uso de do-while para pedir contraseña
    //📌 Objetivo: Pedir una contraseña y no permitir el acceso hasta que el usuario ingrese java123.
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String password;

        //Bucle do while, se ejecuta al menos una vez
        do {
            System.out.println("Di amigo y entra: ");
            password = scanner.nextLine();
        } while (!password.equals("amigo"));
        System.out.println("Acceso concedido a MORIA");
        scanner.close();
    }
}
