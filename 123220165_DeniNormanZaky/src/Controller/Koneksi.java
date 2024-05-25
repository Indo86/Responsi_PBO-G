/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Koneksi {
    static Connection conn;
    public static Connection connection(){
        if(conn == null){
            
            MysqlDataSource data = new MysqlDataSource ();
            data.setDatabaseName("petShop");
            data.setUser("root");
            data.setPassword("");
                    
                    
            try{
            conn = data.getConnection();
                System.out.println("Koneksi Berhasil :)");
            
            }catch(SQLException e){
                e.printStackTrace();
                System.out.println("Koneksi Gagal :(");
            }
        
        }
        return conn;
    }
}
