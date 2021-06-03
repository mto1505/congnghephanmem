/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.daoImpl;

import com.mycompany.applicationmvc.dao.IDonBaoDuongDAO;
import com.mycompany.applicationmvc.mapper.DichVuBaoDuongMapper;
import com.mycompany.applicationmvc.mapper.DonBaoDuongMapper;
import com.mycompany.applicationmvc.mapper.LinhKienMapper;
import com.mycompany.applicationmvc.model.DichVuBaoDuongModel;
import com.mycompany.applicationmvc.model.DonBaoDuongModel;
import com.mycompany.applicationmvc.model.LinhKienModel;
import java.util.List;

/**
 *
 * @author minh
 */
public class DonBaoDuongDAO extends AbstractDAO<DonBaoDuongModel> implements IDonBaoDuongDAO {

    @Override
    public void capNhatDonBaoDuong(DonBaoDuongModel donBaoDuongModel) {

        if (donBaoDuongModel != null && donBaoDuongModel.getId() != 0) {
            String q = "UPDATE DonBaoDuong set BienSo = '?' ,"
                    + "idNhanVienLapDon = ?, "
                    + "NgayHoanThanh = '?', "
                    + "TongTien= ?, "
                    + "TrangThai = ? "
                    + "where DonBaoDuong.id = ?";
            update(
                    q,
                    donBaoDuongModel.getBienSo(),
                    donBaoDuongModel.getIdNhanVienLapDon(),
                    donBaoDuongModel.getNgayHoanThanh(),
                    donBaoDuongModel.getTongTien(),
                    donBaoDuongModel.getTrangThai(),
                    donBaoDuongModel.getId());
        }
    }

    @Override
    public DonBaoDuongModel themDonBaoDuong(DonBaoDuongModel donBaoDuongModel) {
        String q = "INSERT INTO DonBaoDuong (bienso,NgayBatDau,NgayHoanThanh,trangthai,tongtien,idNhanVienLapDon) "
                + "VALUES ('?', '?', '?', '?', ?, ?);"
                + "SELECT * FROM DonBaoDuong WHere DonBaoDuong.id in(SELECT SCOPE_IDENTITY() AS [SCOPE_IDENTITY]); ";

        List<DonBaoDuongModel> d = query(
                q,
                new DonBaoDuongMapper(),
                donBaoDuongModel.getBienSo(),
                donBaoDuongModel.getNgayBatDau(),
                donBaoDuongModel.getNgayHoanThanh(),
                donBaoDuongModel.getTrangThai(),
                donBaoDuongModel.getTongTien(),
                donBaoDuongModel.getIdNhanVienLapDon()
        );

        if (d.get(0) != null) {
            return d.get(0);
        } else {
            return null;
        }
    }

    @Override
    public List<DonBaoDuongModel> timTatCaDonBaoDuong() {
        String q = "SELECT TOP 100 * FROM DonBaoDuong ORDER BY id DESC;";
        return query(q, new DonBaoDuongMapper());
    }

    @Override
    public List<DonBaoDuongModel> timTatCaDonBaoDuong(boolean trangThai) {
        String tt = trangThai ? "1" : "0";
        String q = "SELECT TOP 100 * FROM DonBaoDuong WHERE TrangThai  = ? ORDER BY id DESC;";
        return query(q, new DonBaoDuongMapper());
    }

    @Override
    public DonBaoDuongModel timDonBaoDuong(int id) {
        String q = "SELECT * FROM DonBaoDuong WHere DonBaoDuong.id = ?";
        List<DonBaoDuongModel> d = query(q, new DonBaoDuongMapper(), id);
        if (d.get(0) != null) {
            return d.get(0);
        } else {
            return null;
        }
    }

    @Override
    public void xoaTatCaChiTietThayTheLinhKienTrongDonBaoDuong(int id) {
        String q = "DELETE FROM ChiTietThayTheLinhKien WHERE ChiTietThayTheLinhKien.idDonBaoDuong = ?";
        update(q, id);
    }

    @Override
    public void xoaChiTietThayTheLinhKienTrongDonBaoDuong(int idDonBaoDuong, int idLinhKien, String ngayCapNhatLinhKien) {
        String q = "DELETE FROM ChiTietThayTheLinhKien "
                + "WHERE ChiTietThayTheLinhKien.idDonBaoDuong = ? AND "
                + "ChiTietThayTheLinhKien.idLinkKien = ? AND "
                + "ChiTietThayTheLinhKien.NgayNhapLinhKien = ?";
        update(q, idDonBaoDuong, idLinhKien, ngayCapNhatLinhKien);
    }

    @Override
    public void themChiTietThayTheLinhKienTrongDonBaoDuong(int idDonBaoDuong, int idLinhKien, String ngayCapNhatLinhKien, int soLuong, String ghiChu) {
        String q = "INSERT INTO ChiTietThayTheLinhKien (idDonBaoDuong,idLinkKien,NgayNhapLinhKien,SoLuong,GhiChu) "
                + "VALUES (?,?,?,?,?)";
        insert(q, idDonBaoDuong, idLinhKien, ngayCapNhatLinhKien, soLuong, ghiChu);
    }

    @Override
    public List<LinhKienModel> layDanhSachThayTheLinhKienTrongDonBaoDuong(int idDonBaoDuong) {
        String q = "Select LinhKien.*, ChiTietThayTheLinhKien.SoLuong AS ctsl "
                + "FROM LinhKien join ChiTietThayTheLinhKien ON LinhKien.id = ChiTietThayTheLinhKien.idLinkKien AND LinhKien.NgayNhap = ChiTietThayTheLinhKien.NgayNhapLinhKien "
                + "WHERE ChiTietThayTheLinhKien.idDonBaoDuong = ?";
        return query(q, new LinhKienMapper(), idDonBaoDuong);
    }

    @Override
    public void xoaTatCaChiTietDichVuBaoDuongTrongDonBaoDuong(int idDonBaoDuong) {
        String q = "DELETE FROM ChiTietDonBaoDuong WHERE ChiTietDonBaoDuong.idDonBaoDuong = ?";
        update(q, idDonBaoDuong);
    }

    @Override
    public void xoaChiTietDichVuBaoDuongTrongDonBaoDuong(int idDonBaoDuong, int idDichVuBaoDuong, String NgayCapNhatDichVuBaoDuong) {
        String q = "DELETE FROM ChiTietDonBaoDuong "
                + "WHERE ChiTietDonBaoDuong.idDonBaoDuong = ? AND "
                + "ChiTietDonBaoDuong.idDichVuBaoDuong = ? AND "
                + "ChiTietDonBaoDuong.NgayCapNhatDichVuBaoDuong = ?";
        update(q, idDonBaoDuong, idDichVuBaoDuong, NgayCapNhatDichVuBaoDuong);
    }

    @Override
    public void themChiTietDichVuBaoDuongTrongDonBaoDuong(int idDonBaoDuong, int idDichVuBaoDuong, String ngayCapNhatDichVuBaoDuong, int idNhanVienPhuTrach, int soLuong, int phuPhi) {
        String q = "INSERT INTO ChiTietDonBaoDuong (idDonBaoDuong,idDichVuBaoDuong,NgayCapNhatDichVuBaoDuong,SoLuong,idNhanVienPhuTrach,PhuPhi) "
                + "VALUES (?,?,?,?,?,?)";
        insert(q, idDonBaoDuong, idDichVuBaoDuong, ngayCapNhatDichVuBaoDuong, soLuong, idNhanVienPhuTrach, phuPhi);
    }

    @Override
    public List<DichVuBaoDuongModel> layDanhSachDichVuBaoDuongTrongDonBaoDuong(int idDonBaoDuong) {
        String q = "SELECT DichVuBaoDuong.*, ChiTietDonBaoDuong.SoLuong as ctsl "
                + "FROM DichVuBaoDuong join ChiTietDonBaoDuong "
                + "ON DichVuBaoDuong.id = ChiTietDonBaoDuong.idDichVuBaoDuong "
                + "AND DichVuBaoDuong.NgayCapNhat = ChiTietDonBaoDuong.NgayCapNhatDichVuBaoDuong "
                + "WHERE ChiTietDonBaoDuong.idDonBaoDuong = ?";
        return query(q, new DichVuBaoDuongMapper(), idDonBaoDuong);
    }

    
}
