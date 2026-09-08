
public class Motocicleta extends Vehiculos {
    private int cilindrada;

    public Motocicleta(int Codigo, String Marca, String Modelo, int year, int velocidad, int cilindrada) {
        super(Codigo, Marca, Modelo, year, velocidad);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override 
    public void Conducir() {
        System.out.println("Se esta conduciendo la motocicleta " + getMarca());
    }

    @Override 
    public String toString() {
        return " [Marca: " + getMarca() + ", Modelo: " + getModelo() + "]";
    }



    

}
