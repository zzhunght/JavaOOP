/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.mavenproject2.view;

import com.mycompany.model.Product;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author 84914
 */
public class cardproduct extends javax.swing.JPanel {

    public Product itemRef;
    public String cartIdRef;
    public cardproduct() {
        initComponents();
    }
    public cardproduct(Product item) throws MalformedURLException, IOException {
        this.itemRef = item;
        initComponents();
        brand.setText(item.Brand.brand);
        name.setText(item.name);
        price.setText(item.price.toString());
        URL url = new URL(item.image);
        Image image = ImageIO.read(url);
        pictureBox2.setImage(new ImageIcon(image));
    }
    public cardproduct(Product item,String cartId) throws MalformedURLException, IOException {
//        System.out.print("cartitem--------:" +cartId);
        this.cartIdRef = cartId;
        this.itemRef = item;
        initComponents();
        brand.setText(item.Brand.brand);
        name.setText(item.name);
        price.setText(item.price.toString());
        URL url = new URL(item.image);
        Image image = ImageIO.read(url);
        pictureBox2.setImage(new ImageIcon(image));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gradient4 = new com.mycompany.mavenproject2.view.gradient();
        name = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        mainbutton3 = new com.mycompany.mavenproject2.view.Mainbutton();
        brand = new javax.swing.JLabel();
        pictureBox2 = new com.mycompany.mavenproject2.view.PictureBox();

        gradient4.setBackground(new java.awt.Color(245, 244, 245));
        gradient4.setColor1(new java.awt.Color(255, 255, 255));
        gradient4.setColor2(new java.awt.Color(255, 255, 255));
        gradient4.setPreferredSize(new java.awt.Dimension(355, 389));
        gradient4.setRadius(30);

        name.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        name.setText("TiVi Sam Sung");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel11.setText("Thương hiệu :");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Giá :");

        price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        price.setText("23.000 Đ");

        mainbutton3.setBackground(new java.awt.Color(255, 204, 204));
        mainbutton3.setBorder(null);
        mainbutton3.setText("Xem chi tiết");
        mainbutton3.setBorderColor(new java.awt.Color(255, 255, 255));
        mainbutton3.setColor(new java.awt.Color(255, 204, 204));
        mainbutton3.setColorClick(new java.awt.Color(255, 204, 255));
        mainbutton3.setColorOver(new java.awt.Color(255, 255, 204));
        mainbutton3.setFocusPainted(false);
        mainbutton3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mainbutton3.setRadius(10);
        mainbutton3.setVerifyInputWhenFocusTarget(false);
        mainbutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainbutton3ActionPerformed(evt);
            }
        });

        brand.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        brand.setText("Sam Sung");

        pictureBox2.setImage(new javax.swing.ImageIcon(getClass().getResource("/panasonic-nr-ba229pkvn-1.-600x600.png"))); // NOI18N

        javax.swing.GroupLayout gradient4Layout = new javax.swing.GroupLayout(gradient4);
        gradient4.setLayout(gradient4Layout);
        gradient4Layout.setHorizontalGroup(
            gradient4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(gradient4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradient4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(pictureBox2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(gradient4Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(129, 129, 129)))
                    .addGroup(gradient4Layout.createSequentialGroup()
                        .addGroup(gradient4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(gradient4Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradient4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        gradient4Layout.setVerticalGroup(
            gradient4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pictureBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(gradient4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gradient4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(gradient4, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(gradient4, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mainbutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainbutton3ActionPerformed
        try {
            // TODO add your handling code here:
            ProductDetails d = new ProductDetails(this.itemRef,this.cartIdRef);
            d.setLocationRelativeTo(null);
            d.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(cardproduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mainbutton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel brand;
    private com.mycompany.mavenproject2.view.gradient gradient4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private com.mycompany.mavenproject2.view.Mainbutton mainbutton3;
    private javax.swing.JLabel name;
    private com.mycompany.mavenproject2.view.PictureBox pictureBox2;
    private javax.swing.JLabel price;
    // End of variables declaration//GEN-END:variables
}
