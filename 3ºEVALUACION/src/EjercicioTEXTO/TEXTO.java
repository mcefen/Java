/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioTEXTO;
import java.awt.Color;
import java.awt.Font;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author Jon
 */
public class TEXTO extends javax.swing.JFrame {

    /**
     * Creates new form TEXTO
     */
    public TEXTO() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        campo = new javax.swing.JTextField();
        red = new javax.swing.JRadioButton();
        green = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        izquierda = new javax.swing.JRadioButton();
        centro = new javax.swing.JRadioButton();
        derecha = new javax.swing.JRadioButton();
        boton = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setText("Tratamiento de Texto");

        campo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo.setText("Esto es texto");

        buttonGroup1.add(red);
        red.setText("Rojo");
        red.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                redItemStateChanged(evt);
            }
        });

        buttonGroup1.add(green);
        green.setText("Verde");
        green.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                greenItemStateChanged(evt);
            }
        });

        jCheckBox1.setText("Cursiva");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });

        jCheckBox2.setText("Negrita");
        jCheckBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox2ItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(java.awt.Color.blue);
        jLabel2.setText("Fon...");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 51));
        jLabel3.setText("Alineac...");

        buttonGroup2.add(izquierda);
        izquierda.setText("Izk");
        izquierda.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                izquierdaItemStateChanged(evt);
            }
        });

        buttonGroup2.add(centro);
        centro.setText("Centre");
        centro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                centroItemStateChanged(evt);
            }
        });

        buttonGroup2.add(derecha);
        derecha.setText("Der");
        derecha.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                derechaItemStateChanged(evt);
            }
        });

        boton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boton.setText("Autor");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox2)
                                .addGap(294, 294, 294)
                                .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(red)
                                        .addGap(18, 18, 18)
                                        .addComponent(green)
                                        .addGap(216, 216, 216)
                                        .addComponent(centro)
                                        .addGap(18, 18, 18)
                                        .addComponent(derecha)))
                                .addGap(8, 8, 8)
                                .addComponent(izquierda))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(red)
                    .addComponent(green)
                    .addComponent(izquierda)
                    .addComponent(centro)
                    .addComponent(derecha))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(3, 3, 3)
                        .addComponent(jCheckBox2)
                        .addGap(78, 78, 78))
                    .addComponent(boton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_formWindowClosed

    private void redItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_redItemStateChanged
        // TODO add your handling code here:       
        campo.setBackground(Color.red); 
    }//GEN-LAST:event_redItemStateChanged

    private void greenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_greenItemStateChanged
        // TODO add your handling code here:
        campo.setBackground(Color.GREEN);
    }//GEN-LAST:event_greenItemStateChanged

    private void centroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_centroItemStateChanged
        // TODO add your handling code here: 
        campo.setHorizontalAlignment(campo.CENTER);
        
    }//GEN-LAST:event_centroItemStateChanged

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        // TODO add your handling code here:
        Font letracursiva = new Font("Serif",Font.ITALIC,14);
        campo.setFont(letracursiva);
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox2ItemStateChanged
        // TODO add your handling code here:
        Font letranegra = new Font("Serif",Font.BOLD,14);
        campo.setFont(letranegra);
    }//GEN-LAST:event_jCheckBox2ItemStateChanged

    private void derechaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_derechaItemStateChanged
        // TODO add your handling code here:
        campo.setHorizontalAlignment(campo.RIGHT);
    }//GEN-LAST:event_derechaItemStateChanged

    private void izquierdaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_izquierdaItemStateChanged
        // TODO add your handling code here:
        campo.setHorizontalAlignment(campo.LEFT);
    }//GEN-LAST:event_izquierdaItemStateChanged

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        // TODO add your handling code here:
        String cadena="Jonathan Ortiz";
        JOptionPane.showMessageDialog(
         null, cadena, "Autor",JOptionPane.CANCEL_OPTION);
    
         
    }//GEN-LAST:event_botonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TEXTO().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField campo;
    private javax.swing.JRadioButton centro;
    private javax.swing.JRadioButton derecha;
    private javax.swing.JRadioButton green;
    private javax.swing.JRadioButton izquierda;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton red;
    // End of variables declaration//GEN-END:variables
}
