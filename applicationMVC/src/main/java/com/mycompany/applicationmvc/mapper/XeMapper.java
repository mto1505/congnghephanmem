/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.mapper;

import com.mycompany.applicationmvc.model.KhachHangModel;
import com.mycompany.applicationmvc.model.XeModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MinhTo
 */
public class XeMapper implements RowMapper<XeModel> {

    @Override
    public XeModel mapRow(ResultSet rs) {
        try {
            XeModel Xe = new XeModel();
            Xe.setBienSo(rs.getString("bienso"));
            Xe.setTenXe(rs.getString("tenxe"));
             Xe.getKhachHang().setHoTen(rs.getString("ten"));
             Xe.getKhachHang().setSoDienThoai(rs.getString("sdt"));
            Xe.getLoaixe().setTenLoaiXe(rs.getString("tenloai"));
            return Xe;
        } catch (SQLException ex) {
            Logger.getLogger(XeMapper.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

}
