/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author suman
 */
public class Util {
    /*   private static String driverclass;
     private static String url;
     private static String username;
     private static String password;
     private static Stri
     * ng database;
     static
     {
     FileInputStream fin = null;
     try
     {
     fin = new FileInputStream("db.properties");
     Properties pr = new Properties();
     pr.load(fin);
     driverclass = pr.getProperty("driverclass");
     url = pr.getProperty("url");
     username = pr.getProperty("username");
     password = pr.getProperty("password");
     database = pr.getProperty("database");
     }
     catch (IOException ex)
     {
     ex.printStackTrace();
     }
     finally
     {
     try
     {
     if(fin != null)
     {
     fin.close();
     fin = null;
     }
     }
     catch(IOException ex)
     {
     ex.printStackTrace();
     }
     }
     }*/

    int connect = 0;

    static {
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
            } catch (InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public static Connection getConnection1() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost", "root", "");
        System.out.println("Connection-2 Successful......");
        return con;
    }

    public static Connection getConnection() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/cmsdb", "root", "");
        System.out.println("Connection-1 Successful......");

        return con;
    }

    public static void closeResultset(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
                rs = null;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void closeStatement(Statement stmt) {
        try {
            if (stmt != null) {
                stmt.close();
                stmt = null;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
                con = null;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
