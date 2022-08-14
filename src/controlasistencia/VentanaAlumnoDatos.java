
package controlasistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaAlumnoDatos extends javax.swing.JFrame {

   
    public VentanaAlumnoDatos() {
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
        String nombre;
        String observaciones;
        String enfermedades;
        try{
            BufferedReader br= new BufferedReader(new FileReader("observaciones.txt"));
            String leer = br.readLine();
             while(leer!=null){
                leer=br.readLine();
                if(leer!=null){
                    String[] words = leer.split(";");
                    nombre=words[0];
                    enfermedades=words[1];
                    observaciones=words[2];
                    for (Alumno alumno : au.getAlumnos()){
                        if(alumno.getNombre().equals(nombre)){
                            alumno.setEnfermedades(enfermedades);
                            alumno.setObservaciones(observaciones);
                        }
                    }
                }
            }
            //int i =0;
            br.close();
        } catch (FileNotFoundException ex){
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }   
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boxAlumno = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtEnfermedades = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtObservaciones = new javax.swing.JTextField();
        btnVerDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Datos alumno:");

        jButton3.setText("Enviar datos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Enfermedades / alergias:");

        txtEnfermedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnfermedadesActionPerformed(evt);
            }
        });
        txtEnfermedades.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtEnfermedadesPropertyChange(evt);
            }
        });

        jLabel3.setText("Observaciones:");

        btnVerDatos.setText("Ver datos");
        btnVerDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addComponent(btnVerDatos))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)))))
                .addContainerGap())
            .addComponent(txtEnfermedades)
            .addComponent(txtObservaciones)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerDatos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEnfermedades, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(txtObservaciones.getText().length()!=0||txtEnfermedades.getText().length()!=0){
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


            String nombre;
            String enfermedades;
            String observaciones;

            try{
                BufferedReader br= new BufferedReader(new FileReader("observaciones.txt"));
                String leer = br.readLine();
                 while(leer!=null){
                    leer=br.readLine();
                    if(leer!=null){
                        String[] words = leer.split(";");
                        nombre=words[0];
                        enfermedades=words[1];
                        observaciones=words[2];
                        for (Alumno alumno : au.getAlumnos()){
                            if(alumno.getNombre().equals(nombre)){
                                alumno.setEnfermedades(enfermedades);
                                alumno.setObservaciones(observaciones);
                            }
                        }
                    }
                }
                //int i =0;
                br.close();
            } catch (FileNotFoundException ex){
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }   
            Alumno p = (Alumno) boxAlumno.getSelectedItem();
            for(Alumno alumno : au.getAlumnos()){
                if (p.getDni()==alumno.getDni()){
                    alumno.setEnfermedades(txtEnfermedades.getText());
                    alumno.setObservaciones(txtObservaciones.getText());
                    JFrame jFrame = new JFrame();
                    JOptionPane.showMessageDialog(jFrame, "Datos de "+alumno.getNombre()+", ACTUALIZADOS.\n"+"Enfermedades/Alergias:\n"+
                            alumno.getEnfermedades()+"\nObservaciones:\n"+alumno.getObservaciones());
                    break;
                }
            }
            String texto="";
            File oldFile =new File ("observaciones.txt");
            oldFile.delete();
            File newFile = new File ("observaciones.txt");
            FileWriter Overwritten_File;
            for(Alumno alumno : au.getAlumnos()){
                texto+=(alumno.getNombre()+";"+alumno.getEnfermedades()+";"+alumno.getObservaciones()+"\n");
            }
            try {
                Overwritten_File = new FileWriter(newFile, false);
                Overwritten_File.write("\n");
                Overwritten_File.write(texto);
                Overwritten_File.close();
            } catch (IOException ex) {
                Logger.getLogger(VentanaAlumnoDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame,"Para actualizar debes rellenar los datos.\n(recuerda que se modificara permanentemente)");
        }
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtEnfermedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnfermedadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnfermedadesActionPerformed

    private void btnVerDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDatosActionPerformed
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
        String nombre;
        String observaciones;
        String enfermedades;
        try{
            BufferedReader br= new BufferedReader(new FileReader("observaciones.txt"));
            String leer = br.readLine();
             while(leer!=null){
                leer=br.readLine();
                if(leer!=null){
                    String[] words = leer.split(";");
                    nombre=words[0];
                    enfermedades=words[1];
                    observaciones=words[2];
                    for (Alumno alumno : au.getAlumnos()){
                        if(alumno.getNombre().equals(nombre)){
                            alumno.setEnfermedades(enfermedades);
                            alumno.setObservaciones(observaciones);
                        }
                    }
                }
            }
            //int i =0;
            br.close();
        } catch (FileNotFoundException ex){
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } 
        Alumno p = (Alumno) boxAlumno.getSelectedItem();
        for (Alumno alumno : au.getAlumnos()){
            if (alumno.getDni()==p.getDni()){
                txtEnfermedades.setText(alumno.getEnfermedades());
                txtObservaciones.setText(alumno.getObservaciones());
            }
        }
    }//GEN-LAST:event_btnVerDatosActionPerformed

    private void txtEnfermedadesPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtEnfermedadesPropertyChange

    }//GEN-LAST:event_txtEnfermedadesPropertyChange

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VentanaAlumnoDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAlumnoDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAlumnoDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAlumnoDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAlumnoDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Alumno> boxAlumno;
    private javax.swing.JButton btnVerDatos;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtEnfermedades;
    private javax.swing.JTextField txtObservaciones;
    // End of variables declaration//GEN-END:variables
}
