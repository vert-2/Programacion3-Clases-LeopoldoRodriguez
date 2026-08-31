package Trabajo1;
public class Main {
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("elpejo", 10, "perro", 3);
        mascota1.MostrarDatos();
        mascota1.ClasificarPeso("elpejo");

        System.out.println("-------------------------------------------------");

        Mascota mascota2 = new Mascota("ergato", 3, "gato", 1.8);
        mascota2.MostrarDatos();
        mascota2.ClasificarPeso("gato");

        System.out.println("-------------------------------------------------");
        
        Mascota mascota3 = new Mascota("erpez", 1, "pez", 0.5);
        mascota3.MostrarDatos();
        mascota3.ClasificarPeso("pez");


    }
}
