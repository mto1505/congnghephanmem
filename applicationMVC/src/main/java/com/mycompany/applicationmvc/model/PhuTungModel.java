/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.model;

import java.util.ArrayList;

/**
 *
 * @author hesac
 */
public class PhuTungModel {
    private int id;
    private String tenPhuTung;
    boolean trangThaiSuDung;
    ArrayList<String> trangThai;

    public PhuTungModel() {
    }



    public PhuTungModel(int id, String tenPhuTung) {
        this.id = id;
        this.tenPhuTung = tenPhuTung;
        this.trangThai = new ArrayList<>();
    }
    
    public PhuTungModel(int id, String tenPhuTung, boolean trangThaiSuDung) {
        this.id = id;
        this.tenPhuTung = tenPhuTung;
        this.trangThaiSuDung = trangThaiSuDung;
        this.trangThai = new ArrayList<>();
    }

    public ArrayList<String> getTrangThai() {
        return trangThai;
    }

    public boolean isTrangThaiSuDung() {
        return trangThaiSuDung;
    }

    public void setTrangThaiSuDung(boolean trangThaiSuDung) {
        this.trangThaiSuDung = trangThaiSuDung;
    }

    public void setTrangThai(ArrayList<String> trangThai) {
        this.trangThai = trangThai;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenPhuTung() {
        return tenPhuTung;
    }

    public void setTenPhuTung(String tenPhuTung) {
        this.tenPhuTung = tenPhuTung;
    }
    
}
