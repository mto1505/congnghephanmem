/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.view;

import com.mycompany.applicationmvc.Utils.CustomRenderTable;
import com.mycompany.applicationmvc.Utils.TableColumnUtil;
import com.mycompany.applicationmvc.controller.KhachHangController;
import com.mycompany.applicationmvc.controller.PersonController;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;

/**
 *
 * @author MinhTo
 */
public class KhachHangPanel extends javax.swing.JPanel {

    /**
     * Creates new form KhachHangPanel
     */
    private JFrame frameMain;

    public KhachHangPanel(JFrame frame) {
        initComponents();
        this.frameMain = frame;
        //btnDownup=
        //menuThongtin.add(new JLayeredPane(),BorderLayout.CENTER);
        tableKhachHang.getTableHeader().setDefaultRenderer(new CustomRenderTable());
        TableColumnUtil.setTableColumnSize(tableKhachHang, tableKhachHang.getPreferredSize().getWidth(), 5, 40, 20, 20, 5, 10);
        KhachHangController khachHangController = new KhachHangController(suaBtn, themBtn, xoaBtn, buttonGroup1, maKHField, HoTenField, soCMTField, radioNam, radioNu, ngaySinhJchooseDateField, soDienThoaiField, timkiemSDTField, errorCMND, errorGioiTinh, errorHoVaTen, errorNgaySinh, errorSoDienThoai, tableKhachHang, this);
        khachHangController.setDataToTable();
        khachHangController.setEvent();
       
       // khachHangController.setEvent();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popDown = new javax.swing.JPopupMenu();
        thongtin = new javax.swing.JMenuItem();
        doimatkhau = new javax.swing.JMenuItem();
        dangxuat = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        panelKhachHang = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableKhachHang = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelWelcomeUser = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        soDienThoaiField = new javax.swing.JTextField();
        xoaBtn = new javax.swing.JButton();
        maKHField = new javax.swing.JTextField();
        HoTenField = new javax.swing.JTextField();
        soCMTField = new javax.swing.JTextField();
        ngaySinhJchooseDateField = new com.toedter.calendar.JDateChooser();
        lbMaKhachHang = new javax.swing.JLabel();
        lbHoTen = new javax.swing.JLabel();
        lbCMT = new javax.swing.JLabel();
        lbSDT = new javax.swing.JLabel();
        lbNgaySinh = new javax.swing.JLabel();
        lbGioiTinh = new javax.swing.JLabel();
        themBtn = new javax.swing.JButton();
        suaBtn = new javax.swing.JButton();
        errorHoVaTen = new javax.swing.JLabel();
        errorCMND = new javax.swing.JLabel();
        errorNgaySinh = new javax.swing.JLabel();
        errorGioiTinh = new javax.swing.JLabel();
        errorSoDienThoai = new javax.swing.JLabel();
        radioNam = new javax.swing.JRadioButton();
        radioNu = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        timKiemLabel = new javax.swing.JLabel();
        timkiemSDTField = new javax.swing.JTextField();

        thongtin.setText("Thông tin");
        thongtin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thongtinActionPerformed(evt);
            }
        });
        popDown.add(thongtin);

        doimatkhau.setText("Đổi mật khẩu");
        doimatkhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doimatkhauActionPerformed(evt);
            }
        });
        popDown.add(doimatkhau);

        dangxuat.setText("Đăng xuất");
        popDown.add(dangxuat);

        setPreferredSize(new java.awt.Dimension(990, 669));

        panelKhachHang.setBackground(new java.awt.Color(204, 204, 255));
        panelKhachHang.setForeground(new java.awt.Color(0, 0, 255));
        panelKhachHang.setPreferredSize(new java.awt.Dimension(650, 650));

        tableKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Khách Hàng", "Họ và tên", "CMND/CCCD", "Ngày Sinh", "Giới Tính", "Số điện thoại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableKhachHang.getTableHeader().setResizingAllowed(false);
        tableKhachHang.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableKhachHang);

        jPanel3.setBackground(new java.awt.Color(243, 243, 244));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setForeground(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Khách Hàng");
        jPanel3.add(jLabel1);

        jLabelWelcomeUser.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelWelcomeUser.setForeground(new java.awt.Color(0, 0, 255));
        jLabelWelcomeUser.setText("Minh Tơ");
        jLabelWelcomeUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelWelcomeUserMouseClicked(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(243, 243, 244));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(0, 0, 153)), "Thông Tin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(0, 0, 255));

        xoaBtn.setText("Xoá");
        xoaBtn.setPreferredSize(new java.awt.Dimension(70, 35));
        xoaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaBtnActionPerformed(evt);
            }
        });

        maKHField.setEnabled(false);

        soCMTField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soCMTFieldActionPerformed(evt);
            }
        });

        ngaySinhJchooseDateField.setDateFormatString("dd-MM-yyyy");
        ngaySinhJchooseDateField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ngaySinhJchooseDateFieldFocusGained(evt);
            }
        });
        ngaySinhJchooseDateField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ngaySinhJchooseDateFieldMouseClicked(evt);
            }
        });

        lbMaKhachHang.setForeground(new java.awt.Color(0, 0, 255));
        lbMaKhachHang.setText("Mã KH");

        lbHoTen.setForeground(new java.awt.Color(0, 0, 255));
        lbHoTen.setText("Họ và Tên");

        lbCMT.setForeground(new java.awt.Color(0, 0, 255));
        lbCMT.setText("CMND/CCCD");

        lbSDT.setForeground(new java.awt.Color(0, 0, 255));
        lbSDT.setText("Số điện thoại");

        lbNgaySinh.setForeground(new java.awt.Color(0, 0, 255));
        lbNgaySinh.setText("Ngày sinh");

        lbGioiTinh.setForeground(new java.awt.Color(0, 0, 255));
        lbGioiTinh.setText("Giới tính");

        themBtn.setText("Thêm");
        themBtn.setPreferredSize(new java.awt.Dimension(70, 35));
        themBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themBtnActionPerformed(evt);
            }
        });

        suaBtn.setText("Sữa");
        suaBtn.setPreferredSize(new java.awt.Dimension(70, 35));

        errorHoVaTen.setForeground(new java.awt.Color(255, 0, 0));
        errorHoVaTen.setText("* Nhập sai định dạng vui lòng thử lại");

        errorCMND.setForeground(new java.awt.Color(255, 0, 0));
        errorCMND.setText("* Nhập sai định dạng vui lòng thử lại");

        errorNgaySinh.setForeground(new java.awt.Color(255, 0, 0));
        errorNgaySinh.setText("* Nhập sai định dạng vui lòng thử lại");

        errorGioiTinh.setForeground(new java.awt.Color(255, 0, 0));
        errorGioiTinh.setText("* Vui lòng chọn trường này");

        errorSoDienThoai.setForeground(new java.awt.Color(255, 0, 0));
        errorSoDienThoai.setText("* Nhập sai định dạng vui lòng thử lại");

        buttonGroup1.add(radioNam);
        radioNam.setText("Nam");
        radioNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNamActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioNu);
        radioNu.setText("Nữ");
        radioNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(lbMaKhachHang)
                        .addGap(6, 6, 6)
                        .addComponent(maKHField, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(lbGioiTinh)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(radioNam)
                                .addGap(6, 6, 6)
                                .addComponent(radioNu, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(errorGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(lbHoTen)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HoTenField, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(errorHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54)
                        .addComponent(lbNgaySinh)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(errorNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ngaySinhJchooseDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(themBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(suaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)
                        .addComponent(xoaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(lbCMT)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(soCMTField, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(lbSDT))
                            .addComponent(errorCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soDienThoaiField, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(365, 365, 365))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maKHField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMaKhachHang)
                                    .addComponent(lbGioiTinh))))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioNam, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioNu, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(errorGioiTinh)
                        .addGap(0, 0, 0)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lbHoTen))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(HoTenField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(errorHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lbNgaySinh))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(errorNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ngaySinhJchooseDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(soCMTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soDienThoaiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCMT)
                            .addComponent(lbSDT))))
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errorSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorCMND, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(themBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(suaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(xoaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        timKiemLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        timKiemLabel.setForeground(new java.awt.Color(0, 0, 255));
        timKiemLabel.setText("Tìm kiếm");

        timkiemSDTField.setText("vd: 0929330xxx");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(timKiemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timkiemSDTField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timKiemLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timkiemSDTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelKhachHangLayout = new javax.swing.GroupLayout(panelKhachHang);
        panelKhachHang.setLayout(panelKhachHangLayout);
        panelKhachHangLayout.setHorizontalGroup(
            panelKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKhachHangLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(panelKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelKhachHangLayout.createSequentialGroup()
                        .addGap(0, 185, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                        .addComponent(jLabelWelcomeUser)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKhachHangLayout.createSequentialGroup()
                        .addGroup(panelKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        panelKhachHangLayout.setVerticalGroup(
            panelKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelWelcomeUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void soCMTFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soCMTFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soCMTFieldActionPerformed

    private void themBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_themBtnActionPerformed

    private void thongtinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thongtinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thongtinActionPerformed

    private void jLabelWelcomeUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelWelcomeUserMouseClicked
        // TODO add your handling code here:
        popDown.show(panelKhachHang, jLabelWelcomeUser.getX(), jLabelWelcomeUser.getY() + jLabelWelcomeUser.getHeight());
    }//GEN-LAST:event_jLabelWelcomeUserMouseClicked

    private void doimatkhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doimatkhauActionPerformed
        // TODO add your handling code here
        JDialog dialogChangePassword = new ChangePassWordDialog(null, true, "MinhTo");
        int x = (this.getWidth() / 2) - (dialogChangePassword.getWidth() / 2);
        int y = (this.getHeight() / 2) - (dialogChangePassword.getHeight() / 2);


    }//GEN-LAST:event_doimatkhauActionPerformed

    private void xoaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xoaBtnActionPerformed

    private void radioNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioNamActionPerformed

    private void radioNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioNuActionPerformed

    private void ngaySinhJchooseDateFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ngaySinhJchooseDateFieldMouseClicked
        // TODO add your handling code here:

        System.out.println("ngaySinhJchooseDateField.getDate() " + ngaySinhJchooseDateField.getDate());

        System.out.println("ngaySinhJchooseDateField.getDate() " + ngaySinhJchooseDateField.getDate());

    }//GEN-LAST:event_ngaySinhJchooseDateFieldMouseClicked

    private void ngaySinhJchooseDateFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ngaySinhJchooseDateFieldFocusGained
        System.out.println("ngaySinhJchooseDateField.getDate() " + ngaySinhJchooseDateField.getDate());
        // TODO add your handling code here:
    }//GEN-LAST:event_ngaySinhJchooseDateFieldFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField HoTenField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuItem dangxuat;
    private javax.swing.JMenuItem doimatkhau;
    private javax.swing.JLabel errorCMND;
    private javax.swing.JLabel errorGioiTinh;
    private javax.swing.JLabel errorHoVaTen;
    private javax.swing.JLabel errorNgaySinh;
    private javax.swing.JLabel errorSoDienThoai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelWelcomeUser;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCMT;
    private javax.swing.JLabel lbGioiTinh;
    private javax.swing.JLabel lbHoTen;
    private javax.swing.JLabel lbMaKhachHang;
    private javax.swing.JLabel lbNgaySinh;
    private javax.swing.JLabel lbSDT;
    private javax.swing.JTextField maKHField;
    private com.toedter.calendar.JDateChooser ngaySinhJchooseDateField;
    private javax.swing.JPanel panelKhachHang;
    private javax.swing.JPopupMenu popDown;
    private javax.swing.JRadioButton radioNam;
    private javax.swing.JRadioButton radioNu;
    private javax.swing.JTextField soCMTField;
    private javax.swing.JTextField soDienThoaiField;
    private javax.swing.JButton suaBtn;
    private javax.swing.JTable tableKhachHang;
    private javax.swing.JButton themBtn;
    private javax.swing.JMenuItem thongtin;
    private javax.swing.JLabel timKiemLabel;
    private javax.swing.JTextField timkiemSDTField;
    private javax.swing.JButton xoaBtn;
    // End of variables declaration//GEN-END:variables
}
