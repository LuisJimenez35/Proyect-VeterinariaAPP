/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinal;

import java.awt.Color;
import java.awt.Font;
import java.util.TreeMap; 
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *  
 * @author LuisM
 */
    
public class VInfo extends javax.swing.JFrame {

    /**
     * Creates new form Vtutoriales
     */
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();
    JTextArea txt1 = new JTextArea();
    JTextArea txt2 = new JTextArea();
    JTextArea txt3 = new JTextArea();
    JTextArea txt4 = new JTextArea();
    JTextArea txt5 = new JTextArea();
    
    TreeMap<String, String> info = new TreeMap<>();
    public VInfo() {
        this.setUndecorated(true);
        initComponents();
        información();
        medidasPaneles();
        medidasTXT();
        
       
       
        
        
    }
   
    public void información(){
        info.put("Sobre Nosotros", """
                                   Somos una veterinaria, dispuestos a cuidar y tener en excelentes condiciones
                                   de tu mascota y ofrecerte el mejor servicio tanto online, como presencial
                                   con ventan en una gran variedad de productos y juguetes para los m\u00e1s chineados
                                   de la casa.""");
        info.put("Sobre Citas", """
                                Nuestra gestion de citas es semanal, estas estar\u00e1n acordadas
                                segun la disposici\u00f3n de nuestro personal de veterinarios
                                estas tiene una duraci\u00f3n de una hora cada una, puede hacer
                                el registro de la cita en el apartado de {Registro de citas}.""");
        info.put("Sobre medicamentos", """
                                       La gran mayoria de medicamentos con venta libre los puedes
                                       econtar en el apartado de {Medicametos y accesorios} 
                                       depende del medicamentos tendr\u00e1s que agendar tu cita
                                       para obtener tu preescripci\u00f3n.""");
        info.put("Sobre Nuestros Veterinarios", """
                                                Contamos con el mejor equipo de veterinarios de puriscal con servicio de 8 horas continuas
                                                y excelente atenci\u00f3n al cliente y profesionalismo.""");
        info.put("Contacto", """
                             Puedes contactarnos en diferentes plataformas
                             Correo: Mypetspuriscal@gmail.com
                             Tel: 24168080
                             WhatsApp: 89197986
                             En caso de alg\u00fan inconveniente de contacto puede visitarnos
                             en nuestra sucursal ubicada em puriscal a un costado del antig\u00fco templo parroquial""");
                          
    }
    public void medidasPaneles(){
        panel1.setBackground(Color.LIGHT_GRAY);
        panel1.setBounds(30, 140, 580, 160);
        panel1.setLayout(new javax.swing.OverlayLayout(panel1));
        panelPrincipal.add(panel1);
        panel1.setVisible(true);
        
        panel2.setBackground(Color.GRAY);
        panel2.setBounds(30, 140, 580, 160);
        panelPrincipal.add(panel2);
        panel2.setLayout(new javax.swing.OverlayLayout(panel2));
        panel2.setVisible(false);
        
        panel3.setBackground(Color.DARK_GRAY);
        panel3.setBounds(30, 140, 580, 160);
        panelPrincipal.add(panel3);
        panel3.setLayout(new javax.swing.OverlayLayout(panel3));
        panel3.setVisible(false);
        
        panel4.setBackground(Color.BLACK);
        panel4.setBounds(30, 140, 580, 160);
        panelPrincipal.add(panel4);
        panel4.setLayout(new javax.swing.OverlayLayout(panel4));
        panel4.setVisible(false);
        
        panel5.setBackground(Color.darkGray);
        panel5.setBounds(30, 140, 580, 160);
        panelPrincipal.add(panel5);
        panel5.setLayout(new javax.swing.OverlayLayout(panel5));
        panel5.setVisible(false);
    
        
    
    }
    public void medidasTXT(){
        txt1.setBounds(30, 140, 580, 160);
        txt1.setFont(Font.getFont("Arial"));
        panel1.add(txt1);
        txt1.setText(info.get("Sobre Nosotros"));
        
        txt2.setBounds(30, 140, 580, 160);
        txt2.setFont(Font.getFont("Arial"));
        panel2.add(txt2);
        
        txt3.setBounds(30, 140, 580, 160);
        txt3.setFont(Font.getFont("Arial"));
        panel3.add(txt3);
        
        txt4.setBounds(30, 140, 580, 160);
        txt4.setFont(Font.getFont("Arial"));
        panel4.add(txt4);
        
        txt5.setBounds(30, 140, 580, 160);
        txt5.setFont(Font.getFont("Arial"));
        panel5.add(txt5);
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnNosotros = new javax.swing.JButton();
        btnSCitas = new javax.swing.JButton();
        btnSMEd = new javax.swing.JButton();
        btnNVet = new javax.swing.JButton();
        panelPrincipal = new javax.swing.JPanel();
        btnContacto = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("®MyPets");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Infromación");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Aqui encontraras información basica sobre nuestra veterinara");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("para facilitarte la estadia esta pagina");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        btnNosotros.setText("Sobre Nosotros");
        btnNosotros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNosotrosActionPerformed(evt);
            }
        });
        getContentPane().add(btnNosotros, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 98, -1, -1));

        btnSCitas.setText("Sobre Citas");
        btnSCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSCitasActionPerformed(evt);
            }
        });
        getContentPane().add(btnSCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 98, -1, -1));

        btnSMEd.setText("Sobre Medicamentos");
        btnSMEd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSMEdActionPerformed(evt);
            }
        });
        getContentPane().add(btnSMEd, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 98, -1, -1));

        btnNVet.setText("Sobre Nuestros Veterinarios");
        btnNVet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNVetActionPerformed(evt);
            }
        });
        getContentPane().add(btnNVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 98, -1, -1));

        panelPrincipal.setLayout(new javax.swing.OverlayLayout(panelPrincipal));
        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 580, 160));

        btnContacto.setText("Contacto");
        btnContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactoActionPerformed(evt);
            }
        });
        getContentPane().add(btnContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 98, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BTN Volcer.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 70, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/InfoImg.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNosotrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNosotrosActionPerformed
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(false);
        
        panel1.setVisible(true);
        
    }//GEN-LAST:event_btnNosotrosActionPerformed

    private void btnSCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSCitasActionPerformed
        panel1.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(false);
        txt2.setText(info.get("Sobre Citas"));
        panel2.setVisible(true);
    }//GEN-LAST:event_btnSCitasActionPerformed

    private void btnSMEdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSMEdActionPerformed
        panel1.setVisible(false);
        panel2.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(false);
        txt3.setText(info.get("Sobre medicamentos"));
        panel3.setVisible(true);
    }//GEN-LAST:event_btnSMEdActionPerformed

    private void btnNVetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNVetActionPerformed
        panel1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel5.setVisible(false);
        txt4.setText(info.get("Sobre Nuestros Veterinarios"));
        panel4.setVisible(true);
    }//GEN-LAST:event_btnNVetActionPerformed

    private void btnContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactoActionPerformed
        panel1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        txt5.setText(info.get("Contacto"));
        panel5.setVisible(true);
    }//GEN-LAST:event_btnContactoActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        VPrincipal vprin = new VPrincipal();
        vprin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

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
            java.util.logging.Logger.getLogger(VInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContacto;
    private javax.swing.JButton btnNVet;
    private javax.swing.JButton btnNosotros;
    private javax.swing.JButton btnSCitas;
    private javax.swing.JButton btnSMEd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
