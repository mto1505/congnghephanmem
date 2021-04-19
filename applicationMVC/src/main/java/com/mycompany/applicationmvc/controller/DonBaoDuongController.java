/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.controller;

import com.mycompany.applicationmvc.view.*;
import com.mycompany.applicationmvc.model.*;
/**
 *
 * @author hesac
 */
public class DonBaoDuongController {
    
    private DonBaoDuongPanel DonBaoDuongview;
    private DonBaoDuongModel DonBaoDuongmodel;

    public DonBaoDuongController(DonBaoDuongPanel view, DonBaoDuongModel model) {
        this.DonBaoDuongview = view;
        this.DonBaoDuongmodel = model;
    }
    
    //các hàm xử lí giữa view và model
}
