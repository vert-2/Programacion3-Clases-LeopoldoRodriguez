package Clase;

public class Auditor implements Runnable{
    private CuentaBancaria cuenta;

    public Auditor(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                System.out.println("[Auditor] Saldo actual: |"
                        + cuenta.getSaldoActual() + "|");
                Thread.sleep(700);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
