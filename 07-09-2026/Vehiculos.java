
public abstract class Vehiculos {

    private int Codigo;
    private String Marca;
    private String Modelo;
    private int year;
    private int velocidad;

    public Vehiculos(int Codigo, String Marca, String Modelo, int year, int velocidad) {
        this.Codigo = Codigo;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.year = year;
        this.velocidad = velocidad;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo(){
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public abstract void Conducir();

    @Override
    public String toString() {
    
    return " [Marca: " + this.Marca + ", Modelo: " + this.Modelo + "]";
    }

}
