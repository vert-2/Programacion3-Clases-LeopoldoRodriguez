package Clase;

public class Cajero implements Runnable {
    private CuentaBancaria cuentaAna;
    private CuentaBancaria cuentaLuis;
    private CuentaBancaria cuentaMaria;
    private CuentaBancaria cuentaJose;


    public Cajero() {
        this.cuentaAna = new CuentaBancaria("Ana", 0.0);
        this.cuentaLuis = new CuentaBancaria("Luis", 0.0);
        this.cuentaMaria = new CuentaBancaria("Maria", 0.0);
        this.cuentaJose = new CuentaBancaria("Jose", 0.0);
    }

    @Override
    public void run() {
        
        
        
        
        try {
            
            
        } catch (DepositoInvalidoException e) {
            System.out.println("Error de depósito: " + e.getMessage());
        } 
        try {
            Thread.sleep(500); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
