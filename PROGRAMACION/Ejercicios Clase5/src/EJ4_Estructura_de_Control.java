import java.util.Scanner;

public class EJ4_Estructura_de_Control {
    //🔹 Ejercicio 4: Uso de while para contar hasta que el usuario ingrese 0
    //📌 Objetivo: Pedir números al usuario hasta que ingrese 0.

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int numero;

        //Pedimos el primer numero
        System.out.println("Introduce un numero (0 para salir): ");
        numero = scanner.nextInt();

        //Mientras el numero sea 0, sigue pidiendo numeros
        while (numero !=0){
            System.out.println("Has introducido " +numero);
            System.out.println("Introduce otro número (0 para salir): ");
            numero  = scanner.nextInt();
        }
        System.out.println("Programa finalizado");
        scanner.close();
    }
}
