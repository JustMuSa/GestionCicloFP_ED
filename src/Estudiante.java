public class Estudiante {
    public String nombre_estudiante;  
    public int id_estudiante;         
    public int edad_estudiante;
    
    /**
     * Clase estudiante
     * @param nombre_estudiante
     * @param id_estudiante
     * @param edad_estudiante
     */
   
    //Constructor del estudiante
    public Estudiante(String nombre_estudiante, int id_estudiante, int edad_estudiante) {
        this.nombre_estudiante = nombre_estudiante;
        this.id_estudiante = id_estudiante;
        this.edad_estudiante = edad_estudiante;
       
    }

    //toString con datos del estudiante
    public String datos_estudiante() {
        return "Estudiante: " + nombre_estudiante + " (ID: " + id_estudiante + ") Edad: " + edad_estudiante;
    }
}
