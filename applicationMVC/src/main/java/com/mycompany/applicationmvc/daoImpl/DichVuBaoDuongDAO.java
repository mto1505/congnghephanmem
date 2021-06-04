/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.daoImpl;

import com.mycompany.applicationmvc.dao.IDichVuBaoDuongDAO;
import com.mycompany.applicationmvc.mapper.DichVuBaoDuongMapper;
import com.mycompany.applicationmvc.model.DichVuBaoDuongModel;
import java.util.List;

/**
 *
 * @author minh
 */
public class DichVuBaoDuongDAO extends AbstractDAO<DichVuBaoDuongModel> implements IDichVuBaoDuongDAO {

    @Override
    public void themDichVuBaoDuong(DichVuBaoDuongModel d) {
        String q = "INSERT INTO DichVuBaoDuong(Ten,idLoaiXe,Phi,TrangThai,NgayCapNhat) "
                + "VALUES (?,?,?,?,?)";
        int tt = d.isTrangThai() ? 0 : 1;
        insert(q, d.getTenDichVuBaoDuong(), d.getIdLoaiXe(), d.getPhi(), tt, d.getNgayCapNhat());
    }

    @Override
    public void capNhatDichVuBaoDuong(DichVuBaoDuongModel d) {
        String q = "UPDATE DichVuBaoDuong "
                + "SET Ten = ?, idLoaiXe = ? , NgayCapNhat = ?, Phi = ?, TrangThai = ?";
        int tt = d.isTrangThai() ? 0 : 1;
        update(q, d.getTenDichVuBaoDuong(), d.getIdLoaiXe(), d.getNgayCapNhat(), d.getPhi(), tt);
    }

    @Override
    public List<DichVuBaoDuongModel> timTatCaDichVuBaoDuongMoiNhat() {
        String q = "with temporaryTable(id, NgayCapNhat) as "
                + "(SELECT id,  max(NgayCapNhat)"
                + " from DichVuBaoDuong"
                + " group by id)"
                + " select DichVuBaoDuong.* from DichVuBaoDuong ,temporaryTable"
                + " where DichVuBaoDuong.id = temporaryTable.id and DichVuBaoDuong.NgayCapNhat = temporaryTable.NgayCapNhat";
        return query(q, new DichVuBaoDuongMapper());
    }

    @Override
    public List<DichVuBaoDuongModel> timTatCaDichVuBaoDuongMoiNhat(boolean trangThai) {
        String q = "WITH temporaryTable(id, NgayCapNhat) "
                + "AS (SELECT id,  max(NgayCapNhat) from DichVuBaoDuong group by id) "
                + "SELECT DichVuBaoDuong.* from DichVuBaoDuong ,temporaryTable "
                + "WHERE DichVuBaoDuong.id = temporaryTable.id "
                + "AND DichVuBaoDuong.NgayCapNhat = temporaryTable.NgayCapNhat ";
                
        
        if(trangThai) {
            q+= "AND (DichVuBaoDuong.TrangThai = 0 OR DichVuBaoDuong.TrangThai IS NULL)";
        }else{
            q+= "AND DichVuBaoDuong.TrangThai = 1";
        }
        return query(q, new DichVuBaoDuongMapper());
    }

}
