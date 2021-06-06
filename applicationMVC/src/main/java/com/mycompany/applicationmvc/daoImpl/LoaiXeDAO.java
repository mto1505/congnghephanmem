/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.daoImpl;

import com.mycompany.applicationmvc.dao.ILoaiXeDao;
import com.mycompany.applicationmvc.mapper.LoaiXeMapper;
import com.mycompany.applicationmvc.mapper.XeMapper;
import com.mycompany.applicationmvc.model.LoaiXeModel;
import com.mycompany.applicationmvc.model.XeModel;
import java.util.List;

/**
 *
 * @author MinhTo
 */
public class LoaiXeDAO extends AbstractDAO<LoaiXeModel> implements ILoaiXeDao{
   
    @Override
    public LoaiXeModel findOne(int id) {
        String sql=new String("select * from LoaiXe where id=?");
       List<LoaiXeModel> xelist=query(sql, new LoaiXeMapper(), id);
        return xelist.isEmpty() ? null:xelist.get(0);
    }

    @Override
    public LoaiXeModel findOneByName(String tenloai) {
        String sql=new String("select * from LoaiXe where tenloai=N'?'");
       List<LoaiXeModel> xelist=query(sql, new LoaiXeMapper(), tenloai);
        return xelist.isEmpty() ? null:xelist.get(0);
    }

    @Override
    public int save(LoaiXeModel loaiXe) {
       String sql=new String("insert into LoaiXe (id,tenloai) values (?,N'?')");
      return insert(sql,loaiXe.getMaLoaiXe(),loaiXe.getTenLoaiXe());
      
    }

    @Override
    public void update(LoaiXeModel loaiXe) {
        String sql=new String("update  LoaiXe set tenxe=N'?' where id=?");
        update(sql, loaiXe.getTenLoaiXe(),loaiXe.getMaLoaiXe());
    }

    @Override
    public void delete(int  id) {
         String sql=new String("delete from LoaiXe where id=?");
         update(sql, id);
    }

    @Override
    public List<LoaiXeModel> findAll() {
          String sql=new String("select * from  LoaiXe");
        return  query(sql, new LoaiXeMapper());
    }

    @Override
    public int getTotalItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
