/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lightoff_aubry_version_console;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultButtonModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author bapti
 */
public class fenetreDeJeu extends javax.swing.JFrame {

    GrilleDeJeu grille;
    int nbCoups;
    int nbCoupsMax;
    int nbLignes;
    int nbColonnes;
    int i;
    static int difficulte;

    /**
     * Creates new form fenetreDeJeu
     *
     * @param difficulte
     */
    public fenetreDeJeu(int difficulte) {
        customInitComponents();

        panneau_grille.setVisible(false);
        panneau_infos.setVisible(false);
        fenetreDeJeu.difficulte = difficulte;
        int n;

        panneau_infos.setVisible(true);
        panneau_grille.setVisible(true);
        switch (difficulte) {
            case 1:
                n = 10;
                nbCoupsMax = 25;
                nbLignes = nbColonnes = 7;
                break;
            case 2:
                n = 30;
                nbCoupsMax = 20;
                nbLignes = nbColonnes = 10;
                break;
            default:
                n = 150;
                nbCoupsMax = 18;
                nbLignes = 10;
                nbColonnes = 13;
                break;
        }
        grille = new GrilleDeJeu(nbLignes, nbColonnes);
        // mélange la grille
        grille.genererMatriceAleatoire(n);

        int nbCoupsRestants = nbCoupsMax - nbCoups;
        lbl_coupsUtilises.setText(Integer.toString(nbCoups));
        lbl_coupsRestants.setText(Integer.toString(nbCoupsRestants));

        panneau_grille.setLayout(new java.awt.GridLayout(nbLignes, nbColonnes));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 50 * nbColonnes, 50 * nbLignes));

        for (int k = 0; k < nbLignes; k++) {
            for (int j = 0; j < nbColonnes; j++) {
                CelluleGraphique cellGraph = new CelluleGraphique(grille.matriceCellules[k][j]);
                panneau_grille.add(cellGraph);
                //cellGraph.setEnabled(false);
                // permets de mettre les boutons non cliquables sans les mettres en grisés
                cellGraph.setModel(new DefaultButtonModel() {
                    @Override
                    public boolean isArmed() {
                        return false;
                    }

                    @Override
                    public boolean isPressed() {
                        return false;
                    }
                });
            }
        }

        panneau_grille.repaint();

        //affichage des boutons
        panneau_boutons_lignes.setLayout(new java.awt.GridLayout(nbLignes, 1));
        panneau_boutons_colonnes.setLayout(new java.awt.GridLayout(1, nbColonnes));
        getContentPane().add(panneau_boutons_lignes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 50, 50 * nbLignes));
        getContentPane().add(panneau_boutons_colonnes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50 * nbColonnes, 50));
        getContentPane().add(panneau_diag_desc_haut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));
        getContentPane().add(panneau_diag_mont_haut, new org.netbeans.lib.awtextra.AbsoluteConstraints(50 * (nbColonnes + 1), 0, 50, 50));
        getContentPane().add(panneau_diag_mont_bas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50 * (nbLignes + 1), 50, 50));
        getContentPane().add(panneau_diag_desc_bas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50 * (nbColonnes + 1), 50 * (nbLignes + 1), 50, 50));

        this.pack();
        this.revalidate();

        //ajout des boutons verticaux dans le pannel
        for (i = 0; i < nbLignes; i++) {
            JButton bouton_ligne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerLigneDeCellules(j);
                    nbCoups++;
                    repaint();
                    refreshInfos();
                    testFinDePartie();
                }
            };
            bouton_ligne.addActionListener(ecouteurClick);
            panneau_boutons_lignes.add(bouton_ligne);
        }
        //ajout des boutons horizontaux dans le pannel
        for (i = 0; i < nbColonnes; i++) {
            JButton bouton_colonne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerColonneDeCellules(j);
                    nbCoups++;
                    repaint();
                    refreshInfos();
                    testFinDePartie();
                }
            };
            bouton_colonne.addActionListener(ecouteurClick);
            panneau_boutons_colonnes.add(bouton_colonne);
        }

        JButton bouton_diag_desc = new JButton();
        ActionListener ecouteurClick = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                grille.activerDiagonaleDescendanteHaut();
                nbCoups++;
                repaint();
                refreshInfos();
                testFinDePartie();
            }
        };
        bouton_diag_desc.addActionListener(ecouteurClick);
        panneau_diag_desc_haut.add(bouton_diag_desc);

        JButton bouton_diag_mont = new JButton();
        ActionListener ecouteurClick1 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                grille.activerDiagonaleMontanteHaut();
                nbCoups++;
                repaint();
                refreshInfos();
                testFinDePartie();
            }
        };
        bouton_diag_mont.addActionListener(ecouteurClick1);
        panneau_diag_mont_haut.add(bouton_diag_mont);

        JButton bouton_diag_mont_bas = new JButton();
        ActionListener ecouteurClick2 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //activer diagonale montante du bas
                grille.activerDiagonaleMontanteBas();
                nbCoups++;
                repaint();
                refreshInfos();
                testFinDePartie();
            }
        };
        bouton_diag_mont_bas.addActionListener(ecouteurClick2);
        panneau_diag_mont_bas.add(bouton_diag_mont_bas);

        JButton bouton_diag_desc_bas = new JButton();
        ActionListener ecouteurClick3 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //activer diagonale montante du bas
                grille.activerDiagonaleDescBas();
                nbCoups++;
                repaint();
                refreshInfos();
                testFinDePartie();
            }
        };
        bouton_diag_desc_bas.addActionListener(ecouteurClick3);
        panneau_diag_desc_bas.add(bouton_diag_desc_bas);

        customizeButtons(bouton_diag_desc);
        customizeButtons(bouton_diag_mont);
        customizeButtons(bouton_diag_mont_bas);
        customizeButtons(bouton_diag_desc_bas);

        jLabel1.setHorizontalAlignment(JLabel.CENTER);
        lbl_coupsUtilises.setHorizontalAlignment(JLabel.CENTER);
        lbl_coupsRestants.setHorizontalAlignment(JLabel.CENTER);

        getContentPane().setBackground(Color.WHITE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
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
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        panneau_grille = new javax.swing.JPanel();
        panneau_infos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_coupsUtilises = new javax.swing.JLabel();
        lbl_coupsRestants = new javax.swing.JLabel();
        panneau_boutons_lignes = new javax.swing.JPanel();
        panneau_boutons_colonnes = new javax.swing.JPanel();
        panneau_diag_desc_haut = new javax.swing.JPanel();
        panneau_diag_mont_haut = new javax.swing.JPanel();
        panneau_diag_mont_bas = new javax.swing.JPanel();
        panneau_diag_desc_bas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(153, 153, 255));
        panneau_grille.setRequestFocusEnabled(false);
        panneau_grille.setLayout(new java.awt.GridLayout(7, 7));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 672, 645));

        panneau_infos.setBackground(new java.awt.Color(153, 51, 255));
        panneau_infos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel1.setText("Infos partie");
        panneau_infos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 140, 30));

        jLabel2.setText("Coups utilisés :");
        panneau_infos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setText("Coups restants :");
        panneau_infos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        lbl_coupsUtilises.setText("CoupsUtilises");
        panneau_infos.add(lbl_coupsUtilises, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        lbl_coupsRestants.setText("CoupsRestants");
        panneau_infos.add(lbl_coupsRestants, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        getContentPane().add(panneau_infos, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, 250, 220));

        panneau_boutons_lignes.setBackground(new java.awt.Color(0, 0, 0));
        panneau_boutons_lignes.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(panneau_boutons_lignes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 50, 260));

        panneau_boutons_colonnes.setBackground(new java.awt.Color(0, 0, 0));
        panneau_boutons_colonnes.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(panneau_boutons_colonnes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 280, 50));

        panneau_diag_desc_haut.setBackground(new java.awt.Color(0, 0, 0));
        panneau_diag_desc_haut.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(panneau_diag_desc_haut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        panneau_diag_mont_haut.setBackground(new java.awt.Color(0, 0, 0));
        panneau_diag_mont_haut.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(panneau_diag_mont_haut, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 50, 50));

        panneau_diag_mont_bas.setBackground(new java.awt.Color(0, 0, 0));
        panneau_diag_mont_bas.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(panneau_diag_mont_bas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 50, 50));

        panneau_diag_desc_bas.setBackground(new java.awt.Color(0, 0, 0));
        panneau_diag_desc_bas.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(panneau_diag_desc_bas, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 670, 60, 60));

        setBounds(0, 0, 1044, 740);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(fenetreDeJeu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new fenetreDeJeu(difficulte).setVisible(true);
            }
        });
    }

    private void customInitComponents() {
        initComponents();

        // Set background color to black
        getContentPane().setBackground(Color.BLACK);

        // Customize fonts
        Font customFont = new Font("Arial", Font.PLAIN, 14);
        jLabel1.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lbl_coupsUtilises.setFont(customFont);
        lbl_coupsRestants.setFont(customFont);

    }

    private void customizeButtons(JButton button) {
        button.setBackground(Color.DARK_GRAY);
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.PLAIN, 14));
    }

    public boolean grilleEteinte() {
        boolean estEteinte = true;
        for (int k = 0; k < nbLignes; k++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (!grille.matriceCellules[k][j].estEteint()) {
                    estEteinte = false;
                    break;
                }
            }
        }

        return estEteinte;
    }

    public void grilleInvisible() {
        panneau_grille.setVisible(false);
        boutonsVisibles(false);
    }

    public void grilleVisible() {
        panneau_grille.setVisible(true);
        boutonsVisibles(true);

    }

    public void refreshInfos() {
        int nbCoupsRestants = nbCoupsMax - nbCoups;
        lbl_coupsUtilises.setText(Integer.toString(nbCoups));
        lbl_coupsRestants.setText(Integer.toString(nbCoupsRestants));
    }

    public boolean aGagne() {
        boolean gagne = false;
        if (this.grilleEteinte()) {
            gagne = true;
        }
        return gagne;
    }

    public boolean aPerdu() {
        boolean perdu = false;
        if (nbCoups > nbCoupsMax) {
            perdu = true;
        }
        return perdu;
    }

    public void testFinDePartie() {
        if (aGagne()) {
            FenetreFinDePartie gameOver = new FenetreFinDePartie(true, nbCoups);
            this.dispose();
            gameOver.setVisible(true);

        }
        if (aPerdu()) {
            FenetreFinDePartie gameOver = new FenetreFinDePartie(false, nbCoups);
            this.dispose();
            gameOver.setVisible(true);
        }

    }

    public void boutonsVisibles(boolean opp) {
        panneau_boutons_lignes.setVisible(opp);
        panneau_boutons_colonnes.setVisible(opp);
        panneau_diag_desc_haut.setVisible(opp);
        panneau_diag_mont_haut.setVisible(opp);
        panneau_diag_mont_bas.setVisible(opp);
        panneau_diag_desc_bas.setVisible(opp);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_coupsRestants;
    private javax.swing.JLabel lbl_coupsUtilises;
    private javax.swing.JPanel panneau_boutons_colonnes;
    private javax.swing.JPanel panneau_boutons_lignes;
    private javax.swing.JPanel panneau_diag_desc_bas;
    private javax.swing.JPanel panneau_diag_desc_haut;
    private javax.swing.JPanel panneau_diag_mont_bas;
    private javax.swing.JPanel panneau_diag_mont_haut;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_infos;
    // End of variables declaration//GEN-END:variables
}
