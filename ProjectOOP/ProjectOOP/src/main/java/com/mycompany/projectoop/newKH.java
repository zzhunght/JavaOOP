/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projectoop;

import com.mycompany.api.GET;
import com.mycompany.api.POST;
import com.mycompany.mavenproject2.view.error;
import com.mycompany.mavenproject2.view.notification;
import com.mycompany.model.RegisterForm;
import com.mycompany.model.RegisterResponse;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thinh
 */
public class newKH extends javax.swing.JFrame {

    public String gender = "Nam";
    public POST api = new POST();
    public newKH() {
        initComponents();
        dayCbbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9","10","11", "12", "13", "14", "15", "16", "17", "18", "19","20","21", "22", "23", "24", "25", "26", "27", "28", "29","30","31" }));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        textField1 = new com.mycompany.projectoop.TextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        gradient2 = new com.mycompany.projectoop.gradient();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        gradient3 = new com.mycompany.projectoop.gradient();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        grbuttonPn = new javax.swing.JPanel();
        registerBtn = new com.mycompany.mavenproject2.view.Mainbutton();
        cancleBtn = new com.mycompany.mavenproject2.view.Mainbutton();
        jPanel4 = new javax.swing.JPanel();
        nameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        passField = new javax.swing.JPasswordField();
        repassField = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        MaleRdo = new javax.swing.JRadioButton();
        FemaleRdo = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        yearsCbbox = new com.mycompany.mavenproject2.view.Combobox();
        monthCbbox = new com.mycompany.mavenproject2.view.Combobox();
        dayCbbox = new com.mycompany.mavenproject2.view.Combobox();
        jPanel8 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        addressField = new javax.swing.JTextField();

        jTextField2.setText("jTextField2");

        jTextField4.setText("jTextField4");

        textField1.setText("textField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gradient2.setColor2(new java.awt.Color(153, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Thông tin cá nhân");

        jLabel2.setText("Quản lý thông tin hồ sơ để bảo mật tài khoản");

        javax.swing.GroupLayout gradient2Layout = new javax.swing.GroupLayout(gradient2);
        gradient2.setLayout(gradient2Layout);
        gradient2Layout.setHorizontalGroup(
            gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gradient2Layout.setVerticalGroup(
            gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradient2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradient2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(gradient2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gradient3.setColor1(new java.awt.Color(51, 255, 255));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(0, 1, 0, 10));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Họ và tên: ");
        jPanel1.add(jLabel3);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Email: ");
        jPanel1.add(jLabel4);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Số điện thoại: ");
        jPanel1.add(jLabel5);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Mật khẩu: ");
        jPanel1.add(jLabel6);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Xác nhận mật khẩu: ");
        jPanel1.add(jLabel7);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Giới tính: ");
        jPanel1.add(jLabel8);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Ngày sinh: ");
        jPanel1.add(jLabel9);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("Địa chỉ: ");
        jPanel1.add(jLabel10);

        jPanel3.setOpaque(false);

        grbuttonPn.setOpaque(false);
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

        cancleBtn.setText("Huỷ");
        cancleBtn.setBorderColor(new java.awt.Color(255, 255, 255));
        cancleBtn.setColor(java.awt.Color.white);
        cancleBtn.setColorClick(new java.awt.Color(51, 255, 255));
        cancleBtn.setRadius(15);
        cancleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancleBtnActionPerformed(evt);
            }
        });
        grbuttonPn.add(cancleBtn);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(grbuttonPn, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(grbuttonPn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridLayout(0, 1, 0, 10));

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        jPanel4.add(nameField);
        jPanel4.add(emailField);

        phoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneFieldActionPerformed(evt);
            }
        });
        jPanel4.add(phoneField);
        jPanel4.add(passField);
        jPanel4.add(repassField);

        jPanel5.setOpaque(false);

        buttonGroup1.add(MaleRdo);
        MaleRdo.setText("Nam");
        MaleRdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleRdoActionPerformed(evt);
            }
        });

        buttonGroup1.add(FemaleRdo);
        FemaleRdo.setText("Nữ");
        FemaleRdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleRdoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MaleRdo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FemaleRdo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(391, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaleRdo)
                    .addComponent(FemaleRdo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5);

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        yearsCbbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910" }));
        yearsCbbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearsCbboxActionPerformed(evt);
            }
        });
        jPanel6.add(yearsCbbox);

        monthCbbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        monthCbbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthCbboxActionPerformed(evt);
            }
        });
        jPanel6.add(monthCbbox);

        jPanel6.add(dayCbbox);

        jPanel8.setOpaque(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 105, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel8);

        jPanel7.setOpaque(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 105, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel7);

        jPanel4.add(jPanel6);
        jPanel4.add(addressField);

        javax.swing.GroupLayout gradient3Layout = new javax.swing.GroupLayout(gradient3);
        gradient3.setLayout(gradient3Layout);
        gradient3Layout.setHorizontalGroup(
            gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(gradient3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(122, 122, 122))
        );
        gradient3Layout.setVerticalGroup(
            gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient3Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(gradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(gradient3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(gradient3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void monthCbboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthCbboxActionPerformed
        if(monthCbbox.getSelectedItem()=="2"&&Integer.parseInt((String) yearsCbbox.getSelectedItem())%4!=0){
                dayCbbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9","10","11", "12", "13", "14", "15", "16", "17", "18", "19","20","21", "22", "23", "24", "25", "26", "27", "28" }));
            }
        if(monthCbbox.getSelectedItem()=="2" && Integer.parseInt((String) yearsCbbox.getSelectedItem())%4==0){
                dayCbbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9","10","11", "12", "13", "14", "15", "16", "17", "18", "19","20","21", "22", "23", "24", "25", "26", "27", "28","29" }));
            }
        if(monthCbbox.getSelectedItem().equals("4")
                ||monthCbbox.getSelectedItem().equals("6")
                ||monthCbbox.getSelectedItem().equals("9")
                ||monthCbbox.getSelectedItem().equals("11")){
            dayCbbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9","10","11", "12", "13", "14", "15", "16", "17", "18", "19","20","21", "22", "23", "24", "25", "26", "27", "28","29","30" }));
        }if(monthCbbox.getSelectedItem().equals("1")
                ||monthCbbox.getSelectedItem().equals("3")
                ||monthCbbox.getSelectedItem().equals("5")
                ||monthCbbox.getSelectedItem().equals("7")
                ||monthCbbox.getSelectedItem().equals("8")
                ||monthCbbox.getSelectedItem().equals("10")
                ||monthCbbox.getSelectedItem().equals("12")){
            dayCbbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9","10","11", "12", "13", "14", "15", "16", "17", "18", "19","20","21", "22", "23", "24", "25", "26", "27", "28","29","30","31" }));
        }
    }//GEN-LAST:event_monthCbboxActionPerformed

    private void yearsCbboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearsCbboxActionPerformed
        if(monthCbbox.getSelectedItem()=="Tháng 2" && Integer.parseInt((String) yearsCbbox.getSelectedItem())%4==0){
                dayCbbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9","10","11", "12", "13", "14", "15", "16", "17", "18", "19","20","21", "22", "23", "24", "25", "26", "27", "28","29" }));
            }
        if(monthCbbox.getSelectedItem()=="Tháng 2"&&Integer.parseInt((String) yearsCbbox.getSelectedItem())%4!=0){
                dayCbbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9","10","11", "12", "13", "14", "15", "16", "17", "18", "19","20","21", "22", "23", "24", "25", "26", "27", "28" }));
            }
    }//GEN-LAST:event_yearsCbboxActionPerformed

    private void cancleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancleBtnActionPerformed
                // TODO add your handling code here:
        Login l = new Login();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_cancleBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
   
        try {
            // TODO add your handling code here:
            String name = nameField.getText();
            String email = emailField.getText();
            String phone = phoneField.getText();
            String address = addressField.getText();
            String year = yearsCbbox.getSelectedItem().toString();
            String month = monthCbbox.getSelectedItem().toString();
            String day = dayCbbox.getSelectedItem().toString();
            String birthday = year +"-" +month +"-" + day;
            String password = passField.getText();
            String repass = repassField.getText();
            if(password == null ? repass != null : !password.equals(repass)){
//            dialog xac nhan mk
                error er = new error(true,"Xác nhận mật khẩu sai");
                er.setLocationRelativeTo(null);
                er.setVisible(true);
            }
            else {

                RegisterForm form = new RegisterForm(name, email, phone, address, password, this.gender, birthday);

                System.out.print(form);
                RegisterResponse resp = api.Register("http://localhost:5000/user/register", form.toString());
                System.out.print("register:--------" + resp.toString());
                if (resp.success) {
                    notification noti = new notification( true, "Đăng kí thành công");
                    noti.setLocationRelativeTo(null);
                    noti.setVisible(true);
                    this.dispose();
                    Login l = new Login();
                    l.setVisible(true);
                    l.setLocationRelativeTo(null);
                } else {
                    error er = new error(true, "Đăng kí thất bại");
                    er.setLocationRelativeTo(null);
                    er.setVisible(true);

                }
            }

        } catch (IOException ex) {
            error er = new error(true,"Đăng kí thất bại");
            er.setLocationRelativeTo(null);
            er.setVisible(true);
            System.out.print("Dang ky that bai");
        }

        
    }//GEN-LAST:event_registerBtnActionPerformed

    private void MaleRdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleRdoActionPerformed
        // TODO add your handling code here:
        this.gender = "Nam";
    }//GEN-LAST:event_MaleRdoActionPerformed

    private void FemaleRdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleRdoActionPerformed
        // TODO add your handling code here:
        this.gender = "Nữ";
    }//GEN-LAST:event_FemaleRdoActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void phoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newKH().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton FemaleRdo;
    private javax.swing.JRadioButton MaleRdo;
    private javax.swing.JTextField addressField;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.mycompany.mavenproject2.view.Mainbutton cancleBtn;
    private com.mycompany.mavenproject2.view.Combobox dayCbbox;
    private javax.swing.JTextField emailField;
    private com.mycompany.projectoop.gradient gradient2;
    private com.mycompany.projectoop.gradient gradient3;
    private javax.swing.JPanel grbuttonPn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private com.mycompany.mavenproject2.view.Combobox monthCbbox;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passField;
    private javax.swing.JTextField phoneField;
    private com.mycompany.mavenproject2.view.Mainbutton registerBtn;
    private javax.swing.JPasswordField repassField;
    private com.mycompany.projectoop.TextField textField1;
    private com.mycompany.mavenproject2.view.Combobox yearsCbbox;
    // End of variables declaration//GEN-END:variables
}
