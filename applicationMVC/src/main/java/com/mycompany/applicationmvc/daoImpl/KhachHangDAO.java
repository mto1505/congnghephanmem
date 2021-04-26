/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.daoImpl;

import com.mycompany.applicationmvc.dao.IKhachHangDAO;
import com.mycompany.applicationmvc.mapper.KhachHangMapper;
import com.mycompany.applicationmvc.mapper.RowMapper;
import com.mycompany.applicationmvc.model.KhachHangModel;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

/**
 *
 * @author MinhTo
 */
public class KhachHangDAO extends AbstractDAO<KhachHangModel> implements IKhachHangDAO{

    public KhachHangDAO() {
    }
    
    @Override
    public KhachHangModel findOne(int id) {
            String sqlString=new String("select * from KhachHang where id=?");
            List<KhachHangModel> khachHanglist=query(sqlString, new KhachHangMapper(), id);
        //To change body of generated methods, choose Tools | Templates.
        return khachHanglist.isEmpty() ? null:khachHanglist.get(0);
    }

    @Override
    public KhachHangModel findOneByCMND(String cmnd) {
        String sqlString=new String("select * from KhachHang where cmnd=?");
            List<KhachHangModel> khachHanglist=query(sqlString, new KhachHangMapper(), cmnd);
        //To change body of generated methods, choose Tools | Templates.
        return khachHanglist.isEmpty() ? null:khachHanglist.get(0);
    }

    @Override
    public KhachHangModel findOneByNameAndSDT(String name, String sdt) {
          String sqlString=new String("select * from KhachHang where ten=? and sdt=?");
            List<KhachHangModel> khachHanglist=query(sqlString, new KhachHangMapper(),name,sdt);
        //To change body of generated methods, choose Tools | Templates.
        return khachHanglist.isEmpty() ? null:khachHanglist.get(0);
    }
    

    @Override
    public List<KhachHangModel> findByCategoryId(Long categoryId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int save(KhachHangModel khachHangModel) {
        StringBuilder stringSQL=new StringBuilder("insert into KhachHang (ten,cmnd,sdt,gioitinh,ngaysinh) values (?,?,?,?,?)");
        // LocalDate dateLocal = khachHangModel.getNgaySinh().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        if(khachHangModel.getNgaySinh()!=null)
        {
                 return insert(stringSQL.toString(),khachHangModel.getHoTen(),khachHangModel.getSoCMT(),khachHangModel.getSoDienThoai(),
                khachHangModel.getGioiTinh(),new Date(khachHangModel.getNgaySinh().getTime()));
        }
        else{
            stringSQL=new StringBuilder("insert into KhachHang (ten,cmnd,sdt,gioitinh) values (?,?,?,?)");
             return insert(stringSQL.toString(),khachHangModel.getHoTen(),khachHangModel.getSoCMT(),khachHangModel.getSoDienThoai(),
                khachHangModel.getGioiTinh());
           
        }
    }

    @Override
    public void update(KhachHangModel khachHangModel) {
        StringBuilder sqlString =new StringBuilder("update KhachHang set ten=?,cmnd=?,sdt=?,gioitinh=?,ngaysinh=? where id=?");
        if(khachHangModel.getNgaySinh()!=null)
        {
        update(sqlString.toString(),khachHangModel.getHoTen(),khachHangModel.getSoCMT(),khachHangModel.getSoDienThoai(),
                khachHangModel.getGioiTinh(),new Date(khachHangModel.getNgaySinh().getTime()),khachHangModel.getMaKH());
        }
        else{
            sqlString =new StringBuilder("update KhachHang set ten=?,cmnd=?,sdt=?,gioitinh=? where id=?");
            update(sqlString.toString(),khachHangModel.getHoTen(),khachHangModel.getSoCMT(),khachHangModel.getSoDienThoai(),
                khachHangModel.getGioiTinh(),khachHangModel.getMaKH());
        }
    }

    @Override
    public void delete(int id) {
        StringBuilder sqlString=new StringBuilder("delete from KhachHang where id=?");
        update(sqlString.toString(),id);
    }

    @Override
    public List<KhachHangModel> findAll() {
      String stringSql="select * from KhachHang";
      return query(stringSql, new KhachHangMapper());
    }

    @Override
    public int getTotalItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
