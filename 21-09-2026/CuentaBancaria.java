package Clase;

public class CuentaBancaria {

    private String nombreTitular;
    private double saldoActual;

    public CuentaBancaria(String nombreTitular, double saldoActual) {
        this.nombreTitular = nombreTitular;
        this.saldoActual = saldoActual;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }
    
    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public synchronized double getSaldoActual() {
        return saldoActual;
    }

    public synchronized void depositar(String nombre,double monto) throws DepositoInvalidoException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new DepositoInvalidoException(
                    "El nombre del cliente no puede estar vacío.");
        }

        if (monto <= 0) {
            throw new DepositoInvalidoException(
                    "El monto debe ser mayor que cero.");
        }

        saldoActual += monto;
        System.out.printf("[Cajero] Depósito de %s: $%.2f | Saldo: $%.2f%n",
                nombre, monto, saldoActual);
    }
}
