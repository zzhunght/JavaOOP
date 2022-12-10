
package com.mycompany.projectoop;

import com.mycompany.api.GET;
import com.mycompany.mavenproject2.view.AddProductDialog;
import com.mycompany.model.Brand;
import com.mycompany.model.Category;
import com.mycompany.model.Product;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class tableSp extends javax.swing.JPanel {

    /**
     * Creates new form tableSp
     */
    public GET api = new GET();
    public ArrayList<Product> data;    
    public ArrayList<Category> categoryList;
    public ArrayList<Brand> brandList;
    public int rowSelected;
    
    public tableSp() throws IOException {
        initComponents();
        DefaultTableModel defaulttbmd = new DefaultTableModel();
        ListSelectionModel selectionTable = jTable1.getSelectionModel();
        jTable1.setModel(defaulttbmd);
        defaulttbmd.addColumn("id");
        defaulttbmd.addColumn("Tên");
        defaulttbmd.addColumn("Mô tả");
        defaulttbmd.addColumn("Hình ảnh");
        defaulttbmd.addColumn("Giá");
        defaulttbmd.addColumn("Nhãn hiệu");
        defaulttbmd.addColumn("Giảm giá %");
        
        
        selectionTable.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        selectionTable.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = jTable1.getSelectedRow();
                rowSelected = row;
            }
        });
        
        ArrayList<Product> resp = api.GetProduct("http://localhost:5000/product");
        this.data = resp;
        for (Product i : resp){
            defaulttbmd.addRow(new Object[]{i.getId(),i.getName(),i.getDescription(),i.getImage(),i.getPrice(),i.getBrand(),i.getDiscount()});
        }
        ArrayList<Brand> brand = api.GetBrand("http://localhost:5000/brand");
        ArrayList<Category> category = api.GetCategory("http://localhost:5000/category");
        this.brandList = brand;
        this.categoryList = category;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gradient3 = new com.mycompany.projectoop.gradient();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        addBtn = new com.mycompany.mavenproject2.view.Mainbutton();
        mainbutton3 = new com.mycompany.mavenproject2.view.Mainbutton();
        updateBtn = new com.mycompany.mavenproject2.view.Mainbutton();
        jPanel1 = new javax.swing.JPanel();
        tableTop = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        textField7 = new com.mycompany.projectoop.TextField();

        gradient3.setColor2(new java.awt.Color(153, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("DANH SÁCH SẢN PHẨM");

        jLabel9.setText("Ngày:_________________ Giờ:______________________");

        addBtn.setBorder(null);
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("THÊM");
        addBtn.setBorderColor(new java.awt.Color(255, 255, 255));
        addBtn.setColor(new java.awt.Color(111, 199, 245));
        addBtn.setColorClick(new java.awt.Color(66, 141, 193));
        addBtn.setColorOver(new java.awt.Color(77, 160, 203));
        addBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addBtn.setRadius(15);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        mainbutton3.setBorder(null);
        mainbutton3.setForeground(new java.awt.Color(255, 255, 255));
        mainbutton3.setText("XÓA");
        mainbutton3.setBorderColor(new java.awt.Color(255, 255, 255));
        mainbutton3.setColor(new java.awt.Color(111, 199, 245));
        mainbutton3.setColorClick(new java.awt.Color(66, 141, 193));
        mainbutton3.setColorOver(new java.awt.Color(77, 160, 203));
        mainbutton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mainbutton3.setRadius(15);

        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("CẬP NHẬT");
        updateBtn.setBorderColor(new java.awt.Color(255, 255, 255));
        updateBtn.setColor(new java.awt.Color(111, 199, 245));
        updateBtn.setColorClick(new java.awt.Color(66, 141, 193));
        updateBtn.setColorOver(new java.awt.Color(77, 160, 203));
        updateBtn.setRadius(15);
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gradient3Layout = new javax.swing.GroupLayout(gradient3);
        gradient3.setLayout(gradient3Layout);
        gradient3Layout.setHorizontalGroup(
            gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(mainbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        gradient3Layout.setVerticalGroup(
            gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(gradient3Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradient3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updateBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mainbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tableTop.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Tên", "Mô tả", "Hình ảnh", "Giá", "Nhãn hàng", "Giảm giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setRowHeight(40);
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable1.setShowGrid(true);
        tableTop.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel12.setText("TÌM");

        textField7.setBackground(new java.awt.Color(204, 255, 204));
        textField7.setText("THANH TÌM KIẾM THEO GÌ ĐÓ, NHỜ KHA,");
        textField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textField7, javax.swing.GroupLayout.DEFAULT_SIZE, 1021, Short.MAX_VALUE)
                .addGap(133, 133, 133))
            .addComponent(tableTop)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tableTop, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradient3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(gradient3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField7ActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        AddProductDialog d = new AddProductDialog("Add",this.categoryList,this.brandList);
        d.setLocationRelativeTo(null);
        d.setVisible(true);
    }//GEN-LAST:event_addBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        Product targetItem = this.data.get(this.rowSelected);
        AddProductDialog d = new AddProductDialog("Edit",this.categoryList,this.brandList,targetItem);
        d.setLocationRelativeTo(null);
        d.setVisible(true);
    }//GEN-LAST:event_updateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.mavenproject2.view.Mainbutton addBtn;
    private com.mycompany.projectoop.gradient gradient3;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jTable1;
    private com.mycompany.mavenproject2.view.Mainbutton mainbutton3;
    private javax.swing.JScrollPane tableTop;
    private com.mycompany.projectoop.TextField textField7;
    private com.mycompany.mavenproject2.view.Mainbutton updateBtn;
    // End of variables declaration//GEN-END:variables
}
