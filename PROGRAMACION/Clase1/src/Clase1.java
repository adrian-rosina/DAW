/**
*Clase Main: Introducción a los fundamentos de la programación en Java.
 * Contiene ejemplos sobre estructura basica, variables, tipos de datos, alcance
 * de variables, buenas practicas y errores comunes.
 */

public class Clase1 {

    /**
     * Metodo principal (Punto de entrada del programa en Java)
     */

    public static void main(String[] args) {
        //Llamadas a los métodos que explican cada sección del temario
        queEsUnPrograma();
        estructuraBásica();
        declaracionVariables(); //Pon aqui una variable e imprimela
        usoVariables(); //Imprime Variable1
        alcanceVariables(); //Pon aqui variable2
        buenasPracticas();
        erroresComunes();


    }
//Pon aqwui otra variable e imprimel
    //Pon aqui la variable1
    //Imprime variable2
    /**
     * 1.¿Que es un programa?
     * Explicación sobre que es un programa y su proposito
     */
    public static void queEsUnPrograma(){
        System.out.println("Un programa es...");
        System.out.println("Estas instrucciones estan escritas...");
        System.out.println("Hola mundo");
        System.out.println("Sin programas, las computadoras....");
    }

    /**
     * 2.Estructura básica de un programa en Java
     * Un programa en Java contiene:
     * -Variables para almacenar datos
     * -Métodos para encapsular lógica
     * -Instrucciones de control de flujo (if, loops, etc.)
     */

    public  static void estructuraBásica() {
        System.out.println("\n Estructura básica de un programa en Java" );
        int numero = 42; //Variable de tipo entero
        String mensaje ="Hola Mundo"; //Variable de tipo cadena
        boolean esActivo = true; //Variable booleana

        String mejorEquipo ="Real Valladolid";
        System.out.print("El mejor equipo del mundo es " + mejorEquipo);
        //Mostramos los valores en la consola
        System.out.println("numero" + numero);
        System.out.println("Mensaje" + mensaje);
        System.out.println("Estado" + esActivo);

    }

    public static void declaracionVariables() {
        System.out.println("\n Declaración de variables en Java");

        //  Declaracion y utilizacion de variables
        int edad = 25; //Entero
        double altura = 1.75; //Numero decimal (doble precision)
        char inicial = 'M'; //Caracter unico
        String nombre = "Mario"; //Cadena de texto

        //Mostramos los valores en la consola
        System.out.println("Nombre" + nombre + ", Edad" + edad +
                ", Altura" + altura + ", Inicial" + inicial + "Nombre" + nombre);

    }

    /**
     * 4. Uso de variables en Java
     * Las variables permiten almacenar datos
     */
}