/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjpenjualan;
import java.sql.*;
/**
 *
 * @author D2A
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KoneksiMysql kon = new KoneksiMysql ("penjualan");
        Connection c = kon.getConnection();
        System.out.println("c : "+c);
    }
 }
    

