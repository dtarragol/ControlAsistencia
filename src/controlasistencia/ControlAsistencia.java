
package controlasistencia;

import java.io.File;

public class ControlAsistencia {

    public static void main(String[] args) {
        String carpeta1= "alumnos";
        String archivo = "archivo.txt";
        String archivoContactos ="contactos.txt";
        String archivoObservaciones = "observaciones.txt";
        
        Metodos ma=new Metodos();
        ma.crearCarpeta(carpeta1);
        File f = new File(archivo);
        if(!f.exists()){
            ma.crearArchivo(archivo);
            ma.escribirArchivo(archivo, " ");
        }
        File f2 = new File(archivoContactos);
        if(!f2.exists()){
            ma.crearArchivo(archivoContactos);
            ma.escribirArchivo(archivoContactos, " ");
        }
        File f3 = new File(archivoObservaciones);
        if(!f3.exists()){
            ma.crearArchivo(archivoObservaciones);
            ma.escribirArchivo(archivoObservaciones, " ");
        }
        V1 ventana= new V1();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        
    }
}
