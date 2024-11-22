package taller3.ejercicio2;

public class PruebaMatematicas {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Suma: " + Matematicas.sumar(a, b));
        System.out.println("Resta: " + Matematicas.restar(a, b));
        System.out.println("Multiplicación: " + Matematicas.multiplicar(a, b));
        System.out.println("División: " + Matematicas.dividir(a, b));
    }
}