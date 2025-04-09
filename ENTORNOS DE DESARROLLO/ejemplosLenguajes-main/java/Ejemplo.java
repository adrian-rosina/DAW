/*
 * Java
 *  Multiparadigma: Imperativo, Orientado a Objetos, Funcional
 *  Tipado: Estático, Fuerte
 *  Compilado e Interpretado
 *  Creador: Sun Microsystems
 *  Año: 1995
 *  Extensiones: .java, .class
 *  IDE: Eclipse, NetBeans, IntelliJ IDEA
 *  Frameworks: Spring, Hibernate, Struts, JSF
 */

/*
 * NORMAS DE ESTILO
 * - Nombre de archivo: NombreClase.java
 * - Nombre de clase: NombreClase
 * - Nombres de variables siguieren notación camelCase
 * - Nombres de clases empiezan con mayúscula
 * - Nombres de métodos empiezan con minúscula
 * - Línea de 80 caracteres
 * - Sangría de 4 espacios
 * - Comentarios en línea y de varias líneas
 * - Comentarios en métodos y clases
 * - Uso de espacios en operadores y comas
 * - Llaves en la misma línea
 * - Uso de mayúsculas en constantes
 * - Uso de nombres descriptivos
 * - Uso de nombres en inglés
 */


/*
 * Comentario de varias líneas
 * Se crea con /* y se cierra con * /
 */

// Comentario de una línea
// Se crea con //

/*
 * El package es un contenedor de clases, se utiliza para organizar las clases
 * y evitar conflictos de nombres.
 */
 package java;

/*
 * La clase Ejemplo es la clase principal, es la clase que se ejecuta.
 * La clase debe tener el mismo nombre que el archivo.
 * Cada archivo .java puede tener una sola clase pública.
 */
public class Ejemplo {

    /*
     * El método main es el punto de entrada de la aplicación.
     * Debe ser público, estático y no devuelve nada.
     * Debe existir un solo método main por aplicación.
     */
    public static void main(String[] args) {
        // El tipado es estático, se debe declarar el tipo de dato de la variable
        int numero;
        // La asignación se realiza con el operador =
        numero = 5;
        // Se pueden declarar e inicializar en la misma línea
        int numero2 = 10;
        // Se pueden declarar varias variables del mismo tipo en la misma línea
        int numero3, numero4;
        // Se pueden asignar valores a varias variables en la misma línea
        numero3 = numero4 = 15; // Vigilad con estas instrucciones que dificultan la lectura

        // Ejemplo de tipado fuerte
        //numero = 20.0; // Error de compilación, no se puede asignar un double a un int
        
        System.out.println("Hola Mundo");
        
    }
}
