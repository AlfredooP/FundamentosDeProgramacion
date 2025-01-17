/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fd_2022_10_10_promedio;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author aa506
 */
public class JFramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFramePrincipal
     */
    public JFramePrincipal() {
        initComponents();
        //este código se ejecuta antes de que el usuario interactue con la aplicacion
        ocultarEtiquetas();
        
    }
    
    public void ocultarEtiquetas()
    {
        jLabelCurso.setVisible(false);
        jLabelExamenes.setVisible(false);
        jLabel100.setVisible(false);
        jLabelMencion.setVisible(false);
        
        jLabelPromedio.setBackground(Color.cyan);
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
        jTextFisica = new javax.swing.JTextField();
        jTextQuimica = new javax.swing.JTextField();
        jTextMate = new javax.swing.JTextField();
        jButtonCalcular = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jButtonAleatorio = new javax.swing.JButton();
        jLabelPromedio = new javax.swing.JLabel();
        jLabelExamenes = new javax.swing.JLabel();
        jLabelCurso = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabelMencion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Fisica");

        jLabel2.setText("Química");

        jLabel3.setText("Matemáticas");

        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jButtonBorrar.setText("Borrar");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jButtonAleatorio.setText("Aleatorio");
        jButtonAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAleatorioActionPerformed(evt);
            }
        });

        jLabelPromedio.setBackground(new java.awt.Color(0, 255, 255));
        jLabelPromedio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPromedio.setOpaque(true);

        jLabelExamenes.setBackground(new java.awt.Color(0, 255, 255));
        jLabelExamenes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExamenes.setText("Aprobó los tres exámenes");
        jLabelExamenes.setOpaque(true);

        jLabelCurso.setBackground(new java.awt.Color(255, 255, 51));
        jLabelCurso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCurso.setText("Debe llevar el curso de Regularización");
        jLabelCurso.setOpaque(true);

        jLabel100.setBackground(new java.awt.Color(0, 255, 255));
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setText("Obtuvo al menos un 100");
        jLabel100.setOpaque(true);

        jLabelMencion.setBackground(new java.awt.Color(0, 255, 255));
        jLabelMencion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMencion.setText("Obtuvo mención honorífica!!!");
        jLabelMencion.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelPromedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextMate, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextQuimica, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCalcular)
                            .addComponent(jButtonBorrar)
                            .addComponent(jButtonAleatorio)))
                    .addComponent(jLabelExamenes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel100, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelMencion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCalcular))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextQuimica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBorrar))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextMate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAleatorio))
                .addGap(60, 60, 60)
                .addComponent(jLabelPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabelCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelExamenes, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMencion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        // TODO add your handling code here:
        jTextFisica.setText("");
        jTextQuimica.setText("");
        jTextMate.setText("");
        
        jLabelPromedio.setText("");
        
        ocultarEtiquetas();
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jButtonAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAleatorioActionPerformed
        // TODO add your handling code here:
        Random azar = new Random();
        
        jTextFisica.setText(30 + azar.nextInt(71) + "");
        jTextQuimica.setText(30 + azar.nextInt(71) + "");
        jTextMate.setText(30 + azar.nextInt(71) + "");
        
        jLabelPromedio.setText("");
        
        ocultarEtiquetas();
    }//GEN-LAST:event_jButtonAleatorioActionPerformed

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        // TODO add your handling code here:
        int fisica, quimica, mate;
        double promedio;
        
        fisica = Integer.parseInt(jTextFisica.getText());
        quimica = Integer.parseInt(jTextQuimica.getText());
        mate = Integer.parseInt(jTextMate.getText());
        
        promedio = (fisica + quimica + mate) / 3;
        
        ocultarEtiquetas();
        
        if(promedio >= 70)
            jLabelPromedio.setText("Acreditó con " + promedio);
        else
        {
            jLabelPromedio.setText("No acreditó. Promedio= " + promedio);
            jLabelPromedio.setBackground(Color.red);
            
            if(promedio < 40)
                jLabelCurso.setVisible(true);            
        }
        
        if(fisica >= 70 && quimica >= 70 && mate >= 70)
            jLabelExamenes.setVisible(true);
        
        if(fisica == 100 || quimica == 100 || mate == 100)
            jLabel100.setVisible(true);
        
        if(fisica > 95 && quimica > 95 && mate > 95)
            jLabelMencion.setVisible(true);
    }//GEN-LAST:event_jButtonCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAleatorio;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCurso;
    private javax.swing.JLabel jLabelExamenes;
    private javax.swing.JLabel jLabelMencion;
    private javax.swing.JLabel jLabelPromedio;
    private javax.swing.JTextField jTextFisica;
    private javax.swing.JTextField jTextMate;
    private javax.swing.JTextField jTextQuimica;
    // End of variables declaration//GEN-END:variables
}
