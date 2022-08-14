
package controlasistencia;

public class Contacto {
    private String nombre;
    private String dni;
    private String email;
    private String direccion;
    private String telefono;
    private String telefono2;
    
    
public Contacto(String nombre, String dni, String email, String direccion, String telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        Metodos metodos = new Metodos();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    @Override
    public String toString() {
        return "\n"+nombre+ "\nDNI= "+dni+ "\nEmail= " + email + "\nDireccion= " + direccion + "\nTelefono= " + telefono + "\nTelefono2= " + telefono2+".\n";
    }
}
