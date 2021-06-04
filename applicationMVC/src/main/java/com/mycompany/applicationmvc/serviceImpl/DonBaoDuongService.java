/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.serviceImpl;

import com.mycompany.applicationmvc.daoImpl.*;
import com.mycompany.applicationmvc.model.DonBaoDuongModel;
import com.mycompany.applicationmvc.model.PhuTungModel;
import com.mycompany.applicationmvc.service.IDonBaoDuongService;
import java.util.List;

/**
 *
 * @author minh
 */
public class DonBaoDuongService implements IDonBaoDuongService {
    DonBaoDuongDAO donBaoDuongDAO;

    public DonBaoDuongService() {
        donBaoDuongDAO = new DonBaoDuongDAO();
    }
    
    public List<PhuTungModel> layDanhSachPhuTungCanKiemTra(){
        return donBaoDuongDAO.layDanhSachTatCaPhuTung();
    }
    
    public void xoaDonBaoDuong(int idDonBaoDuong){
        donBaoDuongDAO.xoaTatCaChiTietDichVuBaoDuongTrongDonBaoDuong(idDonBaoDuong);
        donBaoDuongDAO.xoaTatCaChiTietThayTheLinhKienTrongDonBaoDuong(idDonBaoDuong);
        donBaoDuongDAO.xoaTatCaTrangThaiPhuTungTrongDonBaoDuong(idDonBaoDuong);
        donBaoDuongDAO.xoaDonBaoDuong(idDonBaoDuong);
    }
    
    public DonBaoDuongModel timDonBaoDuong(int id){
        return donBaoDuongDAO.timDonBaoDuong(id);
    }

    public void capNhatDonBaoDuong(DonBaoDuongModel d){
        donBaoDuongDAO.capNhatDonBaoDuong(d);
    }
    
    public void themChiTietDonBaoDuong(){
        donBaoDuongDAO.themChiTietDichVuBaoDuongTrongDonBaoDuong(0, 0, ngayCapNhatDichVuBaoDuong, 0, 0, 0);
    }
}
