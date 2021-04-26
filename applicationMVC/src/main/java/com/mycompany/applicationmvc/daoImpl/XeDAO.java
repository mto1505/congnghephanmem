/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.daoImpl;

import com.mycompany.applicationmvc.dao.IXeDAO;
import com.mycompany.applicationmvc.dao.IXeDAO;
import com.mycompany.applicationmvc.mapper.XeMapper;
import com.mycompany.applicationmvc.mapper.RowMapper;
import com.mycompany.applicationmvc.mapper.XeMapper;
import com.mycompany.applicationmvc.model.XeModel;
import com.mycompany.applicationmvc.model.XeModel;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

/**
 *
 * @author MinhTo
 */
public class XeDAO extends AbstractDAO<XeModel> implements IXeDAO{

    public XeDAO() {
    }
    
    @Override
    public XeModel findOne(String bienso) {
            String sqlString=new String("select * from XeMay where bienso=?");
            List<XeModel> xelist=query(sqlString, new XeMapper(), bienso);
        //To change body of generated methods, choose Tools | Templates.
        return xelist.isEmpty() ? null:xelist.get(0);
    }

    
    
    @Override
    public String save(XeModel xeModel) {
            String sqlString=new String("insert into XeMay (bienso,tenxe,idChuSoHuu,idLoaiXe) values(?,?,?,?)");
           int st =insert(sqlString, new XeMapper(), xeModel.getBienSo(),xeModel.getTenXe(),xeModel.getKhachHang().getMaKH(),xeModel.getLoaixe().getMaLoaiXe());
        //To change body of generated methods, choose Tools | Templates.\
        if(st!=-1)
            {
                return xeModel.getBienSo();        
            }
        else
        {
            return null;
        }
    }

    
    @Override
    public void update(XeModel xe) {
        String sqlString=new String("update XeMay set tenxe=?, idChuSoHuu=?,idLoaiXe=? where bienso=?");
        update(sqlString,xe.getTenXe(),xe.getKhachHang().getHoTen(),xe.getLoaixe().getMaLoaiXe(),xe.getBienSo());
    }

   

    @Override
    public void delete(String bienso) {
        StringBuilder sqlString=new StringBuilder("delete from Xe where bienso=?");
        update(sqlString.toString(),bienso);
    }

    @Override
    public List<XeModel> findAll() {
      String stringSql="select * from Xe";
      return query(stringSql, new XeMapper());
    }

    @Override
    public List<XeModel> findAllMultiTable() {
         String stringSql="select bienso,tenxe,ten,sdt,tenloai from Xe as xe "
                 + "\n join KhachHang kh on kh.id=xe.idChuSoHuu"
                 + "\n join LoaiXe loaixe on xe.idLoaiXe=loaixe.id";
      return query(stringSql, new XeMapper());
    }

    @Override
    public int getTotalItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

   
}
