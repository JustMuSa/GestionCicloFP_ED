import java.util.ArrayList;

public class Ciclo {
    public String nombre_ciclo;
    public ArrayList<Estudiante> lista_estudiantes = new ArrayList<>();

    public Ciclo(String NOMBRE_CICLO) {
        this.nombre_ciclo = new String(NOMBRE_CICLO);
    }

    public void Agregar_estudiante(Estudiante e) { 
        lista_estudiantes.add(e); 
    }

    public String datos_ciclo() {  
        String datos = "Ciclo: " + nombre_ciclo + "\nEstudiantes:\n";
        for (Estudiante e : lista_estudiantes) {
            datos += e.datos_estudiante() + "\n";
        }
        return datos;
    }
}
