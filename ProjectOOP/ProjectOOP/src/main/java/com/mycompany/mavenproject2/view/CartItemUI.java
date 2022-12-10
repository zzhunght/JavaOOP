/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.mavenproject2.view;

import com.mycompany.model.CartItem;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author msibravo
 */
public class CartItemUI extends javax.swing.JPanel {

    /**
     * Creates new form CartItem
     */
    public CartItemUI() {
        initComponents();
    }
    public CartItemUI(CartItem item) throws MalformedURLException, IOException {
        initComponents();
        name.setText("<html>"+item.product.name+"</html>");
        jLabel4.setText(item.product.Brand.brand);
        oldPrice.setText(item.product.price.toString());
        amount.setText(item.amount);
        URL url = new URL(item.product.image);
        Image image = ImageIO.read(url);
        pictureBox1.setImage(new ImageIcon(image));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gradient1 = new com.mycompany.mavenproject2.view.gradient();
        jCheckBox1 = new javax.swing.JCheckBox();
        pictureBox1 = new com.mycompany.mavenproject2.view.PictureBox();
        name = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        oldPrice = new javax.swing.JLabel();
        discount = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        amount = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        gradient1.setBackground(new java.awt.Color(254, 255, 239));
        gradient1.setColor1(new java.awt.Color(255, 255, 255));
        gradient1.setColor2(new java.awt.Color(255, 255, 255));
        gradient1.setRadius(20);

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        pictureBox1.setImage(new javax.swing.ImageIcon("C:\\JAVA\\ProjectOOP\\ProjectOOP\\src\\main\\resources\\tuLanhPng\\aqua-aqr-igw525em-gb-12-300x300.png")); // NOI18N

        name.setText("<html>Tv kjash dsdjhah sdjasdhahs jdjkkajhdjh ksakjdjakjsd</html>");

        jLabel3.setText("Thương hiệu:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Sony");

        oldPrice.setText("2.000.000đ");

        discount.setText("3.000.000đ");

        jLabel7.setText("SL:");

        amount.setText("1");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Xoá");

        javax.swing.GroupLayout gradient1Layout = new javax.swing.GroupLayout(gradient1);
        gradient1.setLayout(gradient1Layout);
        gradient1Layout.setHorizontalGroup(
            gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pictureBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradient1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(gradient1Layout.createSequentialGroup()
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(oldPrice)
                        .addGap(30, 30, 30)
                        .addComponent(discount)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(50, 50, 50))))
        );
        gradient1Layout.setVerticalGroup(
            gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient1Layout.createSequentialGroup()
                .addGroup(gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradient1Layout.createSequentialGroup()
                        .addGroup(gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gradient1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jCheckBox1))
                            .addGroup(gradient1Layout.createSequentialGroup()
                                .addGroup(gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(gradient1Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addGroup(gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(oldPrice)
                                            .addComponent(discount)
                                            .addComponent(jLabel7)
                                            .addComponent(amount)
                                            .addComponent(jLabel9)))
                                    .addGroup(gradient1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(name)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))))
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(gradient1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pictureBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(gradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amount;
    private javax.swing.JLabel discount;
    private com.mycompany.mavenproject2.view.gradient gradient1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel name;
    private javax.swing.JLabel oldPrice;
    private com.mycompany.mavenproject2.view.PictureBox pictureBox1;
    // End of variables declaration//GEN-END:variables
}
