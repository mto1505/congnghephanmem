/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.daoImpl;

import com.mycompany.applicationmvc.dao.ILinhKienDAO;
import com.mycompany.applicationmvc.mapper.LinhKienMapper;
import com.mycompany.applicationmvc.mapper.RowMapper;
import com.mycompany.applicationmvc.model.LinhKienModel;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MinhTo
 */
public class LinhKienDAO extends AbstractDAO<LinhKienModel> implements ILinhKienDAO {

    @Override
    public void update(LinhKienModel linhKien) {
        String sql = "update LinhKien set tenlinhkien=?,soluong=?,gia=?,nhacungcap=? where id=? and ngaynhap=?";
        update(sql, linhKien.getTenLinhKien(), linhKien.getSoLuong(), linhKien.getGia(), linhKien.getNhaCungCap().getId(), linhKien.getId(), linhKien.getNgayNhapString());
    }

    @Override
    public void delete(int id) {
        String sql = "delete from LinhKien where id=?";
        update(sql, id);
    }

    @Override
    public int insert(LinhKienModel linhKien) {
        String sql = "insert into LinhKien (tenlinhkien,soluong,gia,nhacungcap,ngaynhap) values(?,?,?,?,?)";

        if (linhKien.getNgayNhapString() != null) {
            return insert(sql, linhKien.getTenLinhKien(), linhKien.getSoLuong(), linhKien.getGia(), linhKien.getNhaCungCap().getId(), linhKien.getNgayNhapString());
        }

        return insert(sql, linhKien.getTenLinhKien(), linhKien.getSoLuong(), linhKien.getGia(), linhKien.getNhaCungCap().getId(), linhKien.getNgayNhapString());
    }

    @Override
    public int insert(LinhKienModel linhKien, boolean autoId) {
        if (autoId == false) {
            String sql = " set Identity_insert LinhKien On insert into LinhKien (id,tenlinhkien,soluong,gia,nhacungcap,ngaynhap) values(?,?,?,?,?,?)";

            if (linhKien.getNgayNhapString() != null) {
                return insert(sql, linhKien.getId(), linhKien.getTenLinhKien(), linhKien.getSoLuong(), linhKien.getGia(), linhKien.getNhaCungCap().getId(), linhKien.getNgayNhapString());
            }

            return insert(sql, linhKien.getId(), linhKien.getTenLinhKien(), linhKien.getSoLuong(), linhKien.getGia(), linhKien.getNhaCungCap().getId(), linhKien.getNgayNhapString());
        } else {
            String sql = "insert into LinhKien (tenlinhkien,soluong,gia,nhacungcap,ngaynhap) values(?,?,?,?,?)";

            if (linhKien.getNgayNhapString() != null) {
                return insert(sql, linhKien.getTenLinhKien(), linhKien.getSoLuong(), linhKien.getGia(), linhKien.getNhaCungCap().getId(), linhKien.getNgayNhapString());
            }

            return insert(sql, linhKien.getTenLinhKien(), linhKien.getSoLuong(), linhKien.getGia(), linhKien.getNhaCungCap().getId(), linhKien.getNgayNhapString());
        }
    }

    @Override
    public List<LinhKienModel> findAll() {
        String sql = "select  * from LinhKien  where trangthai=0";
        return query(sql, new LinhKienMapper());
    }

    @Override
    public LinhKienModel findOne(int id) {
        String sql = "select  * from LinhKien where id=?  and trangthai=0";
        List<LinhKienModel> listLinhKien = query(sql, new LinhKienMapper(), id);
        return listLinhKien.isEmpty() ? null : listLinhKien.get(0);
    }

    @Override
    public LinhKienModel findOneByName(String ten) {
        String sql = "select  * from LinhKien where tenlinhkien=? where trangthai=0";
        List<LinhKienModel> listLinhKien = query(sql, new LinhKienMapper(), ten);
        return listLinhKien.isEmpty() ? null : listLinhKien.get(0);
    }

    @Override
    public LinhKienModel findOneByNameAndMaNhaCungCap(String name, int maNCC, String ngayNhap) {
        String sql = "select * from LinhKien where tenlinhkien=? and nhacungcap=? and ngaynhap=? and trangthai=0";
        List<LinhKienModel> listLinhKien = query(sql, new LinhKienMapper(), name, maNCC, ngayNhap);
        return listLinhKien.isEmpty() ? null : listLinhKien.get(0);
    }

    @Override
    public void deleteByIDNhaCungCap(int idNhaCungCap) {
        String sql = "delete from LinhKien where idnhacungcap=?";
        update(sql, idNhaCungCap);
    }

    @Override
    public LinhKienModel findOneByIdAndDate(int id, String ngaynhap) {
          String sql = "select  * from LinhKien where id=? and ngaynhap=? and trangthai=0";
        List<LinhKienModel> listLinhKien = query(sql, new LinhKienMapper(), id,ngaynhap);
        return listLinhKien.isEmpty() ? null : listLinhKien.get(0);
    }

    @Override
    public void deleteStatus(int id,String ngayNhap) {
       String sql="update LinhKien set trangthai=1 where id=? and ngaynhap=?";
        update(sql,id,ngayNhap);
    }

}
