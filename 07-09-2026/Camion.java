public class Camion extends Vehiculos implements Cargable {
    private int capacidadCarga;

    public Camion(int Codigo, String Marca, String Modelo, int year, int velocidad, int capacidadCarga) {
        super(Codigo, Marca, Modelo, year, velocidad);
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void cargar(double cantidad) {
        
        if (cantidad > capacidadCarga) {
            System.out.println("Te pasate de libra quemate el camion");

        }else{
        System.out.println("Se han cargado " + cantidad + " unidades en el camion " + getMarca());
        }
    }

    @Override
    public void descargar(double cantidad) {
        System.out.println("Se han descargado " + cantidad + " unidades del camion " + getMarca());
    }

    @Override 
    public void Conducir() {
        System.out.println("Se esta conduciendo el camion " + getMarca());
        
    }

    @Override 
    public String toString() {
        return " [Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Capacidad de Carga: " + getCapacidadCarga() + "]";
    }

}
