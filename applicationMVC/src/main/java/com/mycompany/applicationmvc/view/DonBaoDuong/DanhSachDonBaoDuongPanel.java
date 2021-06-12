/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.view.DonBaoDuong;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author hesac
 */
public class DanhSachDonBaoDuongPanel extends javax.swing.JPanel {


    /**
     * Creates new form DanhSachDonBaoDuong
     */
    public DanhSachDonBaoDuongPanel() {
        initComponents();
    }

    public DanhSachDonBaoDuongPanel(CardLayout cardLayoutContainer, javax.swing.JPanel baoDuongContainerPanel) {
        this.cardLayoutContainer = cardLayoutContainer;
        this.container = baoDuongContainerPanel;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog_XacNhanHuyDonBaoDuongTrongDanhSach = new javax.swing.JDialog();
        jButton_CoHuyHoaDonTrongDanhSach = new javax.swing.JButton();
        jButton_KhongHiuyHoaDonTRongDanhSach = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton_TaoHoaDonMoi = new javax.swing.JButton();
        jButton_XacNhanHoanThanhButton = new javax.swing.JButton();
        jButton_SuaDonBaoDuong = new javax.swing.JButton();
        jButton_HuyDonBaoDuong = new javax.swing.JButton();
        jButton_XuatHoaDon = new javax.swing.JButton();
        jButton_XemDonBaoDuong = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_DanhSachDonBaoDuong = new javax.swing.JTable();
        jTextField_TimKiem = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox_CheDoHienThiDanhSachHoaDon = new javax.swing.JCheckBox();

        jDialog_XacNhanHuyDonBaoDuongTrongDanhSach.setLocation(new java.awt.Point(700, 400));
        jDialog_XacNhanHuyDonBaoDuongTrongDanhSach.setMinimumSize(new java.awt.Dimension(400, 200));
        jDialog_XacNhanHuyDonBaoDuongTrongDanhSach.setModal(true);
        jDialog_XacNhanHuyDonBaoDuongTrongDanhSach.setLocationRelativeTo(null);

        jButton_CoHuyHoaDonTrongDanhSach.setText("Có");

        jButton_KhongHiuyHoaDonTRongDanhSach.setText("Không");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Bạn có muốn xác nhận hủy hóa đơn này?");

        javax.swing.GroupLayout jDialog_XacNhanHuyDonBaoDuongTrongDanhSachLayout = new javax.swing.GroupLayout(jDialog_XacNhanHuyDonBaoDuongTrongDanhSach.getContentPane());
        jDialog_XacNhanHuyDonBaoDuongTrongDanhSach.getContentPane().setLayout(jDialog_XacNhanHuyDonBaoDuongTrongDanhSachLayout);
        jDialog_XacNhanHuyDonBaoDuongTrongDanhSachLayout.setHorizontalGroup(
            jDialog_XacNhanHuyDonBaoDuongTrongDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_XacNhanHuyDonBaoDuongTrongDanhSachLayout.createSequentialGroup()
                .addGroup(jDialog_XacNhanHuyDonBaoDuongTrongDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog_XacNhanHuyDonBaoDuongTrongDanhSachLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialog_XacNhanHuyDonBaoDuongTrongDanhSachLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jButton_CoHuyHoaDonTrongDanhSach, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton_KhongHiuyHoaDonTRongDanhSach, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jDialog_XacNhanHuyDonBaoDuongTrongDanhSachLayout.setVerticalGroup(
            jDialog_XacNhanHuyDonBaoDuongTrongDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog_XacNhanHuyDonBaoDuongTrongDanhSachLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jDialog_XacNhanHuyDonBaoDuongTrongDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_CoHuyHoaDonTrongDanhSach)
                    .addComponent(jButton_KhongHiuyHoaDonTRongDanhSach))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        setMaximumSize(new java.awt.Dimension(1366, 660));
        setMinimumSize(new java.awt.Dimension(1366, 660));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1366, 660));

        jPanel1.setMaximumSize(new java.awt.Dimension(950, 645));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 645));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tùy chọn"));
        jPanel2.setMaximumSize(new java.awt.Dimension(320, 605));
        jPanel2.setMinimumSize(new java.awt.Dimension(320, 605));

        jButton_TaoHoaDonMoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_TaoHoaDonMoi.setText("Tạo hóa đơn");
        jButton_TaoHoaDonMoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton_XacNhanHoanThanhButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_XacNhanHoanThanhButton.setText("Xác nhận hoàn thành");
        jButton_XacNhanHoanThanhButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton_SuaDonBaoDuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_SuaDonBaoDuong.setText("Sửa");
        jButton_SuaDonBaoDuong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton_HuyDonBaoDuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_HuyDonBaoDuong.setText("Hủy hóa đơn");
        jButton_HuyDonBaoDuong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton_XuatHoaDon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_XuatHoaDon.setText("Xuất hóa đơn");
        jButton_XuatHoaDon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_XuatHoaDon.setMaximumSize(new java.awt.Dimension(162, 23));
        jButton_XuatHoaDon.setMinimumSize(new java.awt.Dimension(162, 23));
        jButton_XuatHoaDon.setPreferredSize(new java.awt.Dimension(162, 23));
        jButton_XuatHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_XuatHoaDonActionPerformed(evt);
            }
        });

        jButton_XemDonBaoDuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_XemDonBaoDuong.setText("Xem hóa đơn");
        jButton_XemDonBaoDuong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_XemDonBaoDuong.setVisible(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_XacNhanHoanThanhButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(jButton_HuyDonBaoDuong, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_TaoHoaDonMoi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_XemDonBaoDuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_SuaDonBaoDuong, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_XuatHoaDon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jButton_TaoHoaDonMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_XemDonBaoDuong, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_SuaDonBaoDuong, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_XacNhanHoanThanhButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_HuyDonBaoDuong, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_XuatHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Danh sách các hóa đơn"));

        jTable_DanhSachDonBaoDuong.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable_DanhSachDonBaoDuong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Biển số xe", "Khách hàng", "Số điện thoại", "Tổng chi phí sửa chữa", "Ngày hoàn thành", "Nhân viên"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class
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
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        jTable_DanhSachDonBaoDuong.setDefaultRenderer(String.class, centerRenderer);
        jTable_DanhSachDonBaoDuong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable_DanhSachDonBaoDuong.setRowHeight(30);
        jTable_DanhSachDonBaoDuong.setSelectionBackground(new java.awt.Color(153, 153, 255));
        jTable_DanhSachDonBaoDuong.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable_DanhSachDonBaoDuong.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable_DanhSachDonBaoDuong.setShowGrid(true);
        jTable_DanhSachDonBaoDuong.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable_DanhSachDonBaoDuong);
        if (jTable_DanhSachDonBaoDuong.getColumnModel().getColumnCount() > 0) {
            jTable_DanhSachDonBaoDuong.getColumnModel().getColumn(0).setMinWidth(100);
            jTable_DanhSachDonBaoDuong.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable_DanhSachDonBaoDuong.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable_DanhSachDonBaoDuong.getColumnModel().getColumn(5).setResizable(false);
        }

        jTextField_TimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Tìm kiếm:");

        jCheckBox_CheDoHienThiDanhSachHoaDon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox_CheDoHienThiDanhSachHoaDon.setText("Hiện hóa đơn đã hoàn thành");
        jCheckBox_CheDoHienThiDanhSachHoaDon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox_CheDoHienThiDanhSachHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_CheDoHienThiDanhSachHoaDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox_CheDoHienThiDanhSachHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jCheckBox_CheDoHienThiDanhSachHoaDon))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1224, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_XuatHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_XuatHoaDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_XuatHoaDonActionPerformed

    private void jCheckBox_CheDoHienThiDanhSachHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_CheDoHienThiDanhSachHoaDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_CheDoHienThiDanhSachHoaDonActionPerformed

    CardLayout cardLayoutContainer;
    javax.swing.JPanel container;

    private void initCustom() {
        
    }

    public JCheckBox getjCheckBox_CheDoHienThiDanhSachHoaDon() {
        return jCheckBox_CheDoHienThiDanhSachHoaDon;
    }

    public void setjCheckBox_CheDoHienThiDanhSachHoaDon(JCheckBox jCheckBox_CheDoHienThiDanhSachHoaDon) {
        this.jCheckBox_CheDoHienThiDanhSachHoaDon = jCheckBox_CheDoHienThiDanhSachHoaDon;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JButton getjButton_XemDonBaoDuong() {
        return jButton_XemDonBaoDuong;
    }

    public void setjButton_XemDonBaoDuong(JButton jButton_XoaDonBaoDuong1) {
        this.jButton_XemDonBaoDuong = jButton_XoaDonBaoDuong1;
    }


    public CardLayout getCardLayoutContainer() {
        return cardLayoutContainer;
    }

    public void setCardLayoutContainer(CardLayout cardLayoutContainer) {
        this.cardLayoutContainer = cardLayoutContainer;
    }

    public JPanel getContainer() {
        return container;
    }

    public void setContainer(JPanel container) {
        this.container = container;
    }

    public JButton getjButton_XacNhanHoanThanhButton() {
        return jButton_XacNhanHoanThanhButton;
    }

    public void setjButton_XacNhanHoanThanhButton(JButton jButton2) {
        this.jButton_XacNhanHoanThanhButton = jButton2;
    }

    public JButton getjButton_XoaDonBaoDuong() {
        return jButton_HuyDonBaoDuong;
    }

    public JButton getjButton_SuaDonBaoDuong() {
        return jButton_SuaDonBaoDuong;
    }

    public void setjButton_SuaDonBaoDuong(JButton jButton_SuaDonBaoDuong) {
        this.jButton_SuaDonBaoDuong = jButton_SuaDonBaoDuong;
    }

    public JButton getjButton_TaoHoaDonMoi() {
        return jButton_TaoHoaDonMoi;
    }

    public void setjButton_TaoHoaDonMoi(JButton jButton_TaoHoaDonMoi) {
        this.jButton_TaoHoaDonMoi = jButton_TaoHoaDonMoi;
    }

    public JButton getjButton_XuatHoaDon() {
        return jButton_XuatHoaDon;
    }

    public void setjButton_XuatHoaDon(JButton jButton_XuatHoaDon) {
        this.jButton_XuatHoaDon = jButton_XuatHoaDon;
    }

    public void setjButton_XoaDonBaoDuong(JButton jButton3) {
        this.jButton_HuyDonBaoDuong = jButton3;
    }

    public JButton getjButton_CoHuyHoaDonTrongDanhSach() {
        return jButton_CoHuyHoaDonTrongDanhSach;
    }

    public void setjButton_CoHuyHoaDonTrongDanhSach(JButton jButton_CoHuyHoaDonTrongDanhSach) {
        this.jButton_CoHuyHoaDonTrongDanhSach = jButton_CoHuyHoaDonTrongDanhSach;
    }

    public JButton getjButton_HuyDonBaoDuong() {
        return jButton_HuyDonBaoDuong;
    }

    public void setjButton_HuyDonBaoDuong(JButton jButton_HuyDonBaoDuong) {
        this.jButton_HuyDonBaoDuong = jButton_HuyDonBaoDuong;
    }

    public JButton getjButton_KhongHiuyHoaDonTRongDanhSach() {
        return jButton_KhongHiuyHoaDonTRongDanhSach;
    }

    public void setjButton_KhongHiuyHoaDonTRongDanhSach(JButton jButton_KhongHiuyHoaDonTRongDanhSach) {
        this.jButton_KhongHiuyHoaDonTRongDanhSach = jButton_KhongHiuyHoaDonTRongDanhSach;
    }

    public JDialog getjDialog_XacNhanHuyDonBaoDuongTrongDanhSach() {
        return jDialog_XacNhanHuyDonBaoDuongTrongDanhSach;
    }

    public void setjDialog_XacNhanHuyDonBaoDuongTrongDanhSach(JDialog jDialog_XacNhanHuyDonBaoDuongTrongDanhSach) {
        this.jDialog_XacNhanHuyDonBaoDuongTrongDanhSach = jDialog_XacNhanHuyDonBaoDuongTrongDanhSach;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public JTextField getjTextField_TimKiem() {
        return jTextField_TimKiem;
    }

    public void setjTextField_TimKiem(JTextField jTextField_TimKiem) {
        this.jTextField_TimKiem = jTextField_TimKiem;
    }

    public JButton getjButton_ChonDonBaoDuong() {
        return jButton_SuaDonBaoDuong;
    }

    public void setjButton_ChonDonBaoDuong(JButton jButton_ChonDonBaoDuong) {
        this.jButton_SuaDonBaoDuong = jButton_ChonDonBaoDuong;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getjTable_DanhSachDonBaoDuong() {
        return jTable_DanhSachDonBaoDuong;
    }

    public void setjTable_DanhSachDonBaoDuong(JTable jTable1) {
        this.jTable_DanhSachDonBaoDuong = jTable1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_CoHuyHoaDonTrongDanhSach;
    private javax.swing.JButton jButton_HuyDonBaoDuong;
    private javax.swing.JButton jButton_KhongHiuyHoaDonTRongDanhSach;
    private javax.swing.JButton jButton_SuaDonBaoDuong;
    private javax.swing.JButton jButton_TaoHoaDonMoi;
    private javax.swing.JButton jButton_XacNhanHoanThanhButton;
    private javax.swing.JButton jButton_XemDonBaoDuong;
    private javax.swing.JButton jButton_XuatHoaDon;
    private javax.swing.JCheckBox jCheckBox_CheDoHienThiDanhSachHoaDon;
    private javax.swing.JDialog jDialog_XacNhanHuyDonBaoDuongTrongDanhSach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_DanhSachDonBaoDuong;
    private javax.swing.JTextField jTextField_TimKiem;
    // End of variables declaration//GEN-END:variables
}
