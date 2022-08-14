
package controlasistencia;

import java.io.*;

public class Metodos {
    Aula au = new Aula("aula1");
    public void crearArchivo(String archivo){
        
        File f1=new File(archivo);
        PrintWriter pw;
        try {
            if (!f1.exists()){
                pw = new PrintWriter(f1);
                pw.close();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    public void agregarAlumno(String nombre, int dni, int edad ){
        Alumno alumno = new Alumno(nombre, dni, edad);
        au.addAlumno(alumno);
    }
    public void borrarAlumno(int dni){
        int i=0;
        for(Alumno alumno : au.getAlumnos()){
            if(alumno.getDni()==dni){
                au.alumnos.remove(i);
                i++;
            }
        }
    }
    public void escribirArchivo(String archivo, String texto){
        try {
            File f1=new File(archivo);
            
            PrintWriter pw =new PrintWriter (new FileWriter(f1,true));
            pw.println(texto);
            pw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }  
    }
    public void leerArchivo(String archivo) /*throws FileNotFoundException, IOException*/{
        File f1=new File(archivo);
        Aula au = new Aula("aula");
        String name;
        int dni;
        int edad;
        try {
            BufferedReader br= new BufferedReader(new FileReader(archivo));
            String leer = br.readLine();
             while(leer!=null){
                //System.out.println(leer);
                leer=br.readLine();
                if(leer!=null){
                    String[] words = leer.split(";");
                    //System.out.println(Arrays.toString(words));
                    name=words[0];
                    dni=Integer.parseInt(words[1]);
                    edad=Integer.parseInt(words[2]);
                    Alumno alu = new Alumno(name, dni, edad);
                    //System.out.println(alu);
                    au.addAlumno(alu);
                }
            }
            br.close();
            
        } catch (FileNotFoundException ex){
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public void existeArchivo(String archivo){
        File f1= new File(archivo);
        if(f1.exists()){
            System.out.println("El archivo existe\n");
        }else{
            System.out.println("El archivo NO existe\n");
        }
    }
    public void buscarAlumno(int dni){
                for(Alumno alumno : au.getAlumnos()){
            if(alumno.getDni()==dni){
                //FALTA CODIGO!!!!!!!
            }
        }
    }
    public void crearCarpeta(String direccion){
        File directorio = new File(direccion);
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                System.out.println("Directorio creado") ;
            } else {
                System.out.println("Error al crear directorio");
            }
        }
    }
        private static String limpia(String datosArray){
         datosArray = datosArray.trim();
         if (datosArray != null && datosArray.length() > 0 && datosArray.charAt(datosArray.length() - 1) == ',') {           
           datosArray = datosArray.substring(0, datosArray.length() - 1);              
         }
         return datosArray;
    }   
    
}
