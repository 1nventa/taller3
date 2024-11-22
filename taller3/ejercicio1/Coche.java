package taller3.ejercicio1;

public class Coche {
    String marca;
    String modelo;
    static int contadorCoches = 0;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }

    public static void mostrarContadorCoches() {
        System.out.println("Número de coches creados: " + contadorCoches);
    }
}