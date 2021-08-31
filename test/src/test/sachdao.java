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
public class sachdao {

    public boolean insert(Sach sach) throws Exception {
        String sql = "insert into Sach1(matailieu,nhaxuatban,sobanphathanh,tg,st) values (?,?,?,?,?)";
        // Tạo đối tượng thực thi câu lệnh Select
        try (
                 Connection con = DatabaseHelper.openConnection();  PreparedStatement psmt = con.prepareStatement(sql);) {
            psmt.setString(1, sach.getMatailieu());
            psmt.setString(2, sach.getNhaxuatban());
            psmt.setInt(3, sach.getsobanphathanh());
            psmt.setString(4, sach.getTg());
            psmt.setInt(5, sach.getSt());

            return psmt.executeUpdate() > 0;
        }

    }

    public boolean update(Sach sach) throws Exception {

        String sql = "update Sach1 set nhaxuatban=?,sobanphathanh=?,tg=?,st=? where matailieu=?";

        try (
                 Connection con = DatabaseHelper.openConnection();  PreparedStatement psmt = con.prepareStatement(sql);) {
            psmt.setString(5, sach.getMatailieu());
            psmt.setString(1, sach.getNhaxuatban());
            psmt.setInt(2, sach.getsobanphathanh());
            psmt.setString(3, sach.getTg());
            psmt.setInt(4, sach.getSt());

            return psmt.executeUpdate() > 0;
        }

    }

    public boolean delete(String matailieu) throws Exception {
        String sql = "delete from Sach1 where matailieu=?";
        // Tạo đối tượng thực thi câu lệnh Select
        try (
                 Connection con = DatabaseHelper.openConnection();  PreparedStatement psmt = con.prepareStatement(sql);) {
            psmt.setString(1, matailieu);

            return psmt.executeUpdate() > 0;
        }

    }

}
