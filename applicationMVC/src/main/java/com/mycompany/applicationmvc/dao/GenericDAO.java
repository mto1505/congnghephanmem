/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.dao;

import com.mycompany.applicationmvc.mapper.RowMapper;
import java.util.List;

/**
 *
 * @author MinhTo
 */
public interface GenericDAO<T> {

    <T> List<T> query(String sql, RowMapper<T> mapper, Object... paramater);

    void update(String sql, Object... parameters);

    int insert(String sql, Object... parameters);

}
