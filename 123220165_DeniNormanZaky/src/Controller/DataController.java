
package Controller;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.*;
import Model.*;
import javax.swing.JOptionPane;

public class DataController {
   Connection conn;
   Statement stmt;
   String data[][] = new String[100][7];
   
   final String hewan = "SELECT * FROM `hewan`";
   final String insert = "INSERT INTO `hewan` (`nama`, `jenis_hewan`, `nama_pemilik`, `nomor_telepon`, `durasi_penitipan`, `total_tagihan`) VALUES (?,?, ?, ?, ?, ?)"; 
   final String delete = "DELETE * FROM `hewan` WHERE `id` = ?";
   final String update = "UPDATE `hewan` SET `nama` = ?a,jenis_hewan` = ?a,nama_pemilik` = ?a,durasi_Penitipan` = ?,`total_tagihan` = ?a,durasi_Penitipan` = ?,total_tagihan` = ?a WHERE `hewan`.`id` = 2";

    public DataController(){
        conn = Koneksi.connection();
        
    }
    
    
    public String[][] DataHewan(){
        try{
            int totalData = 0;
            String query = hewan;
            stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery(hewan);
            
            
            while(resultSet.next()){
                
                data[totalData][0] = resultSet.getString("nama");
                data[totalData][1] = resultSet.getString("jenis_hewan");
                data[totalData][2] = resultSet.getString("nama_pemilik");
                data[totalData][3] = String.valueOf(resultSet.getInt("nomor_telepon"));;
                data[totalData][4] = String.valueOf(resultSet.getInt("durasi_penitipan"));
                data[totalData][6] = String.valueOf(resultSet.getInt("total_tagihan"));
                data[totalData][7] = String.valueOf(resultSet.getInt("id"));
                totalData++;                 
            }
            stmt.close();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error" + e.getMessage());
        }
       return data;   
    }
    
    
    public void insert(String nama, String jenis_hewan, String nama_pemilik, int nomor_telepon, int durasi_penitipan, int total_tagihan) {
    try{
        PreparedStatement preparedStatement = conn.prepareStatement(insert);
        preparedStatement.setString(1, nama);
        preparedStatement.setString(2, jenis_hewan);
        preparedStatement.setString(3, nama_pemilik);
        preparedStatement.setInt(4, nomor_telepon);
        preparedStatement.setInt(5, durasi_penitipan);
        preparedStatement.setInt(6, total_tagihan);
         preparedStatement.executeLargeUpdate();
        JOptionPane.showMessageDialog(null,"Data Berhasil Ditambahkan");
    }catch(SQLException e){
   
                    JOptionPane.showMessageDialog(null,"error" + e.getMessage());
    
        }
    }
}
