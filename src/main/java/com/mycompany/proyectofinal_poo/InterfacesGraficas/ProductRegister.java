//Trabajo realizado por Yuliana Marcela García Alvarado y
//Leonardo Sebastián Colmenares Urrea

package com.mycompany.proyectofinal_poo.InterfacesGraficas;
import com.mycompany.proyectofinal_poo.Clases.Carbohydrates;
import com.mycompany.proyectofinal_poo.Clases.Fats;
import com.mycompany.proyectofinal_poo.Clases.Foods;
import com.mycompany.proyectofinal_poo.Clases.FruitsnVegetables;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class ProductRegister extends javax.swing.JFrame {
    private List<Foods> foodsList;
    private Map<String, List<String>> foodByType;
    private DefaultListModel<String> listaAlimentosModel = new DefaultListModel<>();
    
    public ProductRegister() {
        initComponents();
        this.setLocationRelativeTo(null);
        setSize(515, 420);
        setTitle("Registro de Alimentos");
        
        //Inicializar alimentos y configurar modelos
        initFoods();
        modelConfig();
        initFoodsList();
    }
    
    public Map<String, List<String>> getFoodByType() {
        return this.foodByType;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        foodLabel = new javax.swing.JLabel();
        cmbFood = new javax.swing.JComboBox<>();
        cmbFoodType = new javax.swing.JComboBox<>();
        foodTypeLabel1 = new javax.swing.JLabel();
        loginBttn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        deleteBttn1 = new javax.swing.JButton();
        addBttn1 = new javax.swing.JButton();
        otherBttn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productJlist = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        foodTypeLabel = new javax.swing.JLabel();
        editBttn1 = new javax.swing.JButton();
        confirmBttn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        foodLabel.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        foodLabel.setForeground(new java.awt.Color(53, 53, 53));
        foodLabel.setText("Alimento");
        getContentPane().add(foodLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 60, -1));

        cmbFood.setBackground(new java.awt.Color(217, 217, 217));
        cmbFood.setForeground(new java.awt.Color(53, 53, 53));
        cmbFood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbFood.setBorder(null);
        cmbFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFoodActionPerformed(evt);
            }
        });
        getContentPane().add(cmbFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 180, -1));

        cmbFoodType.setBackground(new java.awt.Color(217, 217, 217));
        cmbFoodType.setForeground(new java.awt.Color(53, 53, 53));
        cmbFoodType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbFoodType.setBorder(null);
        cmbFoodType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFoodTypeActionPerformed(evt);
            }
        });
        getContentPane().add(cmbFoodType, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 180, -1));

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

        deleteBttn1.setBackground(new java.awt.Color(40, 75, 99));
        deleteBttn1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        deleteBttn1.setForeground(new java.awt.Color(255, 255, 255));
        deleteBttn1.setText("Eliminar");
        deleteBttn1.setBorder(null);
        deleteBttn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBttn1ActionPerformed(evt);
            }
        });
        jPanel2.add(deleteBttn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 90, 20));

        addBttn1.setBackground(new java.awt.Color(40, 75, 99));
        addBttn1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        addBttn1.setForeground(new java.awt.Color(255, 255, 255));
        addBttn1.setText("Añadir");
        addBttn1.setBorder(null);
        addBttn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBttn1ActionPerformed(evt);
            }
        });
        jPanel2.add(addBttn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 90, 20));

        otherBttn.setBackground(new java.awt.Color(40, 75, 99));
        otherBttn.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        otherBttn.setForeground(new java.awt.Color(255, 255, 255));
        otherBttn.setText("Agregar otro");
        otherBttn.setBorder(null);
        otherBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherBttnActionPerformed(evt);
            }
        });
        jPanel2.add(otherBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 90, 20));

        jScrollPane1.setBackground(new java.awt.Color(237, 237, 233));

        productJlist.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), new java.awt.Color(51, 51, 51), null));
        productJlist.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(productJlist);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 170, 310));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(53, 53, 53));
        jLabel1.setText("Lista de agregados");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        foodTypeLabel.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        foodTypeLabel.setForeground(new java.awt.Color(53, 53, 53));
        foodTypeLabel.setText("CARRITO");
        jPanel2.add(foodTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 70, 20));

        editBttn1.setBackground(new java.awt.Color(40, 75, 99));
        editBttn1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        editBttn1.setForeground(new java.awt.Color(255, 255, 255));
        editBttn1.setText("Editar");
        editBttn1.setBorder(null);
        editBttn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBttn1ActionPerformed(evt);
            }
        });
        jPanel2.add(editBttn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 70, 20));

        confirmBttn.setBackground(new java.awt.Color(40, 75, 99));
        confirmBttn.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        confirmBttn.setForeground(new java.awt.Color(255, 255, 255));
        confirmBttn.setText("Confirmar edicion");
        confirmBttn.setBorder(null);
        confirmBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBttnActionPerformed(evt);
            }
        });
        jPanel2.add(confirmBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 120, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void otherBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherBttnActionPerformed
       if ("Otro".equals(cmbFood.getSelectedItem())) {
            //Abrir un JFrame con la lista de alimentos
            ShowFoodListFrame showFoodListFrame = new ShowFoodListFrame(foodByType);
            showFoodListFrame.setVisible(true);
            
        }
    }//GEN-LAST:event_otherBttnActionPerformed

    //done
    private void loginBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBttnActionPerformed
        UserLogin userLogin = new UserLogin();
        userLogin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_loginBttnActionPerformed

    private void cmbFoodTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFoodTypeActionPerformed
        updateFoodsCmb();
        
        
    }//GEN-LAST:event_cmbFoodTypeActionPerformed

    private void cmbFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFoodActionPerformed
        
    }//GEN-LAST:event_cmbFoodActionPerformed
    
    //done                      
    private void addBttn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBttn1ActionPerformed
        if ("Otro".equals(cmbFood.getSelectedItem())) {
            JOptionPane.showMessageDialog(null,
                    "Debe agregar un producto de la lista"
                    + "\nPor favor seleccione el boton *Agregar otro* ");
        }else{
            String tipoAlimento = (String) cmbFoodType.getSelectedItem();
            String alimento = (String) cmbFood.getSelectedItem();
            
            //Agregar a la lista de anadidos
            String info = "Tipo: " + tipoAlimento + " Alimento: " + alimento;
            listaAlimentosModel.addElement(info);
            
            //Actualizar la lista con la info agregada
            productJlist.setModel(listaAlimentosModel);
        }

    }//GEN-LAST:event_addBttn1ActionPerformed
    
    //done
    private void deleteBttn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBttn1ActionPerformed
        //Para obtener el indice seleccionado en la lista
        int selectedIndex = productJlist.getSelectedIndex();
        
        if (selectedIndex != -1 && selectedIndex < listaAlimentosModel.getSize()) {
           listaAlimentosModel.remove(selectedIndex);
        } 
    }//GEN-LAST:event_deleteBttn1ActionPerformed
    
    //done
    private void editBttn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBttn1ActionPerformed
        // Obtener el índice que se seleccionó
        int selectedIndex1 = productJlist.getSelectedIndex();

        if (selectedIndex1 != -1) {
            String selectedElement = listaAlimentosModel.getElementAt(selectedIndex1);

            if (selectedElement.startsWith("Tipo: ") && selectedElement.contains(" Alimento: ")) {
                // Separar el elemento en tipo y alimento
                String[] partes = selectedElement.split(" Alimento: ");

                if (partes.length == 2) {
                    // Se obtiene el tipo ignorando la palabra "Tipo:"
                    String tipoAlimento1 = partes[0].substring(6); 
                    String alimento1 = partes[1];

                    // Configurar los comboBox con las partes obtenidas
                    cmbFoodType.setSelectedItem(tipoAlimento1);
                    cmbFood.setSelectedItem(alimento1);

                } else {
                    System.out.println("Error: formato de cadena inesperado");
                }
            } else {
                System.out.println("Error: formato de cadena inesperado");
            }
        }
    }//GEN-LAST:event_editBttn1ActionPerformed
    
    //done
    private void confirmBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBttnActionPerformed
        // Obtener el índice que se seleccionó
    int selectedIndex1 = productJlist.getSelectedIndex();

    if (selectedIndex1 != -1) {
        // Obtener los nuevos valores de los JComboBox
        String tipoAlimentoNuevo = (String) cmbFoodType.getSelectedItem();
        String alimentoNuevo = (String) cmbFood.getSelectedItem();

        // Actualizar el modelo de la lista con los nuevos valores
        String newElement = "Tipo: " + tipoAlimentoNuevo + " Alimento: " + alimentoNuevo;
        listaAlimentosModel.setElementAt(newElement, selectedIndex1);

        // Actualizar el modelo de la lista fuera del bloque if
        productJlist.setModel(new javax.swing.AbstractListModel<String>() {
            public int getSize() { return listaAlimentosModel.getSize(); }
            public String getElementAt(int i) { return listaAlimentosModel.getElementAt(i); }
        });
    }
    }//GEN-LAST:event_confirmBttnActionPerformed
    
    //done
    private void initFoods(){
        //metodo para inicializar los alimentos en los comboBox
        foodByType = new HashMap<>();
        foodByType.put("Frutas y Verduras", List.of("Manzana", "Aguacate", "Uva", "Tomate", "Otro"));
        foodByType.put("Grasas", List.of("Aceite", "Queso", "Chocolate", "Pescado", "Otro"));
        foodByType.put("Carbohidratos", List.of("Papa", "Pasta", "Pan", "Otro"));
    }
    
    //done
    private void modelConfig(){
        //metodo para inicializar los alimentos en los comboBox
        DefaultComboBoxModel<String> foodTypeModel = 
                new DefaultComboBoxModel<>
                (foodByType.keySet().toArray(new String[0])); 
        cmbFoodType.setModel(foodTypeModel);
        
        
        //modelo inicial del cmbFood
        updateFoodsCmb();
        
        /*DefaultComboBoxModel<String> foodModel = new DefaultComboBoxModel<>();
        foodModel.addElement("Agregar");
        cmbFood.setModel(foodModel);*/
    }
    
    //Lista de productos no agregados
    private void initFoodsList() {
        //todos estos productos heredan de sus clases
        foodsList = new ArrayList<>();
        foodsList.add(new FruitsnVegetables("Banano"));
        foodsList.add(new FruitsnVegetables("Zanahoria"));
        foodsList.add(new FruitsnVegetables("Abichuela"));
        foodsList.add(new Fats("Aceite de Oliva"));
        foodsList.add(new Fats("Mantequilla"));
        foodsList.add(new Fats("Nueces"));
        foodsList.add(new Carbohydrates("Quinua"));
        foodsList.add(new Carbohydrates("Avena"));
        foodsList.add(new Carbohydrates("Yuca"));

    }
    
    public List<Foods> getFoodsList() {
        return foodsList;
    }
    
    //done
    private void updateFoodsCmb(){
        String typeSelected = (String) cmbFoodType.getSelectedItem();
        if(typeSelected != null){
            List<String> foods = foodByType.get(typeSelected);
            
            //configuracion del modelo cmbFood
            DefaultComboBoxModel<String> foodsModel = new 
                DefaultComboBoxModel<>(foods.toArray(new String[0]));
            cmbFood.setModel(foodsModel);
        }    
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
    private javax.swing.JButton addBttn1;
    private javax.swing.JComboBox<String> cmbFood;
    private javax.swing.JComboBox<String> cmbFoodType;
    private javax.swing.JButton confirmBttn;
    private javax.swing.JButton deleteBttn1;
    private javax.swing.JButton editBttn1;
    private javax.swing.JLabel foodLabel;
    private javax.swing.JLabel foodTypeLabel;
    private javax.swing.JLabel foodTypeLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loginBttn;
    private javax.swing.JButton otherBttn;
    private javax.swing.JList<String> productJlist;
    // End of variables declaration//GEN-END:variables
}
