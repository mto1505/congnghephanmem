/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.serviceImpl;

import com.mycompany.applicationmvc.dao.ILinhKienDAO;
import com.mycompany.applicationmvc.daoImpl.LinhKienDAO;
import com.mycompany.applicationmvc.model.LinhKienModel;
import com.mycompany.applicationmvc.service.ILinhKienService;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author MinhTo
 */
public class LinhKienService implements ILinhKienService{
    private ILinhKienDAO linhKienDAO=new LinhKienDAO();
    @Override
    public LinhKienModel save(LinhKienModel linhKienModel) {
        int id=linhKienDAO.insert(linhKienModel);
        return  linhKienDAO.findOne(id);
    }

    @Override
    public LinhKienModel update(LinhKienModel updateModel) {
        linhKienDAO.update(updateModel);
        return linhKienDAO.findOne(updateModel.getId());
                
    }

    @Override
    public void delete(int id) {
       linhKienDAO.delete(id);
    }

    @Override
    public List<LinhKienModel> findAll() {
       return  linhKienDAO.findAll();
    }

    @Override
    public int getTotalItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LinhKienModel findOne(int id) {
       return  linhKienDAO.findOne(id);
    }

    @Override
    public LinhKienModel findOneByName(String name) {
        return linhKienDAO.findOneByName(name);
    }

    @Override
    public LinhKienModel findOneByNameAndMaNhaCungCap(String name, int maNCC,Date ngayNhap) {
            return linhKienDAO.findOneByNameAndMaNhaCungCap(name, maNCC,ngayNhap);
    }

    @Override
    public void deleteByIDNhaCungCap(int idNhaCungCap) {
        linhKienDAO.deleteByIDNhaCungCap(idNhaCungCap);
    }
    
    
}
