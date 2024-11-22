package taller3.ejericicio3;

public class Banco {
    private double saldo;

    public Banco(double saldo) {
        this.saldo = saldo;
    }

    public static void mostrarSaldo() {
        System.out.println("Saldo: " + saldo); // Error de compilación
    }
}