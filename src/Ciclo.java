import java.util.ArrayList;

public class Ciclo {
    public String nombre_ciclo;
    public ArrayList<Estudiante> lista_estudiantes = new ArrayList<>();
    /**
     * Clase ciclo
     * @param NOMBRE_CICLO
     */

    //Constructor
    public Ciclo(String NOMBRE_CICLO) {
        this.nombre_ciclo = new String(NOMBRE_CICLO);
    }

    //Agregar un estudiante
    public void agregar_estudiante(Estudiante e) { 
        lista_estudiantes.add(e); 
    }

    //toString con datos del ciclo
    public String datos_ciclo() {  
        String datos = "Ciclo: " + nombre_ciclo + "\nEstudiantes:\n";
        for (Estudiante e : lista_estudiantes) {
            datos += e.datos_estudiante() + "\n";
        }
        return datos;
    }
}
