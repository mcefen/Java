/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalBD;

import static FinalBD.Socios.conn;
import com.sun.istack.internal.logging.Logger;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juansergio
 */
public class Peliculas extends javax.swing.JFrame {

    static Connection conn;
    static Statement st;

    /**
     * Creates new form Peliculas
     */
    public Peliculas() {
        initComponents();
        getContentPane().setBackground(new Color(50, 51, 151));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        titulo = new javax.swing.JTextField();
        genero = new javax.swing.JTextField();
        fecha_hora = new javax.swing.JTextField();
        director = new javax.swing.JTextField();
        codigo_pelicula = new javax.swing.JTextField();
        argumento = new javax.swing.JTextField();
        Nuevo = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        Consultar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(249, 236, 43));
        jLabel1.setText("INGRESO DE PELÍCULAS");

        jLabel2.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(249, 236, 43));
        jLabel2.setText("Titulo");

        jLabel3.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(249, 236, 43));
        jLabel3.setText("Género");

        jLabel4.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(249, 236, 43));
        jLabel4.setText("Fecha");

        jLabel5.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(249, 236, 43));
        jLabel5.setText("Director");

        jLabel6.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(249, 236, 43));
        jLabel6.setText("Código película");

        jLabel7.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(249, 236, 43));
        jLabel7.setText("Argumento");

        director.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directorActionPerformed(evt);
            }
        });

        codigo_pelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigo_peliculaActionPerformed(evt);
            }
        });

        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        Consultar.setText("Consultar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código película", "Titulo", "Director", "Género", "Fecha", "Argumento"
            }
        ));
        jScrollPane2.setViewportView(Tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 86, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(Limpiar)
                                .addGap(30, 30, 30)
                                .addComponent(Modificar)
                                .addGap(18, 18, 18)
                                .addComponent(Consultar)
                                .addGap(26, 26, 26)
                                .addComponent(Salir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Nuevo)
                                .addGap(340, 340, 340)))
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fecha_hora)
                            .addComponent(director)
                            .addComponent(genero)
                            .addComponent(titulo)
                            .addComponent(argumento)
                            .addComponent(codigo_pelicula)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigo_pelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(director, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecha_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(argumento, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nuevo)
                    .addComponent(Limpiar)
                    .addComponent(Modificar)
                    .addComponent(Consultar)
                    .addComponent(Salir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void directorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_directorActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        dispose();
        inicio2 ini = new inicio2();
        ini.setLocationRelativeTo(null);
        ini.setVisible(true);

    }//GEN-LAST:event_SalirActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/videoclub?zeroDateTimeBehavior=convertToNull", "root", "123456");
            st = conn.createStatement();//consulta la bd

            st.executeUpdate("insert into pelicula(Codigo_Pelicula, Titulo, Director, Genero, Fecha_Hora, Argumento)"
                    + "values('" + codigo_pelicula.getText() + "','" + titulo.getText()
                    + "','" + director.getText() + "','" + genero.getText() + "','"
                    + fecha_hora.getText() + "','" + argumento.getText() + "')");
            JOptionPane.showMessageDialog(null, "SE HA CREADO LA PELÍCULA");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            System.exit(1);

        }
    }//GEN-LAST:event_NuevoActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        titulo.setText("");
        genero.setText("");
        fecha_hora.setText("");
        director.setText("");
        codigo_pelicula.setText("");
        argumento.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        DefaultTableModel tablaDefecto = new DefaultTableModel();
        tablaDefecto.addColumn("CODIGO");
        tablaDefecto.addColumn("TITULO");
        tablaDefecto.addColumn("DIRECTOR");
        tablaDefecto.addColumn("GÉNERO");
        tablaDefecto.addColumn("FECHA");
        tablaDefecto.addColumn("ARGUMENTO");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/videoclub?zeroDateTimeBehavior=convertToNull", "root", "123456");
            st = conn.createStatement();

            ResultSet resultado = st.executeQuery("select * FROM pelicula ORDER BY Codigo_Pelicula");

            while (resultado.next()) {
                Object[] datos = new Object[6];
                for (int i = 0; i < 6; i++) {
                    datos[i] = resultado.getObject(i + 1);
                }
                tablaDefecto.addRow(datos);

            }
            Tabla.setModel(tablaDefecto);

        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_ConsultarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        try {
            if (!"".equals(titulo.getText())) {
                String Query = "update pelicula set Titulo = '" + titulo.getText() + "' where Codigo_Pelicula = " + codigo_pelicula.getText() + ";";
                Statement st = conn.createStatement();
                st.executeUpdate(Query);
            }
            if (!"".equals(director.getText())) {
                String Query = "update pelicula set Director = '" + director.getText() + "' where Codigo_Pelicula = " + codigo_pelicula.getText() + ";";
                Statement st = conn.createStatement();
                st.executeUpdate(Query);
            }
            if (!"".equals(genero.getText())) {
                String Query = "update pelicula set Genero = '" + genero.getText() + "' where Codigo_Pelicula = " + codigo_pelicula.getText() + ";";
                Statement st = conn.createStatement();
                st.executeUpdate(Query);
            }
            if (!"".equals(fecha_hora.getText())) {
                String Query = "update pelicula set Fecha_Hora = '" + fecha_hora.getText() + "' where Codigo_Pelicula = " + codigo_pelicula.getText() + ";";
                Statement st = conn.createStatement();
                st.executeUpdate(Query);
            }
            if (!"".equals(argumento.getText())) {
                String Query = "update pelicula set Argumento = '" + argumento.getText() + "' where Codigo_Pelicula = " + codigo_pelicula.getText() + ";";
                Statement st = conn.createStatement();
                st.executeUpdate(Query);
            }
            JOptionPane.showMessageDialog(null, "SE HA MODIFICADO LA TABLA");

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void codigo_peliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigo_peliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigo_peliculaActionPerformed

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
            java.util.logging.Logger.getLogger(Peliculas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Peliculas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Peliculas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Peliculas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Peliculas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consultar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Nuevo;
    private javax.swing.JButton Salir;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField argumento;
    private javax.swing.JTextField codigo_pelicula;
    private javax.swing.JTextField director;
    private javax.swing.JTextField fecha_hora;
    private javax.swing.JTextField genero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
}
