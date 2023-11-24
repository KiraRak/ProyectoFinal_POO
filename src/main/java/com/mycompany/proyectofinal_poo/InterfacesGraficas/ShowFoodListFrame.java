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
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JList;


public class ShowFoodListFrame extends javax.swing.JFrame {
    private DefaultListModel<String> listModel = new DefaultListModel<>();
    private Map<String, List<String>> foodByType;
    
       
    public ShowFoodListFrame(Map<String, List<String>> foodByType) {
        this.foodByType = foodByType;
        initComponents();
        setFoodsList();
    }
    
     private void setFoodsList() {
        // Usa la variable de instancia foodsList de la clase ProductRegister
        ProductRegister productRegister = new ProductRegister();
        productRegister.setVisible(true);
        List<Foods> foodsList = productRegister.getFoodsList();

        listModel.clear();

        for (Foods food : foodsList) {
            listModel.addElement(food.getName());
        }
        
        visibleList.setModel(listModel);
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
        cancelBttn = new javax.swing.JButton();
        visibleList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        SelectBttn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cancelBttn.setBackground(new java.awt.Color(40, 75, 99));
        cancelBttn.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        cancelBttn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBttn.setText("Cancelar");
        cancelBttn.setBorder(null);
        cancelBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBttnActionPerformed(evt);
            }
        });
        jPanel2.add(cancelBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 60, 26));

        visibleList.setBackground(new java.awt.Color(255, 255, 255));
        visibleList.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.darkGray));
        visibleList.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        visibleList.setForeground(new java.awt.Color(53, 53, 53));
        jPanel2.add(visibleList, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 220, 307));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Productos no agregados");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 170, -1));

        SelectBttn1.setBackground(new java.awt.Color(40, 75, 99));
        SelectBttn1.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        SelectBttn1.setForeground(new java.awt.Color(255, 255, 255));
        SelectBttn1.setText("Seleccionar");
        SelectBttn1.setBorder(null);
        SelectBttn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectBttn1ActionPerformed(evt);
            }
        });
        jPanel2.add(SelectBttn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 77, 26));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBttnActionPerformed
    this.setVisible(false);
        
    }//GEN-LAST:event_cancelBttnActionPerformed

    private void SelectBttn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectBttn1ActionPerformed
        String selectedFood = visibleList.getSelectedValue();
        if (selectedFood != null) {
           
        }
        List<String> foodsList = new ArrayList<>(foodByType.get("Grasas"));
        foodsList.add("Mantequilla");
        for (String food : foodsList) {
            System.out.println(food);
        }
        foodByType.put("Grasas", foodsList);
    }//GEN-LAST:event_SelectBttn1ActionPerformed

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
                ProductRegister productRegister = new ProductRegister();
                new ShowFoodListFrame(productRegister.getFoodByType()).setVisible(true);
                //new ShowFoodListFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SelectBttn1;
    private javax.swing.JButton cancelBttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JList<String> visibleList;
    // End of variables declaration//GEN-END:variables
}
