/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.view;

import com.mycompany.applicationmvc.Utils.CustomRenderTable;
import com.mycompany.applicationmvc.Utils.TableColumnUtil;
import com.mycompany.applicationmvc.controller.PersonController;
import com.mycompany.applicationmvc.controller.XeController;

/**
 *
 * @author MinhTo
 */
public class XePanel extends javax.swing.JPanel {

    /**
     * Creates new form KhachHangPanel
     */
    public XePanel() {
        initComponents();
        xeMayTable.getTableHeader().setDefaultRenderer(new CustomRenderTable());
//        TableColumnUtil.setTableColumnSize(xeMayTable, xeMayTable.getPreferredSize().getWidth(),30,30,20,20);
//        linhKienTable.getTableHeader().setDefaultRenderer(new CustomRenderTable());
//        TableColumnUtil.setTableColumnSize(linhKienTable, linhKienTable.getPreferredSize().getWidth(), 20,30,20,20,10);
//        XeController xeController=new XeController(bienSoField, chuSoHuu, chuSoHuuField, errorBienSo, errorChuSoHuu, errorLoaiXe, errorSoDienThoai, errorTenXe, lbHoTen, lbMaKhachHang, loaiXe, loaiXeCombobox, maLoaiXe, maLoaiXeField, soDienThoai, soDienThoaiField, suaLoaiXeBtn, suaXeBtn, tableMaLoaiXe, tenLoaiXe, tenLoaiXeField, tenXeMayField, themLoaiXeBtn, themXeBtn, timKiemXeField, timKiemXeLbl, xeMayTable, xoaLoaiXeBtn, xoaXeBtn, jPanel1);
            XeController xeController=new XeController(bienSoField, chuSoHuu, chuSoHuuField, errorBienSo, errorChuSoHuu, errorLoaiXe, errorSoDienThoai, errorTenXe, lbHoTen, lbMaKhachHang, loaiXe, loaiXeCombobox, maLoaiXe, maLoaiXeField, soDienThoai, soDienThoaiField, suaLoaiXeBtn, suaXeBtn, tableMaLoaiXe, tenLoaiXe, tenLoaiXeField, tenXeMayField, themLoaiXeBtn, themXeBtn, timKiemXeField, timKiemXeLbl, xeMayTable, xoaLoaiXeBtn, xoaXeBtn, radioNam, radioNu, jPanel1);
        xeController.setDataToCombobox();
        xeController.setDataToTableModel();
            xeController.setEvent();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelWelcomeUser = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        soDienThoaiField = new javax.swing.JTextField();
        xoaXeBtn = new javax.swing.JButton();
        bienSoField = new javax.swing.JTextField();
        tenXeMayField = new javax.swing.JTextField();
        chuSoHuuField = new javax.swing.JTextField();
        lbMaKhachHang = new javax.swing.JLabel();
        lbHoTen = new javax.swing.JLabel();
        chuSoHuu = new javax.swing.JLabel();
        soDienThoai = new javax.swing.JLabel();
        themXeBtn = new javax.swing.JButton();
        suaXeBtn = new javax.swing.JButton();
        loaiXe = new javax.swing.JLabel();
        loaiXeCombobox = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        xeMayTable = new javax.swing.JTable();
        timKiemXeField = new javax.swing.JTextField();
        timKiemXeLbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        errorBienSo = new javax.swing.JLabel();
        errorTenXe = new javax.swing.JLabel();
        errorChuSoHuu = new javax.swing.JLabel();
        errorSoDienThoai = new javax.swing.JLabel();
        errorLoaiXe = new javax.swing.JLabel();
        gioiTinh = new javax.swing.JLabel();
        radioNam = new javax.swing.JRadioButton();
        radioNu = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        xoaLoaiXeBtn = new javax.swing.JButton();
        maLoaiXeField = new javax.swing.JTextField();
        tenLoaiXeField = new javax.swing.JTextField();
        maLoaiXe = new javax.swing.JLabel();
        tenLoaiXe = new javax.swing.JLabel();
        themLoaiXeBtn = new javax.swing.JButton();
        suaLoaiXeBtn = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMaLoaiXe = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1058, 677));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1058, 660));
        jPanel1.setRequestFocusEnabled(false);

        jPanel3.setBackground(new java.awt.Color(243, 243, 244));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setForeground(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Xe Máy - Loại xe");
        jPanel3.add(jLabel1);

        jLabelWelcomeUser.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelWelcomeUser.setForeground(new java.awt.Color(0, 0, 255));
        jLabelWelcomeUser.setText("Minh Tơ");

        jPanel5.setBackground(new java.awt.Color(243, 243, 244));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(0, 0, 153)), "Thông Tin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(0, 0, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(500, 500));

        soDienThoaiField.setBackground(new java.awt.Color(243, 243, 244));
        soDienThoaiField.setText("0929330701");
        soDienThoaiField.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        soDienThoaiField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soDienThoaiFieldActionPerformed(evt);
            }
        });

        xoaXeBtn.setBackground(new java.awt.Color(204, 204, 204));
        xoaXeBtn.setForeground(new java.awt.Color(0, 0, 255));
        xoaXeBtn.setText("Xoá");
        xoaXeBtn.setPreferredSize(new java.awt.Dimension(70, 35));

        bienSoField.setBackground(new java.awt.Color(243, 243, 244));
        bienSoField.setText("86-C1 21565");
        bienSoField.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        bienSoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bienSoFieldActionPerformed(evt);
            }
        });

        tenXeMayField.setBackground(new java.awt.Color(243, 243, 244));
        tenXeMayField.setText("Winer X 150");
        tenXeMayField.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tenXeMayField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenXeMayFieldActionPerformed(evt);
            }
        });

        chuSoHuuField.setBackground(new java.awt.Color(243, 243, 244));
        chuSoHuuField.setText("Nguyễn Thanh Tú");
        chuSoHuuField.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        chuSoHuuField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chuSoHuuFieldActionPerformed(evt);
            }
        });

        lbMaKhachHang.setForeground(new java.awt.Color(0, 0, 255));
        lbMaKhachHang.setText("Biển số");

        lbHoTen.setForeground(new java.awt.Color(0, 0, 255));
        lbHoTen.setText("Tên xe máy");

        chuSoHuu.setForeground(new java.awt.Color(0, 0, 255));
        chuSoHuu.setText("Chủ sở hữu");

        soDienThoai.setForeground(new java.awt.Color(0, 0, 255));
        soDienThoai.setText("Số điên thoại");

        themXeBtn.setBackground(new java.awt.Color(204, 204, 204));
        themXeBtn.setForeground(new java.awt.Color(0, 0, 255));
        themXeBtn.setText("Thêm");
        themXeBtn.setPreferredSize(new java.awt.Dimension(70, 35));
        themXeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themXeBtnActionPerformed(evt);
            }
        });

        suaXeBtn.setBackground(new java.awt.Color(204, 204, 204));
        suaXeBtn.setForeground(new java.awt.Color(0, 0, 255));
        suaXeBtn.setText("Sữa");
        suaXeBtn.setPreferredSize(new java.awt.Dimension(70, 35));

        loaiXe.setForeground(new java.awt.Color(0, 0, 255));
        loaiXe.setText("Loại Xe");

        loaiXeCombobox.setBackground(new java.awt.Color(243, 243, 244));
        loaiXeCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        loaiXeCombobox.setSelectedIndex(-1);

        xeMayTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Biển số", "Tên xe máy", "Loại xe", "Tên khách hàng", "Số điện thoại", "Giới tính"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(xeMayTable);

        timKiemXeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timKiemXeFieldActionPerformed(evt);
            }
        });

        timKiemXeLbl.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        timKiemXeLbl.setForeground(new java.awt.Color(0, 0, 255));
        timKiemXeLbl.setText("Tìm kiếm");

        jSeparator2.setBackground(new java.awt.Color(204, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(204, 0, 0));

        errorBienSo.setIcon(new javax.swing.ImageIcon("C:\\Users\\MinhTo\\Documents\\GitHub\\congnghephanmem\\applicationMVC\\src\\main\\resource\\img\\error_30px.png")); // NOI18N

        errorTenXe.setIcon(new javax.swing.ImageIcon("C:\\Users\\MinhTo\\Documents\\GitHub\\congnghephanmem\\applicationMVC\\src\\main\\resource\\img\\error_30px.png")); // NOI18N

        errorChuSoHuu.setIcon(new javax.swing.ImageIcon("C:\\Users\\MinhTo\\Documents\\GitHub\\congnghephanmem\\applicationMVC\\src\\main\\resource\\img\\error_30px.png")); // NOI18N

        errorSoDienThoai.setIcon(new javax.swing.ImageIcon("C:\\Users\\MinhTo\\Documents\\GitHub\\congnghephanmem\\applicationMVC\\src\\main\\resource\\img\\error_30px.png")); // NOI18N

        errorLoaiXe.setIcon(new javax.swing.ImageIcon("C:\\Users\\MinhTo\\Documents\\GitHub\\congnghephanmem\\applicationMVC\\src\\main\\resource\\img\\error_30px.png")); // NOI18N

        gioiTinh.setForeground(new java.awt.Color(0, 0, 204));
        gioiTinh.setText("Phái");

        buttonGroup1.add(radioNam);
        radioNam.setSelected(true);
        radioNam.setText("Nam");
        radioNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNamActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioNu);
        radioNu.setText("Nữ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(483, 483, 483)
                .addComponent(timKiemXeLbl)
                .addGap(18, 18, 18)
                .addComponent(timKiemXeField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lbMaKhachHang)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bienSoField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(errorBienSo))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbHoTen)
                        .addGap(6, 6, 6)
                        .addComponent(tenXeMayField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(errorTenXe))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(chuSoHuu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chuSoHuuField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(errorChuSoHuu))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(themXeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(suaXeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(xoaXeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loaiXe)
                            .addComponent(soDienThoai)
                            .addComponent(gioiTinh))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(soDienThoaiField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)
                                .addComponent(errorSoDienThoai))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loaiXeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(errorLoaiXe))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioNam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioNu, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(56, 56, 56)
                .addComponent(jScrollPane2))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(timKiemXeLbl))
                    .addComponent(timKiemXeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lbMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(bienSoField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(errorBienSo))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorTenXe)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tenXeMayField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(chuSoHuuField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chuSoHuu, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(errorChuSoHuu))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(errorSoDienThoai)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(soDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(soDienThoaiField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(1, 1, 1)
                                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(radioNam)
                                    .addComponent(radioNu)
                                    .addComponent(gioiTinh))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(loaiXe)
                                    .addComponent(loaiXeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(errorLoaiXe))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(themXeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(suaXeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xoaXeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel6.setBackground(new java.awt.Color(243, 243, 244));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(0, 0, 153)), "Thông Tin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(0, 0, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        xoaLoaiXeBtn.setForeground(new java.awt.Color(0, 0, 255));
        xoaLoaiXeBtn.setText("Xoá");
        xoaLoaiXeBtn.setPreferredSize(new java.awt.Dimension(70, 35));
        jPanel6.add(xoaLoaiXeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        maLoaiXeField.setBackground(new java.awt.Color(243, 243, 244));
        maLoaiXeField.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel6.add(maLoaiXeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 210, 20));

        tenLoaiXeField.setBackground(new java.awt.Color(243, 243, 244));
        tenLoaiXeField.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel6.add(tenLoaiXeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 69, 210, 20));

        maLoaiXe.setForeground(new java.awt.Color(0, 0, 255));
        maLoaiXe.setText("Mã loại xe");
        jPanel6.add(maLoaiXe, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 30, 60, 20));

        tenLoaiXe.setForeground(new java.awt.Color(0, 0, 255));
        tenLoaiXe.setText("Tên loại xe");
        jPanel6.add(tenLoaiXe, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 60, 20));

        themLoaiXeBtn.setForeground(new java.awt.Color(0, 0, 255));
        themLoaiXeBtn.setText("Thêm");
        themLoaiXeBtn.setPreferredSize(new java.awt.Dimension(70, 35));
        themLoaiXeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themLoaiXeBtnActionPerformed(evt);
            }
        });
        jPanel6.add(themLoaiXeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        suaLoaiXeBtn.setForeground(new java.awt.Color(0, 0, 255));
        suaLoaiXeBtn.setText("Sữa");
        suaLoaiXeBtn.setPreferredSize(new java.awt.Dimension(70, 35));
        jPanel6.add(suaLoaiXeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));
        jPanel6.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 210, 10));
        jPanel6.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 210, 10));

        tableMaLoaiXe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã", "Tên loại"
            }
        ));
        jScrollPane1.setViewportView(tableMaLoaiXe);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 280, 130));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\BT-JAVA-WEB\\applicationMVC\\src\\main\\resource\\img\\xe1nho.png")); // NOI18N

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\BT-JAVA-WEB\\applicationMVC\\src\\main\\resource\\img\\xéh.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1052, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelWelcomeUser)
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 863, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelWelcomeUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void themLoaiXeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themLoaiXeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_themLoaiXeBtnActionPerformed

    private void timKiemXeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timKiemXeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timKiemXeFieldActionPerformed

    private void themXeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themXeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_themXeBtnActionPerformed

    private void chuSoHuuFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chuSoHuuFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chuSoHuuFieldActionPerformed

    private void bienSoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bienSoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bienSoFieldActionPerformed

    private void tenXeMayFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenXeMayFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenXeMayFieldActionPerformed

    private void radioNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioNamActionPerformed

    private void soDienThoaiFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soDienThoaiFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soDienThoaiFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bienSoField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel chuSoHuu;
    private javax.swing.JTextField chuSoHuuField;
    private javax.swing.JLabel errorBienSo;
    private javax.swing.JLabel errorChuSoHuu;
    private javax.swing.JLabel errorLoaiXe;
    private javax.swing.JLabel errorSoDienThoai;
    private javax.swing.JLabel errorTenXe;
    private javax.swing.JLabel gioiTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelWelcomeUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lbHoTen;
    private javax.swing.JLabel lbMaKhachHang;
    private javax.swing.JLabel loaiXe;
    private javax.swing.JComboBox<String> loaiXeCombobox;
    private javax.swing.JLabel maLoaiXe;
    private javax.swing.JTextField maLoaiXeField;
    private javax.swing.JRadioButton radioNam;
    private javax.swing.JRadioButton radioNu;
    private javax.swing.JLabel soDienThoai;
    private javax.swing.JTextField soDienThoaiField;
    private javax.swing.JButton suaLoaiXeBtn;
    private javax.swing.JButton suaXeBtn;
    private javax.swing.JTable tableMaLoaiXe;
    private javax.swing.JLabel tenLoaiXe;
    private javax.swing.JTextField tenLoaiXeField;
    private javax.swing.JTextField tenXeMayField;
    private javax.swing.JButton themLoaiXeBtn;
    private javax.swing.JButton themXeBtn;
    private javax.swing.JTextField timKiemXeField;
    private javax.swing.JLabel timKiemXeLbl;
    private javax.swing.JTable xeMayTable;
    private javax.swing.JButton xoaLoaiXeBtn;
    private javax.swing.JButton xoaXeBtn;
    // End of variables declaration//GEN-END:variables
}
