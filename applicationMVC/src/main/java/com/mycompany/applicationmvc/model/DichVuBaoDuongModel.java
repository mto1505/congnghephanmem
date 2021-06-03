/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.model;

/**
 *
 * @author hesac
 */
public class DichVuBaoDuongModel {

    private int id;
    private String tenDichVuBaoDuong;
    private long phi;
    private String loaiXe;
    private String trangThai;
    private int SoLuongTrongHoaDon;
    private long phuPhiTrongHoaDon;
    private int idNhanVienTrongHoaDon;
    private String ngayCapNhat;

    public DichVuBaoDuongModel() {
    }

    public DichVuBaoDuongModel(int id, String tenDichVuBaoDuong, long phi, String loaiXe, String trangThai ,String ngayCapNhat) {
        this.id = id;
        this.tenDichVuBaoDuong = tenDichVuBaoDuong;
        this.phi = phi;
        this.loaiXe = loaiXe;
        this.trangThai = trangThai;
        this.ngayCapNhat = ngayCapNhat;
    }

    public DichVuBaoDuongModel(int id, String tenDichVuBaoDuong, long phi, String loaiXe) {
        this.id = id;
        this.tenDichVuBaoDuong = tenDichVuBaoDuong;
        this.phi = phi;
        this.loaiXe = loaiXe;

    }

    public DichVuBaoDuongModel(int id, String tenDichVuBaoDuong, long phi, String loaiXe, String trangThai, int SoLuongTrongHoaDon, long phuPhi, int nv) {
        this.id = id;
        this.tenDichVuBaoDuong = tenDichVuBaoDuong;
        this.phi = phi;
        this.loaiXe = loaiXe;
        this.trangThai = trangThai;
        this.SoLuongTrongHoaDon = SoLuongTrongHoaDon;
        this.phuPhiTrongHoaDon = phuPhi;
        this.idNhanVienTrongHoaDon = nv;
    }

    public String getNgayCapNhat() {
        return ngayCapNhat;
    }

    public void setNgayCapNhat(String ngayCapNhat) {
        this.ngayCapNhat = ngayCapNhat;
    }

    public int getSoLuongTrongHoaDon() {
        return SoLuongTrongHoaDon;
    }

    public void setSoLuongTrongHoaDon(int SoLuongTrongHoaDon) {
        this.SoLuongTrongHoaDon = SoLuongTrongHoaDon;
    }

    public long getPhuPhi() {
        return phuPhiTrongHoaDon;
    }

    public void setPhuPhi(long phuPhi) {
        this.phuPhiTrongHoaDon = phuPhi;
    }

    public int getNv() {
        return idNhanVienTrongHoaDon;
    }

    public void setNv(int nv) {
        this.idNhanVienTrongHoaDon = nv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getTenDichVuBaoDuong() {
        return tenDichVuBaoDuong;
    }

    public void setTenDichVuBaoDuong(String tenDichVuBaoDuong) {
        this.tenDichVuBaoDuong = tenDichVuBaoDuong;
    }

    public long getPhi() {
        return phi;
    }

    public void setPhi(long phi) {
        this.phi = phi;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

}
