
package controlasistencia;

import java.util.ArrayList;


public class Alumno {
    public enum controlDiario{todoDia, medioDia, faltaTotal};
    private String nombre;
    private int dni;
    private int edad;
    private String enfermedades;
    private String observaciones;
    ArrayList<Contacto> contactos;
    

    public Alumno(String nombre, int dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        contactos = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void addContacto(Contacto contacto){
        contactos.add(contacto);
    }
    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    @Override
    public String toString() {
        return "\nNombre= " + nombre + ", dni= " + dni + ", edad= " + edad;
    }
    
    
}
