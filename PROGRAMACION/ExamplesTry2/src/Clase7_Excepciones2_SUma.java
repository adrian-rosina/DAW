import java.util.Scanner;
import java.util.InputMismatchException;

public class Clase7_Excepciones2_SUma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingresa un numero mayor que 5:");
            int numero = scanner.nextInt();

            if (numero > 5) {
                System.out.println("El número introducido es mayor que 5, " +
                        "número ingresado: " + numero);
            } else {
                System.out.println("Numero válido" + numero);
            }
            ;
        }catch (Exception e ) {
                System.out.println("Dato introducido no válido");
            } finally { scanner.close();
                System.out.println("Programa finalizado");
        }
    }
}
