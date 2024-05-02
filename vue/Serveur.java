/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package restaurant.vue;

import restaurant.Ingredient;
import restaurant.Plat;
import restaurant.Table;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author t.chaumette
 */
public class Serveur extends javax.swing.JFrame {
    private Modele modele;
    /**
     * Creates new form serveur
     */
    public Serveur() {
        modele = new Modele();
        initComponents();
        updateComponents();
        loadModele();
        DefaultListModel listModel = new DefaultListModel();
        commandeTable.setModel(listModel);
    }

    private void saveModele()    {
        try {
            RessouceManager.save(this.modele, "modele.save");
        } catch (Exception e) {
            System.out.println("Erreur lors de la sauvegarde du modele : " + e.getMessage());
        }
    }

    private void loadModele() {
        try {
            this.modele = (Modele) RessouceManager.load("modele.save");
            updateComponents();
        } catch (Exception e) {
            System.out.println("Erreur lors du chargement du modele : " + e.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        Text = new javax.swing.JLabel();
        Text2 = new javax.swing.JLabel();
        tableau = new javax.swing.JScrollPane();
        tableTableau = new javax.swing.JTable();
        tableOccupe = new javax.swing.JButton();
        tableLibre = new javax.swing.JButton();
        Text3 = new javax.swing.JLabel();
        Text4 = new javax.swing.JLabel();
        numTableCommande = new javax.swing.JScrollPane();
        numeroTableCommande = new javax.swing.JList<>();
        afficher = new javax.swing.JButton();
        Text5 = new javax.swing.JLabel();
        commandeListe = new javax.swing.JScrollPane();
        commandeTable = new javax.swing.JList<>();
        supprCommande = new javax.swing.JButton();
        ListePlats = new javax.swing.JScrollPane();
        listesPlats = new javax.swing.JList<>();
        addCommande = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Text.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Text.setText("Serveur");

        Text2.setText("Lister des tables");

        tableTableau.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numéro table", "Occupé"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableau.setViewportView(tableTableau);

        tableOccupe.setText("Occupé");
        tableOccupe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableOccupeActionPerformed(evt);
            }
        });

        tableLibre.setText("Libre");
        tableLibre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableLibreActionPerformed(evt);
            }
        });

        Text3.setText("liste des commandes");

        Text4.setText("Numero table");

        numeroTableCommande.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        numTableCommande.setViewportView(numeroTableCommande);

        afficher.setText("Afficher");
        afficher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afficherActionPerformed(evt);
            }
        });

        Text5.setText("Commande de la table");

        commandeTable.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        commandeListe.setViewportView(commandeTable);

        supprCommande.setText("Supprimer le plat");
        supprCommande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprCommandeActionPerformed(evt);
            }
        });

        listesPlats.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListePlats.setViewportView(listesPlats);

        addCommande.setText("ajouter à la commande");
        addCommande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCommandeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Text, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(299, 299, 299))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tableOccupe, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tableLibre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(tableau, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Text4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(numTableCommande)
                            .addComponent(addCommande, javax.swing.GroupLayout.PREFERRED_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(afficher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ListePlats)
                            .addComponent(Text5, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(commandeListe)
                            .addComponent(supprCommande, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Text2)
                        .addGap(211, 211, 211)
                        .addComponent(Text3)))
                .addGap(189, 189, 189))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text2)
                    .addComponent(Text3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tableau, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tableOccupe)
                            .addComponent(tableLibre)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Text4)
                            .addComponent(Text5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(commandeListe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numTableCommande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(afficher)
                            .addComponent(supprCommande))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ListePlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addCommande))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void updateComponents() {
        updateTable();
        updatePlats();
    }

    public void updatePlats() {
        DefaultListModel listModel = new DefaultListModel();
        listesPlats.setModel(listModel);
        for (Plat plat : modele.getPlats()) {
            if (plat.getRealisable()) {
                listModel.addElement(plat.getNom());
            }
        }
    }

    private void updateTable() {
        DefaultTableModel tableModel = new DefaultTableModel();

        tableModel.addColumn("Numéro de la table");
        tableModel.addColumn("Est occupé");

        for (Table table : modele.getTables()) {
            tableModel.addRow(new Object[]{table.getNumero(), table.isOccupee()});
        }

        tableTableau.setModel(tableModel);

        DefaultListModel listModel = new DefaultListModel();
        numeroTableCommande.setModel(listModel);
        for (Table table : modele.getTables()) {
            listModel.addElement(table.getStringNumero());
        }
    }

    private void tableLibreActionPerformed(java.awt.event.ActionEvent evt) {
        if (tableTableau.getSelectedRow() == -1) {
            return;
        }
        String numero = tableTableau.getValueAt(tableTableau.getSelectedRow(), 0).toString();

        Table table = modele.getTable(Integer.parseInt(numero));
        table.setOccupee(false);

        saveModele();
        updateTable();
    }

    private void tableOccupeActionPerformed(java.awt.event.ActionEvent evt) {
        if (tableTableau.getSelectedRow() == -1) {
            return;
        }
        String numero = tableTableau.getValueAt(tableTableau.getSelectedRow(), 0).toString();

        Table table = modele.getTable(Integer.parseInt(numero));
        table.setOccupee(true);

        saveModele();
        updateTable();
    }





    private void afficherActionPerformed(java.awt.event.ActionEvent evt) {
        if (numeroTableCommande.getSelectedIndex() == -1) {
            return;
        }
        String numero = numeroTableCommande.getSelectedValue();
        Table table = modele.getTable(Integer.parseInt(numero));

        DefaultListModel listModel = new DefaultListModel();
        commandeTable.setModel(listModel);
        for (Plat plat : table.getPlats()) {
            listModel.addElement(plat.getNom());
        }
    }

    private void addCommandeActionPerformed(java.awt.event.ActionEvent evt) {
        if (numeroTableCommande.getSelectedIndex() == -1 || listesPlats.getSelectedIndex() == -1) {
            return;
        }
        String numero = numeroTableCommande.getSelectedValue();
        Table table = modele.getTable(Integer.parseInt(numero));

        String plat = listesPlats.getSelectedValue();
        Plat platObj = modele.getPlat(plat);

        table.addPlat(platObj);

        saveModele();
        afficherActionPerformed(evt);
    }


    private void supprCommandeActionPerformed(java.awt.event.ActionEvent evt) {
        if (numeroTableCommande.getSelectedIndex() == -1 || commandeTable.getSelectedIndex() == -1) {
            return;
        }
        String numero = numeroTableCommande.getSelectedValue();
        Table table = modele.getTable(Integer.parseInt(numero));

        String plat = commandeTable.getSelectedValue();
        Plat platObj = modele.getPlat(plat);

        table.removePlat(platObj);

        saveModele();
        afficherActionPerformed(evt);
    }

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
            java.util.logging.Logger.getLogger(Serveur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Serveur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Serveur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Serveur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Serveur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ListePlats;
    private javax.swing.JLabel Text;
    private javax.swing.JLabel Text2;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Text5;
    private javax.swing.JButton addCommande;
    private javax.swing.JButton afficher;
    private javax.swing.JScrollPane commandeListe;
    private javax.swing.JList<String> commandeTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JList<String> listesPlats;
    private javax.swing.JScrollPane numTableCommande;
    private javax.swing.JList<String> numeroTableCommande;
    private javax.swing.JButton supprCommande;
    private javax.swing.JButton tableLibre;
    private javax.swing.JButton tableOccupe;
    private javax.swing.JTable tableTableau;
    private javax.swing.JScrollPane tableau;
    // End of variables declaration//GEN-END:variables
}
