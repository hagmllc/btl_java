/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author anhph
 */
public class checkadmin {

    public NguoiDung checkadmin(String tendangnhap, String matkhau)
            throws Exception {

        String sql = "select Tendangnhap, pass, phanquyen from person"
                + " where Tendangnhap=? and pass=? and phanquyen='admin' ";
        try (
                 Connection con = DatabaseHelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, tendangnhap);
            pstmt.setString(2, matkhau);

            try ( ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    NguoiDung nd = new NguoiDung();
                    nd.setTendangnhap(tendangnhap);
                    nd.setVaitro(rs.getString("phanquyen"));
                    return nd;
                }
            }
        }
        return null;
    }
}
