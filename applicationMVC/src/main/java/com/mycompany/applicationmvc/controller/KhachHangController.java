/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.controller;

import com.mycompany.applicationmvc.Utils.FomaterDate;
import com.mycompany.applicationmvc.Utils.TableKhachHangModel;
import com.mycompany.applicationmvc.Utils.TableModelCustom;
import com.mycompany.applicationmvc.Utils.ValidationRegEx;
import com.mycompany.applicationmvc.model.KhachHangModel;
import com.mycompany.applicationmvc.service.IKhachHangService;
import com.mycompany.applicationmvc.serviceImpl.KhachHangService;

import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Date;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.DefaultButtonModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import jdk.nashorn.internal.scripts.JO;
import sun.net.www.content.image.gif;

/**
 *
 * @author MinhTo
 */
public class KhachHangController {

    //button
    private javax.swing.JButton suaBtn;
    private javax.swing.JButton themBtn;
    private javax.swing.JButton xoaBtn;
    private javax.swing.ButtonGroup buttonGroup;
    //textField
    private javax.swing.JTextField maKHField;
    private javax.swing.JTextField hoTenField;

    private javax.swing.JTextField soCMTField;
    private javax.swing.JRadioButton radioNam;
    private javax.swing.JRadioButton radioNu;
    private com.toedter.calendar.JDateChooser ngaySinhJchooseDateField;
    private javax.swing.JTextField soDienThoaiField;
    //textField Search
    private javax.swing.JTextField timkiemSDTField;
    //label
    private javax.swing.JLabel errorCMND;
    private javax.swing.JLabel errorGioiTinh;
    private javax.swing.JLabel errorHoVaTen;

    private javax.swing.JLabel errorNgaySinh;
    private javax.swing.JLabel errorSoDienThoai;

    //table
    private javax.swing.JTable tableKhachHang;
    private TableModelCustom tableModelCustom;

    //service
    private IKhachHangService khachHangService;
    // view
    private JPanel panel;

    public KhachHangController(JButton suaBtn, JButton themBtn, JButton xoaBtn, ButtonGroup buttonGroup, JTextField maKHField, JTextField hoTenField, JTextField soCMTField, JRadioButton radioNam, JRadioButton radioNu, JDateChooser ngaySinhJchooseDateField, JTextField soDienThoaiField, JTextField timkiemSDTField, JLabel errorCMND, JLabel errorGioiTinh, JLabel errorHoVaTen, JLabel errorNgaySinh, JLabel errorSoDienThoai, JTable tableKhachHang, JPanel panel) {
        this.suaBtn = suaBtn;
        this.themBtn = themBtn;
        this.xoaBtn = xoaBtn;
        this.buttonGroup = buttonGroup;
        this.maKHField = maKHField;
        this.hoTenField = hoTenField;
        this.soCMTField = soCMTField;
        this.radioNam = radioNam;
        this.radioNu = radioNu;
        this.ngaySinhJchooseDateField = ngaySinhJchooseDateField;
        this.soDienThoaiField = soDienThoaiField;
        this.timkiemSDTField = timkiemSDTField;
        this.errorCMND = errorCMND;
        this.errorGioiTinh = errorGioiTinh;
        this.errorHoVaTen = errorHoVaTen;

        this.errorNgaySinh = errorNgaySinh;
        this.errorSoDienThoai = errorSoDienThoai;
        this.tableKhachHang = tableKhachHang;
        this.panel = panel;
        this.khachHangService = new KhachHangService();
        this.tableModelCustom = new TableKhachHangModel();
    }

    public void setView(KhachHangModel khachHang) {
        this.errorSoDienThoai.setVisible(false);
        this.errorCMND.setVisible(false);
        this.errorHoVaTen.setVisible(false);
        this.errorNgaySinh.setVisible(false);
        this.errorGioiTinh.setVisible(false);

        maKHField.setText(String.valueOf(khachHang.getMaKH()));
        hoTenField.setText(khachHang.getHoTen());
        soCMTField.setText(khachHang.getSoCMT());
        if (khachHang.getGioiTinh().equals("Nam")) {
            radioNam.setSelected(true);
        } else {
            radioNu.setSelected(true);
        }
        ngaySinhJchooseDateField.setDate(khachHang.getNgaySinh());
        soDienThoaiField.setText(khachHang.getSoDienThoai());
        timkiemSDTField.setText("");

    }

    public void setEvent() {

        this.errorSoDienThoai.setVisible(false);
        this.errorCMND.setVisible(false);
        this.errorHoVaTen.setVisible(false);
        this.errorNgaySinh.setVisible(false);
        this.errorGioiTinh.setVisible(false);

        tableKhachHang.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //To change body of generated methods, choose Tools | Templates.
                DefaultTableModel modelTable = (DefaultTableModel) tableKhachHang.getModel();
                int indexSelectedRow = tableKhachHang.getSelectedRow();
                int countCollum = tableKhachHang.getColumnCount();

                KhachHangModel khachHang = new KhachHangModel();
                khachHang.setMaKH((int) modelTable.getValueAt(indexSelectedRow, 0));
                khachHang.setHoTen(modelTable.getValueAt(indexSelectedRow, 1).toString());
                khachHang.setSoCMT(modelTable.getValueAt(indexSelectedRow, 2).toString());

                if (modelTable.getValueAt(indexSelectedRow, 3) != null) {
                    String ngaySinh = modelTable.getValueAt(indexSelectedRow, 3).toString(); //sql Date YYYY-MM-DD

                    {
                        khachHang.setNgaySinh(FomaterDate.convertStringToDate(ngaySinh));// to util.date
                    }
                }
                khachHang.setGioiTinh(modelTable.getValueAt(indexSelectedRow, 4).toString());
                khachHang.setSoDienThoai(modelTable.getValueAt(indexSelectedRow, 5).toString());
                setView(khachHang);
            }

        });
        hoTenField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                errorHoVaTen.setVisible(false);
            }

            @Override
            public void focusLost(FocusEvent e) {
                ///kiểm tra value
                if (hoTenField.getText().isEmpty()) {
                    errorHoVaTen.setText("* Vui lòng nhập trường này");
                    errorHoVaTen.setVisible(true);
                } else {
                    errorHoVaTen.setVisible(false);
                }
            }
        });
        soCMTField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                errorCMND.setVisible(false);
            }

            @Override
            public void focusLost(FocusEvent e) {
                ///kiểm tra value
                if (!soCMTField.getText().isEmpty()) {
                    if (ValidationRegEx.validationCMND(soCMTField.getText())) {
                        errorCMND.setVisible(false);
                    } else {
                        errorCMND.setText("Không đúng định dạng vui lòng thử lại");
                        errorCMND.setVisible(true);
                    }
                }
            }
        });
//        soCMTField.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseExited(MouseEvent e) {
//                System.out.println("fired");
//                if (soCMTField.getText().isEmpty()) {
//                    errorCMND.setText("* Vui lòng nhập trường này");
//                    errorCMND.setVisible(true);
//                } else {
//                    if (ValidationRegEx.validationCMND(soCMTField.getText())) {
//                        errorCMND.setVisible(false);
//                    } else {
//
//                        errorCMND.setText("Không đúng định dạng vui lòng thử lại");
//                        errorCMND.setVisible(true);
//                    }
//                } //To change body of generated methods, choose Tools | Templates.
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                errorCMND.setVisible(false); //To change body of generated methods, choose Tools | Templates.
//            }
//
//        });
        radioNam.addFocusListener(new FocusListener() {
            @Override

            public void focusGained(FocusEvent e) {
                errorGioiTinh.setVisible(false);
            }

            @Override
            public void focusLost(FocusEvent e) {
                ///kiểm tra value
                if (radioNam.isSelected()) {
                    errorGioiTinh.setVisible(false);
                } else if (radioNu.isSelected()) {
                    errorGioiTinh.setVisible(false);
                } else {
                    errorGioiTinh.setText("* Vui lòng nhập trường này");
                    errorGioiTinh.setVisible(true);
                }
            }
        });
        radioNu.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                errorGioiTinh.setVisible(false);
            }

            @Override
            public void focusLost(FocusEvent e) {
                ///kiểm tra value
                if (radioNu.isSelected()) {
                    errorGioiTinh.setVisible(false);
                } else if (radioNam.isSelected()) {
                    errorGioiTinh.setVisible(false);
                } else {
                    //errorGioiTinh.setText("* Vui lòng nhập trường này");
                    errorGioiTinh.setVisible(true);
                }
            }
        });
        //ngaySinhJchooseDateField.getDateEditor().setEnabled(false);
        ngaySinhJchooseDateField.getDateEditor().addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {

                if (ngaySinhJchooseDateField.getDate() != null) {
                    errorNgaySinh.setVisible(false);
                    System.out.println(" value " + ngaySinhJchooseDateField.getDate().toString());

                }

            }
        });

        soDienThoaiField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                errorSoDienThoai.setVisible(false);

            }

            @Override
            public void focusLost(FocusEvent e) {
                ///kiểm tra value
                if (!soDienThoaiField.getText().isEmpty()) {
                    boolean isValid = ValidationRegEx.validationSDT(soDienThoaiField.getText());
                    if (isValid) {
                        errorSoDienThoai.setVisible(false);
                    } else {
                        errorSoDienThoai.setText("*Không đúng định dạng vui lòng nhập lại");
                        errorSoDienThoai.setVisible(true);

                    }
                } else {
                    errorSoDienThoai.setText("* Vui lòng nhập trường này");
                    errorSoDienThoai.setVisible(true);
                }
            }

        });
//        soDienThoaiField.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseExited(MouseEvent e) {
//                if (!soDienThoaiField.getText().isEmpty()) {
//                    boolean isValid = ValidationRegEx.validationSDT(soDienThoaiField.getText());
//                    if (isValid) {
//                        errorSoDienThoai.setVisible(false);
//                    } else {
//                        errorSoDienThoai.setText("*Không đúng định dạng vui lòng nhập lại");
//                        errorSoDienThoai.setVisible(true);
//
//                    }
//                } else {
//                    errorSoDienThoai.setText("* Vui lòng nhập trường này");
//                    errorSoDienThoai.setVisible(true);
//                }//To change body of generated methods, choose Tools | Templates.
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                errorSoDienThoai.setVisible(false);//To change body of generated methods, choose Tools | Templates.
//            }
//
//        });
        themBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // KIỂM TRA RỖNG 
                boolean isValid = false;
                boolean hasFieldEmpty = false;
                boolean isNotFormated = false;
                if (hoTenField.getText().isEmpty()) {
                    errorHoVaTen.setText("* Vui lòng nhập trường này");
                    errorHoVaTen.setVisible(true);
                    hasFieldEmpty = true;
                }
                if (soCMTField.getText().isEmpty()) {
                    errorCMND.setText("* Vui lòng nhập trường này");
                    errorCMND.setVisible(true);
                    hasFieldEmpty = true;
                }
                if (radioNam.getText().isEmpty() && radioNu.getText().isEmpty()) {
                    errorGioiTinh.setText("* Vui lòng nhập trường này");
                    errorGioiTinh.setVisible(true);
                    hasFieldEmpty = true;
                }
                if (soDienThoaiField.getText().isEmpty()) {
                    errorSoDienThoai.setText("* Vui lòng nhập trường này");
                    errorSoDienThoai.setVisible(true);
                    hasFieldEmpty = true;
                }
                //neu có thuộc tính rỗng
                if (hasFieldEmpty == true) {
                    JOptionPane.showOptionDialog(panel, "Vui lòng điền đầy đủ thông tin", "Infomation", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
                    isValid = false;
                } // không có thuoc tính rỗng kiểm tra định dạng
                else {
                    if (!ValidationRegEx.validationSDT(soDienThoaiField.getText())) {
                        errorSoDienThoai.setText("*Không đúng định dạng vui lòng nhập lại");
                        errorSoDienThoai.setVisible(true);
                        isNotFormated = true;
                    }

                    if (!ValidationRegEx.validationCMND(soCMTField.getText())) {
                        errorCMND.setText("Không đúng định dạng vui lòng thử lại");
                        errorCMND.setVisible(true);
                        isNotFormated = true;
                    }
                    if (isNotFormated == true) {
                        JOptionPane.showOptionDialog(panel, "Thông tin sai định dạng", "Infomation", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
                    }
                }

                if (isNotFormated != true && hasFieldEmpty != true) {
                    String hoTen = hoTenField.getText();
                    String soCMND = soCMTField.getText();
                    String gioiTinh = null;
                    if (radioNam.isSelected()) {
                        gioiTinh = radioNam.getText();
                    } else {
                        gioiTinh = radioNu.getText();
                    }

                    java.util.Date ngaySinh = new java.util.Date();
                    ngaySinh = ngaySinhJchooseDateField.getDate();
                    String soDienThoai = null;
                    soDienThoai = soDienThoaiField.getText();
                    //khoi tạo đối tượng
                    KhachHangModel khachHang = new KhachHangModel(0, hoTen, soCMND, gioiTinh, ngaySinh, soDienThoai);
                    // Kiểm tra số chứng minh
                    if (khachHangService.findOneByCMND(soCMND) != null) {
                        KhachHangModel newKhachHang = khachHangService.save(khachHang);
                        if (newKhachHang != null) {
                            JOptionPane.showMessageDialog(panel, "Lưu thành công", "Thông báo", 0, null);
                            //showOptionDialog(panel, "Thông tin sai định dạng", "Infomation", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
                        }
                    }
                    else{
                          JOptionPane.showMessageDialog(panel, "Thông tin thêm vào bị trùng số CMND ", "Thông báo", 0, null);
                    }

                }

            }
        });
        xoaBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Kiểm tra mã khách hàng

                String idKhachHang = maKHField.getText();
                if (!idKhachHang.isEmpty()) {

                    String message[] = {"Mã khách hàng: " + maKHField.getText(),
                        "Họ và tên: " + hoTenField.getText(),
                        "Số điện thoại: " + soDienThoaiField.getText()
                    };
                    String op[] = {"Chờ anh", "Em đồng ý"};
                    int reply = JOptionPane.showOptionDialog(panel, message, "Xoá khách hàng", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, op, op[0]);
                    if (reply == 1) {
                        //xoá
                        System.out.println("Xoa");
                        khachHangService.delete(Integer.parseInt(idKhachHang));
                        JOptionPane.showMessageDialog(panel, "Xoá thành công", "Thông báo", 1, null);
                    }

                } else {

                }
            }
        });
        suaBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // KIỂM TRA RỖNG 
                boolean isValid = false;
                boolean hasFieldEmpty = false;
                boolean isNotFormated = false;
                if (hoTenField.getText().isEmpty()) {
                    errorHoVaTen.setText("* Vui lòng nhập trường này");
                    errorHoVaTen.setVisible(true);
                    hasFieldEmpty = true;
                }
                if (soCMTField.getText().isEmpty()) {
                    errorCMND.setText("* Vui lòng nhập trường này");
                    errorCMND.setVisible(true);
                    hasFieldEmpty = true;
                }
                if (radioNam.getText().isEmpty() && radioNu.getText().isEmpty()) {
                    errorGioiTinh.setText("* Vui lòng nhập trường này");
                    errorGioiTinh.setVisible(true);
                    hasFieldEmpty = true;
                }
                if (soDienThoaiField.getText().isEmpty()) {
                    errorSoDienThoai.setText("* Vui lòng nhập trường này");
                    errorSoDienThoai.setVisible(true);
                    hasFieldEmpty = true;
                }
                //neu có thuộc tính rỗng
                if (hasFieldEmpty == true) {
                    JOptionPane.showMessageDialog(panel, "Vui lòng điền đầy đủ thông tin", "Infomation", JOptionPane.INFORMATION_MESSAGE, null);
                    isValid = false;
                } // không có thuoc tính rỗng kiểm tra định dạng
                else {
                    if (!ValidationRegEx.validationSDT(soDienThoaiField.getText())) {
                        errorSoDienThoai.setText("*Không đúng định dạng vui lòng nhập lại");
                        errorSoDienThoai.setVisible(true);
                        isNotFormated = true;
                    }
                    if (!ValidationRegEx.validationCMND(soCMTField.getText())) {
                        errorCMND.setText("Không đúng định dạng vui lòng thử lại");
                        errorCMND.setVisible(true);
                        isNotFormated = true;
                    }
                    if (isNotFormated == true) {
                        JOptionPane.showMessageDialog(panel, "Thông tin sai định dạng", "Infomation", 0, null);
                    }
                }

                if (isNotFormated != true && hasFieldEmpty != true) {
                    int id = 0;
                    if (!maKHField.getText().isEmpty()) {
                        id = Integer.parseInt(maKHField.getText());
                    }

                    String hoTen = hoTenField.getText();
                    String soCMND = soCMTField.getText();
                    String gioiTinh = null;
                    if (radioNam.isSelected()) {
                        gioiTinh = radioNam.getText();
                    } else {
                        gioiTinh = radioNu.getText();
                    }

                    java.util.Date ngaySinh = new java.util.Date();
                    ngaySinh = ngaySinhJchooseDateField.getDate();
                    String soDienThoai = null;
                    soDienThoai = soDienThoaiField.getText();
                    //khoi tạo đối tượng
                    KhachHangModel khachHang = new KhachHangModel(id, hoTen, soCMND, gioiTinh, ngaySinh, soDienThoai);
                    KhachHangModel newKhachHang = khachHangService.update(khachHang);
                    if (newKhachHang != null) {
                        JOptionPane.showMessageDialog(panel, "Sữa thành công", "Thông báo", 0, null);
                        //showOptionDialog(panel, "Thông tin sai định dạng", "Infomation", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
                    }
                }

            }

        });

        //    hoTenField.addKeyListener(l);
    }

    public void setDataToTable() {
        DefaultTableModel modelTable = (DefaultTableModel) tableKhachHang.getModel();
        modelTable.setRowCount(0);
        List<KhachHangModel> listKhachHang = khachHangService.findAll();
        modelTable = tableModelCustom.setTableData(listKhachHang, modelTable);
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<>(modelTable);
        tableKhachHang.setRowSorter(rowSorter);
        timkiemSDTField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                RowFilter<DefaultTableModel, Object> rf = null;
                if (timkiemSDTField.getText().trim().isEmpty()) {
                    rowSorter.setRowFilter(null);
                } else {
                    rf = RowFilter.regexFilter(timkiemSDTField.getText(), 0);
                    rowSorter.setRowFilter(rf);
                }

            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                RowFilter<DefaultTableModel, Object> rf = null;
                if (timkiemSDTField.getText().trim().isEmpty()) {
                    rowSorter.setRowFilter(null);
                } else {
                    rf = RowFilter.regexFilter(timkiemSDTField.getText(), 0);
                    rowSorter.setRowFilter(rf);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    private java.sql.Date covertDateToDateSql(java.util.Date dateChooserDate) {

        return new Date(dateChooserDate.getTime());

    }

}
