/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.Utils;

import java.math.MathContext;
import java.sql.Connection;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author MinhTo
 */
import java.sql.Connection;
import java.sql.DriverManager;
impoadasdrt java.sql.SQLException;

public class DBConnectUtil {

    private static ThreadLocal<Connection> tl = new ThreadLocal<>();
    private static PropertiseUtil propertiesUtil = new PropertiseUtil();

    private static String url = propertiesUtil.getValue("url", "jdbc:sqlserver://DESKTOP-QK1KP4V\\SQLMINHTO:1433;databaseName=QuanLyBaoDuong");
    private static String driver = propertiesUtil.getValue("driver", "com.microsoft.sqlserver.jdbc.SQLServerDriver");
    private static String username = propertiesUtil.getValue("username", "minhto");
    private static String password = propertiesUtil.getValue("password", "minhto123");

    static {
        try {
            Class.forName(driver);
            System.out.println("thanh cong");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        Connection conn = tl.get();
        // If there is no connection in the container, get a connection from the connection pool to ThreadLocal
        if (conn == null) {
            conn = DriverManager.getConnection(url, username, password);
            tl.set(conn);
        }
        return conn;
    }

    public static void begin() {
        try {
            getConnection().setAutoCommit(false);
        } catch (SQLException e) {

        }
    }

    public static void commit() {
        try {
            getConnection().commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void rollback() {
        try {
            getConnection().rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close() {

        try {
            tl.remove();
            getConnection().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
   
}
