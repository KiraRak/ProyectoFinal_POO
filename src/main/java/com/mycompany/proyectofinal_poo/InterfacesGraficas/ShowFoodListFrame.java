package com.mycompany.proyectofinal_poo.InterfacesGraficas;
import com.mycompany.proyectofinal_poo.Clases.Foods;
import com.mycompany.proyectofinal_poo.InterfacesGraficas.ProductRegister;
import com.sun.source.tree.ImportTree;
import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.DefaultListModel;
import java.util.List;
import javax.swing.ListModel;
import javax.swing.ListCellRenderer;
import javax.swing.DefaultListCellRenderer;
import java.awt.Component;
import javax.swing.JList;


public class ShowFoodListFrame extends javax.swing.JFrame {
    private DefaultListModel<Foods> listModel;
    
    
    
    public ShowFoodListFrame() {
        initComponents();
        listModel = new DefaultListModel<>();
        visibleList = new JList<>(listModel);
        
        
        // Asigna un CellRenderer para mostrar la representación adecuada
        visibleList.setCellRenderer(new FoodsListCellRenderer());
        
        // Configura el layout del formulario
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(new JScrollPane(visibleList), BorderLayout.CENTER);
        
        setFoodsList();
    }
    
     private void setFoodsList() {
        // Usa la variable de instancia foodsList de la clase ProductRegister
        ProductRegister productRegister = new ProductRegister();
        List<Foods> foodsList = productRegister.getFoodsList();

        listModel.clear();

        for (Foods food : foodsList) {
            listModel.addElement(food);
        }
    }
     
     // Añade una clase para el renderizador de celdas
    class FoodsListCellRenderer extends DefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                boolean isSelected, boolean cellHasFocus) {
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

            if (value instanceof Foods) {
                Foods food = (Foods) value;
                setText(food.getName());  
            }

            return this;
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        SelectBttn = new javax.swing.JButton();
        visibleList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        SelectBttn.setText("Seleccionar");
        SelectBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectBttnActionPerformed(evt);
            }
        });

        visibleList.setBackground(new java.awt.Color(255, 255, 255));
        visibleList.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        visibleList.setForeground(new java.awt.Color(53, 53, 53));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(SelectBttn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(visibleList, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(visibleList, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(SelectBttn)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SelectBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectBttnActionPerformed

    }//GEN-LAST:event_SelectBttnActionPerformed

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
            java.util.logging.Logger.
                    getLogger(ShowFoodListFrame.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.
                    getLogger(ShowFoodListFrame.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.
                    getLogger(ShowFoodListFrame.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.
                    getLogger(ShowFoodListFrame.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowFoodListFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SelectBttn;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JList<String> visibleList;
    // End of variables declaration//GEN-END:variables
}
