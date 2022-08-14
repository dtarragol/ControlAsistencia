
package controlasistencia;
import java.util.ArrayList;

public class Aula {
    String nombreAula;
    ArrayList<Alumno> alumnos;

    public Aula(String nombreAula) {
        this.nombreAula = nombreAula;
        alumnos = new ArrayList();
    }

    public String getNombreAula() {
        return nombreAula;
    }

    public void setNombreAula(String nombreAula) {
        this.nombreAula = nombreAula;
    }
    /*
    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    */
    
    public void addAlumno(Alumno alumno){
        alumnos.add(alumno);
    }
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }
    /*public String ListaAlumnos(Alumno alumno){
        String listaAl="";
        for(Alumno alumno:  )
        return listaAl;
    }*/
    @Override
    public String toString() {
        return nombreAula + "\n" + alumnos;
    }
    
}
