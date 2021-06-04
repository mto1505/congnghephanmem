/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.controller;

import org.apache.commons.lang.SerializationUtils;
import View.*;
import Model.*;
import Entities.*;
import View.DonBaoDuong.DonBaoDuongContainerPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.event.TableModelEvent;
import java.time.LocalDate;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelListener;
import lib.Config;
import lib.Stringlib;

/**
 *
 * @author hesac
 */
public class DichVuBaoDuongController {

    DichVubaoDuongPanel dichVuPanel;
    DonBaoDuongModelDB baoDuongModel;
    ArrayList<NhanVienModel> danhSachNhanVien;
    ArrayList<DichVuBaoDuongModel> danhSachDichVubaoDuong;

    public DichVuBaoDuongController(DichVubaoDuongPanel dichVuPanel, DonBaoDuongModelDB model) throws SQLException {
        this.dichVuPanel = dichVuPanel;
        this.baoDuongModel = model;
        init();
    }

    private void init() throws SQLException {
        loadDanhSachDichVuBaoDuong();
        themSuKienChoItem();
        loadDanhSachLoaiXeComboBox();
        capNhatGiaoDienThemMoiDichVuBaoDuong();
    }

    private void loadDanhSachDichVuBaoDuong() throws SQLException {
        ArrayList<DichVuBaoDuongModel> arl = baoDuongModel.layDanhSachDichVuBaoDuongMoiNhat();
        DefaultTableModel dftb = (DefaultTableModel) dichVuPanel.getjTable_DanhSachDichVuBaoDuong().getModel();
        dftb.setNumRows(0);
        for (DichVuBaoDuongModel dichVuBaoDuong : arl) {
            dftb.addRow(new Object[]{
                dichVuBaoDuong.getId(),
                dichVuBaoDuong.getTenDichVuBaoDuong(),
                dichVuBaoDuong.getPhi(),
                dichVuBaoDuong.getLoaiXe(),
                dichVuBaoDuong.getTrangThai(),
                dichVuBaoDuong.getNgayCapNhat()});
        }
    }

    private void loadDanhSachLoaiXeComboBox() throws SQLException {

        ArrayList<LoaiXeModel> arl = baoDuongModel.layDanhSachLoaiXe();
        JComboBox<String> tb = dichVuPanel.getjComboBox_LoaiXe();
        arl.forEach(loaiXe -> {
            tb.addItem(loaiXe.getTenLoai());
        });
        tb.setSelectedIndex(0);
    }

    private void themSuKienChoItem() {

        dichVuPanel.getjTable_DanhSachDichVuBaoDuong().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = dichVuPanel.getjTable_DanhSachDichVuBaoDuong().getSelectedRow();
                if (row > -1) {

                    DefaultTableModel md = ((DefaultTableModel) dichVuPanel.getjTable_DanhSachDichVuBaoDuong().getModel());
                    dichVuPanel.getjTextField_MaDichVuBaoDuong().setText(md.getValueAt(row, 0).toString());
                    dichVuPanel.getjTextField_TenDichVuBaoDuong().setText(md.getValueAt(row, 1).toString());
                    dichVuPanel.getjTextField_TenDichVuBaoDuong().setEditable(false);
                    dichVuPanel.getjTextField_TenDichVuBaoDuong().setEnabled(false);
                    dichVuPanel.getjTextField_PhiDichVuBaoDuong().setText(md.getValueAt(row, 2).toString());
                    dichVuPanel.getjTextField_PhiDichVuBaoDuong().setEditable(true);
                    dichVuPanel.getjComboBox_LoaiXe().setSelectedItem(md.getValueAt(row, 3).toString());
                    dichVuPanel.getjComboBox_LoaiXe().setEnabled(false);
                    if (md.getValueAt(row, 4).toString().equalsIgnoreCase("Sử dụng")) {
                        dichVuPanel.getjCheckBox_TrangThaiSuDungDichVuBaoDuong().setSelected(true);
                    } else {
                        dichVuPanel.getjCheckBox_TrangThaiSuDungDichVuBaoDuong().setSelected(false);
                    }
                }
            }
        });



        dichVuPanel.getjTextField_TimKiemDichVuBaoDuong().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                try {
                    ArrayList<DichVuBaoDuongModel> ar = baoDuongModel.layDanhSachDichVuBaoDuongMoiNhat();
                    String key = dichVuPanel.getjTextField_TimKiemDichVuBaoDuong().getText().trim();
                    DefaultTableModel dm = (DefaultTableModel) dichVuPanel.getjTable_DanhSachDichVuBaoDuong().getModel();
                    if (!key.equalsIgnoreCase("")) {
                        dm.setNumRows(0);
                        for (DichVuBaoDuongModel dv : ar) {
                            if (Stringlib.isLikeString(key, dv.getTenDichVuBaoDuong()) >= 0.51) {
                                dm.addRow(new Object[]{dv.getId(), dv.getTenDichVuBaoDuong(), dv.getPhi(), dv.getLoaiXe(), dv.getTrangThai()});
                            }
                        }
                    } else {
                        loadDanhSachDichVuBaoDuong();
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(DonBaoDuongController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        dichVuPanel.getjButton_LuuDichVuBaoDuong().addActionListener((e) -> {
            String st = "Không sử dụng";
            if (dichVuPanel.getjCheckBox_TrangThaiSuDungDichVuBaoDuong().isSelected()) {
                st = "Sử dụng";
            }
            DichVuBaoDuongModel dv = new DichVuBaoDuongModel(
                    Integer.parseInt(dichVuPanel.getjTextField_MaDichVuBaoDuong().getText()),
                    dichVuPanel.getjTextField_TenDichVuBaoDuong().getText(),
                    Long.parseLong(dichVuPanel.getjTextField_PhiDichVuBaoDuong().getText().trim()),
                    dichVuPanel.getjComboBox_LoaiXe().getSelectedItem().toString(),
                    st,
                    dichVuPanel.getjTextField_NgayCapNhat().getText());
            if (dichVuPanel.getjTextField_MaDichVuBaoDuong().getText().equalsIgnoreCase("")) {

                try {
                    baoDuongModel.themDichVuBaoDuong(dv);
                } catch (SQLException ex) {
                    Logger.getLogger(DichVuBaoDuongController.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    baoDuongModel.capNhatDichVuBaoDuong(dv);
                } catch (SQLException ex) {
                    Logger.getLogger(DichVuBaoDuongController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            try {
                loadDanhSachDichVuBaoDuong();
            } catch (SQLException ex) {
                Logger.getLogger(DichVuBaoDuongController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        dichVuPanel.getjButton_ThemDichVubaoDUongMoi().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                capNhatGiaoDienThemMoiDichVuBaoDuong();
            }
        });

        

    }

    private void capNhatGiaoDienThemMoiDichVuBaoDuong() {
        dichVuPanel.getjTextField_MaDichVuBaoDuong().setText("[Tự động tạo]");
        dichVuPanel.getjTextField_TenDichVuBaoDuong().setText("");
        dichVuPanel.getjTextField_TenDichVuBaoDuong().setEnabled(true);
        dichVuPanel.getjTextField_TenDichVuBaoDuong().setEditable(true);
        dichVuPanel.getjTextField_PhiDichVuBaoDuong().setText("");
        dichVuPanel.getjTextField_PhiDichVuBaoDuong().setEditable(true);
        dichVuPanel.getjComboBox_LoaiXe().setSelectedIndex(0);
        dichVuPanel.getjComboBox_LoaiXe().setEnabled(true);
        dichVuPanel.getjCheckBox_TrangThaiSuDungDichVuBaoDuong().setSelected(true);
    }
    
    
}
