import java.util.Scanner;

// Ejercicio 1: Uso de if para verificar números positivos y negativos

public class EJ1_Estructuras_de_Control {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in); //Creamos un objeto Scanner

        System.out.println("Introduce un número: ");
        int numero = scanner.nextInt(); //Leemos el número ingresado

        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0){
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El número es igual a 0");
        }
        scanner.close();
    }
}



