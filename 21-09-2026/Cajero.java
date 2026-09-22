package Clase;

public class Cajero implements Runnable {
    private CuentaBancaria cuenta;

    public Cajero(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void run() {
        try {
            cuenta.depositar("Ana", 1500.00);
        } catch (DepositoInvalidoException e) {
            System.out.println("[Cajero] Error: " + e.getMessage());
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("[Cajero] El cajero fue interrumpido.");
            Thread.currentThread().interrupt();
            return;
        }
        try {
            cuenta.depositar("Luis", -200.00);
        } catch (DepositoInvalidoException e) {
            System.out.println("[Cajero] Error: " + e.getMessage());
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("[Cajero] El cajero fue interrumpido.");
            Thread.currentThread().interrupt();
            return;
        }
        try {
            cuenta.depositar("Carlos", 800.00);
        } catch (DepositoInvalidoException e) {
            System.out.println("[Cajero] Error: " + e.getMessage());
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("[Cajero] El cajero fue interrumpido.");
            Thread.currentThread().interrupt();
            return;
        }
        try {
            cuenta.depositar("", 500.00);
        } catch (DepositoInvalidoException e) {
            System.out.println("[Cajero] Error: " + e.getMessage());
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("[Cajero] El cajero fue interrumpido.");
            Thread.currentThread().interrupt();
            return;
        }
        try {
            cuenta.depositar("Maria", 3000.00);
        } catch (DepositoInvalidoException e) {
            System.out.println("[Cajero] Error: " + e.getMessage());
        }
        
    }
}
