package Clase;

public class Main {
    
    public static void main(String[] args) {
        Cajero cajero = new Cajero();
        Thread thread = new Thread(cajero);
        thread.start();
    }
}
