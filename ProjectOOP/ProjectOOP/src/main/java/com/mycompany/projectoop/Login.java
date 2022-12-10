/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projectoop;

import com.mycompany.api.POST;
import com.mycompany.mavenproject2.view.error;
import com.mycompany.mavenproject2.view.home;
import com.mycompany.mavenproject2.view.listproduct;
import com.mycompany.model.LoginForm;
import com.mycompany.model.LoginResponse;
import java.awt.Color;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JFrame;

/**
 *
 * @author thinh
 */
public class Login extends javax.swing.JFrame {

    public POST api = new POST();

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        grbuttonPn.setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgroundPn = new javax.swing.JPanel();
        gradient2 = new com.mycompany.projectoop.gradient();
        grbuttonPn = new javax.swing.JPanel();
        registerBtn = new com.mycompany.mavenproject2.view.Mainbutton();
        loginBtn = new com.mycompany.mavenproject2.view.Mainbutton();
        jSeparator = new javax.swing.JSeparator();
        chooseButton = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        userText = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        pictureBox1 = new com.mycompany.mavenproject2.view.PictureBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bgroundPn.setBackground(new java.awt.Color(102, 255, 204));

        grbuttonPn.setLayout(new java.awt.GridLayout(1, 0, 15, 10));

        registerBtn.setBorderColor(new java.awt.Color(255, 255, 255));
        registerBtn.setColor(java.awt.Color.white);
        registerBtn.setColorClick(new java.awt.Color(102, 255, 255));
        registerBtn.setLabel("Đăng ký");
        registerBtn.setRadius(15);
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });
        grbuttonPn.add(registerBtn);

        loginBtn.setBorderColor(new java.awt.Color(255, 255, 255));
        loginBtn.setColor(java.awt.Color.white);
        loginBtn.setColorClick(new java.awt.Color(51, 255, 255));
        loginBtn.setLabel("Đăng nhập");
        loginBtn.setRadius(15);
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        grbuttonPn.add(loginBtn);

        chooseButton.setText("Đổi vai trò");
        chooseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseButtonActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("ĐĂNG NHẬP ");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Email: ");

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Mật khẩu:");

        javax.swing.GroupLayout gradient2Layout = new javax.swing.GroupLayout(gradient2);
        gradient2.setLayout(gradient2Layout);
        gradient2Layout.setHorizontalGroup(
            gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(gradient2Layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(chooseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(gradient2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(gradient2Layout.createSequentialGroup()
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(gradient2Layout.createSequentialGroup()
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(grbuttonPn, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gradient2Layout.setVerticalGroup(
            gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(chooseButton)
                .addGap(7, 7, 7)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(grbuttonPn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );

        pictureBox1.setImage(new javax.swing.ImageIcon("C:\\JAVA\\ProjectOOP\\ProjectOOP\\src\\main\\resources\\loginpng\\LoginJava.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pictureBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pictureBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgroundPnLayout = new javax.swing.GroupLayout(bgroundPn);
        bgroundPn.setLayout(bgroundPnLayout);
        bgroundPnLayout.setHorizontalGroup(
            bgroundPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgroundPnLayout.createSequentialGroup()
                .addComponent(gradient2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bgroundPnLayout.setVerticalGroup(
            bgroundPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradient2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgroundPn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgroundPn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseButtonActionPerformed
        // TODO add your handling code here:

        chooseUser d = new chooseUser();
        d.setLocationRelativeTo(null);
        d.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_chooseButtonActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        String email = userText.getText();
        String password = passwordField.getText();
        if ("".equals(email) || "".equals(password)) {
            error er = new error( true, "Tài khoản hoặc mật khẩu trống");
            er.setLocationRelativeTo(null);
            er.setVisible(true);
            System.out.print("Dang nhap that bai");
        } else {
            LoginForm form = new LoginForm(email, password);
            try {
                LoginResponse resp = api.Login(form.toString());
                System.out.print(resp);
                if (resp.success) {
                    // dang nhap thanh cong
                    home frame = new home(resp.user);
                    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    frame.setVisible(true);
                    this.dispose();
                } else {
                    //dang nhap that bai
                    error er = new error( true, "Đăng nhập thất bại");
                    er.setLocationRelativeTo(null);
                    er.setVisible(true);
                    System.out.print("Dang nhap that bai");

                }
            } catch (IOException ex) {
                error er = new error(true, "Đăng nhập thất bại");
                er.setLocationRelativeTo(null);
                er.setVisible(true);
                System.out.print("Dang nhap that bai");
            }
        }


    }//GEN-LAST:event_loginBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        newKH d = new newKH();
        d.setLocationRelativeTo(null);
        d.setVisible(true);
    }//GEN-LAST:event_registerBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        Login login = new Login();
        login.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgroundPn;
    private javax.swing.JButton chooseButton;
    private com.mycompany.projectoop.gradient gradient2;
    private javax.swing.JPanel grbuttonPn;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator;
    private com.mycompany.mavenproject2.view.Mainbutton loginBtn;
    private javax.swing.JPasswordField passwordField;
    private com.mycompany.mavenproject2.view.PictureBox pictureBox1;
    private com.mycompany.mavenproject2.view.Mainbutton registerBtn;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables
}
