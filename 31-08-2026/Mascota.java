package Trabajo1;
public class Mascota {

    private String nombre;
    private int edad;
    private String especie;
    private double peso;

    public Mascota(String nombre, int edad, String especie, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.peso = peso;
    }

    public void MostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Especie: " + especie);
        System.out.println("Peso: " + peso);
    }

    public void ClasificarPeso(String nombre) {
        if (peso < 2) {
            System.out.println("Bajo peso");
        } else if (peso >= 2 && peso <= 10) {
            System.out.println("Peso normal");
        } else{
            System.out.println("Sobrepeso");
        } 

    }

}
