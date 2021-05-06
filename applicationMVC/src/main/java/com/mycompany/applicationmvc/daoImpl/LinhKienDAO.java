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
import java.sql.Date;
import java.util.List;

/**
 *
 * @author MinhTo
 */
public class LinhKienDAO extends AbstractDAO<LinhKienModel> implements ILinhKienDAO{

    @Override
    public void update(LinhKienModel linhKien) {
        String  sql="update LinhKien set tenlinhkien=?,soluong=?,gia=?,nhacungcap=? where id=?" ;
        update(sql, linhKien.getTenLinhKien(),linhKien.getSoLuong(),linhKien.getGia(),linhKien.getNhaCungCap().getId(),linhKien.getId());
    }

    @Override
    public void delete(int id) {
        String sql="delete from LinhKien where id=?";
        update(sql,id);
        
    }

    @Override
    public int insert(LinhKienModel linhKien) {
        String sql="insert into LinhKien (tenlinhkien,soluong,gia,nhacungcap,ngaynhap) values(?,?,?,?,?)";
        return insert(sql,linhKien.getTenLinhKien(),linhKien.getSoLuong(),linhKien.getGia(),linhKien.getNhaCungCap().getId(),new Date(linhKien.getNgayNhap().getTime()));
    }

    @Override
    public List<LinhKienModel> findAll() {
       String sql="select  * from LinhKien";
       return query(sql, new LinhKienMapper());
    }

    @Override
    public LinhKienModel findOne(int id) {
        String sql="select  * from LinhKien where id=?";
        List<LinhKienModel> listLinhKien=query(sql, new LinhKienMapper(),id);
        return listLinhKien.isEmpty()? null:listLinhKien.get(0);
    }

    @Override
    public LinhKienModel findOneByName(String ten) {
                String sql="select  * from LinhKien where tenlinhkien=?";
        List<LinhKienModel> listLinhKien=query(sql, new LinhKienMapper(),ten);
        return listLinhKien.isEmpty()? null:listLinhKien.get(0);
    }

    @Override
    public LinhKienModel findOneByNameAndMaNhaCungCap(String name, int maNCC,Date ngayNhap) {
        String sql="select * from LinhKien where tenlinhkien=? and nhacungcap=? and ngaynhap=?";
        List<LinhKienModel> listLinhKien =query(sql, new LinhKienMapper(), name,maNCC,ngayNhap);
        return listLinhKien.isEmpty()?null:listLinhKien.get(0);
    }

    @Override
    public void deleteByIDNhaCungCap(int idNhaCungCap) {
        String sql="delete from LinhKien where idnhacungcap=?";
        update(sql, idNhaCungCap);
    }
    
   
    
}
