package vn.aptech.LoginDemoServlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * © Copyright 2021 by AnhNBT™
 */

/**
 *
 * @author Nguyen Ba Tuan Anh <anhnbt.it@gmail.com>
 */
public class DBConnection {
    public static Connection conn;
    
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            if (conn == null || conn.isClosed()) {
                System.out.println("Connecting...");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/jspservlet_demo", "anhnbt", "KhoaiTay@2019");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
}
