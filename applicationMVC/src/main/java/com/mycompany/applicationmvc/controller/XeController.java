/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.controller;

import com.mycompany.applicationmvc.Utils.TableKhachHangModel;
import com.mycompany.applicationmvc.Utils.TableLoaiXeModel;
import com.mycompany.applicationmvc.Utils.TableModelCustom;
import com.mycompany.applicationmvc.Utils.TableXeModel;
import com.mycompany.applicationmvc.Utils.ValidationRegEx;
import com.mycompany.applicationmvc.dao.IKhachHangDAO;
import com.mycompany.applicationmvc.dao.ILoaiXeDao;
import com.mycompany.applicationmvc.daoImpl.KhachHangDAO;
import com.mycompany.applicationmvc.daoImpl.LoaiXeDAO;
import com.mycompany.applicationmvc.model.KhachHangModel;
import com.mycompany.applicationmvc.model.LoaiXeModel;
import com.mycompany.applicationmvc.model.XeModel;
import com.mycompany.applicationmvc.service.IKhachHangService;
import com.mycompany.applicationmvc.service.ILoaiXeService;
import com.mycompany.applicationmvc.service.IXeService;
import com.mycompany.applicationmvc.serviceImpl.KhachHangService;
import com.mycompany.applicationmvc.serviceImpl.LoaiXeService;
import com.mycompany.applicationmvc.serviceImpl.XeService;
//import com.sun.java_cup.internal.runtime.lr_parser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.text.ParseException;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelListener;
import javax.swing.plaf.IconUIResource;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author MinhTo
 */
public class XeController {

    public static final String errorURL = System.getProperty("user.dir").concat("\\src\\main\\resource\\img\\error_30px.png");
    public static final String iconErrorURL = new File(errorURL).toString();
    public static final String ImportantURL = System.getProperty("user.dir").concat("\\src\\main\\resource\\img\\high_priority_30px.png");
    public static final String iconImportantURL = new File(ImportantURL).toString();
    private javax.swing.JTextField bienSoField;
    private javax.swing.JLabel chuSoHuu;
    private javax.swing.JTextField chuSoHuuField;
    private javax.swing.JLabel errorBienSo;
    private javax.swing.JLabel errorChuSoHuu;
    private javax.swing.JLabel errorLoaiXe;
    private javax.swing.JLabel errorSoDienThoai;
    private javax.swing.JLabel errorTenXe;
    private javax.swing.JLabel errorTenLoaiXe;

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
    private javax.swing.JRadioButton radioNam;
    private javax.swing.JRadioButton radioNu;
    private TableModelCustom tableModelCustom;
    private TableModelCustom tableLoaiXeCustom;

    //service
    private IXeService xeSevice = new XeService();
    private IKhachHangService khachHangService = new KhachHangService();
    private ILoaiXeService loaiXeService = new LoaiXeService();
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

    public XeController(JTextField bienSoField, JLabel chuSoHuu, JTextField chuSoHuuField, JLabel errorBienSo, JLabel errorChuSoHuu, JLabel errorLoaiXe, JLabel errorSoDienThoai, JLabel errorTenXe, JLabel errorTenLoaiXe, JLabel lbHoTen, JLabel lbMaKhachHang, JLabel loaiXe, JComboBox<String> loaiXeCombobox, JLabel maLoaiXe, JTextField maLoaiXeField, JLabel soDienThoai, JTextField soDienThoaiField, JButton suaLoaiXeBtn, JButton suaXeBtn, JTable tableMaLoaiXe, JLabel tenLoaiXe, JTextField tenLoaiXeField, JTextField tenXeMayField, JButton themLoaiXeBtn, JButton themXeBtn, JTextField timKiemXeField, JLabel timKiemXeLbl, JTable xeMayTable, JButton xoaLoaiXeBtn, JButton xoaXeBtn, JRadioButton radioNam, JRadioButton radioNu, JPanel jpanel) {
        this.bienSoField = bienSoField;
        this.chuSoHuu = chuSoHuu;
        this.chuSoHuuField = chuSoHuuField;
        this.errorBienSo = errorBienSo;
        this.errorChuSoHuu = errorChuSoHuu;
        this.errorLoaiXe = errorLoaiXe;
        this.errorSoDienThoai = errorSoDienThoai;
        this.errorTenXe = errorTenXe;
        this.errorTenLoaiXe = errorTenLoaiXe;
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
        this.radioNam = radioNam;
        this.radioNu = radioNu;
        this.jpanel = jpanel;
        this.tableModelCustom = new TableXeModel();
        this.tableLoaiXeCustom = new TableLoaiXeModel();
    }

//   tableModelCustom = new TableXeModel();
//        tableLoaiXeCustom = new TableLoaiXeModel();
    public void setView(XeModel xe) {
        this.errorTenXe.setVisible(false);
        this.errorBienSo.setVisible(false);
        this.errorChuSoHuu.setVisible(false);
        this.errorSoDienThoai.setVisible(false);
        this.errorLoaiXe.setVisible(false);
        this.errorTenLoaiXe.setVisible(false);

        bienSoField.setText(xe.getBienSo());
        tenXeMayField.setText(xe.getTenXe());
        chuSoHuuField.setText(xe.getKhachHang().getHoTen());
        soDienThoaiField.setText(xe.getKhachHang().getSoDienThoai());

        if (xe.getLoaixe() == null) {
            loaiXeCombobox.setSelectedItem("Lo???i xe kh??ng t???n t???i");
        } else {
            loaiXeCombobox.setSelectedItem(xe.getLoaixe().getTenLoaiXe());
        }
        if (xe.getKhachHang().getGioiTinh().equals("Nam")) {
            radioNam.setSelected(true);
        } else {
            radioNu.setSelected(true);

        }
        // disable textfield bi???n s???
        bienSoField.setEnabled(false);
        //kh??ng cho s???a gi???i t??nh trong b???ng xe
        radioNam.setEnabled(false);
        radioNu.setEnabled(false);
        themXeBtn.setText("Kh??i ph???c");
    }

    public void setViewLoaiXe(LoaiXeModel loaiXe) {
        this.maLoaiXeField.setText(Integer.toString(loaiXe.getMaLoaiXe()));
        this.tenLoaiXeField.setText(loaiXe.getTenLoaiXe());
    }

    public void setDataToTableModel() {
        // them du lieu combobox Loai Xe 
        List<LoaiXeModel> listLoaiXeCombobox = loaiXeService.findAll();
        loaiXeCombobox.removeAllItems();
        for (LoaiXeModel loaiXeModel : listLoaiXeCombobox) {
            loaiXeCombobox.addItem(loaiXeModel.getTenLoaiXe());
        }

        DefaultTableModel modelTable = (DefaultTableModel) xeMayTable.getModel();
        modelTable.setRowCount(0);

        //Data Xe may
        List<XeModel> listXe = xeSevice.findAllMultiTable();
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
        // data Bang LoaiXe
        List<LoaiXeModel> listLoaiXe = loaiXeService.findAll();
        DefaultTableModel modelLoaiXeTable = (DefaultTableModel) tableMaLoaiXe.getModel();
        modelLoaiXeTable.setRowCount(0);
        modelLoaiXeTable = tableLoaiXeCustom.setTableData(listLoaiXe, modelLoaiXeTable);

        xeMayTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int colNum = 0;
                DefaultTableModel modelTable = (DefaultTableModel) xeMayTable.getModel();
                colNum = modelTable.getColumnCount();
                int rowSelected = xeMayTable.getSelectedRow();
                XeModel xe = new XeModel();
                xe.setKhachHang(new KhachHangModel());
                xe.setLoaixe(new LoaiXeModel());

                xe.setBienSo(xeMayTable.getValueAt(rowSelected, 0).toString());
                xe.setTenXe(xeMayTable.getValueAt(rowSelected, 1).toString());
                xe.setLoaixe(loaiXeService.findOneByName(xeMayTable.getValueAt(rowSelected, 2).toString()));
                xe.getKhachHang().setHoTen(xeMayTable.getValueAt(rowSelected, 3).toString());
                xe.getKhachHang().setSoDienThoai(xeMayTable.getValueAt(rowSelected, 4).toString());
                xe.getKhachHang().setGioiTinh(xeMayTable.getValueAt(rowSelected, 5).toString());
                setView(xe);

            }

        });
        tableMaLoaiXe.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                DefaultTableModel modelTable = (DefaultTableModel) tableMaLoaiXe.getModel();

                int rowSeleted = tableMaLoaiXe.getSelectedRow();

                LoaiXeModel loaiXeModel = new LoaiXeModel();
                loaiXeModel.setMaLoaiXe(Integer.valueOf(modelTable.getValueAt(rowSeleted, 0).toString()));
                loaiXeModel.setTenLoaiXe(modelTable.getValueAt(rowSeleted, 1).toString());
                setViewLoaiXe(loaiXeModel);

            }
        });
    }

    public void setEvent() {
        //s??? ki???n Xe
        this.errorTenXe.setVisible(false);
        this.errorBienSo.setVisible(false);
        this.errorChuSoHuu.setVisible(false);
        this.errorSoDienThoai.setVisible(false);
        this.errorLoaiXe.setVisible(false);
        this.errorTenLoaiXe.setVisible(false);
        themXeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (themXeBtn.getText().equals("Th??m")) {
                    //ki???m tra th??ng tin r???ng 
                    boolean isEmpty = false;
                    boolean isInvalidFomat = false;
                    if (bienSoField.getText().isEmpty()) {
                        isEmpty = true;
                        ImageIcon img = new ImageIcon(iconImportantURL);
                        //  errorBienSo.setText("");
                        errorBienSo.setIcon(img);
                        errorBienSo.revalidate();
                        errorBienSo.repaint();
                        errorBienSo.setVisible(true);
                    }
                    if (tenXeMayField.getText().isEmpty()) {
                        isEmpty = true;
                        ImageIcon img = new ImageIcon(iconImportantURL);
                        //  errorBienSo.setText("");
                        errorTenXe.setIcon(img);
                        errorTenXe.revalidate();
                        errorTenXe.repaint();
                        errorTenXe.setVisible(true);
                    }
                    if (chuSoHuuField.getText().isEmpty()) {
                        isEmpty = true;
                        ImageIcon img = new ImageIcon(iconImportantURL);
                        //  errorBienSo.setText("");
                        errorChuSoHuu.setIcon(img);
                        errorChuSoHuu.revalidate();
                        errorChuSoHuu.repaint();
                        errorChuSoHuu.setVisible(true);
                    }
                    if (soDienThoaiField.getText().isEmpty()) {
                        isEmpty = true;
                        ImageIcon img = new ImageIcon(iconImportantURL);
                        //  errorBienSo.setText("");
                        errorSoDienThoai.setIcon(img);
                        errorSoDienThoai.revalidate();
                        errorSoDienThoai.repaint();
                        errorSoDienThoai.setVisible(true);
                    }
                    if (loaiXeCombobox.getSelectedItem() == null) {
                        isEmpty = true;
                        ImageIcon img = new ImageIcon(iconImportantURL);
                        //  errorBienSo.setText("");
                        errorLoaiXe.setIcon(img);
                        errorLoaiXe.revalidate();
                        errorLoaiXe.repaint();
                        errorLoaiXe.setVisible(true);
                    }

                    if (isEmpty == true) {
                        JOptionPane.showOptionDialog(jpanel, "Vui l??ng ??i???n ?????y ????? th??ng tin", "Infomation", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
                    } else {
                        //kiem tra dinh dang
                        if (loaiXeService.findOneByName(loaiXeCombobox.getSelectedItem().toString()) == null) {

                            ImageIcon img = new ImageIcon(iconErrorURL);

                            errorLoaiXe.setIcon(img);
                            errorLoaiXe.setToolTipText("Lo???i xe kh??ng t???n t???i");
                            errorLoaiXe.setVisible(true);
                            isInvalidFomat = true;
                        }
                        // so dien thoai
                        if (!ValidationRegEx.validationSDT(soDienThoaiField.getText())) {
                            ImageIcon imgError = new ImageIcon(iconErrorURL);
                            //errorChuSoHuu.setText("");
                            errorSoDienThoai.setIcon(imgError);
                            errorSoDienThoai.revalidate();
                            errorSoDienThoai.repaint();
                            errorSoDienThoai.setVisible(true);
                            isInvalidFomat = true;
                        }
                        //kiem tra dinh dang ten xe
                        if (!ValidationRegEx.validationTextAndNumRegex(tenXeMayField.getText())) {
                            ImageIcon imgError = new ImageIcon(iconErrorURL);

                            errorTenXe.setIcon(imgError);
                            errorTenXe.revalidate();
                            errorTenXe.repaint();
                            errorTenXe.setVisible(true);
                            System.out.println("Sai ?????nh d???ng(Gi???a 2 t??? ch??? c?? 1 kho???ng tr???ng v?? kh??ng ch???a c??c k?? t??? ?????c bi???t");
                            errorTenXe.setToolTipText("* Sai ?????nh d???ng(Gi???a 2 t??? ch??? c?? 1 kho???ng tr???ng v?? kh??ng ch???a c??c k?? t??? ?????c bi???t)");
                            isInvalidFomat = true;
                        } else if (ValidationRegEx.validationTextAndNumRegex(tenXeMayField.getText())) {
                            if (tenXeMayField.getText().length() > 50) {
                                System.out.println("* T??n qu?? d??i(lon hon 50 ki tu) vui l??ng nh???p l???i");
                                errorTenXe.setToolTipText("* T??n qu?? d??i(lon hon 50 ki tu) vui l??ng nh???p l???i");
                                errorTenXe.setVisible(true);
                                isInvalidFomat = true;
                            }

                        }

                        //kiem tra dinh dang chu so huu
                        if (!ValidationRegEx.validationTextRegex(chuSoHuuField.getText())) {
                            ImageIcon imgError = new ImageIcon(iconErrorURL);
                            //errorChuSoHuu.setText("");
                            errorChuSoHuu.setIcon(imgError);
                            errorChuSoHuu.revalidate();
                            errorChuSoHuu.repaint();

                            errorChuSoHuu.setToolTipText("* Sai ?????nh d???ng(Gi???a 2 t??? ch??? c?? 1 kho???ng tr???ng v?? ch??? ch??a c??c ch??? c??i");
                            errorChuSoHuu.setVisible(true);
                            System.out.println("Sai ?????nh d???ng(Gi???a 2 t??? ch??? c?? 1 kho???ng tr???ng v?? ch??? ch??a c??c ch??? c??i");
                            isInvalidFomat = true;
                        } else if (ValidationRegEx.validationTextRegex(chuSoHuuField.getText())) {
                            if (chuSoHuuField.getText().length() >= 25) {
                                System.out.println("* T??n qu?? d??i(lon hon 25 ki tu) vui l??ng nh???p l???i");
                                errorChuSoHuu.setToolTipText("* T??n qu?? d??i(lon hon 25 ki tu) vui l??ng nh???p l???i");
                                ImageIcon imgError = new ImageIcon(iconErrorURL);
                                //errorChuSoHuu.setText("");
                                errorChuSoHuu.setIcon(imgError);
                                errorChuSoHuu.setVisible(true);
                            }
                        }

                        //kiem tra dinh dang BIEN SO
                        if (!ValidationRegEx.validationBienSo(bienSoField.getText())) {
                            ImageIcon imgError = new ImageIcon(iconErrorURL);
                            //errorChuSoHuu.setText("");
                            errorBienSo.setIcon(imgError);
                            errorBienSo.revalidate();
                            errorBienSo.repaint();
                            errorBienSo.setVisible(true);
                            isInvalidFomat = true;
                        }
                        //kiem tra dinh dang LOAI XE
                        System.out.println(loaiXeCombobox.getSelectedItem().toString());
                        if (!ValidationRegEx.validationTextRegex(loaiXeCombobox.getSelectedItem().toString())) {
                            ImageIcon imgError = new ImageIcon(iconErrorURL);
                            //errorChuSoHuu.setText("");
                            errorLoaiXe.setIcon(imgError);
                            errorLoaiXe.revalidate();
                            errorLoaiXe.repaint();
                            errorLoaiXe.setVisible(true);
                            isInvalidFomat = true;
                        }
                        if (isInvalidFomat) {
                            JOptionPane.showMessageDialog(jpanel, "Th??ng tin kh??ng ????ng ??inh d???ng", "L???i ?????nh d???ng", JOptionPane.ERROR_MESSAGE, new ImageIcon(iconErrorURL));
                        }

                    }

                    if (isInvalidFomat != true && isEmpty != true)// ko c?? thu???c t??nh r???ng v?? sai ?????nh d???ng
                    {
                        //them thong tin xe v?? db
                        String bienSo = bienSoField.getText();
                        String tenXemay = tenXeMayField.getText();
                        String chuSoHuu = chuSoHuuField.getText();
                        String soDienThoai = soDienThoaiField.getText();
                        String loaiXe = loaiXeCombobox.getSelectedItem().toString();
                        String gioiTinh = null;
                        if (radioNam.isSelected()) {
                            gioiTinh = radioNam.getText();
                        } else {
                            gioiTinh = radioNu.getText();
                        }
                        //t???o khach hang
                        KhachHangModel khachHang = new KhachHangModel();
                        khachHang = khachHangService.findOneByNameAndSDT(chuSoHuu, soDienThoai);

                        if (khachHang == null) {
                            // JOptionPane.showMessageDialog(jpanel, "Kh??ch h??ng kh??ng t???n t???i ", "Not Found", 0);
                            //them khach hang
                            khachHang = new KhachHangModel();
                            khachHang.setHoTen(chuSoHuu);
                            khachHang.setSoDienThoai(soDienThoai);
                            khachHang.setGioiTinh(gioiTinh);
                            KhachHangModel khachHangNew = khachHangService.save(khachHang);

                            if (khachHangNew == null) {
                                JOptionPane.showMessageDialog(jpanel, "L??u th???t b???i ", "Not Found", 0);
                            } else {
                                // t???o lo???i xe
                                LoaiXeModel loaiXeModel = new LoaiXeModel();
                                loaiXeModel = loaiXeService.findOneByName(loaiXe);
                                //t???o xe;
                                XeModel xe = new XeModel(bienSo, tenXemay, loaiXeModel, khachHangNew);
                                //ki???m tra t???n t???i
                                if (xeSevice.findOne(xe.getBienSo()) == null) {
                                    xe = xeSevice.save(xe);
                                    if (xe != null) {
                                        JOptionPane.showMessageDialog(jpanel, "Th??m xe th??nh c??ng", "L??u", 0);
                                        setDataToTableModel();
                                    } else {
                                        JOptionPane.showMessageDialog(jpanel, "Th??m xe th???t b???i", "L??u", 0);
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(jpanel, "Xe ???? t???n t???i", "Ki???m tra", 0);
                                }
                            }

                        } //kh??ch h??ng ???? t???n t???i
                        else {

                            // t???o lo???i xe
                            LoaiXeModel loaiXeModel = new LoaiXeModel();
                            loaiXeModel = loaiXeService.findOneByName(loaiXe);
                            //t???o xe;
                            XeModel xe = new XeModel(bienSo, tenXemay, loaiXeModel, khachHang);
                            //ki???m tra t???n t???i
                            if (xeSevice.findOne(xe.getBienSo()) == null) {
                                xe = xeSevice.save(xe);
                                if (xe != null) {
                                    JOptionPane.showMessageDialog(jpanel, "Th??m xe th??nh c??ng", "L??u", 0);
                                    setDataToTableModel();
                                } else {
                                    JOptionPane.showMessageDialog(jpanel, "Th??m xe th???t b???i", "L??u", 0);
                                }
                            } else {
                                JOptionPane.showMessageDialog(jpanel, "Xe ???? t???n t???i", "Ki???m tra", 0);
                            }
                        }
                    }
                } else {
                    //reset field
                    bienSoField.setText("");
                    tenXeMayField.setText("");
                    chuSoHuuField.setText("");
                    soDienThoaiField.setText("");
                    loaiXeCombobox.setSelectedIndex(0);
                    themXeBtn.setText("Th??m");
                    bienSoField.setEnabled(true);
                    radioNam.setEnabled(true);

                    radioNu.setEnabled(true);
                    errorTenXe.setVisible(false);
                    errorBienSo.setVisible(false);
                    errorChuSoHuu.setVisible(false);
                    errorSoDienThoai.setVisible(false);
                    errorLoaiXe.setVisible(false);
                    errorTenLoaiXe.setVisible(false);

                }
            }

        }
        );
        suaXeBtn.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e
            ) {
                //ki???m tra th??ng tin r???ng 
                boolean isEmpty = false;
                boolean isInvalidFomat = false;
                if (bienSoField.getText().isEmpty()) {
                    isEmpty = true;
                    ImageIcon img = new ImageIcon(iconImportantURL);
                    //  errorBienSo.setText("");
                    errorBienSo.setIcon(img);
                    errorBienSo.revalidate();
                    errorBienSo.repaint();
                    errorBienSo.setVisible(true);
                }
                if (tenXeMayField.getText().isEmpty()) {
                    isEmpty = true;
                    ImageIcon img = new ImageIcon(iconImportantURL);
                    //  errorBienSo.setText("");
                    errorTenXe.setIcon(img);
                    errorTenXe.revalidate();
                    errorTenXe.repaint();
                    errorTenXe.setVisible(true);
                }
                if (chuSoHuuField.getText().isEmpty()) {
                    isEmpty = true;
                    ImageIcon img = new ImageIcon(iconImportantURL);
                    //  errorBienSo.setText("");
                    errorChuSoHuu.setIcon(img);
                    errorChuSoHuu.revalidate();
                    errorChuSoHuu.repaint();
                    errorChuSoHuu.setVisible(true);
                }
                if (soDienThoaiField.getText().isEmpty()) {
                    isEmpty = true;
                    ImageIcon img = new ImageIcon(iconImportantURL);
                    //  errorBienSo.setText("");
                    errorSoDienThoai.setIcon(img);
                    errorSoDienThoai.revalidate();
                    errorSoDienThoai.repaint();
                    errorSoDienThoai.setVisible(true);
                }
                if (loaiXeCombobox.getSelectedItem() == null) {
                    isEmpty = true;
                    ImageIcon img = new ImageIcon(iconImportantURL);
                    //  errorBienSo.setText("");
                    errorLoaiXe.setIcon(img);
                    errorLoaiXe.revalidate();
                    errorLoaiXe.repaint();
                    errorLoaiXe.setVisible(true);
                }

                if (isEmpty == true) {
                    JOptionPane.showOptionDialog(jpanel, "Vui l??ng ??i???n ?????y ????? th??ng tin", "Infomation", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
                } else {
                    //kiem tra dinh dang
                    if (loaiXeCombobox.getSelectedIndex() == -1) {

                        ImageIcon img = new ImageIcon(iconErrorURL);

                        errorLoaiXe.setIcon(img);
                        errorLoaiXe.setToolTipText("Lo???i xe kh??ng t???n t???i");

                        errorLoaiXe.setVisible(true);
                        isInvalidFomat = true;
                    }
                    //kiem tra so dien thoai
                    if (!ValidationRegEx.validationSDT(soDienThoaiField.getText())) {
                        ImageIcon imgError = new ImageIcon(iconErrorURL);
                        //errorChuSoHuu.setText("");
                        errorSoDienThoai.setIcon(imgError);
                        errorSoDienThoai.revalidate();
                        errorSoDienThoai.repaint();
                        errorSoDienThoai.setVisible(true);
                        isInvalidFomat = true;
                    }
                    //kiem tra dinh dang ten xe
                    if (!ValidationRegEx.validationTextAndNumRegex(tenXeMayField.getText())) {
                        ImageIcon imgError = new ImageIcon(iconErrorURL);
                        //errorChuSoHuu.setText("");
                        errorTenXe.setIcon(imgError);
                        errorTenXe.revalidate();
                        errorTenXe.repaint();
                        errorTenXe.setVisible(true);
                        System.out.println("Sai ?????nh d???ng(Gi???a 2 t??? ch??? c?? 1 kho???ng tr???ng v?? kh??ng ch???a c??c k?? t??? ?????c bi???t");
                        errorTenXe.setToolTipText("* Sai ?????nh d???ng(Gi???a 2 t??? ch??? c?? 1 kho???ng tr???ng v?? kh??ng ch???a c??c k?? t??? ?????c bi???t)");
                        isInvalidFomat = true;
                    } else if (ValidationRegEx.validationTextAndNumRegex(tenXeMayField.getText())) {
                        if (tenXeMayField.getText().length() > 50) {
                            System.out.println("* T??n qu?? d??i(lon hon 50 ki tu) vui l??ng nh???p l???i");
                            errorTenXe.setToolTipText("* T??n qu?? d??i(lon hon 50 ki tu) vui l??ng nh???p l???i");
                            errorTenXe.setVisible(true);
                            isInvalidFomat = true;
                        }

                    }

                    //kiem tra dinh dang chu so huu
                    if (!ValidationRegEx.validationTextRegex(chuSoHuuField.getText())) {
                        ImageIcon imgError = new ImageIcon(iconErrorURL);
                        //errorChuSoHuu.setText("");
                        errorChuSoHuu.setIcon(imgError);
                        errorChuSoHuu.revalidate();
                        errorChuSoHuu.repaint();

                        errorChuSoHuu.setToolTipText("* Sai ?????nh d???ng(Gi???a 2 t??? ch??? c?? 1 kho???ng tr???ng v?? ch??? ch??a c??c ch??? c??i");
                        errorChuSoHuu.setVisible(true);
                        System.out.println("Sai ?????nh d???ng(Gi???a 2 t??? ch??? c?? 1 kho???ng tr???ng v?? ch??? ch??a c??c ch??? c??i");
                        isInvalidFomat = true;
                    } else if (ValidationRegEx.validationTextRegex(chuSoHuuField.getText())) {
                        if (chuSoHuuField.getText().length() >= 25) {
                            System.out.println("* T??n qu?? d??i(lon hon 25 ki tu) vui l??ng nh???p l???i");
                            errorChuSoHuu.setToolTipText("* T??n qu?? d??i(lon hon 25 ki tu) vui l??ng nh???p l???i");
                            errorChuSoHuu.setVisible(true);
                        }
                    }

                    //kiem tra dinh dang BIEN SO
                    if (!ValidationRegEx.validationBienSo(bienSoField.getText())) {
                        ImageIcon imgError = new ImageIcon(iconErrorURL);
                        //errorChuSoHuu.setText("");
                        errorBienSo.setIcon(imgError);
                        errorBienSo.revalidate();
                        errorBienSo.repaint();
                        errorBienSo.setVisible(true);
                        isInvalidFomat = true;
                    }
                    //kiem tra dinh dang LOAI XE
                    System.out.println(loaiXeCombobox.getSelectedItem().toString());
                    if (!ValidationRegEx.validationTextRegex(loaiXeCombobox.getSelectedItem().toString())) {
                        ImageIcon imgError = new ImageIcon(iconErrorURL);
                        //errorChuSoHuu.setText("");
                        errorLoaiXe.setIcon(imgError);
                        errorLoaiXe.revalidate();
                        errorLoaiXe.repaint();
                        errorLoaiXe.setVisible(true);
                        isInvalidFomat = true;
                    }
                    if (isInvalidFomat) {
                        JOptionPane.showMessageDialog(jpanel, "Th??ng tin kh??ng ????ng ??inh d???ng", "L???i ?????nh d???ng", JOptionPane.ERROR_MESSAGE, new ImageIcon(iconErrorURL));
                    }

                }

                if (isInvalidFomat != true && isEmpty != true)// ko c?? thu???c t??nh r???ng v?? sai ?????nh d???ng
                {
                    //them thong tin xe v?? db
                    String bienSo = bienSoField.getText();
                    String tenXemay = tenXeMayField.getText();
                    String chuSoHuu = chuSoHuuField.getText();
                    String soDienThoai = soDienThoaiField.getText();
                    String loaiXe = loaiXeCombobox.getSelectedItem().toString();
                    String gioiTinh = null;
                    if (radioNam.isSelected()) {
                        gioiTinh = radioNam.getText();
                    } else {
                        gioiTinh = radioNu.getText();
                    }
                    //t???o khach hang
                    KhachHangModel khachHang = new KhachHangModel();
                    khachHang = khachHangService.findOneByNameAndSDT(chuSoHuu, soDienThoai);

                    if (khachHang == null) {
                        JOptionPane.showMessageDialog(jpanel, "Kh??ch h??ng kh??ng t???n t???i ", "Not Found", 0);
                        //them khach hang
                        khachHang = new KhachHangModel();
                        khachHang.setHoTen(chuSoHuu);
                        khachHang.setSoDienThoai(soDienThoai);
                        khachHang.setGioiTinh(gioiTinh);
                        KhachHangModel khachHangNew = khachHangService.save(khachHang);
                        if (khachHangNew == null) {
                            JOptionPane.showMessageDialog(jpanel, "C???p nh???t th???t b???i ", "Not Found", 0);
                        } else {
                            // t???o lo???i xe
                            LoaiXeModel loaiXeModel = new LoaiXeModel();
                            loaiXeModel = loaiXeService.findOneByName(loaiXe);
                            //t???o xe;
                            XeModel xe = new XeModel(bienSo, tenXemay, loaiXeModel, khachHangNew);
                            //c???p nh???t xe
                            xe = xeSevice.update(xe);
                            if (xe != null) {
                                JOptionPane.showMessageDialog(jpanel, "C???p nh???t xe th??nh c??ng", "L??u", 0);
                                setDataToTableModel();
                            } else {
                                JOptionPane.showMessageDialog(jpanel, "C???p nh???t xe th???t b???i", "L??u", 0);
                            }

                        }

                    } else {
                        // t???o lo???i xe
                        LoaiXeModel loaiXeModel = new LoaiXeModel();
                        loaiXeModel = loaiXeService.findOneByName(loaiXe);
                        //t???o xe;
                        XeModel xe = new XeModel(bienSo, tenXemay, loaiXeModel, khachHang);
                        //c???p nh???t xe
                        XeModel xeNew = xeSevice.update(xe);
                        if (xeNew != null) {
                            JOptionPane.showMessageDialog(jpanel, "C???p nh???t xe th??nh c??ng", "L??u", 0);
                            setDataToTableModel();
                        } else {
                            JOptionPane.showMessageDialog(jpanel, "C???p nh???t xe th???t b???i", "L??u", 0);
                        }
                    }
                }

            }

        }
        );
        xoaXeBtn.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e
            ) {
                //kiem tra thong tin xe can xoa
                String bienSo = bienSoField.getText();
                if (bienSo.isEmpty()) {
                    JOptionPane.showMessageDialog(jpanel, "Vui l??ng ch???n xe", "Th??ng tin", 0);
                } else {
                    if (xeSevice.findOneInDonBaoDuong(bienSo) == null) {
                        xeSevice.delete(bienSo);
                        JOptionPane.showMessageDialog(jpanel, "Xo?? th??nh c??ng", "Xo??", 0);
                        setDataToTableModel();
                    } else {
                        JOptionPane.showMessageDialog(jpanel, "Xo?? th???t b???i", "Xo??", 0);
                    }

                }
            }
        }
        );
        //kiem tra bien so
        bienSoField.addFocusListener(
                new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e
            ) {
                if (bienSoField.getText().isEmpty()) {    //FIELD EMPTY
                    ImageIcon img = new ImageIcon(iconImportantURL);
                    //  errorBienSo.setText("");
                    errorBienSo.setIcon(img);

                    errorBienSo.revalidate();
                    errorBienSo.repaint();
                    errorBienSo.setVisible(true);
                } else {
                    //INVALID FORMAT
                    System.out.println(ValidationRegEx.validationBienSo(bienSoField.getText()));
                    if (ValidationRegEx.validationBienSo(bienSoField.getText())) {
                        errorBienSo.setVisible(false);
                    } else {
                        ImageIcon img2 = new ImageIcon(iconErrorURL);
                        //errorBienSo.setText("");
                        errorBienSo.setIcon(img2);

                        errorBienSo.revalidate();
                        errorBienSo.repaint();
                        errorBienSo.setVisible(true);
                    }
                }
            }

            @Override
            public void focusGained(FocusEvent e
            ) {
                errorBienSo.setVisible(false);
            }
        }
        );
        // kiem tra ten xe
        tenXeMayField.addFocusListener(
                new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e
            ) {
                if (tenXeMayField.getText().isEmpty()) {    //FIELD EMPTY
                    ImageIcon imgImportane = new ImageIcon(iconImportantURL);
                    //  errorBienSo.setText("");
                    errorTenXe.setIcon(imgImportane);
                    errorTenXe.revalidate();
                    errorTenXe.repaint();
                    errorTenXe.setVisible(true);
                } else {
                    //INVALID FORMAT
                    System.out.println("tenXeMayField.getText() " + tenXeMayField.getText());
                    if (ValidationRegEx.validationTextAndNumRegex(tenXeMayField.getText())) {
                        errorTenXe.setVisible(false);
                    } else {
                        ImageIcon imgError = new ImageIcon(iconErrorURL);
                        //errorTenXe.setText("");
                        errorTenXe.setIcon(imgError);
                        errorTenXe.revalidate();
                        errorTenXe.repaint();
                        errorTenXe.setVisible(true);
                    }
                }
            }

            @Override
            public void focusGained(FocusEvent e
            ) {
                errorTenXe.setVisible(false);
                errorTenXe.setToolTipText(null);
            }
        }
        );
        chuSoHuuField.addFocusListener(
                new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e
            ) {
                if (chuSoHuuField.getText().isEmpty()) {    //FIELD EMPTY
                    ImageIcon imgImportane = new ImageIcon(iconImportantURL);
                    //  errorBienSo.setText("");
                    errorChuSoHuu.setIcon(imgImportane);
                    errorChuSoHuu.revalidate();
                    errorChuSoHuu.repaint();
                    errorChuSoHuu.setVisible(true);
                } else {
                    //INVALID FORMAT
                    System.out.println(ValidationRegEx.validationTextRegex(chuSoHuuField.getText()));
                    if (ValidationRegEx.validationTextRegex(chuSoHuuField.getText())) {
                        errorChuSoHuu.setVisible(false);
                    } else {
                        ImageIcon imgError = new ImageIcon(iconErrorURL);
                        //errorChuSoHuu.setText("");
                        errorChuSoHuu.setIcon(imgError);
                        errorChuSoHuu.revalidate();
                        errorChuSoHuu.repaint();
                        errorChuSoHuu.setVisible(true);
                    }
                }
            }

            @Override
            public void focusGained(FocusEvent e
            ) {
                errorChuSoHuu.setVisible(false);
                errorChuSoHuu.setToolTipText(null);
            }
        }
        );
        soDienThoaiField.addFocusListener(
                new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e
            ) {
                if (soDienThoaiField.getText().isEmpty()) {    //FIELD EMPTY
                    ImageIcon imgImportane = new ImageIcon(iconImportantURL);
                    //  errorBienSo.setText("");
                    errorSoDienThoai.setIcon(imgImportane);
                    errorSoDienThoai.revalidate();
                    errorSoDienThoai.repaint();
                    errorSoDienThoai.setVisible(true);
                } else {
                    //INVALID FORMAT
                    System.out.println(ValidationRegEx.validationBienSo(soDienThoaiField.getText()));
                    if (ValidationRegEx.validationSDT(soDienThoaiField.getText())) {
                        errorSoDienThoai.setVisible(false);
                    } else {
                        ImageIcon imgError = new ImageIcon(iconErrorURL);
                        //errorSoDienThoai.setText("");
                        errorSoDienThoai.setIcon(imgError);
                        errorSoDienThoai.revalidate();
                        errorSoDienThoai.repaint();
                        errorSoDienThoai.setVisible(true);
                    }
                }
            }

            @Override
            public void focusGained(FocusEvent e
            ) {
                errorSoDienThoai.setVisible(false);
            }
        }
        );

        loaiXeCombobox.addFocusListener(
                new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e
            ) {
                if (loaiXeCombobox.getSelectedItem() == null) {    //FIELD EMPTY
                    ImageIcon imgImportane = new ImageIcon(iconImportantURL);
                    //  errorBienSo.setText("");
                    errorLoaiXe.setIcon(imgImportane);
                    errorLoaiXe.revalidate();
                    errorLoaiXe.repaint();
                    errorLoaiXe.setVisible(true);
                } else {
                    //INVALID FORMAT
                    System.out.println(loaiXeCombobox.getSelectedItem().toString());
                    if (ValidationRegEx.validationTextRegex(loaiXeCombobox.getSelectedItem().toString())) {
                        errorLoaiXe.setVisible(false);
                    } else {
                        ImageIcon imgError = new ImageIcon(iconErrorURL);
                        //errorLoaiXe.setText("");
                        errorLoaiXe.setIcon(imgError);
                        errorLoaiXe.revalidate();
                        errorLoaiXe.repaint();
                        errorLoaiXe.setVisible(true);
                    }
                }
            }

            @Override
            public void focusGained(FocusEvent e
            ) {
                errorLoaiXe.setVisible(false);
            }
        }
        );

        // S??? ki???n lo???i xe
        themLoaiXeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isEmpty = false;
                boolean isInvalidFomat = false;
                if (tenLoaiXeField.getText().isEmpty()) {
                    isEmpty = true;
                    ImageIcon img = new ImageIcon(iconImportantURL);
                    //  errorBienSo.setText("");
                    errorTenLoaiXe.setIcon(img);
                    errorTenLoaiXe.revalidate();
                    errorTenLoaiXe.repaint();
                    errorTenLoaiXe.setVisible(true);
                } else {
                    if (!ValidationRegEx.validationTextRegex(tenLoaiXeField.getText())) {
                        ImageIcon imgError = new ImageIcon(iconErrorURL);

                        errorTenLoaiXe.setIcon(imgError);
                        errorTenLoaiXe.revalidate();
                        errorTenLoaiXe.repaint();
                        errorTenLoaiXe.setVisible(true);
                        System.out.println("Sai ?????nh d???ng(Gi???a 2 t??? ch??? c?? 1 kho???ng tr???ng v?? kh??ng ch???a c??c k?? t??? ?????c bi???t");
                        errorTenLoaiXe.setToolTipText("* Sai ?????nh d???ng(Gi???a 2 t??? ch??? c?? 1 kho???ng tr???ng v?? kh??ng ch???a c??c k?? t??? ?????c bi???t)");
                        isInvalidFomat = true;
                    } else if (ValidationRegEx.validationTextRegex(tenLoaiXeField.getText())) {
                        if (tenLoaiXeField.getText().length() > 50) {
                            System.out.println("* T??n qu?? d??i(lon hon 50 ki tu) vui l??ng nh???p l???i");
                            errorTenLoaiXe.setToolTipText("* T??n qu?? d??i(lon hon 50 ki tu) vui l??ng nh???p l???i");
                            errorTenLoaiXe.setVisible(true);
                            isInvalidFomat = true;
                        }

                    }
                }

                if (isEmpty == false && isInvalidFomat == false) {
                    String loaiXe = tenLoaiXeField.getText();
                    LoaiXeModel loaiXeModel = new LoaiXeModel();

                    loaiXeModel = loaiXeService.findOneByName(loaiXe);

                    if (loaiXeModel == null) {
                        loaiXeModel = new LoaiXeModel();
                        loaiXeModel.setTenLoaiXe(loaiXe);
                        loaiXeModel = loaiXeService.save(loaiXeModel);
                        if (loaiXeModel != null) {
                            JOptionPane.showMessageDialog(jpanel, "Th??m lo???i xe th??nh c??ng", "?????ng ??", 0);
                            setDataToTableModel();
                        } else {
                            JOptionPane.showMessageDialog(jpanel, "Th??m lo???i xe th???t b???i", "?????ng ??", 0);
                        }
                    } else {
                        JOptionPane.showMessageDialog(jpanel, "Th??m lo???i xe th???t b???i", "?????ng ??", 0);
                    }
                } else {
                    JOptionPane.showMessageDialog(jpanel, "Th??m lo???i xe th???t b???i", "?????ng ??", 0);
                }
            }
        });
        suaLoaiXeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isEmpty = false;
                boolean isInvalidFomat = false;
                if (tenLoaiXeField.getText().isEmpty()) {
                    isEmpty = true;
                    ImageIcon img = new ImageIcon(iconImportantURL);
                    //  errorBienSo.setText("");
                    errorTenLoaiXe.setIcon(img);
                    errorTenLoaiXe.revalidate();
                    errorTenLoaiXe.repaint();
                    errorTenLoaiXe.setVisible(true);
                } else {
                    if (!ValidationRegEx.validationTextRegex(tenLoaiXeField.getText())) {
                        ImageIcon imgError = new ImageIcon(iconErrorURL);
                        errorTenLoaiXe.setIcon(imgError);
                        errorTenLoaiXe.revalidate();
                        errorTenLoaiXe.repaint();
                        errorTenLoaiXe.setVisible(true);
                        System.out.println("Sai ?????nh d???ng(Gi???a 2 t??? ch??? c?? 1 kho???ng tr???ng v?? kh??ng ch???a c??c k?? t??? ?????c bi???t");
                        errorTenLoaiXe.setToolTipText("* Sai ?????nh d???ng(Gi???a 2 t??? ch??? c?? 1 kho???ng tr???ng v?? kh??ng ch???a c??c k?? t??? ?????c bi???t)");
                        isInvalidFomat = true;
                    } else if (ValidationRegEx.validationTextRegex(tenLoaiXeField.getText())) {
                        if (tenLoaiXeField.getText().length() > 50) {
                            System.out.println("* T??n qu?? d??i(lon hon 50 ki tu) vui l??ng nh???p l???i");
                            errorTenLoaiXe.setToolTipText("* T??n qu?? d??i(lon hon 50 ki tu) vui l??ng nh???p l???i");
                            errorTenLoaiXe.setVisible(true);
                            isInvalidFomat = true;
                        }
                    }
                }
                //th???c hi???n s???a lo???i xe 
                if (isEmpty == false && isInvalidFomat == false) {
                    //l???y ra id lo???i xe
                    String idLoaiXe = maLoaiXeField.getText();
                    try {
                        int idLoaiXeInt = Integer.parseInt(idLoaiXe);
                        String loaiXe = tenLoaiXeField.getText();
                        LoaiXeModel loaiXeModel = new LoaiXeModel();
                        loaiXeModel = loaiXeService.findOneByCode(idLoaiXeInt);

                        if (loaiXeModel != null && !loaiXeModel.getTenLoaiXe().equals(loaiXe)) { //xe ph???i c?? trong db v?? kh??ng c?? t??n lo???i xe trung
                            if (loaiXeService.findOneByName(loaiXe) == null) //ki???m tra t??n loai xe
                            {
                                loaiXeModel = new LoaiXeModel();
                                loaiXeModel.setTenLoaiXe(loaiXe);
                                loaiXeModel.setMaLoaiXe(idLoaiXeInt);
                                loaiXeModel = loaiXeService.update(loaiXeModel);
                                if (loaiXeModel != null) {
                                    JOptionPane.showMessageDialog(jpanel, "S???a lo???i xe th??nh c??ng", "?????ng ??", 0);
                                    setDataToTableModel();
                                } else {
                                    JOptionPane.showMessageDialog(jpanel, "S???a lo???i xe th???t b???i", "?????ng ??", 0);
                                }
                            } else {
                                JOptionPane.showMessageDialog(jpanel, "S???a lo???i xe th???t b???i", "?????ng ??", 0);
                            }
                        } else {
                            JOptionPane.showMessageDialog(jpanel, "S???a lo???i xe th???t b???i", "?????ng ??", 0);
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(jpanel, "S???a lo???i xe th???t b???i", "?????ng ??", 0);
                    }

                } else {
                    JOptionPane.showMessageDialog(jpanel, "S???a lo???i xe th???t b???i", "?????ng ??", 0);
                }
            }

        });
        //xo?? lo???i xe
        xoaLoaiXeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!maLoaiXeField.getText().isEmpty()) {
                    int maLoaiXe = Integer.parseInt(maLoaiXeField.getText());
                    if (loaiXeService.findOneInXe(maLoaiXe) == null) {
                        String op[] = {"Hu???", "?????ng ??"};
                        int value = JOptionPane.showOptionDialog(jpanel, "B???n ch???c ch???n mu???n xo??", "Xo?? loai xe", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, op, op[0]);
                        if (value == 1) {
                            loaiXeService.deleteStatus(maLoaiXe);
                            JOptionPane.showMessageDialog(jpanel, "Xo?? th??nh c??ng", "Th??ng tin", JOptionPane.INFORMATION_MESSAGE);
                            setDataToTableModel();
                        } else {
                            JOptionPane.showMessageDialog(jpanel, "Xo?? th???t b???i", "Th??ng tin", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(jpanel, "Xo?? th???t b???i(C?? xe thu???c lo???i xe n??y)", "Th??ng tin", JOptionPane.INFORMATION_MESSAGE);
                    }

                }

            }
        });
        tenLoaiXeField.addFocusListener(
                new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e
            ) {
                if (tenLoaiXeField.getText().isEmpty()) {    //FIELD EMPTY
                    ImageIcon imgImportane = new ImageIcon(iconImportantURL);
                    //  errorBienSo.setText("");
                    errorTenLoaiXe.setIcon(imgImportane);
                    errorTenLoaiXe.revalidate();
                    errorTenLoaiXe.repaint();
                    errorTenLoaiXe.setVisible(true);
                } else {
                    //INVALID FORMAT

                    if (ValidationRegEx.validationTextRegex(tenLoaiXeField.getText())) {
                        errorTenLoaiXe.setVisible(false);
                    } else {
                        ImageIcon imgError = new ImageIcon(iconErrorURL);
                        //errorTenLoaiXe.setText("");
                        errorTenLoaiXe.setIcon(imgError);
                        errorTenLoaiXe.revalidate();
                        errorTenLoaiXe.repaint();
                        errorTenLoaiXe.setVisible(true);
                    }
                }
            }

            @Override
            public void focusGained(FocusEvent e
            ) {
                errorTenLoaiXe.setVisible(false);
                errorTenLoaiXe.setToolTipText(null);
            }
        }
        );
    }

    public void setDataToCombobox() {
        List<LoaiXeModel> listLoaiXe = loaiXeService.findAll();
        DefaultComboBoxModel model = (DefaultComboBoxModel) loaiXeCombobox.getModel();
        model.removeAllElements();
        for (LoaiXeModel loaiXeModel : listLoaiXe) {
            model.addElement(loaiXeModel.getTenLoaiXe());
        }
        model.setSelectedItem(null);
    }

}
