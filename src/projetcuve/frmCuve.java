/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetcuve;

import Classes.Carburant;
import Classes.Cuve;
import Classes.GestionnairesCuves;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cleme
 */
public class frmCuve extends javax.swing.JFrame {

    /**
     * Creates new form frmCuve
     */
    public frmCuve() {
        initComponents();
    }
    // Variables globales
     DefaultTableModel dtmCuves;
     DefaultTableModel dtmCarburant;
     Cuve maCuve;
    // ArrayList <Cuve> lesCuves;
     GestionnairesCuves gestion;
    //  public ArrayList<Carburant>
     
     
     
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCuve = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCarburant = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblCuve.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "Nom Cuve"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCuve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCuveMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCuve);

        tblCarburant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero Carburant", "Nom Carburant", "Prix Carburant"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCarburant);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(294, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        dtmCuves = (DefaultTableModel) tblCuve.getModel();
        dtmCarburant = (DefaultTableModel) tblCarburant.getModel();
        gestion = new GestionnairesCuves();
       maCuve = new Cuve();
     
        Cuve c1 = new Cuve(1,"Cuve 1");
        Cuve c2 = new Cuve(2, "Cuve 2");
        Cuve c3 = new Cuve(3, "Cuve 3");
       
        Carburant s1 = new Carburant(1,"Diesel",25.2);
        Carburant s2 = new Carburant(2,"SUperEnormeSansPlomb95",45.5);
        Carburant s3 = new Carburant(3,"Fuel",1);
        
        c1.ajouterCarburant(s1); 
        c2.ajouterCarburant(s2); 
        c3.ajouterCarburant(s3);
        
        
        Vector v = new Vector();
        v.add(c1.getIdCuve());
        v.add(c1.getNomCuve());
         dtmCuves.addRow(v);
         

         Vector v2 = new Vector();
         v2.add(c2.getIdCuve());
         v2.add(c2.getNomCuve());
         dtmCuves.addRow(v2);

         Vector v3 = new Vector();
         v3.add(c3.getIdCuve());
         v3.add(c3.getNomCuve());
         dtmCuves.addRow(v3);
      
     
        
        
    }//GEN-LAST:event_formWindowOpened

    private void tblCuveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCuveMouseClicked
        // TODO add your handling code here:
         //JOptionPane.showMessageDialog(this,"bonjour a tous");
         
         
         while (dtmCarburant.getRowCount()!=0)
        {
            dtmCarburant.removeRow(0);
        }
         
        for(Carburant c : gestion.getLesCuves().get(tblCuve.getSelectedRow()).getLesCarburants())
                               
        {
         Vector v = new Vector();
         v.add(c.getIdCarburant());
         v.add(c.getNomCarburant());
         v.add(c.getPrixCarburant());
         
         dtmCarburant.addRow(v);
         
        }
       
          
          
          
    }//GEN-LAST:event_tblCuveMouseClicked

    
    
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
            java.util.logging.Logger.getLogger(frmCuve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCuve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCuve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCuve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCuve().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCarburant;
    private javax.swing.JTable tblCuve;
    // End of variables declaration//GEN-END:variables
}
