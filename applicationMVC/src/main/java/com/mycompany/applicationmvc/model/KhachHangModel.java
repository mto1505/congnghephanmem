/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.model;

import java.util.Date;

/**
 *
 * @author MinhTo
 */
public class KhachHangModel {
    
    private int maKH;
    private String hoTen;
    private String soCMT;
    private String gioiTinh;
    private Date ngaySinh;
    private String soDienThoai;

    public KhachHangModel() {
    }
    
    public KhachHangModel(int maKH, String HoTen, String soCMT, String gioiTinh, Date ngaySinh, String soDienThoai) {
        this.maKH = maKH;
        this.hoTen = HoTen;
        this.soCMT = soCMT;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.soDienThoai = soDienThoai;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String HoTen) {
        this.hoTen = HoTen;
    }

    public String getSoCMT() {
        return soCMT;
    }

    public void setSoCMT(String soCMT) {
        this.soCMT = soCMT;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    
}
