/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.view;

import com.mycompany.applicationmvc.Bean.DanhMucBean;
import com.mycompany.applicationmvc.controller.PersonController;
import com.mycompany.applicationmvc.controller.SwitchController;
import com.mycompany.applicationmvc.service.PersonService;
import com.mycompany.applicationmvc.serviceImpl.PersonServiceImpl;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author MinhTo
 */
public class MenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form ListMenuFrame
     */
    public MenuFrame() {
        initComponents();
        //setVisible(true);
        List<DanhMucBean> listDanhMuc=new ArrayList<>();
        listDanhMuc.add(new DanhMucBean("trangChinh", null, trangChinhLabel));
        listDanhMuc.add(new DanhMucBean("khachHangPage", null, khachHangLabel));
        listDanhMuc.add(new DanhMucBean("xePage", null,xeLabel));
          listDanhMuc.add(new DanhMucBean("linhKienPage", null,linhKienLabel));
          listDanhMuc.add(new DanhMucBean("donBaoDuongPage",null,donBaoDuongLabel));
        SwitchController c=new SwitchController(this,Panels, listDanhMuc);
        
        c.setEvent();
       
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panels = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        trangChinhLabel = new javax.swing.JLabel();
        khachHangLabel = new javax.swing.JLabel();
        xeLabel = new javax.swing.JLabel();
        quanLiLK = new javax.swing.JLabel();
        dichVuBD = new javax.swing.JLabel();
        quanTri = new javax.swing.JLabel();
        listQuanTri = new javax.swing.JPanel();
        quyen1 = new javax.swing.JLabel();
        quyen2 = new javax.swing.JLabel();
        quyen3 = new javax.swing.JLabel();
        quyen4 = new javax.swing.JLabel();
        linhKienLabel = new javax.swing.JLabel();
        donBaoDuongLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panels.setPreferredSize(new java.awt.Dimension(990, 650));

        javax.swing.GroupLayout PanelsLayout = new javax.swing.GroupLayout(Panels);
        Panels.setLayout(PanelsLayout);
        PanelsLayout.setHorizontalGroup(
            PanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelsLayout.setVerticalGroup(
            PanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        trangChinhLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        trangChinhLabel.setForeground(new java.awt.Color(255, 0, 0));
        trangChinhLabel.setText("Home");

        khachHangLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        khachHangLabel.setForeground(new java.awt.Color(0, 0, 204));
        khachHangLabel.setText("Quản Lí Khách Hàng");
        khachHangLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                khachHangLabelMouseClicked(evt);
            }
        });

        xeLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        xeLabel.setForeground(new java.awt.Color(0, 0, 204));
        xeLabel.setText("Quản Lí Xe");
        xeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xeLabelMouseClicked(evt);
            }
        });

        quanLiLK.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        quanLiLK.setForeground(new java.awt.Color(0, 0, 204));
        quanLiLK.setText("Quản lí .....");
        quanLiLK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quanLiLKMouseClicked(evt);
            }
        });

        dichVuBD.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dichVuBD.setForeground(new java.awt.Color(0, 0, 204));
        dichVuBD.setText("Dịch Vụ Bảo Dưỡng");

        quanTri.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        quanTri.setForeground(new java.awt.Color(0, 0, 204));
        quanTri.setText("Quản Trị");
        quanTri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quanTriMouseClicked(evt);
            }
        });

        listQuanTri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listQuanTriMouseClicked(evt);
            }
        });

        quyen1.setText("quyền 1");

        quyen2.setText("quyền 2");

        quyen3.setText("quyền 3");

        quyen4.setText("quyền 4");

        javax.swing.GroupLayout listQuanTriLayout = new javax.swing.GroupLayout(listQuanTri);
        listQuanTri.setLayout(listQuanTriLayout);
        listQuanTriLayout.setHorizontalGroup(
            listQuanTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listQuanTriLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(listQuanTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quyen4)
                    .addComponent(quyen3)
                    .addComponent(quyen2)
                    .addComponent(quyen1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        listQuanTriLayout.setVerticalGroup(
            listQuanTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listQuanTriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(quyen1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quyen2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quyen3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quyen4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        linhKienLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        linhKienLabel.setForeground(new java.awt.Color(0, 0, 204));
        linhKienLabel.setText("Quản lí Linh Kiện");
        linhKienLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linhKienLabelMouseClicked(evt);
            }
        });

        donBaoDuongLabel.setText("Don bao duong");

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xeLabel)
                            .addComponent(khachHangLabel)
                            .addComponent(dichVuBD)
                            .addComponent(quanTri, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(listQuanTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(linhKienLabel))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(quanLiLK))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(trangChinhLabel))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(donBaoDuongLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(trangChinhLabel)
                .addGap(18, 18, 18)
                .addComponent(khachHangLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(xeLabel)
                .addGap(62, 62, 62)
                .addComponent(linhKienLabel)
                .addGap(64, 64, 64)
                .addComponent(dichVuBD)
                .addGap(64, 64, 64)
                .addComponent(quanTri)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listQuanTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(donBaoDuongLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(quanLiLK, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panels, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Panels, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        Panels.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void khachHangLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khachHangLabelMouseClicked
//        // TODO add your handling code here:
//        CardLayout cardLayout = (CardLayout) Panels.getLayout();
//        cardLayout.show(Panels, "card2");
    }//GEN-LAST:event_khachHangLabelMouseClicked

    private void xeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xeLabelMouseClicked
        // TODO add your handling code here:
//        CardLayout cardLayout = (CardLayout) Panels.getLayout();
//        cardLayout.show(Panels, "card3");
    }//GEN-LAST:event_xeLabelMouseClicked

    private void quanLiLKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quanLiLKMouseClicked
        // TODO add your handling code here:
//        CardLayout cardLayout = (CardLayout) Panels.getLayout();
//        cardLayout.show(Panels, "card4");
    }//GEN-LAST:event_quanLiLKMouseClicked

    private void listQuanTriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listQuanTriMouseClicked
        // TODO add your handling code here:
        listQuanTri.getRootPane();
    }//GEN-LAST:event_listQuanTriMouseClicked

    private void quanTriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quanTriMouseClicked
        // TODO add your handling code here:
//        PersonService personService = new PersonServiceImpl();
//        personService.find();


        if (listQuanTri.isVisible()) {
            listQuanTri.setVisible(false);
        } else {
            listQuanTri.setVisible(true);
        }
    }//GEN-LAST:event_quanTriMouseClicked

    private void linhKienLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linhKienLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_linhKienLabelMouseClicked

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
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuFrame().setVisible(true);
            }
        });
    }

  
    public JLabel getQuanLiKH() {
        return khachHangLabel;
    }

    public void setQuanLiKH(JLabel quanLiKH) {
        this.khachHangLabel = quanLiKH;
    }

    public JPanel getPanels() {
        return Panels;
    }

    public void setPanels(JPanel Panels) {
        this.Panels = Panels;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panels;
    private javax.swing.JLabel dichVuBD;
    private javax.swing.JLabel donBaoDuongLabel;
    private javax.swing.JLabel khachHangLabel;
    private javax.swing.JLabel linhKienLabel;
    private javax.swing.JPanel listQuanTri;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel quanLiLK;
    private javax.swing.JLabel quanTri;
    private javax.swing.JLabel quyen1;
    private javax.swing.JLabel quyen2;
    private javax.swing.JLabel quyen3;
    private javax.swing.JLabel quyen4;
    private javax.swing.JLabel trangChinhLabel;
    private javax.swing.JLabel xeLabel;
    // End of variables declaration//GEN-END:variables
}
