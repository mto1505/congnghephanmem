/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.serviceImpl;

import com.mycompany.applicationmvc.dao.IXeDAO;
import com.mycompany.applicationmvc.daoImpl.KhachHangDAO;
import com.mycompany.applicationmvc.daoImpl.XeDAO;
import com.mycompany.applicationmvc.model.KhachHangModel;
import com.mycompany.applicationmvc.model.XeModel;
import com.mycompany.applicationmvc.service.IKhachHangService;
import com.mycompany.applicationmvc.service.IXeService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MinhTo
 */
public class XeService implements IXeService {

    private IXeDAO xeDao=new XeDAO();

    public XeService() {
    }

    @Override
    public XeModel save(XeModel xeModel) {
        String bienso=xeDao.save(xeModel);
        return xeDao.findOne(bienso);
    }

    @Override
    public XeModel update(XeModel updateModel) {
        xeDao.save(updateModel);
        return xeDao.findOne(updateModel.getBienSo());
        
    }

    @Override
    public void delete(String bienso) {
        xeDao.delete(bienso);
        
    }

    @Override
    public List<XeModel> findAll() {
        return xeDao.findAll();
    }

    @Override
    public int getTotalItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public XeModel findOne(String bienso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

   
}
