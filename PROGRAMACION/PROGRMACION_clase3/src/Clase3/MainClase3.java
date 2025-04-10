package Clase3;

public class MainClase3 {
    public static void main(String[] args) {

        //Declaras una constante con la pabra FINAL
        final double PI = 3.1416;
        final int mayoriaEdad = 18;

        System.out.println("El valor de PI es " + PI);
        System.out.println("La edad minima para ser adulto en Spain es " + mayoriaEdad);

        int x = 10;
        int y = 20;

        System.out.println("¿Es x igual a y?: " + (x==y));
        System.out.println("¿Es x diferente a y?: " + (x!=y));
        System.out.println("¿Es x mayor a y?: " + (x>y));
        System.out.println("¿Es x menor a y?: " + (x<y));



        //Operadoresw loficos. Es quel que combina expresiones logicas
        boolean a = true;
        boolean b = false;

        System.out.println("a AND b: " + (a && b )); //Y
        System.out.println("a OR b: " + (a || b));
        System.out.println("NOT a: " + (!a) );

        //Expresiones y/o evaluaciones
            int resultado =(10 + 5) * 2/3;
        System.out.println("El resultado de la expresion es: " + resultado);
    }



}


