/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.viewAdmin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author dhmty
 */
public class JPanel_TaiKhoan extends javax.swing.JPanel {

    /**
     * Creates new form JPanel_TaiKhoan
     */
    private String pass_ao="\u25cf\u25cf\u25cf\u25cf\u25cf\u25cf\u25cf\u25cf\u25cf\u25cf";
    public JPanel_TaiKhoan() {
        initComponents();
        importDataTaiKhoan();
        importDataMaNV();
        importDataQuyen();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_CheDo = new javax.swing.ButtonGroup();
        jPanel_DKTK = new javax.swing.JPanel();
        jButton_XacNhan = new javax.swing.JButton();
        jButton_Reset = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField_tenTK = new javax.swing.JTextField();
        jComboBox_IDNV = new javax.swing.JComboBox<>();
        jComboBox_Quyen = new javax.swing.JComboBox<>();
        jPasswordField_nv = new javax.swing.JPasswordField();
        jCheckBox_pass = new javax.swing.JCheckBox();
        jLabel_TieuDe = new javax.swing.JLabel();
        jScrollPane_DSTK = new javax.swing.JScrollPane();
        jTable_DanhSachTK = new javax.swing.JTable();
        jLabel32 = new javax.swing.JLabel();
        jTextField_FindID_TK = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jRadioButton_CDThem = new javax.swing.JRadioButton();
        jRadioButton_CDSua = new javax.swing.JRadioButton();
        jRadioButton_CDXoa = new javax.swing.JRadioButton();

        setMinimumSize(new java.awt.Dimension(1092, 573));

        jButton_XacNhan.setText("THÊM TÀI KHOẢN");
        jButton_XacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_XacNhanjButton_LuuActionPerformed(evt);
            }
        });

        jButton_Reset.setText("ĐẶT LẠI");
        jButton_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ResetjButton_ResetActionPerformed(evt);
            }
        });

        jLabel10.setText("Tên Đăng Nhập");

        jLabel11.setText("Mật Khẩu");

        jLabel12.setText("Mã Nhân Viên");

        jLabel13.setText("Quyền");

        jTextField_tenTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_tenTKjTextField_tenTKActionPerformed(evt);
            }
        });

        jPasswordField_nv.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jPasswordField_nvInputMethodTextChanged(evt);
            }
        });
        jPasswordField_nv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_nvjPasswordField_nvActionPerformed(evt);
            }
        });
        jPasswordField_nv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField_nvKeyPressed(evt);
            }
        });

        jCheckBox_pass.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jCheckBox_pass.setText("Hiển Thị Mật Khẩu");
        jCheckBox_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_passActionPerformed(evt);
            }
        });

        jLabel_TieuDe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_TieuDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TieuDe.setText("NHẬP THÔNG TIN TÀI KHOẢN");
        jLabel_TieuDe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel_TieuDe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel_DKTKLayout = new javax.swing.GroupLayout(jPanel_DKTK);
        jPanel_DKTK.setLayout(jPanel_DKTKLayout);
        jPanel_DKTKLayout.setHorizontalGroup(
            jPanel_DKTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DKTKLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_DKTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_DKTKLayout.createSequentialGroup()
                        .addGroup(jPanel_DKTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel_DKTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_DKTKLayout.createSequentialGroup()
                                .addComponent(jCheckBox_pass)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel_DKTKLayout.createSequentialGroup()
                                .addGroup(jPanel_DKTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_DKTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField_tenTK, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                        .addComponent(jPasswordField_nv))
                                    .addGroup(jPanel_DKTKLayout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(jButton_XacNhan)))
                                .addGap(85, 85, 85)
                                .addGroup(jPanel_DKTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton_Reset)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel_DKTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox_IDNV, 0, 190, Short.MAX_VALUE)
                                    .addComponent(jComboBox_Quyen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(12, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_DKTKLayout.createSequentialGroup()
                        .addComponent(jLabel_TieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel_DKTKLayout.setVerticalGroup(
            jPanel_DKTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_DKTKLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_TieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_DKTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel_DKTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_tenTK, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(jComboBox_IDNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel_DKTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox_Quyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_DKTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jPasswordField_nv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox_pass)
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(jPanel_DKTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_XacNhan)
                    .addComponent(jButton_Reset))
                .addGap(16, 16, 16))
        );

        jTable_DanhSachTK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên Đăng Nhập", "Mật Khẩu", "Mã Nhân Viên", "Tên Nhân Viên", "Mã Quyền", "Quyền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_DanhSachTK.setOpaque(false);
        jTable_DanhSachTK.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable_DanhSachTK.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jTable_DanhSachTKMouseWheelMoved(evt);
            }
        });
        jTable_DanhSachTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_DanhSachTKMouseClicked(evt);
            }
        });
        jScrollPane_DSTK.setViewportView(jTable_DanhSachTK);
        if (jTable_DanhSachTK.getColumnModel().getColumnCount() > 0) {
            jTable_DanhSachTK.getColumnModel().getColumn(1).setMinWidth(0);
            jTable_DanhSachTK.getColumnModel().getColumn(1).setMaxWidth(0);
            jTable_DanhSachTK.getColumnModel().getColumn(4).setMinWidth(0);
            jTable_DanhSachTK.getColumnModel().getColumn(4).setMaxWidth(0);
        }

        jLabel32.setText("Tìm Kiếm Theo Tên Đăng Nhập");

        jTextField_FindID_TK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FindID_TKActionPerformed(evt);
            }
        });
        jTextField_FindID_TK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_FindID_TKKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("DANH SÁCH TÀI KHOẢN");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setText("CHỌN CHẾ ĐỘ");

        buttonGroup_CheDo.add(jRadioButton_CDThem);
        jRadioButton_CDThem.setSelected(true);
        jRadioButton_CDThem.setText("THÊM TÀI KHOẢN");
        jRadioButton_CDThem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton_CDThemItemStateChanged(evt);
            }
        });

        buttonGroup_CheDo.add(jRadioButton_CDSua);
        jRadioButton_CDSua.setText("CHỈNH SỬA TÀI KHOẢN");
        jRadioButton_CDSua.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton_CDSuaItemStateChanged(evt);
            }
        });

        buttonGroup_CheDo.add(jRadioButton_CDXoa);
        jRadioButton_CDXoa.setText("XÓA TÀI KHOẢN");
        jRadioButton_CDXoa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton_CDXoaItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jTextField_FindID_TK, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(32, 32, 32)
                                .addComponent(jRadioButton_CDThem)
                                .addGap(35, 35, 35)
                                .addComponent(jRadioButton_CDSua)
                                .addGap(50, 50, 50)
                                .addComponent(jRadioButton_CDXoa))
                            .addComponent(jScrollPane_DSTK, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel_DKTK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(196, 196, 196))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(436, 436, 436))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jRadioButton_CDThem)
                    .addComponent(jRadioButton_CDSua)
                    .addComponent(jRadioButton_CDXoa))
                .addGap(18, 18, 18)
                .addComponent(jPanel_DKTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_FindID_TK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane_DSTK, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_XacNhanjButton_LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_XacNhanjButton_LuuActionPerformed
        // TODO add your handling code here:
        if (jRadioButton_CDXoa.isSelected()){
            String user=jTextField_tenTK.getText();
            user=user.trim();
            if (ControllerAdmin.ktUser(user)==0) JOptionPane.showMessageDialog(this, "Tên Tài Khoản không tồn tại, chon 1 o trong DANH SACH de XOA");
            else {
                int ret=JOptionPane.showConfirmDialog(this, "Ban co chac chan muon xoa ? ", "Xac Nhan", 0);
                if (ret == JOptionPane.CANCEL_OPTION)
                return;
                else if (ret==JOptionPane.OK_OPTION)
                {
                    ModelAdmin.xoaTK(user);
                    JOptionPane.showMessageDialog(this,"Xoa Thanh Cong");
                    this.importDataTaiKhoan();
                }
            }
        }
        else {
            String user=jTextField_tenTK.getText();
            char[] pass=jPasswordField_nv.getPassword();
            String password= String.valueOf(pass);
            //chuyển pass sang Bcrypt
            String id_nv1= (String) jComboBox_IDNV.getSelectedItem();
            String id_quyen1= (String) jComboBox_Quyen.getSelectedItem();
            String id_nv2[]=id_nv1.split("\\s");
            int id_nv=Integer.parseInt(id_nv2[0]);
            String id_quyen2[]=id_quyen1.split("\\s");
            int id_quyen=Integer.parseInt(id_quyen2[0]);

            boolean kt=true;
            if (ControllerAdmin.ktKTrang(user)==1){
                kt=false;
                JOptionPane.showMessageDialog(this, "Ten Tai Khoan Khong Chua Khoang Trang");
            }
            if (user.matches("") || password.matches("")){
                kt=false;
                JOptionPane.showMessageDialog(this, "Ten Tai Khoan, Mật Khẩu Khong Duoc De Trong");
            }

            if (kt){
                String hash = BCrypt.hashpw(password, BCrypt.gensalt(6));
                if (jRadioButton_CDSua.isSelected()) {
                    int ret=JOptionPane.showConfirmDialog(this, "Tên Tài Khoản đã tồn tại, Bạn có muốn cập nhật tài khoản", "Xác nhận", 0);
                    if (ret==JOptionPane.CANCEL_OPTION) return;
                    else  if (ret==JOptionPane.OK_OPTION) {
                        // chưa đúngs
                        if (password.equals(pass_ao)){
                            ModelAdmin.suaTK1(user,id_nv,id_quyen);
                            //System.out.println("ko thay doi pass");
                        }
                        else
                        {
                            ModelAdmin.suaTK(user,hash, id_nv, id_quyen);
                            //System.out.println("da thay doi pass");
                        }
                            
                        JOptionPane.showMessageDialog(this, "Cập nhật Tài Khoản "+ user +" Thành Công");
                    }
                }
                else if (jRadioButton_CDThem.isSelected()) {
                    ModelAdmin.themTK(user, hash, id_nv, id_quyen);
                    JOptionPane.showMessageDialog(this, "Đã Thêm Tài Khoản Thành Công");
                }
                this.importDataTaiKhoan();
            }
        }
        
        
    }//GEN-LAST:event_jButton_XacNhanjButton_LuuActionPerformed

    private void jButton_ResetjButton_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ResetjButton_ResetActionPerformed
        // TODO add your handling code here:
       if (jRadioButton_CDThem.isSelected()){ 
           jTextField_tenTK.setText("");
       }
        if (jRadioButton_CDSua.isSelected()){ 
           jPasswordField_nv.setEditable(true);
           jCheckBox_pass.setSelected(true);
       }
        jPasswordField_nv.setText("");
        jComboBox_IDNV.setSelectedIndex(0);
        jComboBox_Quyen.setSelectedIndex(0);
    }//GEN-LAST:event_jButton_ResetjButton_ResetActionPerformed

    private void jTextField_tenTKjTextField_tenTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_tenTKjTextField_tenTKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_tenTKjTextField_tenTKActionPerformed

    private void jPasswordField_nvjPasswordField_nvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_nvjPasswordField_nvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_nvjPasswordField_nvActionPerformed

    private void jCheckBox_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_passActionPerformed
        // TODO add your handling code here:
        if (jRadioButton_CDThem.isSelected()){
            if (jCheckBox_pass.isSelected()){
              jPasswordField_nv.setEchoChar((char)0);
            }
            else {
                jPasswordField_nv.setEchoChar('\u25cf');
            }
        }
        else if (jRadioButton_CDSua.isSelected()){
            if (jCheckBox_pass.isSelected()){
                 jPasswordField_nv.setEditable(true);
                jPasswordField_nv.setText("");
            }
            else {
               jPasswordField_nv.setEditable(false);
            }
        }
       
    }//GEN-LAST:event_jCheckBox_passActionPerformed

    private void jTable_DanhSachTKMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jTable_DanhSachTKMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_DanhSachTKMouseWheelMoved

    private void jTable_DanhSachTKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_DanhSachTKMouseClicked
        // TODO add your handling code here:
        if (!jRadioButton_CDThem.isSelected()){
             int i=jTable_DanhSachTK.getSelectedRow();
            jTextField_tenTK.setText((String) jTable_DanhSachTK.getValueAt(i, 0));
            jPasswordField_nv.setText(pass_ao);
            jComboBox_IDNV.setSelectedItem((String) jTable_DanhSachTK.getValueAt(i, 2) +" - "+(String) jTable_DanhSachTK.getValueAt(i, 3));
            jComboBox_Quyen.setSelectedItem((String) jTable_DanhSachTK.getValueAt(i, 4)+" - "+(String) jTable_DanhSachTK.getValueAt(i, 5));
        }
    }//GEN-LAST:event_jTable_DanhSachTKMouseClicked

    private void jTextField_FindID_TKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FindID_TKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FindID_TKActionPerformed

    private void jTextField_FindID_TKKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_FindID_TKKeyReleased
        // TODO add your handling code here:
        String s=jTextField_FindID_TK.getText();
        DefaultTableModel dtm= (DefaultTableModel) jTable_DanhSachTK.getModel();
        dtm.setNumRows(0);
        Connection cn=ModelAdmin.connectMSSQL();
        String sql="select TK.TenTaiKhoan,TK.MatKhau,TK.idNhanVien,NV.Ten,TK.idQuyen,Q.Ten\n" +
                "from TaiKhoan as TK,Quyen as Q,NhanVien as NV\n" + "where tk.idNhanVien=Nv.id and tk.idQuyen=Q.id";
        Vector vt=null;
        try{
            PreparedStatement ps=cn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                vt=new Vector();
                String a=rs.getString(1);
                if (a.contains(s)){
                    vt.add(a);
                    vt.add(rs.getString(2));
                    vt.add(rs.getString(3));
                    vt.add(rs.getString(4));
                    vt.add(rs.getString(5));
                    vt.add(rs.getString(6));
                    dtm.addRow(vt);
                }
            }
           jTable_DanhSachTK.setModel(dtm);
           rs.close();
           ps.close();
           cn.close();
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jTextField_FindID_TKKeyReleased

    private void jRadioButton_CDThemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton_CDThemItemStateChanged
        // TODO add your handling code here
        if (jRadioButton_CDThem.isSelected()) {
            jButton_XacNhan.setText("THÊM TÀI KHOẢN");
            jLabel_TieuDe.setText("NHẬP THÔNG TIN TÀI KHOẢN");
            jTextField_tenTK.setEditable(true);
            jPasswordField_nv.setEditable(true);
            jCheckBox_pass.setVisible(true);
            jCheckBox_pass.setText("Hiển Thị Mật Khẩu");
            jButton_Reset.setEnabled(true);
            jComboBox_IDNV.setEnabled(true);
            jComboBox_Quyen.setEnabled(true);
            //set to default
            jTextField_tenTK.setText("");
            jPasswordField_nv.setText("");
            jComboBox_IDNV.setSelectedIndex(0);
            jComboBox_Quyen.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jRadioButton_CDThemItemStateChanged

    private void jRadioButton_CDSuaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton_CDSuaItemStateChanged
        // TODO add your handling code here:
        if (jRadioButton_CDSua.isSelected()) {
            jButton_XacNhan.setText("LƯU TÀI KHOẢN");
            jLabel_TieuDe.setText("CHỈNH SỬA TÀI KHOẢN - CHỌN 1 Ô TRONG BẢNG");
            //set cac gia tri
            jTextField_tenTK.setEditable(false);
            jPasswordField_nv.setEditable(false);
            jCheckBox_pass.setVisible(true);
            jCheckBox_pass.setText("Đặt Lại Mật Khẩu");
            jButton_Reset.setEnabled(true);
            jComboBox_IDNV.setEnabled(true);
            jComboBox_Quyen.setEnabled(true);
            //SET GIÁ TRỊ ĐẦU TIÊN TRONG BẢNG
            int i=0;
            int j=jTable_DanhSachTK.getRowCount();
            if (j!=0){
                jTable_DanhSachTK.setRowSelectionInterval(i, i);
                jTextField_tenTK.setText((String) jTable_DanhSachTK.getValueAt(i, 0));
                jPasswordField_nv.setText(pass_ao);
                jComboBox_IDNV.setSelectedItem((String) jTable_DanhSachTK.getValueAt(i, 2) +" - "+(String) jTable_DanhSachTK.getValueAt(i, 3));
                jComboBox_Quyen.setSelectedItem((String) jTable_DanhSachTK.getValueAt(i, 4)+" - "+(String) jTable_DanhSachTK.getValueAt(i, 5));
            }

        }
    }//GEN-LAST:event_jRadioButton_CDSuaItemStateChanged

    private void jRadioButton_CDXoaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton_CDXoaItemStateChanged
        // TODO add your handling code here:
        if (jRadioButton_CDXoa.isSelected()) {
             jButton_XacNhan.setText("XÓA TÀI KHOẢN");
             jLabel_TieuDe.setText("XÓA TÀI KHOẢN - CHỌN 1 Ô TRONG BẢNG");
             //set cac gia tri
             jTextField_tenTK.setEditable(false);
             jCheckBox_pass.setVisible(false);
             jButton_Reset.setEnabled(false);
             jComboBox_IDNV.setEnabled(false);
             jComboBox_Quyen.setEnabled(false);
            //SET GIÁ TRỊ ĐẦU TIÊN TRONG BẢNG
            int i=0;
            int j=jTable_DanhSachTK.getRowCount();
            if (j!=0) {
               jTable_DanhSachTK.setRowSelectionInterval(i, i);
                jTextField_tenTK.setText((String) jTable_DanhSachTK.getValueAt(i, 0));
                jPasswordField_nv.setText(pass_ao);
                jComboBox_IDNV.setSelectedItem((String) jTable_DanhSachTK.getValueAt(i, 2) +" - "+(String) jTable_DanhSachTK.getValueAt(i, 3));
                jComboBox_Quyen.setSelectedItem((String) jTable_DanhSachTK.getValueAt(i, 4)+" - "+(String) jTable_DanhSachTK.getValueAt(i, 5));
            }

        }
    }//GEN-LAST:event_jRadioButton_CDXoaItemStateChanged

    private void jPasswordField_nvKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_nvKeyPressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jPasswordField_nvKeyPressed

    private void jPasswordField_nvInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jPasswordField_nvInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_nvInputMethodTextChanged

      private void importDataTaiKhoan(){
        DefaultTableModel dtm= (DefaultTableModel) jTable_DanhSachTK.getModel();
        dtm.setNumRows(0);
        Connection cn=ModelAdmin.connectMSSQL();
        String sql="select TK.TenTaiKhoan,TK.MatKhau,TK.idNhanVien,NV.Ten,TK.idQuyen,Q.Ten\n" + "from TaiKhoan as TK,Quyen as Q,NhanVien as NV\n" + "where tk.idNhanVien=Nv.id and tk.idQuyen=Q.id";
        Vector vt=null;
        try{
            PreparedStatement ps=cn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                vt=new Vector();
                vt.add(rs.getString(1)); 
                vt.add(rs.getString(2));
                vt.add(rs.getString(3));
                vt.add(rs.getString(4));
                vt.add(rs.getString(5));
                vt.add(rs.getString(6));
                dtm.addRow(vt);
            }
           jTable_DanhSachTK.setModel(dtm);
           rs.close();
           ps.close();
           cn.close();
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    private void importDataMaNV(){
       Connection cn=ModelAdmin.connectMSSQL();
       String sql="select id,Ten from NhanVien";
       try{
           PreparedStatement ps=cn.prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           while (rs.next()){
               jComboBox_IDNV.addItem(rs.getString(1)+" - "+rs.getString(2));
               //jComboBox_IDNV1.addItem(rs.getString(1)+" - "+rs.getString(2)); add này vào thống kê bảo dưỡng
           }
           rs.close();
           ps.close();
           cn.close();
       }
       catch (SQLException ex){
           ex.printStackTrace();
       }
    }
     private void importDataQuyen(){
       Connection cn=ModelAdmin.connectMSSQL();
       String sql="select id,Ten from Quyen";
       try{
           PreparedStatement ps=cn.prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           while (rs.next()){
               jComboBox_Quyen.addItem(rs.getString(1)+" - "+rs.getString(2));
           }
           rs.close();
           ps.close();
           cn.close();
       }
       catch (SQLException ex){
           ex.printStackTrace();
       }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_CheDo;
    private javax.swing.JButton jButton_Reset;
    private javax.swing.JButton jButton_XacNhan;
    private javax.swing.JCheckBox jCheckBox_pass;
    private javax.swing.JComboBox<String> jComboBox_IDNV;
    private javax.swing.JComboBox<String> jComboBox_Quyen;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel_TieuDe;
    private javax.swing.JPanel jPanel_DKTK;
    private javax.swing.JPasswordField jPasswordField_nv;
    private javax.swing.JRadioButton jRadioButton_CDSua;
    private javax.swing.JRadioButton jRadioButton_CDThem;
    private javax.swing.JRadioButton jRadioButton_CDXoa;
    private javax.swing.JScrollPane jScrollPane_DSTK;
    private javax.swing.JTable jTable_DanhSachTK;
    private javax.swing.JTextField jTextField_FindID_TK;
    private javax.swing.JTextField jTextField_tenTK;
    // End of variables declaration//GEN-END:variables
}
