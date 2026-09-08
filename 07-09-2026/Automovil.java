

public class Automovil extends Vehiculos {
    private int numPuertas;

    public Automovil(int Codigo, String Marca, String Modelo, int year, int velocidad, int numPuertas) {
        super(Codigo, Marca, Modelo, year, velocidad);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override 
    public void Conducir() {
        System.out.println("Se esta conduciendo el automovil " + getMarca());
    }

    @Override 
    public String toString() {
        return " [Marca: " + getMarca() + ", Modelo: " + getModelo() +"]";
    }

    
}
