package taller3.ejercicio1;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Coche coche1 = new Coche("Toyota", "Corolla");
        @SuppressWarnings("unused")
        Coche coche2 = new Coche("Honda", "Civic");
        @SuppressWarnings("unused")
        Coche coche3 = new Coche("Ford", "Focus");
        Coche.mostrarContadorCoches();
    }
}