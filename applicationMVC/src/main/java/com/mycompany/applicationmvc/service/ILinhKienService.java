/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.service;

import com.mycompany.applicationmvc.model.KhachHangModel;
import com.mycompany.applicationmvc.model.LinhKienModel;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author MinhTo
 */
public interface ILinhKienService {
        LinhKienModel save(LinhKienModel linhKienModel);
	LinhKienModel update(LinhKienModel updateModel);
	void delete(int id);
          void deleteByIDNhaCungCap(int idNhaCungCap );
	List<LinhKienModel> findAll();
	int getTotalItem();
	LinhKienModel findOne(int id);
        LinhKienModel findOneByName(String name);
        LinhKienModel findOneByNameAndMaNhaCungCap(String name,int maNCC,Date ngayNhap);
   
}