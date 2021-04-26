/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.controller;

import com.mycompany.applicationmvc.Utils.TableKhachHangModel;
import com.mycompany.applicationmvc.Utils.TableModelCustom;
import com.mycompany.applicationmvc.dao.IKhachHangDAO;
import com.mycompany.applicationmvc.dao.ILoaiXeDao;
import com.mycompany.applicationmvc.daoImpl.KhachHangDAO;
import com.mycompany.applicationmvc.daoImpl.LoaiXeDAO;
import com.mycompany.applicationmvc.model.KhachHangModel;
import com.mycompany.applicationmvc.model.LoaiXeModel;
import com.mycompany.applicationmvc.model.XeModel;
import com.mycompany.applicationmvc.service.IXeService;
import com.mycompany.applicationmvc.serviceImpl.XeService;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author MinhTo
 */
public class XeController {

      private javax.swing.JTextField bienSoField;
    private javax.swing.JLabel chuSoHuu;
    private javax.swing.JTextField chuSoHuuField;
    private javax.swing.JLabel errorBienSo;
    private javax.swing.JLabel errorChuSoHuu;
    private javax.swing.JLabel errorLoaiXe;
    private javax.swing.JLabel errorSoDienThoai;
    private javax.swing.JLabel errorTenXe;

    private javax.swing.JLabel lbHoTen;
    private javax.swing.JLabel lbMaKhachHang;
    private javax.swing.JLabel loaiXe;
    private javax.swing.JComboBox<String> loaiXeCombobox;
    private javax.swing.JLabel maLoaiXe;
    private javax.swing.JTextField maLoaiXeField;
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
     private TableModelCustom tableModelCustom;
    //service
    private  IXeService xeSevice=new XeService();
    private IKhachHangDAO khachHangDAO=new KhachHangDAO();
    private ILoaiXeDao loaiXeDao=new LoaiXeDAO();
    // view 
    private JPanel jpanel;

    public JPanel getJpanel() {
        return jpanel;
    }

    public void setJpanel(JPanel jpanel) {
        this.jpanel = jpanel;
    }
    
    public JTextField getBienSoField() {
        return bienSoField;
    }

    public void setBienSoField(JTextField bienSoField) {
        this.bienSoField = bienSoField;
    }

    public JLabel getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(JLabel chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    public JTextField getChuSoHuuField() {
        return chuSoHuuField;
    }

    public void setChuSoHuuField(JTextField chuSoHuuField) {
        this.chuSoHuuField = chuSoHuuField;
    }

    public JLabel getLbHoTen() {
        return lbHoTen;
    }

    public void setLbHoTen(JLabel lbHoTen) {
        this.lbHoTen = lbHoTen;
    }

    public JLabel getLbMaKhachHang() {
        return lbMaKhachHang;
    }

    public void setLbMaKhachHang(JLabel lbMaKhachHang) {
        this.lbMaKhachHang = lbMaKhachHang;
    }

    public JLabel getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(JLabel loaiXe) {
        this.loaiXe = loaiXe;
    }

    public JComboBox<String> getLoaiXeCombobox() {
        return loaiXeCombobox;
    }

    public void setLoaiXeCombobox(JComboBox<String> loaiXeCombobox) {
        this.loaiXeCombobox = loaiXeCombobox;
    }

    public JLabel getMaLoaiXe() {
        return maLoaiXe;
    }

    public void setMaLoaiXe(JLabel maLoaiXe) {
        this.maLoaiXe = maLoaiXe;
    }

    public JTextField getMaLoaiXeField() {
        return maLoaiXeField;
    }

    public void setMaLoaiXeField(JTextField maLoaiXeField) {
        this.maLoaiXeField = maLoaiXeField;
    }

    public JLabel getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(JLabel soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public JTextField getSoDienThoaiField() {
        return soDienThoaiField;
    }

    public void setSoDienThoaiField(JTextField soDienThoaiField) {
        this.soDienThoaiField = soDienThoaiField;
    }

    public JLabel getTenLoaiXe() {
        return tenLoaiXe;
    }

    public void setTenLoaiXe(JLabel tenLoaiXe) {
        this.tenLoaiXe = tenLoaiXe;
    }

    public JTextField getTenLoaiXeField() {
        return tenLoaiXeField;
    }

    public void setTenLoaiXeField(JTextField tenLoaiXeField) {
        this.tenLoaiXeField = tenLoaiXeField;
    }

    public JTextField getTenXeMayField() {
        return tenXeMayField;
    }

    public void setTenXeMayField(JTextField tenXeMayField) {
        this.tenXeMayField = tenXeMayField;
    }

    public JTextField getTimKiemXeField() {
        return timKiemXeField;
    }

    public void setTimKiemXeField(JTextField timKiemXeField) {
        this.timKiemXeField = timKiemXeField;
    }

    public JLabel getTimKiemXeLbl() {
        return timKiemXeLbl;
    }

    public void setTimKiemXeLbl(JLabel timKiemXeLbl) {
        this.timKiemXeLbl = timKiemXeLbl;
    }

    public JTable getXeMayTable() {
        return xeMayTable;
    }

    public void setXeMayTable(JTable xeMayTable) {
        this.xeMayTable = xeMayTable;
    }

    public JTable getTableMaLoaiXe() {
        return tableMaLoaiXe;
    }

    public void setTableMaLoaiXe(JTable tableMaLoaiXe) {
        this.tableMaLoaiXe = tableMaLoaiXe;
    }

    public JButton getXoaLoaiXeBtn() {
        return xoaLoaiXeBtn;
    }

    public void setXoaLoaiXeBtn(JButton xoaLoaiXeBtn) {
        this.xoaLoaiXeBtn = xoaLoaiXeBtn;
    }

    public JButton getXoaXeBtn() {
        return xoaXeBtn;
    }

    public void setXoaXeBtn(JButton xoaXeBtn) {
        this.xoaXeBtn = xoaXeBtn;
    }

    public JButton getSuaLoaiXeBtn() {
        return suaLoaiXeBtn;
    }

    public void setSuaLoaiXeBtn(JButton suaLoaiXeBtn) {
        this.suaLoaiXeBtn = suaLoaiXeBtn;
    }

    public JButton getSuaXeBtn() {
        return suaXeBtn;
    }

    public void setSuaXeBtn(JButton suaXeBtn) {
        this.suaXeBtn = suaXeBtn;
    }

    public JButton getThemLoaiXeBtn() {
        return themLoaiXeBtn;
    }

    public void setThemLoaiXeBtn(JButton themLoaiXeBtn) {
        this.themLoaiXeBtn = themLoaiXeBtn;
    }

    public JButton getThemXeBtn() {
        return themXeBtn;
    }

    public void setThemXeBtn(JButton themXeBtn) {
        this.themXeBtn = themXeBtn;
    }

    public XeController(JTextField bienSoField, JLabel chuSoHuu, JTextField chuSoHuuField, JLabel errorBienSo, JLabel errorChuSoHuu, JLabel errorLoaiXe, JLabel errorSoDienThoai, JLabel errorTenXe, JLabel lbHoTen, JLabel lbMaKhachHang, JLabel loaiXe, JComboBox<String> loaiXeCombobox, JLabel maLoaiXe, JTextField maLoaiXeField, JLabel soDienThoai, JTextField soDienThoaiField, JButton suaLoaiXeBtn, JButton suaXeBtn, JTable tableMaLoaiXe, JLabel tenLoaiXe, JTextField tenLoaiXeField, JTextField tenXeMayField, JButton themLoaiXeBtn, JButton themXeBtn, JTextField timKiemXeField, JLabel timKiemXeLbl, JTable xeMayTable, JButton xoaLoaiXeBtn, JButton xoaXeBtn, JPanel jpanel) {
        this.bienSoField = bienSoField;
        this.chuSoHuu = chuSoHuu;
        this.chuSoHuuField = chuSoHuuField;
        this.errorBienSo = errorBienSo;
        this.errorChuSoHuu = errorChuSoHuu;
        this.errorLoaiXe = errorLoaiXe;
        this.errorSoDienThoai = errorSoDienThoai;
        this.errorTenXe = errorTenXe;
        this.lbHoTen = lbHoTen;
        this.lbMaKhachHang = lbMaKhachHang;
        this.loaiXe = loaiXe;
        this.loaiXeCombobox = loaiXeCombobox;
        this.maLoaiXe = maLoaiXe;
        this.maLoaiXeField = maLoaiXeField;
        this.soDienThoai = soDienThoai;
        this.soDienThoaiField = soDienThoaiField;
        this.suaLoaiXeBtn = suaLoaiXeBtn;
        this.suaXeBtn = suaXeBtn;
        this.tableMaLoaiXe = tableMaLoaiXe;
        this.tenLoaiXe = tenLoaiXe;
        this.tenLoaiXeField = tenLoaiXeField;
        this.tenXeMayField = tenXeMayField;
        this.themLoaiXeBtn = themLoaiXeBtn;
        this.themXeBtn = themXeBtn;
        this.timKiemXeField = timKiemXeField;
        this.timKiemXeLbl = timKiemXeLbl;
        this.xeMayTable = xeMayTable;
        this.xoaLoaiXeBtn = xoaLoaiXeBtn;
        this.xoaXeBtn = xoaXeBtn;
        this.jpanel = jpanel;
        tableModelCustom=new TableKhachHangModel();
    }

   public void setView(XeModel xe)
   {
       this.errorTenXe.setVisible(false); 
        this.errorBienSo.setVisible(false);
        this.errorChuSoHuu.setVisible(false); 
        this.errorSoDienThoai.setVisible(false); 
        this.errorLoaiXe.setVisible(false); 
       this.getBienSoField().setText(xe.getBienSo());
       this.getTenXeMayField().setText(xe.getTenXe());
       this.getChuSoHuu().setText(xe.getKhachHang().getHoTen());
       this.getTenLoaiXe().setText(xe.getLoaixe().getTenLoaiXe());
       this.getSoDienThoai().setText(xe.getKhachHang().getSoDienThoai());       
       
   }
   public void setDataToTableModel(List<XeModel> xe)
   {
        DefaultTableModel modelTable = (DefaultTableModel) xeMayTable.getModel();
        modelTable.setRowCount(0);
        List<XeModel> listXe=xeSevice.findAll();
        
        
        modelTable = tableModelCustom.setTableData(listXe, modelTable);
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<>(modelTable);
        xeMayTable.setRowSorter(rowSorter);
        timKiemXeField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                RowFilter<DefaultTableModel, Object> rf = null;
                if (timKiemXeField.getText().trim().isEmpty()) {
                    rowSorter.setRowFilter(null);
                } else {
                    rf = RowFilter.regexFilter(timKiemXeField.getText(), 0);
                    rowSorter.setRowFilter(rf);
                }

            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                RowFilter<DefaultTableModel, Object> rf = null;
                if (timKiemXeField.getText().trim().isEmpty()) {
                    rowSorter.setRowFilter(null);
                } else {
                    rf = RowFilter.regexFilter(timKiemXeField.getText(), 0);
                    rowSorter.setRowFilter(rf);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
       
   }
    
}
