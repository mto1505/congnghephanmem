/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.viewMain;

import com.mycompany.applicationmvc.viewAdmin.ControllerAdmin;
import com.mycompany.applicationmvc.viewAdmin.ModelAdmin;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author dhmty
 */
public class MainThuNgan extends javax.swing.JFrame {

//    private com.mycompany.applicationmvc.view.DonBaoDuong.DonBaoDuongContainerPanel node1;
//    private com.mycompany.applicationmvc.view.DichVubaoDuongPanel node2;
//    private com.mycompany.applicationmvc.view.DanhSachPhuTungKiemTraPanel node3;
    
    
//        com.mycompany.applicationmvc.view.DonBaoDuong.DonBaoDuongContainerPanel node1 = new com.mycompany.applicationmvc.view.DonBaoDuong.DonBaoDuongContainerPanel();
//        new com.mycompany.applicationmvc.controller.DonBaoDuongController((com.mycompany.applicationmvc.view.DonBaoDuong.DonBaoDuongContainerPanel) node1);
//
//        com.mycompany.applicationmvc.view.DichVubaoDuongPanel node2 = new com.mycompany.applicationmvc.view.DichVubaoDuongPanel();
//        try {
//            new com.mycompany.applicationmvc.controller.DichVuBaoDuongController((com.mycompany.applicationmvc.view.DichVubaoDuongPanel) node2);
//        } catch (SQLException ex) {
//            Logger.getLogger(MainThuNgan.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        com.mycompany.applicationmvc.view.DanhSachPhuTungKiemTraPanel node3 = new com.mycompany.applicationmvc.view.DanhSachPhuTungKiemTraPanel();
//        try {
//            new com.mycompany.applicationmvc.controller.DanhSachPhuTungKiemTraController((com.mycompany.applicationmvc.view.DanhSachPhuTungKiemTraPanel) node3);
//        } catch (SQLException ex) {
//            Logger.getLogger(MainThuNgan.class.getName()).log(Level.SEVERE, null, ex);
//        }
    
    
    /**
     * Creates new form MainNV
     */
    private int idNhanVienLap;
    public MainThuNgan() {
        initComponents();
    }
     public MainThuNgan(String id,String ten,int idnvl) {
        idNhanVienLap=idnvl;
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(ControllerAdmin.readFileBufferedImage("./src/img/maintenance.png"));
        this.setTitle("QUẢN LÝ BẢO DƯỠNG XE MÁY");
        this.jLabel_TenTK.setText("Username : "+id);
        this.jLabel_TenTG.setText(ten);
        jTextField_TKhoan.setText(id);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog_ChangePass = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_TKhoan = new javax.swing.JTextField();
        TIEUDE = new javax.swing.JLabel();
        jLabel_XNNewPass = new javax.swing.JLabel();
        jButton_XNCPass = new javax.swing.JButton();
        jButton_HuyCPass = new javax.swing.JButton();
        jCheckBox_passold = new javax.swing.JCheckBox();
        jCheckBox_passnew = new javax.swing.JCheckBox();
        jCheckBox_passXN = new javax.swing.JCheckBox();
        jPasswordField_OldPass = new javax.swing.JPasswordField();
        jPasswordField_NewPass = new javax.swing.JPasswordField();
        jPasswordField_XNNewPass = new javax.swing.JPasswordField();
        jPanel_ThuNgan = new javax.swing.JPanel();
        jTabbedPane_QLThuNgan = new javax.swing.JTabbedPane();
        jPanel_LapDBD = new javax.swing.JPanel();
        jTabbedPane_DBD = new javax.swing.JTabbedPane();
        jPanel_NhapKho = new javax.swing.JPanel();
        jTabbedPane_NhapKho = new javax.swing.JTabbedPane();
        jPanel_TTKH = new javax.swing.JPanel();
        jTabbedPane_TTKH = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel_TenTG = new javax.swing.JLabel();
        jButton_Thoat = new javax.swing.JButton();
        jButton_CPass = new javax.swing.JButton();
        jLabel_TenTK = new javax.swing.JLabel();
        jButton_CTK = new javax.swing.JButton();

        jLabel2.setText("Tài Khoản");

        jLabel3.setText("Mật Khẩu Cũ");

        jLabel4.setText("Mật Khẩu Mới");

        jTextField_TKhoan.setEditable(false);

        TIEUDE.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TIEUDE.setText("ĐỔI MẬT KHẨU");

        jLabel_XNNewPass.setText("Xác Nhận Mật Khẩu Mới");

        jButton_XNCPass.setText("XÁC NHẬN");
        jButton_XNCPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_XNCPassActionPerformed(evt);
            }
        });

        jButton_HuyCPass.setText("ĐẶT LẠI");
        jButton_HuyCPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_HuyCPassActionPerformed(evt);
            }
        });

        jCheckBox_passold.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jCheckBox_passold.setText("Hiển Thị");
        jCheckBox_passold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_passoldActionPerformed(evt);
            }
        });

        jCheckBox_passnew.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jCheckBox_passnew.setText("Hiển Thị");
        jCheckBox_passnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_passnewActionPerformed(evt);
            }
        });

        jCheckBox_passXN.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jCheckBox_passXN.setText("Hiển Thị");
        jCheckBox_passXN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_passXNActionPerformed(evt);
            }
        });

        jPasswordField_OldPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_OldPassActionPerformed(evt);
            }
        });

        jPasswordField_XNNewPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_XNNewPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4))
                                        .addGap(67, 67, 67))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel_XNNewPass)
                                        .addGap(13, 13, 13)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField_TKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                    .addComponent(jPasswordField_OldPass, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                    .addComponent(jPasswordField_NewPass)
                                    .addComponent(jPasswordField_XNNewPass, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox_passold)
                                    .addComponent(jCheckBox_passnew)
                                    .addComponent(jCheckBox_passXN)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(jButton_XNCPass)
                                .addGap(48, 48, 48)
                                .addComponent(jButton_HuyCPass)))
                        .addGap(0, 53, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(TIEUDE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(TIEUDE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_TKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCheckBox_passold)
                    .addComponent(jPasswordField_OldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCheckBox_passnew)
                    .addComponent(jPasswordField_NewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_XNNewPass)
                    .addComponent(jCheckBox_passXN)
                    .addComponent(jPasswordField_XNNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_XNCPass)
                    .addComponent(jButton_HuyCPass))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog_ChangePassLayout = new javax.swing.GroupLayout(jDialog_ChangePass.getContentPane());
        jDialog_ChangePass.getContentPane().setLayout(jDialog_ChangePassLayout);
        jDialog_ChangePassLayout.setHorizontalGroup(
            jDialog_ChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_ChangePassLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jDialog_ChangePassLayout.setVerticalGroup(
            jDialog_ChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_ChangePassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_ThuNgan.setBackground(new java.awt.Color(204, 255, 255));
        jPanel_ThuNgan.setBorder(new javax.swing.border.MatteBorder(null));

        jTabbedPane_QLThuNgan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane_QLThuNgan.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane_QLThuNgan.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane_QLThuNgan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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
        com.mycompany.applicationmvc.controller.DonBaoDuongController dbd_ctrl= new com.mycompany.applicationmvc.controller.DonBaoDuongController(node1);
        dbd_ctrl.setIdNhanVienLapDon(idNhanVienLap);

        com.mycompany.applicationmvc.view.DichVubaoDuongPanel node2 = new com.mycompany.applicationmvc.view.DichVubaoDuongPanel();
        try {
            new com.mycompany.applicationmvc.controller.DichVuBaoDuongController((com.mycompany.applicationmvc.view.DichVubaoDuongPanel) node2);
        } catch (SQLException ex) {
            Logger.getLogger(MainThuNgan.class.getName()).log(Level.SEVERE, null, ex);
        }

        com.mycompany.applicationmvc.view.DanhSachPhuTungKiemTraPanel node3 = new com.mycompany.applicationmvc.view.DanhSachPhuTungKiemTraPanel();
        try {
            new com.mycompany.applicationmvc.controller.DanhSachPhuTungKiemTraController((com.mycompany.applicationmvc.view.DanhSachPhuTungKiemTraPanel) node3);
        } catch (SQLException ex) {
            Logger.getLogger(MainThuNgan.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTabbedPane_DBD.addTab("LẬP ĐƠN BẢO DƯỠNG",node1);
        //jTabbedPane_DBD.addTab("DỊCH VỤ BẢO DƯỠNG",node2);
        //jTabbedPane_DBD.addTab("DANH SÁCH PHỤ TÙNG KIỂM TRA",node3);
        ImageIcon img_hd=ControllerAdmin.setIcon(20,20,"./src/img/invoice1.png");
        jTabbedPane_DBD.setIconAt(0, img_hd);

        jTabbedPane_QLThuNgan.addTab("HÓA ĐƠN", null, jPanel_LapDBD, "");

        javax.swing.GroupLayout jPanel_NhapKhoLayout = new javax.swing.GroupLayout(jPanel_NhapKho);
        jPanel_NhapKho.setLayout(jPanel_NhapKhoLayout);
        jPanel_NhapKhoLayout.setHorizontalGroup(
            jPanel_NhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_NhapKhoLayout.createSequentialGroup()
                .addComponent(jTabbedPane_NhapKho, javax.swing.GroupLayout.PREFERRED_SIZE, 1258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_NhapKhoLayout.setVerticalGroup(
            jPanel_NhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane_NhapKho, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
        );

        //jTabbedPane_NhapKho.addTab("Linh Kiện",new com.mycompany.applicationmvc.view.LinhKienPanel());
        ImageIcon img_lk=ControllerAdmin.setIcon(20,20,"./src/img/helmet.png");
        jTabbedPane_NhapKho.addTab("LINH KIỆN + NHÀ SẢN XUẤT", img_lk,new com.mycompany.applicationmvc.view.LinhKienPanel());

        jTabbedPane_QLThuNgan.addTab("QUẢN LÝ KHO", jPanel_NhapKho);

        javax.swing.GroupLayout jPanel_TTKHLayout = new javax.swing.GroupLayout(jPanel_TTKH);
        jPanel_TTKH.setLayout(jPanel_TTKHLayout);
        jPanel_TTKHLayout.setHorizontalGroup(
            jPanel_TTKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TTKHLayout.createSequentialGroup()
                .addComponent(jTabbedPane_TTKH, javax.swing.GroupLayout.PREFERRED_SIZE, 1303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_TTKHLayout.setVerticalGroup(
            jPanel_TTKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane_TTKH, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
        );

        jTabbedPane_TTKH.addTab("Khách Hàng",new com.mycompany.applicationmvc.view.KhachHangPanel(this));
        jTabbedPane_TTKH.addTab("Xe Máy",new com.mycompany.applicationmvc.view.XePanel());
        ImageIcon img_kh=ControllerAdmin.setIcon(20,20,"./src/img/customer1.png");
        jTabbedPane_TTKH.setIconAt(0, img_kh);
        ImageIcon img_xm=ControllerAdmin.setIcon(20,20,"./src/img/scooter.png");
        jTabbedPane_TTKH.setIconAt(1, img_xm);

        jTabbedPane_QLThuNgan.addTab("KHÁCH HÀNG", jPanel_TTKH);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("THU NGÂN");

        jLabel_TenTG.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel_TenTG.setText("TÊN NHÂN VIÊN THU NGÂN");

        jButton_Thoat.setText("THOÁT");
        jButton_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ThoatActionPerformed(evt);
            }
        });

        jButton_CPass.setText("ĐỔI MẬT KHẨU");
        jButton_CPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CPassActionPerformed(evt);
            }
        });

        jLabel_TenTK.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel_TenTK.setText("TÊN TÀI KHOẢN");

        jButton_CTK.setText("ĐỔI TÀI KHOẢN");
        jButton_CTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CTKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_ThuNganLayout = new javax.swing.GroupLayout(jPanel_ThuNgan);
        jPanel_ThuNgan.setLayout(jPanel_ThuNganLayout);
        jPanel_ThuNganLayout.setHorizontalGroup(
            jPanel_ThuNganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ThuNganLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel_TenTG)
                .addGap(24, 24, 24)
                .addComponent(jLabel_TenTK)
                .addGap(18, 18, 18)
                .addComponent(jButton_CPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 513, Short.MAX_VALUE)
                .addComponent(jButton_CTK)
                .addGap(34, 34, 34)
                .addComponent(jButton_Thoat)
                .addGap(105, 105, 105))
            .addGroup(jPanel_ThuNganLayout.createSequentialGroup()
                .addComponent(jTabbedPane_QLThuNgan, javax.swing.GroupLayout.PREFERRED_SIZE, 1430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_ThuNganLayout.setVerticalGroup(
            jPanel_ThuNganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ThuNganLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_ThuNganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel_TenTG)
                    .addComponent(jButton_Thoat)
                    .addComponent(jButton_CPass)
                    .addComponent(jLabel_TenTK)
                    .addComponent(jButton_CTK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane_QLThuNgan, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ImageIcon imageIcon1=ControllerAdmin.setIcon(70,70,"./src/img/invoice.png");
        ImageIcon imageIcon2=ControllerAdmin.setIcon(70,70,"./src/img/inventory.png");
        ImageIcon imageIcon3=ControllerAdmin.setIcon(70,70,"./src/img/kyc.png");
        jTabbedPane_QLThuNgan.setIconAt(0, imageIcon1);
        jTabbedPane_QLThuNgan.setIconAt(1, imageIcon2);
        jTabbedPane_QLThuNgan.setIconAt(2, imageIcon3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_ThuNgan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_ThuNgan, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CPassActionPerformed
        // TODO add your handling code here:
       
        jDialog_ChangePass.setSize(568, 350);
        jDialog_ChangePass.setLocationRelativeTo(null);
        jDialog_ChangePass.setVisible(true);
    }//GEN-LAST:event_jButton_CPassActionPerformed

    private void jButton_ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton_ThoatActionPerformed

    private void jButton_XNCPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_XNCPassActionPerformed
        // TODO add your handling code here:
        boolean kt=true;
        String user=jTextField_TKhoan.getText().trim();
        String oldpass=jPasswordField_OldPass.getText().trim();
        String newpass=jPasswordField_NewPass.getText().trim();
        String xnnewpass=jPasswordField_XNNewPass.getText().trim();

        if (oldpass.matches("") || newpass.matches("") || xnnewpass.matches("")){
            kt=false;
            JOptionPane.showMessageDialog(this, "Các Trường Mật Khẩu Khong Duoc De Trong");
        }
        if( kt && !xnnewpass.equals(newpass)){
            kt=false;
            JOptionPane.showMessageDialog(this, "Xác Nhận Mật Khẩu Mới Không Chính Xác");
        }
        if (kt){
            String newhash = BCrypt.hashpw(newpass, BCrypt.gensalt(6));
            if (ControllerAdmin.ktPassTK(user,oldpass)==1){
                ModelAdmin.suaTK2(user,newhash);
                JOptionPane.showMessageDialog(this, "Thay Đổi Mật Khẩu Thành Công");
            }
            else {
                JOptionPane.showMessageDialog(this, "Mật Khẩu Cũ Không Chính Xác");
            }
        }
    }//GEN-LAST:event_jButton_XNCPassActionPerformed

    private void jButton_HuyCPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_HuyCPassActionPerformed
        // TODO add your handling code here:
        jPasswordField_OldPass.setText("");
        jPasswordField_NewPass.setText("");
        jPasswordField_XNNewPass.setText("");
    }//GEN-LAST:event_jButton_HuyCPassActionPerformed

    private void jCheckBox_passoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_passoldActionPerformed
        // TODO add your handling code here:

        if (jCheckBox_passold.isSelected()){
            jPasswordField_OldPass.setEchoChar((char)0);
        }
        else {
            jPasswordField_OldPass.setEchoChar('\u25cf');
        }

    }//GEN-LAST:event_jCheckBox_passoldActionPerformed

    private void jCheckBox_passnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_passnewActionPerformed
        // TODO add your handling code here:
        if (jCheckBox_passnew.isSelected()){
            jPasswordField_NewPass.setEchoChar((char)0);
        }
        else {
            jPasswordField_NewPass.setEchoChar('\u25cf');
        }
    }//GEN-LAST:event_jCheckBox_passnewActionPerformed

    private void jCheckBox_passXNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_passXNActionPerformed
        // TODO add your handling code here:
        if (jCheckBox_passXN.isSelected()){
            jPasswordField_XNNewPass.setEchoChar((char)0);
        }
        else {
            jPasswordField_XNNewPass.setEchoChar('\u25cf');
        }
    }//GEN-LAST:event_jCheckBox_passXNActionPerformed

    private void jPasswordField_XNNewPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_XNNewPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_XNNewPassActionPerformed

    private void jPasswordField_OldPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_OldPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_OldPassActionPerformed

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
            java.util.logging.Logger.getLogger(MainThuNgan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainThuNgan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainThuNgan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainThuNgan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainThuNgan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TIEUDE;
    private javax.swing.JButton jButton_CPass;
    private javax.swing.JButton jButton_CTK;
    private javax.swing.JButton jButton_HuyCPass;
    private javax.swing.JButton jButton_Thoat;
    private javax.swing.JButton jButton_XNCPass;
    private javax.swing.JCheckBox jCheckBox_passXN;
    private javax.swing.JCheckBox jCheckBox_passnew;
    private javax.swing.JCheckBox jCheckBox_passold;
    private javax.swing.JDialog jDialog_ChangePass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_TenTG;
    private javax.swing.JLabel jLabel_TenTK;
    private javax.swing.JLabel jLabel_XNNewPass;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_LapDBD;
    private javax.swing.JPanel jPanel_NhapKho;
    private javax.swing.JPanel jPanel_TTKH;
    private javax.swing.JPanel jPanel_ThuNgan;
    private javax.swing.JPasswordField jPasswordField_NewPass;
    private javax.swing.JPasswordField jPasswordField_OldPass;
    private javax.swing.JPasswordField jPasswordField_XNNewPass;
    private javax.swing.JTabbedPane jTabbedPane_DBD;
    private javax.swing.JTabbedPane jTabbedPane_NhapKho;
    private javax.swing.JTabbedPane jTabbedPane_QLThuNgan;
    private javax.swing.JTabbedPane jTabbedPane_TTKH;
    private javax.swing.JTextField jTextField_TKhoan;
    // End of variables declaration//GEN-END:variables
}
