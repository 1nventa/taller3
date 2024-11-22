package taller3.ejericicio3;

public class PruebaBanco {
    public static void main(String[] args) {
        Banco banco = new Banco(1000);
        banco.mostrarSaldo(); // Esto también generará un error
    }
}