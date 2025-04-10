import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Clase7_exepciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try  {

            System.out.println("Ingrésame un número: ");
            int numero = scanner.nextInt();
            System.out.println("El numero ingrasado es " + numero);
        } catch (InputMismatchException e) {
            System.out.println("No has ingrasado un numero");
        } finally { scanner.close();
            System.out.println("Programa finalizado");

        }
    }
}
