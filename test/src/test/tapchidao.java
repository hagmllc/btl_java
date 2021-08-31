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
public class tapchidao {

    public boolean insert(TapChi tapchi) throws Exception {
        String sql = "insert into TapChi(matailieu,nhaxuatban,sobanphathanh,sophathanh,thangphathanh) values (?,?,?,?,?)";
        // Tạo đối tượng thực thi câu lệnh Select
        try (
                 Connection con = DatabaseHelper.openConnection();  PreparedStatement psmt = con.prepareStatement(sql);) {
            psmt.setString(1, tapchi.getMatailieu());
            psmt.setString(2, tapchi.getNhaxuatban());
            psmt.setInt(3, tapchi.getsobanphathanh());
            psmt.setInt(4, tapchi.getSophathanh());
            psmt.setString(5, tapchi.getThangphathanh());

            return psmt.executeUpdate() > 0;
        }

    }

    public boolean update(TapChi tapchi) throws Exception {

        String sql = "update TapChi set nhaxuatban=?,sobanphathanh=?,sophathanh=?,thangphathanh=? where matailieu=?";

        try (
                 Connection con = DatabaseHelper.openConnection();  PreparedStatement psmt = con.prepareStatement(sql);) {
            psmt.setString(5, tapchi.getMatailieu());
            psmt.setString(1, tapchi.getNhaxuatban());
            psmt.setInt(2, tapchi.getSobanphathanh());
            psmt.setInt(3, tapchi.getSophathanh());
            psmt.setString(4, tapchi.getThangphathanh());

            return psmt.executeUpdate() > 0;
        }

    }

    public boolean delete(String matailieu) throws Exception {
        String sql = "delete from TapChi where matailieu=?";
        // Tạo đối tượng thực thi câu lệnh Select
        try (
                 Connection con = DatabaseHelper.openConnection();  PreparedStatement psmt = con.prepareStatement(sql);) {
            psmt.setString(1, matailieu);

            return psmt.executeUpdate() > 0;
        }

    }

}
