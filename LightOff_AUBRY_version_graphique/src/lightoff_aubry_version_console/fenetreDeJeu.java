/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lightoff_aubry_version_console;

/**
 *
 * @author bapti
 */
public class fenetreDeJeu extends javax.swing.JFrame {

    /**
     * Creates new form fenetreDeJeu
     */
    public fenetreDeJeu() {
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

        panneau_grille = new javax.swing.JPanel();
        panneau_infos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_start = new javax.swing.JButton();
        btn_col_2 = new javax.swing.JButton();
        btn_diag_mont = new javax.swing.JButton();
        btn_col_0 = new javax.swing.JButton();
        btn_col_1 = new javax.swing.JButton();
        btn_col_3 = new javax.swing.JButton();
        btn_col_4 = new javax.swing.JButton();
        btn_col_5 = new javax.swing.JButton();
        btn_col_6 = new javax.swing.JButton();
        btn_diag_desc = new javax.swing.JButton();
        btn_ligne_0 = new javax.swing.JButton();
        btn_ligne_1 = new javax.swing.JButton();
        btn_ligne_2 = new javax.swing.JButton();
        btn_ligne_3 = new javax.swing.JButton();
        btn_ligne_4 = new javax.swing.JButton();
        btn_ligne_5 = new javax.swing.JButton();
        btn_ligne_6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(255, 255, 255));
        panneau_grille.setLayout(new java.awt.GridLayout(7, 7));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 672, 600));

        panneau_infos.setBackground(new java.awt.Color(204, 255, 204));
        panneau_infos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre de coups utilisés :");
        panneau_infos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 20));

        jLabel2.setText("nombre de coups maximum :");
        panneau_infos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        btn_start.setText("Démarrer la Partie");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        panneau_infos.add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        getContentPane().add(panneau_infos, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 250, 200));

        btn_col_2.setText("3");
        btn_col_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, -1));

        btn_diag_mont.setText("/");
        btn_diag_mont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_diag_montActionPerformed(evt);
            }
        });
        getContentPane().add(btn_diag_mont, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, -1, -1));

        btn_col_0.setText("1");
        getContentPane().add(btn_col_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 0, -1, -1));

        btn_col_1.setText("2");
        getContentPane().add(btn_col_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 0, -1, -1));

        btn_col_3.setText("4");
        btn_col_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 0, -1, -1));

        btn_col_4.setText("5");
        btn_col_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 0, -1, -1));

        btn_col_5.setText("6");
        btn_col_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 0, -1, -1));

        btn_col_6.setText("7");
        getContentPane().add(btn_col_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(654, 0, -1, -1));

        btn_diag_desc.setText("\\");
            getContentPane().add(btn_diag_desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

            btn_ligne_0.setText("A");
            getContentPane().add(btn_ligne_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

            btn_ligne_1.setText("B");
            btn_ligne_1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn_ligne_1ActionPerformed(evt);
                }
            });
            getContentPane().add(btn_ligne_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

            btn_ligne_2.setText("C");
            btn_ligne_2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn_ligne_2ActionPerformed(evt);
                }
            });
            getContentPane().add(btn_ligne_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, -1, -1));

            btn_ligne_3.setText("D");
            btn_ligne_3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn_ligne_3ActionPerformed(evt);
                }
            });
            getContentPane().add(btn_ligne_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, -1));

            btn_ligne_4.setText("E");
            btn_ligne_4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn_ligne_4ActionPerformed(evt);
                }
            });
            getContentPane().add(btn_ligne_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, -1));

            btn_ligne_5.setText("F");
            btn_ligne_5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn_ligne_5ActionPerformed(evt);
                }
            });
            getContentPane().add(btn_ligne_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, -1, -1));

            btn_ligne_6.setText("G");
            btn_ligne_6.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn_ligne_6ActionPerformed(evt);
                }
            });
            getContentPane().add(btn_ligne_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, -1, -1));

            setBounds(0, 0, 1044, 672);
        }// </editor-fold>//GEN-END:initComponents

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_startActionPerformed

    private void btn_diag_montActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_diag_montActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_diag_montActionPerformed

    private void btn_ligne_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ligne_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ligne_1ActionPerformed

    private void btn_ligne_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ligne_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ligne_2ActionPerformed

    private void btn_ligne_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ligne_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ligne_3ActionPerformed

    private void btn_ligne_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ligne_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ligne_4ActionPerformed

    private void btn_ligne_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ligne_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ligne_5ActionPerformed

    private void btn_ligne_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ligne_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ligne_6ActionPerformed

    private void btn_col_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col_3ActionPerformed

    private void btn_col_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col_5ActionPerformed

    private void btn_col_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col_2ActionPerformed

    private void btn_col_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col_4ActionPerformed

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
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetreDeJeu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_col_0;
    private javax.swing.JButton btn_col_1;
    private javax.swing.JButton btn_col_2;
    private javax.swing.JButton btn_col_3;
    private javax.swing.JButton btn_col_4;
    private javax.swing.JButton btn_col_5;
    private javax.swing.JButton btn_col_6;
    private javax.swing.JButton btn_diag_desc;
    private javax.swing.JButton btn_diag_mont;
    private javax.swing.JButton btn_ligne_0;
    private javax.swing.JButton btn_ligne_1;
    private javax.swing.JButton btn_ligne_2;
    private javax.swing.JButton btn_ligne_3;
    private javax.swing.JButton btn_ligne_4;
    private javax.swing.JButton btn_ligne_5;
    private javax.swing.JButton btn_ligne_6;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_infos;
    // End of variables declaration//GEN-END:variables
}
