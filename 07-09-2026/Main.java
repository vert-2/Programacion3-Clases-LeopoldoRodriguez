public class Main {
    public static void main(String[] args) {
        Automovil auto = new Automovil (1, "Toyota", "Trueno AE86", 1983, 180, 2);
        Motocicleta moto = new Motocicleta(2, "Honda", "CBR600RR", 2003, 250, 600);
        Camion camion = new Camion(3, "Volvo", "FH16", 2020, 120, 20000);
        Automovil auto2 = new Automovil (4, "Lamborghini", "Sesto Elemento", 2010, 350, 2);
        Automovil auto3 = new Automovil (5, "BMW", "M3 E46", 2000, 250, 4);

        Vehiculos[] misVehiculos = {auto, moto, camion, auto2, auto3};

        for (Vehiculos v : misVehiculos) {
            System.out.print(v.getClass());
            System.out.println(" - " + v);
            if (v instanceof Cargable) {
                System.out.println("-" + "Este vehiculo es cargable.");
                ((Cargable)v).cargar(1000);
                ((Cargable)v).descargar(500);
            }
        }

        System.out.println("\nConduciendo todos los vehiculos:");

        for (Vehiculos v : misVehiculos) {
            v.Conducir();
        }



        

    }

}
