// Script de tipos de datos en Java

class Clase2 {
    public static void main(String[] args) {


      // ================================================================
      // TIPOS PRIMITIVOS EN JAVA
      // Los tipos primitivos almacenan valores simples en memoria.
      // No pueden contener metodos ni comportamientos adicionales
      // =========================================================


        System.out.println("TIPOS PRIMITIVOS EN JAVA");

        //Enteros numeros sin decimales
        byte numeroByte = 1;
        System.out.println("Quiero imprimir mi numero " + numeroByte);


        short numeroShort = 32000;
        System.out.println("Quiero ver mi numero short pero YA: " + numeroShort);

        int numeroGrande = 2332434;
        System.out.println("Imprime el numero mas grande " + numeroGrande);

        long numeroLong = 2831387217737L;
        System.out.println("Quiero ver mi numero enorme " + numeroLong);


        //EJERCICIO 1
        // Crea una variable de cada tipo entero y asignale valores distintos,
        //Luego imprimelas con un System.out.println().


        float numeroFloat = 0.2f;
        System.out.println("NUMEROS FLOTANTES");

        //Flotantes (numeros con decimales)
        System.out.println("Mi float querido es " +numeroFloat);

        double numeroDouble = 2312312.345;
        System.out.println("Aqui esta mi double bonito " + numeroDouble);

        //EJERCICIO 2
        //Declara una variable de tipo float y otra de tipo double con
        // valores distintos
        //Imprimelas en la consola

        //Booleanos Verdaderos y Falsos

        System.out.println("BOOLEANOS");
        boolean esVerdadero = true;
        boolean esFalso = false;

        System.out.println("¿Es Fernando Alonso el mejor piloto de la " +
                "historia de la formula 1 ?" + esVerdadero);

        //EJERCICIO 3
        //Declara una variable boolean y asignale un valor falso. SOLO SI
        // SABES PROGRAMAR haz el ejercicio 2 con un if.

        //Caracteres (un solo simbolo)
        System.out.println("CARACTERES");
        char letra = 'A';
        char simbolo = '@';
        char unicode = '\u2764';
        String cantidad = "Mucho";

        System.out.println("La letra de mi DNI es " + letra);
        System.out.println("¿Que utilizo para escribir un correo?: " + simbolo);
        System.out.println("¿Cuánto quiero a la nena? " + cantidad + " " + unicode);

        //EJERCICIO 4
        //Declara una variable de tipo char con tu inicial y otra con un
        // simbolo
        //Imprimelas en la consola.

        //====================================================================
        //TIPOS DE REFERENCIA EN JAVA
        //Los tipos de referencia no almacenan valores directamente.
        //En su lugar, almacenan direcciones de memoria que apuntan a objetos

        System.out.println("\n TiPOS DE REFERENCIA EN JAVA");

        //Cadenas de texto (Strings)
        System.out.println("CADENAS DE TEXTO");
        String texto = "My name is Jeff";
        System.out.println("¿En que película dicen esta frase? " + texto)  ;

        //EJERCICIO 5
        //Dclara una variable String con tu nombre y otra con tu lenguaje
        // favorito
        //Concatenalas en un mensaje y muestra el resultado

        String nombrePropio ="Adrián";
        String lenguaje ="Español";

        System.out.println("Me llamo " + nombrePropio +  ", y mi lenguaje " +
                "favorito es el " + lenguaje);


        //Arrays (listas de valores)
        System.out.println("ARRAYS");
        int [] numerosArray = {10, 20, 30, 40, 50};
        //Los arrays comienzan en la posicion 0
        System.out.println("Te imprimo el valor de la primera posicion " + numerosArray[0]);
        System.out.println("Te imprimo el valor de la segunda posicion " + numerosArray[1]);
        System.out.println("Te imprimo el valor de la tercera posicion " + numerosArray[2]);
        System.out.println("Te imprimo el valor de la cuarta posicion " + numerosArray[3]);


        //=====================================================
        //LITERALES EN JAVA
        //Un literal es un valor constante que se usa directamente en el codigo
        //Ejemplos: numeros, texto, valores booleanos

        System.out.println("Literales en Java");
        System.out.println(0.21);
        System.out.println(2);
    }
}