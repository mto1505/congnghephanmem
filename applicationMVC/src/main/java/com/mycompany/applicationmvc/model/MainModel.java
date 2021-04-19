/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.model;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.sql.*;
import java.sql.SQLException;

/**
 *
 * @author hesac
 */
public class MainModel {
    private Connection con;
    public DonBaoDuongModel DBDModel;
    public MainModel() {
        init();
        DBDModel = new DonBaoDuongModel(con);
        //Tạo thêm các model khác nếu cần
    }
    
    
    private void init() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://;databaseName=QuanLyBaoDuong [sa on dbo]", "sa", "123");
        } catch (ClassNotFoundException | SQLException e) {
        }  
    }
}
