import java.util.ArrayList;

public class GestionCicloFP {
    public ArrayList<Estudiante> lista_estudiantes = new ArrayList<>(); 
    public ArrayList<Ciclo> lista_ciclos = new ArrayList<>();         

    public void agregarEstudiante(String nombre, int id, int edad) {  
        lista_estudiantes.add(new Estudiante(nombre, id, edad));
    }

    public void agregarCiclo(String nombreCiclo) { 
    	lista_ciclos.add(new Ciclo(nombreCiclo));
    }

    public void matricular_estudiante(int id_estudiante, String nombre_ciclo) { 
        Estudiante estudiante = null; 
        Ciclo curso = null;      

        for (Estudiante e : lista_estudiantes) { 
            if (e.id_estudiante == id_estudiante) {
                estudiante = e;
                break;
            }
        }

        for (Ciclo c : lista_ciclos) { 
            if (c.nombre_ciclo.equals(nombre_ciclo)) {
                curso = c;
                break;
            }
        }

        if (estudiante != null && curso != null) {
            curso.Agregar_estudiante(estudiante);
        }
    }

    public void mostrar_ciclos() { 
        for (Ciclo ciclo : lista_ciclos) {
            System.out.println(ciclo.datos_ciclo());
        }
    }

    public static void main(String[] args) {
        GestionCicloFP gestion = new GestionCicloFP();

        System.out.println("Agregando todo...");
        
        gestion.agregarEstudiante("Alicia", 1, 20);
        gestion.agregarEstudiante("Roberto", 2, 22);

        gestion.agregarCiclo("DAW");
        gestion.agregarCiclo("ASIR");

        gestion.matricular_estudiante(1, "DAW");
        gestion.matricular_estudiante(2, "ASIR");

        System.out.println("Ciclos: ");
        
        gestion.mostrar_ciclos();
    }
}

