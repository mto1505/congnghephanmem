/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.service;

import com.mycompany.applicationmvc.model.LoaiXeModel;
import com.mycompany.applicationmvc.model.XeModel;
import java.util.List;

/**
 *
 * @author MinhTo
 */
public interface ILoaiXeService {
    LoaiXeModel save(LoaiXeModel LoaiXeModel);
	LoaiXeModel update(LoaiXeModel updateModel);
	void delete(int id);
	List<LoaiXeModel> findAll();
	int getTotalItem();
	
}
