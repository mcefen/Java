
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mati
 */
public class act2 extends javax.swing.JFrame {

    /**
     * Creates new form act2
     */
    public act2() {
        initComponents();
        setTitle("Mini enquesta");
        setLocationRelativeTo(null); 	
    	setResizable(false);
         grupo.add(Windows);
         grupo.add(Mac);
         grupo.add(Linux);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        Windows = new javax.swing.JRadioButton();
        Linux = new javax.swing.JRadioButton();
        Mac = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        Programacion = new javax.swing.JCheckBox();
        Diseño = new javax.swing.JCheckBox();
        Admin = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        temps = new javax.swing.JSlider();
        Boton = new javax.swing.JButton();
        lWindows = new javax.swing.JLabel();
        lMac = new javax.swing.JLabel();
        lLinux = new javax.swing.JLabel();
        lPro = new javax.swing.JLabel();
        lDi = new javax.swing.JLabel();
        lAd = new javax.swing.JLabel();
        lH = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tria el teu sistema operatiu");

        Windows.setText("Windows");
        Windows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WindowsActionPerformed(evt);
            }
        });

        Linux.setText("Linux");
        Linux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LinuxActionPerformed(evt);
            }
        });

        Mac.setText("Mac");
        Mac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MacActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tria la teua especialitat");

        Programacion.setText("Programació");
        Programacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProgramacionActionPerformed(evt);
            }
        });

        Diseño.setText("Diseny grafic");
        Diseño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiseñoActionPerformed(evt);
            }
        });

        Admin.setText("Administració");
        Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Hores dedicades al ordinador");

        temps.setMaximum(10);
        temps.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tempsStateChanged(evt);
            }
        });

        Boton.setBackground(new java.awt.Color(89, 140, 227));
        Boton.setText("Generar");
        Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActionPerformed(evt);
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
                            .addComponent(lWindows)
                            .addComponent(lMac)
                            .addComponent(lLinux))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator2)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Windows)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Linux)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Mac))
                                        .addComponent(jSeparator1)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(temps, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Programacion)
                                .addGap(18, 18, 18)
                                .addComponent(Diseño)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lPro, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lDi, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lAd, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(Admin))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(Boton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(lH, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(lWindows)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lMac)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lLinux))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lPro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lDi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lAd))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Programacion)
                                        .addComponent(Diseño))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Windows)
                            .addComponent(Linux)
                            .addComponent(Mac))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addComponent(Admin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lH, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(temps, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Boton)
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(rootPane, "El te sistema operatiu preferit és "+lLinux.getText()+lMac.getText()+lWindows.getText()+ ", les teues especialitats son "+lPro.getText()+" "+lDi.getText()+" "+lAd.getText()+" i el numero de hores dedicades al Pc son "+lH.getText());
    
    }//GEN-LAST:event_BotonActionPerformed

    private void MacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MacActionPerformed
        // TODO add your handling code here:
        if(Mac.isSelected()){
            lMac.setText(Mac.getText());
            lMac.setVisible(false);
        }
    }//GEN-LAST:event_MacActionPerformed

    private void WindowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WindowsActionPerformed
        // TODO add your handling code here:
        if (Windows.isSelected()){
           lWindows.setText(Windows.getText());
             lWindows.setVisible(false);
        }
    }//GEN-LAST:event_WindowsActionPerformed

    private void LinuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LinuxActionPerformed
        // TODO add your handling code here:
         if (Linux.isSelected()){
            lLinux.setText(Linux.getText());
            lLinux.setVisible(false);
        }
    }//GEN-LAST:event_LinuxActionPerformed

    private void ProgramacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProgramacionActionPerformed
        // TODO add your handling code here:
        if(Programacion.isSelected()){
            lPro.setText(Programacion.getText());
            lPro.setVisible(false);
        }
    }//GEN-LAST:event_ProgramacionActionPerformed

    private void DiseñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiseñoActionPerformed
        // TODO add your handling code here:
         if(Diseño.isSelected()){
            lDi.setText(Diseño.getText());
            lDi.setVisible(false);
        }
    }//GEN-LAST:event_DiseñoActionPerformed

    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed
        // TODO add your handling code here:
         if(Admin.isSelected()){
            lAd.setText(Admin.getText());
            lAd.setVisible(false);
        }
    }//GEN-LAST:event_AdminActionPerformed

    private void tempsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tempsStateChanged
        // TODO add your handling code here:
        int horas = temps.getValue();
                lH.setText(horas+" horas" );
    }//GEN-LAST:event_tempsStateChanged

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
            java.util.logging.Logger.getLogger(act2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(act2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(act2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(act2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new act2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Admin;
    private javax.swing.JButton Boton;
    private javax.swing.JCheckBox Diseño;
    private javax.swing.JRadioButton Linux;
    private javax.swing.JRadioButton Mac;
    private javax.swing.JCheckBox Programacion;
    private javax.swing.JRadioButton Windows;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lAd;
    private javax.swing.JLabel lDi;
    private javax.swing.JLabel lH;
    private javax.swing.JLabel lLinux;
    private javax.swing.JLabel lMac;
    private javax.swing.JLabel lPro;
    private javax.swing.JLabel lWindows;
    private javax.swing.JSlider temps;
    // End of variables declaration//GEN-END:variables
}
