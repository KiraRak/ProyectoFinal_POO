
package com.mycompany.proyectofinal_poo.InterfacesGraficas;

import javax.swing.JOptionPane;

public class UserLogin extends javax.swing.JFrame {
    public UserLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
        setSize(220, 300);
        setTitle("Login");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Background = new javax.swing.JPanel();
        LoginLabel = new javax.swing.JLabel();
        passInput = new javax.swing.JTextField();
        userInput = new javax.swing.JTextField();
        LoginLabel1 = new javax.swing.JLabel();
        LoginLabel2 = new javax.swing.JLabel();
        loginbttn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginLabel.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        LoginLabel.setForeground(new java.awt.Color(53, 53, 53));
        LoginLabel.setText("Password");
        Background.add(LoginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 70, 20));

        passInput.setBackground(new java.awt.Color(217, 217, 217));
        passInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passInputActionPerformed(evt);
            }
        });
        Background.add(passInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 100, -1));

        userInput.setBackground(new java.awt.Color(217, 217, 217));
        userInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userInputActionPerformed(evt);
            }
        });
        Background.add(userInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 100, -1));

        LoginLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        LoginLabel1.setForeground(new java.awt.Color(53, 53, 53));
        LoginLabel1.setText("Welcome");
        Background.add(LoginLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 20));

        LoginLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        LoginLabel2.setForeground(new java.awt.Color(53, 53, 53));
        LoginLabel2.setText("User");
        Background.add(LoginLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 40, 20));

        loginbttn.setBackground(new java.awt.Color(40, 75, 99));
        loginbttn.setForeground(new java.awt.Color(255, 255, 255));
        loginbttn.setText("Log In");
        loginbttn.setBorder(null);
        loginbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbttnActionPerformed(evt);
            }
        });
        Background.add(loginbttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 60, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userInputActionPerformed

    }//GEN-LAST:event_userInputActionPerformed

    private void passInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passInputActionPerformed
        
    }//GEN-LAST:event_passInputActionPerformed

    private void loginbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbttnActionPerformed
        try {
            if ("admin".equals(userInput.getText()) && 
                    "123".equals(passInput.getText())){
            ProductRegister productRegister = new ProductRegister();
            productRegister.setVisible(true);
            this.setVisible(false);
        } else{
            JOptionPane.showMessageDialog(null, "Usuario o "
                    + "contrasena invalido");  
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_loginbttnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JLabel LoginLabel1;
    private javax.swing.JLabel LoginLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loginbttn;
    private javax.swing.JTextField passInput;
    private javax.swing.JTextField userInput;
    // End of variables declaration//GEN-END:variables
}
