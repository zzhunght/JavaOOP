/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject2.view;

import com.mycompany.api.GET;
import com.mycompany.model.Category;
import com.mycompany.model.Product;
import com.mycompany.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author msibravo
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public User myuser;
    public GET api = new GET();
    public ArrayList<Product> listProduct;
    public ArrayList<Category> listCategory;
    public Loading loadingicon = new Loading();

    public home() throws IOException {
        initComponents();
        loadingbar.add(loadingicon);
        loadingicon.setVisible(false);
        productwrapper.setLayout(new WrapLayout(WrapLayout.LEFT, 27, 15));
        ArrayList<Category> categories = api.GetCategory("http://localhost:5000/category");
        ArrayList<Product> resp = api.GetProduct("http://localhost:5000/product");
        this.listCategory = categories;
        this.listProduct = resp;
        for (Product item : this.listProduct) {
            productwrapper.add(new cardproduct(item));
        }
    }

    public home(User user) throws IOException {
        initComponents();
        this.myuser = user;
        loadingbar.add(loadingicon);
        loadingicon.setVisible(false);
        productwrapper.setLayout(new WrapLayout(WrapLayout.LEFT, 27, 15));
        ArrayList<Category> categories = api.GetCategory("http://localhost:5000/category");
        ArrayList<Product> resp = api.GetProduct("http://localhost:5000/product");
        this.listCategory = categories;
        this.listProduct = resp;
        for (Product item : this.listProduct) {
            productwrapper.add(new cardproduct(item, this.myuser.Carts.id));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gradient2 = new com.mycompany.mavenproject2.view.gradient();
        gradient1 = new com.mycompany.mavenproject2.view.gradient();
        pictureBox4 = new com.mycompany.mavenproject2.view.PictureBox();
        gradient3 = new com.mycompany.mavenproject2.view.gradient();
        searchField = new javax.swing.JTextField();
        searchIcon = new com.mycompany.mavenproject2.view.PictureBox();
        jSeparator1 = new javax.swing.JSeparator();
        pictureBox2 = new com.mycompany.mavenproject2.view.PictureBox();
        pictureBox3 = new com.mycompany.mavenproject2.view.PictureBox();
        jLabel5 = new javax.swing.JLabel();
        pictureBox5 = new com.mycompany.mavenproject2.view.PictureBox();
        jPanel1 = new javax.swing.JPanel();
        gradient5 = new com.mycompany.mavenproject2.view.gradient();
        jLabel1 = new javax.swing.JLabel();
        cart = new com.mycompany.mavenproject2.view.gradient();
        jLabel3 = new javax.swing.JLabel();
        gradient11 = new com.mycompany.mavenproject2.view.gradient();
        jLabel4 = new javax.swing.JLabel();
        gradient6 = new com.mycompany.mavenproject2.view.gradient();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel17 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel16 = new javax.swing.JPanel();
        TvCategory = new javax.swing.JPanel();
        pictureBox10 = new com.mycompany.mavenproject2.view.PictureBox();
        jLabel31 = new javax.swing.JLabel();
        tulanhCategory = new javax.swing.JPanel();
        pictureBox24 = new com.mycompany.mavenproject2.view.PictureBox();
        jLabel11 = new javax.swing.JLabel();
        maynuocnongCategory = new javax.swing.JPanel();
        pictureBox25 = new com.mycompany.mavenproject2.view.PictureBox();
        jLabel12 = new javax.swing.JLabel();
        mayruaxeCategory = new javax.swing.JPanel();
        pictureBox26 = new com.mycompany.mavenproject2.view.PictureBox();
        jLabel13 = new javax.swing.JLabel();
        maylocnuocCategory = new javax.swing.JPanel();
        pictureBox28 = new com.mycompany.mavenproject2.view.PictureBox();
        jLabel15 = new javax.swing.JLabel();
        dogiadungCategory = new javax.swing.JPanel();
        pictureBox29 = new com.mycompany.mavenproject2.view.PictureBox();
        jLabel16 = new javax.swing.JLabel();
        quatCategory = new javax.swing.JPanel();
        pictureBox30 = new com.mycompany.mavenproject2.view.PictureBox();
        jLabel17 = new javax.swing.JLabel();
        dieuhoaCategory = new javax.swing.JPanel();
        pictureBox31 = new com.mycompany.mavenproject2.view.PictureBox();
        jLabel18 = new javax.swing.JLabel();
        tudongCategory = new javax.swing.JPanel();
        pictureBox32 = new com.mycompany.mavenproject2.view.PictureBox();
        jLabel19 = new javax.swing.JLabel();
        beptuCategory = new javax.swing.JPanel();
        pictureBox33 = new com.mycompany.mavenproject2.view.PictureBox();
        jLabel20 = new javax.swing.JLabel();
        maygiatCategory = new javax.swing.JPanel();
        pictureBox35 = new com.mycompany.mavenproject2.view.PictureBox();
        jLabel22 = new javax.swing.JLabel();
        maylanhCategory = new javax.swing.JPanel();
        pictureBox36 = new com.mycompany.mavenproject2.view.PictureBox();
        jLabel23 = new javax.swing.JLabel();
        productwrapper = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        loadingbar = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gradient2.setColor1(new java.awt.Color(102, 204, 255));
        gradient2.setColor2(new java.awt.Color(102, 204, 255));
        gradient2.setMaximumSize(new java.awt.Dimension(1200, 1000));

        gradient1.setBackground(new java.awt.Color(102, 204, 255));
        gradient1.setRadius(60);

        pictureBox4.setImage(new javax.swing.ImageIcon("C:\\JAVA\\ProjectOOP\\ProjectOOP\\src\\main\\resources\\home-page.png")); // NOI18N

        javax.swing.GroupLayout gradient1Layout = new javax.swing.GroupLayout(gradient1);
        gradient1.setLayout(gradient1Layout);
        gradient1Layout.setHorizontalGroup(
            gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradient1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pictureBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        gradient1Layout.setVerticalGroup(
            gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradient1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pictureBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gradient3.setBackground(new java.awt.Color(102, 204, 255));
        gradient3.setColor1(new java.awt.Color(255, 255, 255));
        gradient3.setColor2(new java.awt.Color(255, 255, 255));
        gradient3.setRadius(50);

        searchField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        searchField.setToolTipText("");
        searchField.setBorder(null);
        searchField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        searchIcon.setImage(new javax.swing.ImageIcon("C:\\JAVA\\ProjectOOP\\ProjectOOP\\src\\main\\resources\\layout\\external-zoom-in-tool-for-exploring-and-magnification-basic-shadow-tal-revivo.png")); // NOI18N
        searchIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchIconMouseClicked(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 200));

        javax.swing.GroupLayout gradient3Layout = new javax.swing.GroupLayout(gradient3);
        gradient3.setLayout(gradient3Layout);
        gradient3Layout.setHorizontalGroup(
            gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradient3Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        gradient3Layout.setVerticalGroup(
            gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradient3Layout.createSequentialGroup()
                .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gradient3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gradient3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(15, 15, 15))
        );

        pictureBox2.setImage(new javax.swing.ImageIcon("C:\\JAVA\\ProjectOOP\\ProjectOOP\\src\\main\\resources\\layout\\shopping-cart4.png")); // NOI18N

        pictureBox3.setImage(new javax.swing.ImageIcon("C:\\JAVA\\ProjectOOP\\ProjectOOP\\src\\main\\resources\\layout\\order-history11.png")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("LE PHI HUNG");

        pictureBox5.setImage(new javax.swing.ImageIcon("C:\\JAVA\\ProjectOOP\\ProjectOOP\\src\\main\\resources\\layout\\user1.png")); // NOI18N

        javax.swing.GroupLayout gradient2Layout = new javax.swing.GroupLayout(gradient2);
        gradient2.setLayout(gradient2Layout);
        gradient2Layout.setHorizontalGroup(
            gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient2Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(gradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(gradient3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(pictureBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(pictureBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pictureBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        gradient2Layout.setVerticalGroup(
            gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient2Layout.createSequentialGroup()
                .addGroup(gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradient2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gradient3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pictureBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pictureBox3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(gradient2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pictureBox5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        gradient5.setBackground(new java.awt.Color(255, 255, 255));
        gradient5.setColor1(new java.awt.Color(153, 153, 255));
        gradient5.setColor2(new java.awt.Color(153, 153, 255));
        gradient5.setRadius(50);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\JAVA\\ProjectOOP\\ProjectOOP\\src\\main\\resources\\home-page1.png")); // NOI18N
        jLabel1.setText("Màn hình chính");

        javax.swing.GroupLayout gradient5Layout = new javax.swing.GroupLayout(gradient5);
        gradient5.setLayout(gradient5Layout);
        gradient5Layout.setHorizontalGroup(
            gradient5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );
        gradient5Layout.setVerticalGroup(
            gradient5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradient5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cart.setBackground(new java.awt.Color(255, 255, 255));
        cart.setColor1(new java.awt.Color(153, 153, 255));
        cart.setColor2(new java.awt.Color(153, 153, 255));
        cart.setRadius(50);
        cart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\JAVA\\ProjectOOP\\ProjectOOP\\src\\main\\resources\\layout\\shopping-cart4.png")); // NOI18N
        jLabel3.setText("Giỏ hàng");
        jLabel3.setIconTextGap(10);

        javax.swing.GroupLayout cartLayout = new javax.swing.GroupLayout(cart);
        cart.setLayout(cartLayout);
        cartLayout.setHorizontalGroup(
            cartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cartLayout.setVerticalGroup(
            cartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gradient11.setBackground(new java.awt.Color(255, 255, 255));
        gradient11.setColor1(new java.awt.Color(153, 153, 255));
        gradient11.setColor2(new java.awt.Color(153, 153, 255));
        gradient11.setRadius(50);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\JAVA\\ProjectOOP\\ProjectOOP\\src\\main\\resources\\layout\\order-history11.png")); // NOI18N
        jLabel4.setText("Đơn hàng");
        jLabel4.setIconTextGap(10);

        javax.swing.GroupLayout gradient11Layout = new javax.swing.GroupLayout(gradient11);
        gradient11.setLayout(gradient11Layout);
        gradient11Layout.setHorizontalGroup(
            gradient11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );
        gradient11Layout.setVerticalGroup(
            gradient11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradient11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        gradient6.setBackground(new java.awt.Color(255, 255, 255));
        gradient6.setColor1(new java.awt.Color(153, 153, 255));
        gradient6.setColor2(new java.awt.Color(153, 153, 255));
        gradient6.setRadius(50);
        gradient6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gradient6MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\JAVA\\ProjectOOP\\ProjectOOP\\src\\main\\resources\\layout\\user2.png")); // NOI18N
        jLabel6.setText("Thông tin người dùng");

        javax.swing.GroupLayout gradient6Layout = new javax.swing.GroupLayout(gradient6);
        gradient6.setLayout(gradient6Layout);
        gradient6Layout.setHorizontalGroup(
            gradient6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );
        gradient6Layout.setVerticalGroup(
            gradient6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("23th_Team@gmail.com");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("LIÊN HỆ:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gradient6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gradient11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gradient5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gradient5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(gradient11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gradient6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setBackground(new java.awt.Color(245, 244, 245));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel17.setBackground(new java.awt.Color(245, 244, 245));
        jPanel17.setAutoscrolls(true);
        jPanel17.setMaximumSize(new java.awt.Dimension(600, 300));

        jLabel30.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel30.setText("Danh Mục:");

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setMaximumSize(new java.awt.Dimension(1152, 300));
        jPanel16.setPreferredSize(new java.awt.Dimension(1152, 333));
        jPanel16.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 15, 30));

        TvCategory.setBackground(new java.awt.Color(255, 255, 255));
        TvCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TvCategoryMouseClicked(evt);
            }
        });

        pictureBox10.setImage(new javax.swing.ImageIcon("C:\\JAVA\\ProjectOOP\\ProjectOOP\\src\\main\\resources\\layout\\Tivi-128x129.png")); // NOI18N

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Tivi");

        javax.swing.GroupLayout TvCategoryLayout = new javax.swing.GroupLayout(TvCategory);
        TvCategory.setLayout(TvCategoryLayout);
        TvCategoryLayout.setHorizontalGroup(
            TvCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TvCategoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TvCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(pictureBox10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        TvCategoryLayout.setVerticalGroup(
            TvCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TvCategoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pictureBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel16.add(TvCategory);

        tulanhCategory.setBackground(new java.awt.Color(255, 255, 255));
        tulanhCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tulanhCategoryMouseClicked(evt);
            }
        });

        pictureBox24.setImage(new javax.swing.ImageIcon("C:\\JAVA\\ProjectOOP\\ProjectOOP\\src\\main\\resources\\layout\\Tulanh-128x129.png")); // NOI18N

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Tủ lạnh");

        javax.swing.GroupLayout tulanhCategoryLayout = new javax.swing.GroupLayout(tulanhCategory);
        tulanhCategory.setLayout(tulanhCategoryLayout);
        tulanhCategoryLayout.setHorizontalGroup(
            tulanhCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tulanhCategoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tulanhCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(pictureBox24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        tulanhCategoryLayout.setVerticalGroup(
            tulanhCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tulanhCategoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pictureBox24, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel16.add(tulanhCategory);

        maynuocnongCategory.setBackground(new java.awt.Color(255, 255, 255));
        maynuocnongCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maynuocnongCategoryMouseClicked(evt);
            }
        });

        pictureBox25.setImage(new javax.swing.ImageIcon("C:\\JAVA\\ProjectOOP\\ProjectOOP\\src\\main\\resources\\layout\\may-nuoc-nong-128x129-1.png")); // NOI18N

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Máy nước nóng");
        jLabel12.setToolTipText("");

        javax.swing.GroupLayout maynuocnongCategoryLayout = new javax.swing.GroupLayout(maynuocnongCategory);
        maynuocnongCategory.setLayout(maynuocnongCategoryLayout);
        maynuocnongCategoryLayout.setHorizontalGroup(
            maynuocnongCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, maynuocnongCategoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(maynuocnongCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pictureBox25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        maynuocnongCategoryLayout.setVerticalGroup(
            maynuocnongCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, maynuocnongCategoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pictureBox25, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel16.add(maynuocnongCategory);

        mayruaxeCategory.setBackground(new java.awt.Color(255, 255, 255));
        mayruaxeCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mayruaxeCategoryMouseClicked(evt);
            }
        });

        pictureBox26.setImage(new javax.swing.ImageIcon("C:\\JAVA\\ProjectOOP\\ProjectOOP\\src\\main\\resources\\layout\\may-rua-xe-128x129-1.png")); // NOI18N

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Máy rửa xe");
        jLabel13.setToolTipText("");

        javax.swing.GroupLayout mayruaxeCategoryLayout = new javax.swing.GroupLayout(mayruaxeCategory);
        mayruaxeCategory.setLayout(mayruaxeCategoryLayout);
        mayruaxeCategoryLayout.setHorizontalGroup(
            mayruaxeCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mayruaxeCategoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mayruaxeCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(pictureBox26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mayruaxeCategoryLayout.setVerticalGroup(
            mayruaxeCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mayruaxeCategoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pictureBox26, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel16.add(mayruaxeCategory);

        maylocnuocCategory.setBackground(new java.awt.Color(255, 255, 255));
        maylocnuocCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maylocnuocCategoryMouseClicked(evt);
            }
        });

        pictureBox28.setImage(new javax.swing.ImageIcon("C:\\JAVA\\ProjectOOP\\ProjectOOP\\src\\main\\resources\\layout\\noibat-128x129.png")); // NOI18N

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Máy lọc nước");

        javax.swing.GroupLayout maylocnuocCategoryLayout = new javax.swing.GroupLayout(maylocnuocCategory);
        maylocnuocCategory.setLayout(maylocnuocCategoryLayout);
        maylocnuocCategoryLayout.setHorizontalGroup(
            maylocnuocCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, maylocnuocCategoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(maylocnuocCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(pictureBox28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        maylocnuocCategoryLayout.setVerticalGroup(
            maylocnuocCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, maylocnuocCategoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pictureBox28, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel16.add(maylocnuocCategory);

        dogiadungCategory.setBackground(new java.awt.Color(255, 255, 255));
        dogiadungCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dogiadungCategoryMouseClicked(evt);
            }
        });

        pictureBox29.setImage(new javax.swing.ImageIcon("C:\\JAVA\\ProjectOOP\\ProjectOOP\\src\\main\\resources\\layout\\noicomdien-128x129-1.png")); // NOI18N

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Đồ gia dụng");

        javax.swing.GroupLayout dogiadungCategoryLayout = new javax.swing.GroupLayout(dogiadungCategory);
        dogiadungCategory.setLayout(dogiadungCategoryLayout);
        dogiadungCategoryLayout.setHorizontalGroup(
            dogiadungCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dogiadungCategoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dogiadungCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(pictureBox29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        dogiadungCategoryLayout.setVerticalGroup(
            dogiadungCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dogiadungCategoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pictureBox29, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel16.add(dogiadungCategory);

        quatCategory.setBackground(new java.awt.Color(255, 255, 255));
        quatCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quatCategoryMouseClicked(evt);
            }
        });

        pictureBox30.setImage(new javax.swing.ImageIcon("C:\\JAVA\\ProjectOOP\\ProjectOOP\\src\\main\\resources\\layout\\quat-128x129.png")); // NOI18N

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Quạt");

        javax.swing.GroupLayout quatCategoryLayout = new javax.swing.GroupLayout(quatCategory);
        quatCategory.setLayout(quatCategoryLayout);
        quatCategoryLayout.setHorizontalGroup(
            quatCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quatCategoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(quatCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(pictureBox30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        quatCategoryLayout.setVerticalGroup(
            quatCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quatCategoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pictureBox30, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel16.add(quatCategory);

        dieuhoaCategory.setBackground(new java.awt.Color(255, 255, 255));
        dieuhoaCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dieuhoaCategoryMouseClicked(evt);
            }
        });

        pictureBox31.setImage(new javax.swing.ImageIcon("C:\\JAVA\\ProjectOOP\\ProjectOOP\\src\\main\\resources\\layout\\quatdieuhoa-128x129.png")); // NOI18N

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Điều hòa");

        javax.swing.GroupLayout dieuhoaCategoryLayout = new javax.swing.GroupLayout(dieuhoaCategory);
        dieuhoaCategory.setLayout(dieuhoaCategoryLayout);
        dieuhoaCategoryLayout.setHorizontalGroup(
            dieuhoaCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dieuhoaCategoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dieuhoaCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(pictureBox31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        dieuhoaCategoryLayout.setVerticalGroup(
            dieuhoaCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dieuhoaCategoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pictureBox31, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel16.add(dieuhoaCategory);

        tudongCategory.setBackground(new java.awt.Color(255, 255, 255));
        tudongCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tudongCategoryMouseClicked(evt);
            }
        });

        pictureBox32.setImage(new javax.swing.ImageIcon("C:\\JAVA\\ProjectOOP\\ProjectOOP\\src\\main\\resources\\layout\\tu-dong-128x129.png")); // NOI18N

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Tủ đông");

        javax.swing.GroupLayout tudongCategoryLayout = new javax.swing.GroupLayout(tudongCategory);
        tudongCategory.setLayout(tudongCategoryLayout);
        tudongCategoryLayout.setHorizontalGroup(
            tudongCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tudongCategoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tudongCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(pictureBox32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        tudongCategoryLayout.setVerticalGroup(
            tudongCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tudongCategoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pictureBox32, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel16.add(tudongCategory);

        beptuCategory.setBackground(new java.awt.Color(255, 255, 255));
        beptuCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                beptuCategoryMouseClicked(evt);
            }
        });

        pictureBox33.setImage(new javax.swing.ImageIcon("C:\\JAVA\\ProjectOOP\\ProjectOOP\\src\\main\\resources\\layout\\Bepbeptu-128x129.png")); // NOI18N

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Bếp từ");

        javax.swing.GroupLayout beptuCategoryLayout = new javax.swing.GroupLayout(beptuCategory);
        beptuCategory.setLayout(beptuCategoryLayout);
        beptuCategoryLayout.setHorizontalGroup(
            beptuCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, beptuCategoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(beptuCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(pictureBox33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        beptuCategoryLayout.setVerticalGroup(
            beptuCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, beptuCategoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pictureBox33, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel16.add(beptuCategory);

        maygiatCategory.setBackground(new java.awt.Color(255, 255, 255));
        maygiatCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maygiatCategoryMouseClicked(evt);
            }
        });

        pictureBox35.setImage(new javax.swing.ImageIcon("C:\\JAVA\\ProjectOOP\\ProjectOOP\\src\\main\\resources\\layout\\Maygiat-128x129.png")); // NOI18N

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Máy giặt");

        javax.swing.GroupLayout maygiatCategoryLayout = new javax.swing.GroupLayout(maygiatCategory);
        maygiatCategory.setLayout(maygiatCategoryLayout);
        maygiatCategoryLayout.setHorizontalGroup(
            maygiatCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, maygiatCategoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(maygiatCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(pictureBox35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        maygiatCategoryLayout.setVerticalGroup(
            maygiatCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, maygiatCategoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pictureBox35, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel16.add(maygiatCategory);

        maylanhCategory.setBackground(new java.awt.Color(255, 255, 255));
        maylanhCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maylanhCategoryMouseClicked(evt);
            }
        });

        pictureBox36.setImage(new javax.swing.ImageIcon("C:\\JAVA\\ProjectOOP\\ProjectOOP\\src\\main\\resources\\layout\\Maylanh-128x129-128x129-1.png")); // NOI18N

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Máy lạnh");

        javax.swing.GroupLayout maylanhCategoryLayout = new javax.swing.GroupLayout(maylanhCategory);
        maylanhCategory.setLayout(maylanhCategoryLayout);
        maylanhCategoryLayout.setHorizontalGroup(
            maylanhCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, maylanhCategoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(maylanhCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(pictureBox36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        maylanhCategoryLayout.setVerticalGroup(
            maylanhCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, maylanhCategoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pictureBox36, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel16.add(maylanhCategory);

        productwrapper.setBackground(new java.awt.Color(245, 244, 245));

        javax.swing.GroupLayout productwrapperLayout = new javax.swing.GroupLayout(productwrapper);
        productwrapper.setLayout(productwrapperLayout);
        productwrapperLayout.setHorizontalGroup(
            productwrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        productwrapperLayout.setVerticalGroup(
            productwrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
        );

        loadingbar.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productwrapper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loadingbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1389, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(151, 151, 151)
                                .addComponent(jLabel9)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(38, 38, 38))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(36, 36, 36)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loadingbar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(productwrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel17);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradient2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(gradient2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void TvCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TvCategoryMouseClicked
        // TODO add your handling code here:
        String TiviId = "";
        for (Category i : this.listCategory) {
            if ("Tivi".equals(i.label)) {
                loadingicon.setVisible(true);
                try {

                    ArrayList<Product> resp = api.GetProduct("http://localhost:5000/product/bycategory/" + i.id);
                    System.out.print(resp);
                    this.listProduct = resp;
                    productwrapper.removeAll();
                    for (Product item : this.listProduct) {
                        productwrapper.add(new cardproduct(item));
                    }
                } catch (IOException ex) {
                    Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
                }
                loadingicon.setVisible(false);
            }
        }
    }//GEN-LAST:event_TvCategoryMouseClicked

    private void tulanhCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tulanhCategoryMouseClicked
        // TODO add your handling code here:
        for (Category i : this.listCategory) {
            if ("Tủ lạnh".equals(i.label)) {
                loadingicon.setVisible(true);
                try {
                    ArrayList<Product> resp = api.GetProduct("http://localhost:5000/product/bycategory/" + i.id);
                    System.out.print(resp);
                    this.listProduct = resp;
                    productwrapper.removeAll();
                    for (Product item : this.listProduct) {
                        productwrapper.add(new cardproduct(item));
                    }
                } catch (IOException ex) {
                    Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
                }
                loadingicon.setVisible(false);

            }
        }

    }//GEN-LAST:event_tulanhCategoryMouseClicked

    private void maynuocnongCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maynuocnongCategoryMouseClicked
        // TODO add your handling code here:
        for (Category i : this.listCategory) {
            if ("Máy nước nóng".equals(i.label)) {
                loadingicon.setVisible(true);
                try {
                    ArrayList<Product> resp = api.GetProduct("http://localhost:5000/product/bycategory/" + i.id);
                    System.out.print(resp);
                    this.listProduct = resp;
                    productwrapper.removeAll();
                    for (Product item : this.listProduct) {
                        productwrapper.add(new cardproduct(item));
                    }
                } catch (IOException ex) {
                    Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
                }
                loadingicon.setVisible(false);

            }
        }
    }//GEN-LAST:event_maynuocnongCategoryMouseClicked

    private void quatCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quatCategoryMouseClicked
        // TODO add your handling code here:
        for (Category i : this.listCategory) {
            if ("Quạt".equals(i.label)) {
                loadingicon.setVisible(true);
                try {
                    ArrayList<Product> resp = api.GetProduct("http://localhost:5000/product/bycategory/" + i.id);
                    System.out.print(resp);
                    this.listProduct = resp;
                    productwrapper.removeAll();
                    for (Product item : this.listProduct) {
                        productwrapper.add(new cardproduct(item));
                    }
                } catch (IOException ex) {
                    Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
                }
                loadingicon.setVisible(false);

            }
        }
    }//GEN-LAST:event_quatCategoryMouseClicked

    private void mayruaxeCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mayruaxeCategoryMouseClicked
        // TODO add your handling code here:
        for (Category i : this.listCategory) {
            if ("Máy rửa xe".equals(i.label)) {
                loadingicon.setVisible(true);
                try {
                    ArrayList<Product> resp = api.GetProduct("http://localhost:5000/product/bycategory/" + i.id);
                    System.out.print(resp);
                    this.listProduct = resp;
                    productwrapper.removeAll();
                    for (Product item : this.listProduct) {
                        productwrapper.add(new cardproduct(item));
                    }
                } catch (IOException ex) {
                    Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
                }
                loadingicon.setVisible(false);

            }
        }
    }//GEN-LAST:event_mayruaxeCategoryMouseClicked

    private void maylocnuocCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maylocnuocCategoryMouseClicked
        // TODO add your handling code here:
        for (Category i : this.listCategory) {
            if ("Máy lọc nước".equals(i.label)) {
                loadingicon.setVisible(true);
                try {
                    ArrayList<Product> resp = api.GetProduct("http://localhost:5000/product/bycategory/" + i.id);
                    System.out.print(resp);
                    this.listProduct = resp;
                    productwrapper.removeAll();
                    for (Product item : this.listProduct) {
                        productwrapper.add(new cardproduct(item));
                    }
                } catch (IOException ex) {
                    Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
                }
                loadingicon.setVisible(false);

            }
        }
    }//GEN-LAST:event_maylocnuocCategoryMouseClicked

    private void dogiadungCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dogiadungCategoryMouseClicked
        // TODO add your handling code here:
        for (Category i : this.listCategory) {
            if ("Đồ gia dụng".equals(i.label)) {
                loadingicon.setVisible(true);
                try {
                    ArrayList<Product> resp = api.GetProduct("http://localhost:5000/product/bycategory/" + i.id);
                    System.out.print(resp);
                    this.listProduct = resp;
                    productwrapper.removeAll();
                    for (Product item : this.listProduct) {
                        productwrapper.add(new cardproduct(item));
                    }
                } catch (IOException ex) {
                    Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
                }
                loadingicon.setVisible(false);

            }
        }
    }//GEN-LAST:event_dogiadungCategoryMouseClicked

    private void dieuhoaCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dieuhoaCategoryMouseClicked
        // TODO add your handling code here:
        for (Category i : this.listCategory) {
            if ("Điều hòa".equals(i.label)) {
                System.out.print(i);
                loadingicon.setVisible(true);
                try {
                    ArrayList<Product> resp = api.GetProduct("http://localhost:5000/product/bycategory/" + i.id);
                    System.out.print(resp);
                    this.listProduct = resp;
                    productwrapper.removeAll();
                    for (Product item : this.listProduct) {
                        productwrapper.add(new cardproduct(item));
                    }
                } catch (IOException ex) {
                    Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
                }
                loadingicon.setVisible(false);

            }
        }
    }//GEN-LAST:event_dieuhoaCategoryMouseClicked

    private void tudongCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tudongCategoryMouseClicked
        // TODO add your handling code here:
        for (Category i : this.listCategory) {
            if ("Tủ đông".equals(i.label)) {
                loadingicon.setVisible(true);
                try {
                    ArrayList<Product> resp = api.GetProduct("http://localhost:5000/product/bycategory/" + i.id);
                    System.out.print(resp);
                    this.listProduct = resp;
                    productwrapper.removeAll();
                    for (Product item : this.listProduct) {
                        productwrapper.add(new cardproduct(item));
                    }
                } catch (IOException ex) {
                    Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
                }
                loadingicon.setVisible(false);

            }
        }
    }//GEN-LAST:event_tudongCategoryMouseClicked

    private void beptuCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beptuCategoryMouseClicked
        // TODO add your handling code here:
        for (Category i : this.listCategory) {
            if ("Bếp từ".equals(i.label)) {
                loadingicon.setVisible(true);
                try {
                    ArrayList<Product> resp = api.GetProduct("http://localhost:5000/product/bycategory/" + i.id);
                    System.out.print(resp);
                    this.listProduct = resp;
                    productwrapper.removeAll();
                    for (Product item : this.listProduct) {
                        productwrapper.add(new cardproduct(item));
                    }
                } catch (IOException ex) {
                    Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
                }
                loadingicon.setVisible(false);

            }
        }
    }//GEN-LAST:event_beptuCategoryMouseClicked

    private void maygiatCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maygiatCategoryMouseClicked
        // TODO add your handling code here:
        for (Category i : this.listCategory) {
            if ("Máy giặt".equals(i.label)) {
                loadingicon.setVisible(true);
                try {
                    ArrayList<Product> resp = api.GetProduct("http://localhost:5000/product/bycategory/" + i.id);
                    System.out.print(resp);
                    this.listProduct = resp;
                    productwrapper.removeAll();
                    for (Product item : this.listProduct) {
                        productwrapper.add(new cardproduct(item));
                    }
                } catch (IOException ex) {
                    Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
                }
                loadingicon.setVisible(false);

            }
        }

    }//GEN-LAST:event_maygiatCategoryMouseClicked

    private void maylanhCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maylanhCategoryMouseClicked
        // TODO add your handling code here:
        for (Category i : this.listCategory) {
            if ("Máy lạnh".equals(i.label)) {
                loadingicon.setVisible(true);
                try {
                    ArrayList<Product> resp = api.GetProduct("http://localhost:5000/product/bycategory/" + i.id);
                    System.out.print(resp);
                    this.listProduct = resp;
                    productwrapper.removeAll();
                    for (Product item : this.listProduct) {
                        productwrapper.add(new cardproduct(item));
                    }
                } catch (IOException ex) {
                    Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
                }
                loadingicon.setVisible(false);

            }
        }
    }//GEN-LAST:event_maylanhCategoryMouseClicked

    private void cartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartMouseClicked
        // TODO add your handling code here:\
        try {
            CartDialog d = new CartDialog(this.myuser);
            d.setLocationRelativeTo(null);
            d.setVisible(true);

            // TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(listproduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cartMouseClicked

    private void searchIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchIconMouseClicked
        // TODO add your handling code here:
        String searchText = searchField.getText();
        loadingicon.setVisible(true);
        try {
            ArrayList<Product> resp = api.GetProduct("http://localhost:5000/product/search?search=" + searchText);
            System.out.print(resp);
            this.listProduct = resp;
            productwrapper.removeAll();
            for (Product item : this.listProduct) {
                productwrapper.add(new cardproduct(item));
            }
        } catch (IOException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
        loadingicon.setVisible(false);
    }//GEN-LAST:event_searchIconMouseClicked

    private void gradient6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradient6MouseClicked
    
        // TODO add your handling code here:
    }//GEN-LAST:event_gradient6MouseClicked

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new home().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TvCategory;
    private javax.swing.JPanel beptuCategory;
    private com.mycompany.mavenproject2.view.gradient cart;
    private javax.swing.JPanel dieuhoaCategory;
    private javax.swing.JPanel dogiadungCategory;
    private com.mycompany.mavenproject2.view.gradient gradient1;
    private com.mycompany.mavenproject2.view.gradient gradient11;
    private com.mycompany.mavenproject2.view.gradient gradient2;
    private com.mycompany.mavenproject2.view.gradient gradient3;
    private com.mycompany.mavenproject2.view.gradient gradient5;
    private com.mycompany.mavenproject2.view.gradient gradient6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPanel loadingbar;
    private javax.swing.JPanel maygiatCategory;
    private javax.swing.JPanel maylanhCategory;
    private javax.swing.JPanel maylocnuocCategory;
    private javax.swing.JPanel maynuocnongCategory;
    private javax.swing.JPanel mayruaxeCategory;
    private com.mycompany.mavenproject2.view.PictureBox pictureBox10;
    private com.mycompany.mavenproject2.view.PictureBox pictureBox2;
    private com.mycompany.mavenproject2.view.PictureBox pictureBox24;
    private com.mycompany.mavenproject2.view.PictureBox pictureBox25;
    private com.mycompany.mavenproject2.view.PictureBox pictureBox26;
    private com.mycompany.mavenproject2.view.PictureBox pictureBox28;
    private com.mycompany.mavenproject2.view.PictureBox pictureBox29;
    private com.mycompany.mavenproject2.view.PictureBox pictureBox3;
    private com.mycompany.mavenproject2.view.PictureBox pictureBox30;
    private com.mycompany.mavenproject2.view.PictureBox pictureBox31;
    private com.mycompany.mavenproject2.view.PictureBox pictureBox32;
    private com.mycompany.mavenproject2.view.PictureBox pictureBox33;
    private com.mycompany.mavenproject2.view.PictureBox pictureBox35;
    private com.mycompany.mavenproject2.view.PictureBox pictureBox36;
    private com.mycompany.mavenproject2.view.PictureBox pictureBox4;
    private com.mycompany.mavenproject2.view.PictureBox pictureBox5;
    private javax.swing.JPanel productwrapper;
    private javax.swing.JPanel quatCategory;
    private javax.swing.JTextField searchField;
    private com.mycompany.mavenproject2.view.PictureBox searchIcon;
    private javax.swing.JPanel tudongCategory;
    private javax.swing.JPanel tulanhCategory;
    // End of variables declaration//GEN-END:variables
}
