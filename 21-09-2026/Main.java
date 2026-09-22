package Clase;

public class Main {
    
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Cuenta principal", 0.0);

        Cajero cajero = new Cajero(cuenta);
        Auditor auditor = new Auditor(cuenta);
        Thread threadCajero = new Thread(cajero);
        Thread threadAuditor = new Thread(auditor);

        threadAuditor.start();
        threadCajero.start();

        try {
            threadCajero.join();

            // El auditor trabaja mientras el cajero está activo.
            threadAuditor.interrupt();
            threadAuditor.join();

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.printf("[Main] Saldo final: $%.2f%n", cuenta.getSaldoActual());
    }
}
