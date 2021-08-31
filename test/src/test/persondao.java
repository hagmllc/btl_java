/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author anhph
 */
public class persondao {

    public boolean insert(Person ps) throws Exception {
        String sql = "insert into person(Tendangnhap,pass,tuoi,gioitinh,email,phanquyen,name) values (?,?,?,?,?,?,?)";
        // Tạo đối tượng thực thi câu lệnh Select
        try (
                 Connection con = DatabaseHelper.openConnection();  PreparedStatement psmt = con.prepareStatement(sql);) {
            psmt.setString(1, ps.getTendangnhap());
            psmt.setString(2, ps.getPass());
            psmt.setInt(3, ps.getTuoi());
            psmt.setString(4, ps.getGioitinh());
            psmt.setString(5, ps.getEmail());
            psmt.setString(6, ps.getPhanquyen());
            psmt.setString(7, ps.getName());

            return psmt.executeUpdate() > 0;
        }
    }

    public boolean delete(String Tendangnhap) throws Exception {
        String sql = "delete from person where Tendangnhap=?";
        // Tạo đối tượng thực thi câu lệnh Select
        try (
                 Connection con = DatabaseHelper.openConnection();  PreparedStatement psmt = con.prepareStatement(sql);) {
            psmt.setString(1, Tendangnhap);

            return psmt.executeUpdate() > 0;
        }

    }

    public boolean update(Person ps) throws Exception {

        String sql = "update person set pass=?, tuoi=?,gioitinh=?,email=?,phanquyen=?,name=? where Tendangnhap=?";

        try (
                 Connection con = DatabaseHelper.openConnection();  PreparedStatement psmt = con.prepareStatement(sql);) {

            psmt.setString(7, ps.getTendangnhap());
            psmt.setString(1, ps.getPass());
            psmt.setInt(2, ps.getTuoi());
            psmt.setString(3, ps.getGioitinh());
            psmt.setString(4, ps.getEmail());
            psmt.setString(5, ps.getPhanquyen());
            psmt.setString(6, ps.getName());

            return psmt.executeUpdate() > 0;
        }

    }
}
