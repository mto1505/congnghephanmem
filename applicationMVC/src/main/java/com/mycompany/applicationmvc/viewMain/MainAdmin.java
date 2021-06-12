/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.viewMain;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author dhmty
 */
public class MainAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MainAdmin
     */
    public MainAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Quản Lý");
    }
    //set tieue de
    public MainAdmin(String id,String ten) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Quản Lý");
        this.jLabel_TenTK.setText("Username : "+id);
        this.jLabel_TenTG.setText(ten);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Admin = new javax.swing.JPanel();
        jTabbedPane_QLAdmin = new javax.swing.JTabbedPane();
        jPanel_QuanLy = new javax.swing.JPanel();
        jTabbedPane_QuanLy = new javax.swing.JTabbedPane();
        jPanel_ThongKe = new javax.swing.JPanel();
        jTabbedPane_ThongKe = new javax.swing.JTabbedPane();
        jPanel_LapDBD = new javax.swing.JPanel();
        jTabbedPane_DBD = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel_TenTG = new javax.swing.JLabel();
        jButton_Thoat = new javax.swing.JButton();
        jButton_XuatExcel = new javax.swing.JButton();
        jLabel_TenTK = new javax.swing.JLabel();
        jButton_CTK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_Admin.setBackground(new java.awt.Color(204, 255, 255));
        jPanel_Admin.setBorder(new javax.swing.border.MatteBorder(null));

        jTabbedPane_QLAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane_QLAdmin.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane_QLAdmin.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        javax.swing.GroupLayout jPanel_QuanLyLayout = new javax.swing.GroupLayout(jPanel_QuanLy);
        jPanel_QuanLy.setLayout(jPanel_QuanLyLayout);
        jPanel_QuanLyLayout.setHorizontalGroup(
            jPanel_QuanLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_QuanLyLayout.createSequentialGroup()
                .addComponent(jTabbedPane_QuanLy, javax.swing.GroupLayout.PREFERRED_SIZE, 1303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_QuanLyLayout.setVerticalGroup(
            jPanel_QuanLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_QuanLyLayout.createSequentialGroup()
                .addComponent(jTabbedPane_QuanLy, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane_QuanLy.addTab("TÀI KHOẢN", new com.mycompany.applicationmvc.viewAdmin.JPanel_TaiKhoan());
        jTabbedPane_QuanLy.addTab("NHÂN VIÊN", new com.mycompany.applicationmvc.viewAdmin.JPanel_NhanVien());
        jTabbedPane_QuanLy.addTab("KHÁCH HÀNG", new com.mycompany.applicationmvc.view.KhachHangPanel(this));
        jTabbedPane_QuanLy.addTab("XE MÁY", new com.mycompany.applicationmvc.view.XePanel());

        jTabbedPane_QLAdmin.addTab("QUẢN LÝ", jPanel_QuanLy);

        javax.swing.GroupLayout jPanel_ThongKeLayout = new javax.swing.GroupLayout(jPanel_ThongKe);
        jPanel_ThongKe.setLayout(jPanel_ThongKeLayout);
        jPanel_ThongKeLayout.setHorizontalGroup(
            jPanel_ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ThongKeLayout.createSequentialGroup()
                .addComponent(jTabbedPane_ThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 1293, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_ThongKeLayout.setVerticalGroup(
            jPanel_ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ThongKeLayout.createSequentialGroup()
                .addComponent(jTabbedPane_ThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane_ThongKe.addTab("ĐƠN BẢO DƯỠNG", new com.mycompany.applicationmvc.viewAdmin.JPanel_TKDBD());
        jTabbedPane_ThongKe.addTab("LINH KIỆN", new com.mycompany.applicationmvc.viewAdmin.JPanel_TKLinhKien());
        jTabbedPane_ThongKe.addTab("KHÁCH HÀNG", new com.mycompany.applicationmvc.viewAdmin.JPanel_TKKhachHang());
        jTabbedPane_ThongKe.addTab("BIỂU ĐỒ", new com.mycompany.applicationmvc.viewAdmin.JPanel_BieuDo());

        jTabbedPane_QLAdmin.addTab("THỐNG KÊ", jPanel_ThongKe);

        javax.swing.GroupLayout jPanel_LapDBDLayout = new javax.swing.GroupLayout(jPanel_LapDBD);
        jPanel_LapDBD.setLayout(jPanel_LapDBDLayout);
        jPanel_LapDBDLayout.setHorizontalGroup(
            jPanel_LapDBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_LapDBDLayout.createSequentialGroup()
                .addComponent(jTabbedPane_DBD, javax.swing.GroupLayout.PREFERRED_SIZE, 1351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_LapDBDLayout.setVerticalGroup(
            jPanel_LapDBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_LapDBDLayout.createSequentialGroup()
                .addComponent(jTabbedPane_DBD, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
                .addContainerGap())
        );

        com.mycompany.applicationmvc.view.DonBaoDuong.DonBaoDuongContainerPanel node1 = new com.mycompany.applicationmvc.view.DonBaoDuong.DonBaoDuongContainerPanel();
        new com.mycompany.applicationmvc.controller.DonBaoDuongController((com.mycompany.applicationmvc.view.DonBaoDuong.DonBaoDuongContainerPanel) node1);

        com.mycompany.applicationmvc.view.DichVubaoDuongPanel node2 = new com.mycompany.applicationmvc.view.DichVubaoDuongPanel();
        try {
            new com.mycompany.applicationmvc.controller.DichVuBaoDuongController((com.mycompany.applicationmvc.view.DichVubaoDuongPanel) node2);
        } catch (SQLException ex) {
            Logger.getLogger(MainAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

        com.mycompany.applicationmvc.view.DanhSachPhuTungKiemTraPanel node3 = new com.mycompany.applicationmvc.view.DanhSachPhuTungKiemTraPanel();
        try {
            new com.mycompany.applicationmvc.controller.DanhSachPhuTungKiemTraController((com.mycompany.applicationmvc.view.DanhSachPhuTungKiemTraPanel) node3);
        } catch (SQLException ex) {
            Logger.getLogger(MainAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTabbedPane_DBD.addTab("LẬP ĐƠN BẢO DƯỠNG",node1);
        jTabbedPane_DBD.addTab("DỊCH VỤ BẢO DƯỠNG",node2);
        jTabbedPane_DBD.addTab("DANH SÁCH PHỤ TÙNG KIỂM TRA",node3);

        jTabbedPane_QLAdmin.addTab("ĐƠN BẢO DƯỠNG", jPanel_LapDBD);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ");

        jLabel_TenTG.setText("TÊN NHÂN VIÊN QUẢN LÝ");

        jButton_Thoat.setText("THOÁT");
        jButton_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ThoatActionPerformed(evt);
            }
        });

        jButton_XuatExcel.setText("Xuất FILE EXCEL");
        jButton_XuatExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_XuatExcelActionPerformed(evt);
            }
        });

        jLabel_TenTK.setText("TÊN TÀI KHOẢN");

        jButton_CTK.setText("ĐỔI TÀI KHOẢN");
        jButton_CTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CTKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_AdminLayout = new javax.swing.GroupLayout(jPanel_Admin);
        jPanel_Admin.setLayout(jPanel_AdminLayout);
        jPanel_AdminLayout.setHorizontalGroup(
            jPanel_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_AdminLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_TenTG)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel_TenTK)
                        .addGap(65, 65, 65)
                        .addComponent(jButton_XuatExcel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_CTK)
                        .addGap(50, 50, 50)
                        .addComponent(jButton_Thoat)
                        .addGap(105, 105, 105))
                    .addGroup(jPanel_AdminLayout.createSequentialGroup()
                        .addComponent(jTabbedPane_QLAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 1424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel_AdminLayout.setVerticalGroup(
            jPanel_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_AdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel_TenTG)
                    .addComponent(jButton_Thoat)
                    .addComponent(jButton_XuatExcel)
                    .addComponent(jLabel_TenTK)
                    .addComponent(jButton_CTK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane_QLAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton_ThoatActionPerformed

    private void jButton_XuatExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_XuatExcelActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            com.mycompany.applicationmvc.viewAdmin.XuatExcel.main(new String[0]);
        } catch (IOException ex) {
            Logger.getLogger(MainAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this,"Xuất File EXEL Thành Công. Vị Trí : Source Project");
    }//GEN-LAST:event_jButton_XuatExcelActionPerformed

    private void jButton_CTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CTKActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new com.mycompany.applicationmvc.viewMain.SignInForm().setVisible(true);
    }//GEN-LAST:event_jButton_CTKActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_CTK;
    private javax.swing.JButton jButton_Thoat;
    private javax.swing.JButton jButton_XuatExcel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_TenTG;
    private javax.swing.JLabel jLabel_TenTK;
    private javax.swing.JPanel jPanel_Admin;
    private javax.swing.JPanel jPanel_LapDBD;
    private javax.swing.JPanel jPanel_QuanLy;
    private javax.swing.JPanel jPanel_ThongKe;
    private javax.swing.JTabbedPane jTabbedPane_DBD;
    private javax.swing.JTabbedPane jTabbedPane_QLAdmin;
    private javax.swing.JTabbedPane jTabbedPane_QuanLy;
    private javax.swing.JTabbedPane jTabbedPane_ThongKe;
    // End of variables declaration//GEN-END:variables
}
