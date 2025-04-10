import java.util.Scanner;

public class EJ2_Estructuras_de_control {
}
//Ejercicio 2: Uso de switch para menú de opciones
//📌 Objetivo: Crear un menú interactivo donde el usuario elija una opción y se muestre un mensaje diferente según su selección.

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in); //Creamos el objeto Scanner
    System.out.println("1. Saludar");
    System.out.println("2. Mostrar fecha");
    System.out.println("3. Hasta luego");


    System.out.println("Selecciona una de las opciones anteriores");

    int opcion = scanner.nextInt(); //Leemos la opcion del usuario
    switch (opcion){
        case 1 -> System.out.println("Hola bienvenido");

        case 2 -> System.out.println("Hoy es un gran dia para programar");

        case 3 -> System.out.println("Venga hulio adio");

        default -> System.out.println("Opción no valida, vuelve a intentarlo");
    }
    scanner.close();
}