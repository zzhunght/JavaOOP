/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.mavenproject2.view;

import com.mycompany.api.POST;
import com.mycompany.model.AddToCart;
import com.mycompany.model.AddToCartResponse;
import com.mycompany.model.Product;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class ProductDetails extends javax.swing.JDialog {

    /**
     * Creates new form ProductDetails
     */
    public POST api = new POST();
    public String cartId;
    public Product targetItem;
    public ProductDetails() {
        initComponents();
    }
    
    public ProductDetails(Product item) throws MalformedURLException, IOException {
        System.out.print("aloooooooooooo");
        initComponents();
        description.setText("<html>"+item.description+"</html>");
        name.setText(item.name);
        price.setText(item.price.toString());
        URL url = new URL(item.image);
        Image image = ImageIO.read(url);
        pictureBox1.setImage(new ImageIcon(image));
    }
    public ProductDetails(Product item, String cartId) throws MalformedURLException, IOException {
        this.cartId= cartId;
        System.out.print(cartId);
        this.targetItem = item;
        initComponents();
        description.setText("<html>"+item.description+"</html>");
        name.setText(item.name);
        price.setText(item.price.toString());
        URL url = new URL(item.image);
        Image image = ImageIO.read(url);
        pictureBox1.setImage(new ImageIcon(image));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        pictureBox1 = new com.mycompany.mavenproject2.view.PictureBox();
        name = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        amount = new javax.swing.JSpinner();
        addToCart = new com.mycompany.mavenproject2.view.Mainbutton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Chi Ti???t S???n Ph???m");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        pictureBox1.setImage(new javax.swing.ImageIcon(getClass().getResource("/lg-inverter-315-lit-gn-m312bl-1.-600x600.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(pictureBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(pictureBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        name.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        name.setText("jLabel2");

        jLabel2.setText("M?? t??? :");

        description.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        description.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        description.setText("<html>Tivi 50 inch, ????? ph??n gi???i 4K s???c n??t.B??? x??? l?? X1 4K HDR x??? l?? h??nh ???nh tinh vi, gi???m nhi???u, gi???m m???, t??ng ????? chi ti???t.Dolby Atmos c??ng ngh??? c?? kh??? n??ng t???o n??n ??m thanh v??m 3 chi???u s???ng ?????ng.H??? ??i???u h??nh Google TV c?? giao di???n g???n g??ng, kho ???ng d???ng phong ph??.??i???u khi???n, t??m ki???m tr??n tivi v???i tr??? l?? ???o Google Assistant.Chi???u m??n h??nh ??i???n tho???i l??n tivi th??ng qua Chromecast.</html>");
        description.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        priceLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        priceLabel.setText("Gi??:");

        price.setText("jLabel3");

        amount.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        amount.setEditor(new javax.swing.JSpinner.NumberEditor(amount, ""));
        amount.setPreferredSize(new java.awt.Dimension(100, 30));

        addToCart.setBorder(null);
        addToCart.setForeground(new java.awt.Color(255, 255, 255));
        addToCart.setText("Th??m v??o gi??? h??ng");
        addToCart.setBorderColor(new java.awt.Color(255, 255, 255));
        addToCart.setColor(new java.awt.Color(255, 133, 59));
        addToCart.setColorClick(new java.awt.Color(255, 106, 69));
        addToCart.setColorOver(new java.awt.Color(255, 118, 86));
        addToCart.setRadius(10);
        addToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(priceLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartActionPerformed
        System.out.print("cartid--------------------"+this.cartId);

        try {
            // TODO add your handling code here:
            
            // theem san pham vao gio hang cua user dang nhap
            Integer val = Integer.valueOf(amount.getValue().toString());
            AddToCart form = new AddToCart(this.cartId,this.targetItem.id,val);
            AddToCartResponse resp =api.AddToCart(form.toString());
            if(resp.success){
                notification noti = new notification(true, "S???n ph???m ???? ???????c th??m v??o gi??? h??ng c???a b???n");
                noti.setLocationRelativeTo(null);
                noti.setVisible(true);
           
            }
        } catch (IOException ex) {
            Logger.getLogger(ProductDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addToCartActionPerformed

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
            java.util.logging.Logger.getLogger(ProductDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            ProductDetails dialog = new ProductDetails();
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.mavenproject2.view.Mainbutton addToCart;
    private javax.swing.JSpinner amount;
    private javax.swing.JLabel description;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel name;
    private com.mycompany.mavenproject2.view.PictureBox pictureBox1;
    private javax.swing.JLabel price;
    private javax.swing.JLabel priceLabel;
    // End of variables declaration//GEN-END:variables
}
