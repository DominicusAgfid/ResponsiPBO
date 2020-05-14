/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DASP
 */
public class koneksi {
    public static Connection koneksi;
    public static Connection getKoneksi(){
        if(koneksi==null){
            try{
                String url = "jdbc:mysql://localhost/4responsipbo";
                String user = "root";
                String pass = "";
                
                Driver driver = new Driver();
                DriverManager.registerDriver(driver);
                koneksi = (Connection) DriverManager.getConnection(url,user,pass);
            }catch(SQLException ex){
            }
        }
        return koneksi;
    }
}
