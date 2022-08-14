
package controlasistencia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class VentanaVerAlumno extends javax.swing.JFrame {

 
    public VentanaVerAlumno() {
        initComponents();
        Metodos ma=new Metodos();
        Aula au = new Aula("aula");
        String name;
        int dni;
        int edad;
        try{
            BufferedReader br= new BufferedReader(new FileReader("archivo.txt"));
            String leer = br.readLine();
             while(leer!=null){
                leer=br.readLine();
                if(leer!=null){
                    String[] words = leer.split(";");
                    name=words[0];
                    dni=Integer.parseInt(words[1]);
                    edad=Integer.parseInt(words[2]);
                    Alumno alu = new Alumno(name, dni, edad);
                    au.addAlumno(alu);
                }
            }
            //int i =0;
            br.close();
        } catch (FileNotFoundException ex){
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        for(Alumno alumno: au.getAlumnos()){
            boxAlumno.addItem(alumno);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boxAlumno = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Ver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Datos alumno:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1))
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jButton2))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Metodos mar=new  Metodos();
        
        Aula au = new Aula("aula");
        
        String name;
        int dni0;
        int edad;
        try{
            BufferedReader br= new BufferedReader(new FileReader("archivo.txt"));
            String leer = br.readLine();
             while(leer!=null){
                leer=br.readLine();
                if(leer!=null){
                    String[] words = leer.split(";");
                    name=words[0];
                    dni0=Integer.parseInt(words[1]);
                    edad=Integer.parseInt(words[2]);
                    Alumno alu = new Alumno(name, dni0, edad);
                    au.addAlumno(alu);
                }
            }
            //int i =0;
            br.close();
        } catch (FileNotFoundException ex){
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        String nombreAl;
        String nombre;
        String dni;
        String email;
        String direccion;
        String telefono;
        String telefono2;
        String tex;
        try{
            BufferedReader br= new BufferedReader(new FileReader("contactos.txt"));
            String leer = br.readLine();
            while(leer!=null){
                leer=br.readLine();
                if(leer!=null){
                    String[] words = leer.split(";");
                    nombreAl=words[0];
                    nombre=words[1];
                    direccion=words[2];
                    dni=words[3];
                    email=words[4];
                    telefono=words[5];
                    telefono2=words[6];
                    
                    Contacto con = new Contacto(nombre, dni, email, direccion, telefono);
                    if (telefono2!=null){
                        con.setTelefono2(telefono2);
                    }
                    
                    for (Alumno alumno : au.getAlumnos()){
                        if (alumno.getNombre().equals(nombreAl)){
                            alumno.addContacto(con);
                            break;
                        }    
                    }
                }
            }    
               
        br.close();
        } catch (FileNotFoundException ex){
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Alumno p = (Alumno) boxAlumno.getSelectedItem();
        for (Alumno alumno : au.getAlumnos()){

            if (p.getDni()==alumno.getDni()){
                JFrame jFrame = new JFrame();
                JOptionPane.showMessageDialog(jFrame, "Contactos del alumno "+alumno.getNombre()+":\n\n"+alumno.contactos.toString()
                        .replace("[", "")
                        .replace(",", "")  //remove the commas
                        .replace("[", "")  //remove the right bracket
                        .replace("]", "")  //remove the left bracket
                        .trim());  
            }
        }        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaVerAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVerAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVerAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVerAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaVerAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Alumno> boxAlumno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
