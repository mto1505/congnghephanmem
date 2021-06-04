/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.daoImpl;

import com.mycompany.applicationmvc.dao.INhanVienDAO;
import com.mycompany.applicationmvc.mapper.NhanVienMapper;
import com.mycompany.applicationmvc.mapper.RowMapper;
import com.mycompany.applicationmvc.model.NhanVienModel;
import java.util.List;

/**
 *
 * @author MinhTo
 */
public class NhanVienDAO implements INhanVienDAO{

    @Override
    public NhanVienModel findOne(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<NhanVienModel> findByCategoryId(Long categoryId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Long save(NhanVienModel NhanVienModel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(NhanVienModel updateNhanVien) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<NhanVienModel> findAll() {
        String q  = "SELECT * FROM NhanVien";
        return query(q, new NhanVienMapper());
    }

    @Override
    public int getTotalItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> List<T> query(String sql, RowMapper<T> mapper, Object... paramater) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(String sql, Object... parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insert(String sql, Object... parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
