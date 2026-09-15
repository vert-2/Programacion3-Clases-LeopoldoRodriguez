public class Main {

    public static void main(String[] args){

        String[] nombres = {"Juan Perez", "Ana Lopez", "Carlos Ruiz", "Maria Diaz", "Luis Marte"};
        String [] correos = {"juan@ucne.edu", "ana@gmail.com", "carlos@ucne.edu", "maria@yahoo.com", "luis@ucne.edu"};
        double [] parcial1 = {8.5, 9.0, 6.3, 4.5, 7.8};
        double[] parcial2 = {7.0, 8.5, 5.9, 6.0, 9.2};
        double[] parcial3 = {9.0, 7.5, 4.8, 8.0, 6.5};
        double[] promedios = new double[nombres.length];

        
        for (int i = 0; i < nombres.length; i++) {
            promedios[i] = (parcial1[i] + parcial2[i] + parcial3[i]) / 3;
        }

        System.out.println(String.format("%-15s %-10s %-10s", "NOMBRE", "PROMEDIO", "ESTADO"));
        System.out.println("----------------------------------------");
        for (int i = 0; i < nombres.length; i++) {
            
            String estado = (promedios[i] >= 6.0) ? "Aprobado" : "Reprobado";
            
            
            System.out.println(String.format("%-15s %-10.2f %-10s", nombres[i], promedios[i], estado));

        }
        
        double promedioGeneral = 0;
        for (double promedio : promedios) {
            promedioGeneral += promedio;
        }
        promedioGeneral /= promedios.length;
        System.out.println("----------------------------------------");
        System.out.println(String.format("PROMEDIO GENERAL: %-10.2f", promedioGeneral));

        int promedioMasAlto = 0;
        int promedioMasBajo = 0;

        for (int i = 1; i < promedios.length; i++) {
            if (promedios[i] > promedios[promedioMasAlto]) {
                promedioMasAlto = i; 
            }
            if (promedios[i] < promedios[promedioMasBajo]) {
                promedioMasBajo = i; 
            }
        }

        
        System.out.println(String.format("PROMEDIO MAS ALTO: %s con %.2f", nombres[promedioMasAlto], promedios[promedioMasAlto]));
        System.out.println(String.format("PROMEDIO MAS BAJO: %s con %.2f", nombres[promedioMasBajo], promedios[promedioMasBajo]));

        System.out.println("----------------------------------------");
        System.out.print("Estudiantes con correo institucional: ");

        for (int i = 0; i < correos.length; i++) {
    
            if (correos[i].endsWith("@ucne.edu")) {
        
        String nombreMayuscula = nombres[i].toUpperCase();
        
        
        System.out.print("- " + nombreMayuscula + " " + correos[i] + " ");
            }
        }
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("BUSCADOR DE ESTUDIANTES");
        int indice = buscarEstudiante(nombres, "lopez");

        if (indice != -1) {

            String estado = (promedios[indice] >= 6.0)
                    ? "Aprobado"
                    : "Reprobado";

            System.out.println("Estudiante encontrado:");
            System.out.println("Indice:     " + indice);
            System.out.println("Nombre:     " + nombres[indice]);
            System.out.println("Correo:     " + correos[indice]);
            System.out.println("Parcial 1:  " + parcial1[indice]);
            System.out.println("Parcial 2:  " + parcial2[indice]);
            System.out.println("Parcial 3:  " + parcial3[indice]);
            System.out.printf("Promedio:   %.2f%n", promedios[indice]);
            System.out.println("Estado:     " + estado);

        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    public static int buscarEstudiante(String[] nombres, String nombreBuscar) {

        for (int i = 0; i < nombres.length; i++) {

            if (nombres[i].toLowerCase().contains(nombreBuscar.toLowerCase())) {
                return i;
            }
        }

        return -1;
    }

}


