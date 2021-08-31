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
public class baodao {

    public boolean insert(Bao bao) throws Exception {
        String sql = "insert into Bao(matailieu,nhaxuatban,sobanphathanh,ngayphathanh) values (?,?,?,?)";
        // Tạo đối tượng thực thi câu lệnh Select
        try (
                 Connection con = DatabaseHelper.openConnection();  PreparedStatement psmt = con.prepareStatement(sql);) {
            psmt.setString(1, bao.getMatailieu());
            psmt.setString(2, bao.getNhaxuatban());
            psmt.setInt(3, bao.getSobanphathanh());
            psmt.setString(4, bao.getNgayphathanh());

            return psmt.executeUpdate() > 0;
        }
    }

    public boolean delete(String matailieu) throws Exception {
        String sql = "delete from Bao where matailieu=?";
        // Tạo đối tượng thực thi câu lệnh Select
        try (
                 Connection con = DatabaseHelper.openConnection();  PreparedStatement psmt = con.prepareStatement(sql);) {
            psmt.setString(1, matailieu);

            return psmt.executeUpdate() > 0;
        }

    }

    public boolean update(Bao bao) throws Exception {

        String sql = "update Bao set nhaxuatban=?,sobanphathanh=?,ngayphathanh=? where matailieu=?";

        try (
                 Connection con = DatabaseHelper.openConnection();  PreparedStatement psmt = con.prepareStatement(sql);) {

            psmt.setString(1, bao.getNhaxuatban());
            psmt.setInt(2, bao.getsobanphathanh());
            psmt.setString(3, bao.getNgayphathanh());
            psmt.setString(4, bao.getMatailieu());

            return psmt.executeUpdate() > 0;
        }

    }
}
