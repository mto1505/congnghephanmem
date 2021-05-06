/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Date;

/**
 *
 * @author MinhTo
 */
public class LinhKienModel {

    private int id;
    private String tenLinhKien;
    private int soLuong;
    private double gia;
    private NhaCungCapModel nhaCungCap;
    private Date ngayNhap;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenLinhKien() {
        return tenLinhKien;
    }

    public void setTenLinhKien(String tenLinhKien) {
        this.tenLinhKien = tenLinhKien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        BigDecimal value=new BigDecimal(gia);
        value.setScale(3,RoundingMode.HALF_EVEN);
        this.gia = value.doubleValue();
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public NhaCungCapModel getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(NhaCungCapModel nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public LinhKienModel() {
    }

    public LinhKienModel(int id, String tenLinhKien, int soLuong, double gia, NhaCungCapModel nhaCungCap, Date ngayNhap) {
        this.id = id;
        this.tenLinhKien = tenLinhKien;
        this.soLuong = soLuong;
        this.gia = gia;
        this.nhaCungCap = nhaCungCap;
        this.ngayNhap = ngayNhap;
    }

}
