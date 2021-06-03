/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.mapper;

import com.mycompany.applicationmvc.model.LinhKienModel;
import com.mycompany.applicationmvc.model.NhaCungCapModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MinhTo
 */
public class LinhKienMapper implements RowMapper<LinhKienModel>{

    @Override
    public LinhKienModel mapRow(ResultSet rs) {
        try {
            LinhKienModel linhKien=new LinhKienModel();
            NhaCungCapModel nhaCungCap=new NhaCungCapModel();
            linhKien.setId(rs.getInt("id"));
            linhKien.setTenLinhKien(rs.getString("tenlinhkien"));
            linhKien.setSoLuong(rs.getInt("soluong"));
            linhKien.setGia(rs.getDouble("gia"));
            nhaCungCap.setId(rs.getInt("nhacungcap"));
            linhKien.setNhaCungCap(nhaCungCap);
            linhKien.setNgayNhap(rs.getDate("ngaynhap"));
            try {
                linhKien.setSoLuongTrongDonBaoDuong(rs.getInt("ctsl"));
            } catch (SQLException e) {
                linhKien.setSoLuongTrongDonBaoDuong(0);
            }
            return linhKien;
        } catch (SQLException ex) {
            Logger.getLogger(LinhKienMapper.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
    
    
}
