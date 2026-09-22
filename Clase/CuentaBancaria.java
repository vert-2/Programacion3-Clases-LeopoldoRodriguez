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
        try{
           if (nombre == null || nombre.trim().isEmpty()){
            throw new DepositoInvalidoException("Nombre vacio tu te llama vacio????");
           }else if (monto <= 0){
                throw new DepositoInvalidoException("Manito aqui no cogemo esa monto vacio");
            } else {
                saldoActual += monto;
                System.out.println("Monto actual de " + nombre + ": " + getSaldoActual());
            }
        }catch (DepositoInvalidoException e){
            System.out.println("Error general: " + e.getMessage());
        }

    }
}
