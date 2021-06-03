/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.dao;

import com.mycompany.applicationmvc.model.LinhKienModel;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author MinhTo
 */
public interface ILinhKienDAO extends GenericDAO<LinhKienModel> {

    void update(LinhKienModel linhKien);

    void delete(int id);

    void deleteByIDNhaCungCap(int idNhaCungCap);

    int insert(LinhKienModel linhKien);

    List<LinhKienModel> findAll();

    LinhKienModel findOne(int id);

    LinhKienModel findOneByName(String ten);

    LinhKienModel findOneByNameAndMaNhaCungCap(String name, int maNCC, Date ngayNhap);

}
