
package com.mycompany.proyectofinal_poo.InterfacesGraficas;

public class ProductRegister extends javax.swing.JFrame {

    public ProductRegister() {
        initComponents();
        this.setLocationRelativeTo(null);
        setSize(315, 380);
        setTitle("Registro de Alimentos");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addBttn = new javax.swing.JButton();
        editBttn = new javax.swing.JButton();
        foodLabel = new javax.swing.JLabel();
        cmbFood = new javax.swing.JComboBox<>();
        foodTypeLabel = new javax.swing.JLabel();
        cmbFoodType = new javax.swing.JComboBox<>();
        deleteBttn1 = new javax.swing.JButton();
        foodTypeLabel1 = new javax.swing.JLabel();
        loginBttn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addBttn.setBackground(new java.awt.Color(40, 75, 99));
        addBttn.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        addBttn.setForeground(new java.awt.Color(255, 255, 255));
        addBttn.setText("Añadir");
        addBttn.setBorder(null);
        addBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBttnActionPerformed(evt);
            }
        });
        getContentPane().add(addBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 80, 20));

        editBttn.setBackground(new java.awt.Color(40, 75, 99));
        editBttn.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        editBttn.setForeground(new java.awt.Color(255, 255, 255));
        editBttn.setText("Editar");
        editBttn.setBorder(null);
        getContentPane().add(editBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 80, 20));

        foodLabel.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        foodLabel.setForeground(new java.awt.Color(53, 53, 53));
        foodLabel.setText("Alimento");
        getContentPane().add(foodLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 60, -1));

        cmbFood.setBackground(new java.awt.Color(217, 217, 217));
        cmbFood.setForeground(new java.awt.Color(53, 53, 53));
        cmbFood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbFood.setBorder(null);
        getContentPane().add(cmbFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 180, -1));

        foodTypeLabel.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        foodTypeLabel.setForeground(new java.awt.Color(53, 53, 53));
        foodTypeLabel.setText("CARRITO");
        getContentPane().add(foodTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 70, -1));

        cmbFoodType.setBackground(new java.awt.Color(217, 217, 217));
        cmbFoodType.setForeground(new java.awt.Color(53, 53, 53));
        cmbFoodType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbFoodType.setBorder(null);
        getContentPane().add(cmbFoodType, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 180, -1));

        deleteBttn1.setBackground(new java.awt.Color(40, 75, 99));
        deleteBttn1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        deleteBttn1.setForeground(new java.awt.Color(255, 255, 255));
        deleteBttn1.setText("Eliminar");
        deleteBttn1.setBorder(null);
        getContentPane().add(deleteBttn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 80, 20));

        foodTypeLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        foodTypeLabel1.setForeground(new java.awt.Color(53, 53, 53));
        foodTypeLabel1.setText("Tipo de alimento");
        getContentPane().add(foodTypeLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        loginBttn.setBackground(new java.awt.Color(40, 75, 99));
        loginBttn.setForeground(new java.awt.Color(255, 255, 255));
        loginBttn.setText("Volver");
        loginBttn.setBorder(null);
        loginBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBttnActionPerformed(evt);
            }
        });
        getContentPane().add(loginBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 20));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBttnActionPerformed

    private void loginBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBttnActionPerformed
        UserLogin userLogin = new UserLogin();
        userLogin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_loginBttnActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.
                    getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductRegister.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductRegister.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductRegister.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductRegister.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBttn;
    private javax.swing.JComboBox<String> cmbFood;
    private javax.swing.JComboBox<String> cmbFoodType;
    private javax.swing.JButton deleteBttn1;
    private javax.swing.JButton editBttn;
    private javax.swing.JLabel foodLabel;
    private javax.swing.JLabel foodTypeLabel;
    private javax.swing.JLabel foodTypeLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginBttn;
    // End of variables declaration//GEN-END:variables
}
