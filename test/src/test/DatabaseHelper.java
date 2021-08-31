/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author anhph
 */
public class DatabaseHelper {

    public static Connection openConnection() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://localhost;database=quanlitv;";
        String dbusername = "sa";
        String password = "sa";
        Connection con = DriverManager.getConnection(connectionUrl, dbusername, password);
        return con;
    }
}
