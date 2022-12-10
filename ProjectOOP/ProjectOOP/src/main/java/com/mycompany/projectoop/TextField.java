package com.mycompany.projectoop;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TextField extends JTextField{

    /**
     * @return the hideText
//     */
//    public String getHideText() {
//        return hideText;
//    }
//
//    /**
//     * @param hideText the hideText to set
//     */
//    public void setHideText(String hideText) {
//        this.hideText = hideText;
//    }
//
//    private boolean mouseOver = false;
//    private String hideText = "texttttt";
//    private boolean hideT = false;
//    
    public TextField() {
        // set border
        setBorder(new EmptyBorder(10,5,1,5));
        
//        addMouseListener(new MouseAdapter(){
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                hideT = true;
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//                hideT = false;
//            }
//            
//        }
//        );
    }
    // 

//    @Override
//    public void paint(Graphics g) {
//        super.paint(g); 
//        Graphics2D g2 = (Graphics2D)g;
//        creatHideText(g2);
//        if (hideT) {
//            g2.setColor(new Color(255,255,255));
//        }
//        else{
//            g2.setColor(new Color(150,150,150));
//        }
//    }
//    
//    private void creatHideText(Graphics2D g2){
//        g2.setColor(new Color(150,150,150));
//        Font myFont1 = new Font("Segoe UI", Font.PLAIN, 12);
//        g2.setFont(myFont1);
//        g2.drawString(getHideText(),(getInsets().right), (int)getInsets().bottom+12);
//    }
}
