/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PaqueteAgendar;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author xerkl
 */
public class PantallaDeFechas extends javax.swing.JFrame {

    /**
     * Creates new form PantallaDeFechas
     */
    public  PantallaDeFechas() {
        initComponents();
        crearCitasL();
        crearCitasM();
        crearCitasK();
        crearCitasJ();
        crearCitasV();
        crearCitasS();
    }
    
    public void crearCitasL(){
        AgregarCitas nuevo = new AgregarCitas();
        
        
                
            
            for (int i = 1,j=8; i < AgregarCitas.cantidadDeCitasL+1&&j<=16; i++,j++) {
                
                 
                    
                

                if (j <= 12) {
                    JButton botonL = new JButton("Lunes"+": "+j+"am");
                   
                    panelLunes.add(botonL);
                    
                    
                           
                    
                    botonL.addActionListener((ActionEvent e) -> {
                        int seleccion = JOptionPane.showConfirmDialog(rootPane, "¿Desea agendar su cita?");
                        
                        if(seleccion == JOptionPane.YES_OPTION) {
                            JOptionPane.showMessageDialog(rootPane, "Cita agendada");
                            String fechaLunes = botonL.getText();
                            
                            RegistroCitas.txtFechaDeCita.setText(fechaLunes);
                            
                            botonL.setEnabled(false);
                            
                            
                            
                            
                        }
                        else{
                            System.out.println("No esta entrando");
                        }    
                    });  
                }
                else{
                    JButton botonL = new JButton("Lunes"+": "+j+"pm");
                    panelLunes.add(botonL);
                    botonL.addActionListener((ActionEvent e) -> {
                        int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea agendar su cita?");
                        
                        if(seleccion == JOptionPane.YES_OPTION) {
                            
                            JOptionPane.showMessageDialog(rootPane, "Cita agendada");
                            String fechaLunes = botonL.getText();
                            
                            RegistroCitas.txtFechaDeCita.setText(fechaLunes);
                        }    
                    });
                }

            }
        
        
        
        
    }
    public void crearCitasM(){
        for (int i = 1,j=8; i < AgregarCitas.cantidadDeCitasM+1&&j<=16; i++,j++) {
            if (j <= 12) {
                JButton botonM = new JButton("Martes"+": "+j+"am");
                panelMartes.add(botonM);
                botonM.addActionListener((ActionEvent e) -> {
                    int seleccion = JOptionPane.showConfirmDialog(rootPane, "¿Desea agendar su cita?");
                    
                    if(seleccion == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(rootPane, "Cita agendada");
                        String fechaMartes = botonM.getText();
                        
                        RegistroCitas.txtFechaDeCita.setText(fechaMartes);
                        
                        
                    }
                    else{
                        System.out.println("No esta entrando");
                    }    
                });  
            }
            else{
                JButton botonM = new JButton("Martes"+": "+j+"pm");
                panelMartes.add(botonM);
                botonM.addActionListener((ActionEvent e) -> {
                    int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea agendar su cita?");
                    
                    if(seleccion == JOptionPane.YES_OPTION) {
                        
                        JOptionPane.showMessageDialog(rootPane, "Cita agendada");
                        String fechaMartes = botonM.getText();
                        
                        RegistroCitas.txtFechaDeCita.setText(fechaMartes);
                    }    
                });
            }
            
            
            
            
        }
        
        
    }
    public void crearCitasK(){
        for (int i = 1,j=8; i < AgregarCitas.cantidadDeCitasK+1&&j<=16; i++,j++) {
            if (j <= 12) {
                JButton botonK = new JButton("Miercoles"+": "+j+"am");
                panelMiercoles.add(botonK);
                botonK.addActionListener((ActionEvent e) -> {
                    int seleccion = JOptionPane.showConfirmDialog(rootPane, "¿Desea agendar su cita?");
                    
                    if(seleccion == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(rootPane, "Cita agendada");
                        String fechaMiercoles = botonK.getText();
                        
                        RegistroCitas.txtFechaDeCita.setText(fechaMiercoles);
                        
                        
                    }
                    else{
                        System.out.println("No esta entrando");
                    }    
                });  
            }
            else{
                JButton botonK = new JButton("Miercoles"+": "+j+"pm");
                panelMiercoles.add(botonK);
                botonK.addActionListener((ActionEvent e) -> {
                    int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea agendar su cita?");
                    
                    if(seleccion == JOptionPane.YES_OPTION) {
                        
                        JOptionPane.showMessageDialog(rootPane, "Cita agendada");
                        String fechaMiercoles = botonK.getText();
                        
                        RegistroCitas.txtFechaDeCita.setText(fechaMiercoles);
                    }    
                });
            }
            
            
            
            
        }
        
        
    }
    public void crearCitasJ(){
        for (int i = 1,j=8; i < AgregarCitas.cantidadDeCitasJ+1&&j<=16; i++,j++) {
            
            if (j <= 12) {
                JButton botonJ = new JButton("Jueves"+": "+j+"am");
                panelJueves.add(botonJ);
                botonJ.addActionListener((ActionEvent e) -> {
                    int seleccion = JOptionPane.showConfirmDialog(rootPane, "¿Desea agendar su cita?");
                    
                    if(seleccion == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(rootPane, "Cita agendada");
                        String fechaJueves = botonJ.getText();
                        
                        RegistroCitas.txtFechaDeCita.setText(fechaJueves);
                        
                        
                    }
                    else{
                        System.out.println("No esta entrando");
                    }    
                });  
            }
            else{
                JButton botonJ = new JButton("Jueves"+": "+j+"pm");
                panelJueves.add(botonJ);
                botonJ.addActionListener((ActionEvent e) -> {
                    int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea agendar su cita?");
                    
                    if(seleccion == JOptionPane.YES_OPTION) {
                        
                        JOptionPane.showMessageDialog(rootPane, "Cita agendada");
                        String fechaJueves = botonJ.getText();
                        
                        RegistroCitas.txtFechaDeCita.setText(fechaJueves);
                    }    
                });
            }    
            
            
            
            
            
        }
        
        
    }
    public void crearCitasV(){
        for (int i = 1,j=8; i < AgregarCitas.cantidadDeCitasV+1&&j<=16; i++,j++) {
            if (j <= 12) {
                JButton botonV = new JButton("Viernes"+": "+j+"am");
                panelViernes.add(botonV);
                botonV.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                       int seleccion = JOptionPane.showConfirmDialog(rootPane, "¿Desea agendar su cita?");
                        
                        if(seleccion == JOptionPane.YES_OPTION) {
                            JOptionPane.showMessageDialog(rootPane, "Cita agendada");
                            String fechaViernes = botonV.getText();
                            
                            RegistroCitas.txtFechaDeCita.setText(fechaViernes);
                            
                                  
                        }
                        else{
                            System.out.println("No esta entrando"); 
                       }
                    }    
                });  
            }
            else{
                JButton botonV = new JButton("Viernes"+": "+j+"pm");
                panelViernes.add(botonV);
                botonV.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                       int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea agendar su cita?");
                        
                        if(seleccion == JOptionPane.YES_OPTION) {
                            
                            JOptionPane.showMessageDialog(rootPane, "Cita agendada");
                            String fecha = botonV.getText();
                            
                            RegistroCitas.txtFechaDeCita.setText(fecha);
                        }
                    }    
                });
            }    
            
            
            
            
            
        }
        
        
    }
    public void crearCitasS(){
        for (int i = 1,j=8; i < AgregarCitas.cantidadDeCitasS+1&&j<=16; i++,j++) {
            if (j <= 12) {
                JButton botonS = new JButton("Sabado"+": "+j+"am");
                panelSabado.add(botonS);
                botonS.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                       int seleccion = JOptionPane.showConfirmDialog(rootPane, "¿Desea agendar su cita?");
                        
                        if(seleccion == JOptionPane.YES_OPTION) {
                            JOptionPane.showMessageDialog(rootPane, "Cita agendada");
                            String fechaSabado = botonS.getText();
                            
                            RegistroCitas.txtFechaDeCita.setText(fechaSabado);
                            
                                  
                        }
                        else{
                            System.out.println("No esta entrando"); 
                       }
                    }    
                });  
            }
            else{
                JButton botonS = new JButton("Sabado"+": "+j+"pm");
                panelSabado.add(botonS);
                botonS.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                       int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea agendar su cita?");
                        
                        if(seleccion == JOptionPane.YES_OPTION) {
                            
                            JOptionPane.showMessageDialog(rootPane, "Cita agendada");
                            String fecha = botonS.getText();
                            
                            RegistroCitas.txtFechaDeCita.setText(fecha);
                        }
                    }    
                });
            }    
            
            
            
            
            
        }
        
        
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelLunes = new javax.swing.JPanel();
        panelMartes = new javax.swing.JPanel();
        panelMiercoles = new javax.swing.JPanel();
        panelJueves = new javax.swing.JPanel();
        panelViernes = new javax.swing.JPanel();
        panelSabado = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Horarios Disponibles");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 0, -1, -1));

        panelLunes.setForeground(new java.awt.Color(255, 255, 255));
        panelLunes.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(panelLunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 780, 64));

        panelMartes.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(panelMartes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 780, 65));

        panelMiercoles.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(panelMiercoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 780, 69));

        panelJueves.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(panelJueves, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 780, 66));

        panelViernes.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(panelViernes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 780, 67));

        panelSabado.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(panelSabado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 780, 69));

        jLabel2.setText("Lunes:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel3.setText("Martes:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel4.setText("Miercoles:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel5.setText("Jueves:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel6.setText("Viernes:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel7.setText("Sábado:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 84, 37));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/calendario-reloj-como-simbolo-icono-evento-programado-esperando-dibujos-animados-plano-aislado_101884-758.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaDeFechas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaDeFechas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaDeFechas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaDeFechas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaDeFechas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel panelJueves;
    private static javax.swing.JPanel panelLunes;
    private javax.swing.JPanel panelMartes;
    private javax.swing.JPanel panelMiercoles;
    private javax.swing.JPanel panelSabado;
    private javax.swing.JPanel panelViernes;
    // End of variables declaration//GEN-END:variables
}
