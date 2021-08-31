/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anhph
 */
public class timkiemdao {

    public static List<Sach> FindSach(String matailieu, String tg, String nhaxuatban) throws Exception {
        ResultSet rs = null;
        PreparedStatement sttm = null;
        List<Sach> ls = new ArrayList<>();

        try {
            String sql = "Select * from Sach1 where matailieu like ? or tg like ? or nhaxuatban like ?";
            Connection con = DatabaseHelper.openConnection();
            sttm = con.prepareCall(sql);
            sttm.setString(1, "%" + matailieu + "%");
            sttm.setString(2, "%" + tg + "%");
            sttm.setString(3, "%" + nhaxuatban + "%");
            rs = sttm.executeQuery();

            while (rs.next()) {
                Sach data = new Sach();
                data.setMatailieu(rs.getString("matailieu"));
                data.setNhaxuatban(rs.getString("nhaxuatban"));
                data.setSobanphathanh(rs.getInt("sobanphathanh"));
                data.setTg(rs.getString("tg"));
                data.setSt(rs.getInt("st"));
                ls.add(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ls;
    }

    public static List<Bao> FindBao(String matailieu, String nhaxuatban, String sobanphathanh, String ngayphathanh) throws Exception {
        ResultSet rs = null;
        PreparedStatement sttm = null;
        List<Bao> ls = new ArrayList<>();

        try {
            String sql = "Select * from Bao where matailieu like ? or nhaxuatban like ? or sobanphathanh like ? or ngayphathanh like ?";
            Connection con = DatabaseHelper.openConnection();
            sttm = con.prepareCall(sql);
            sttm.setString(1, "%" + matailieu + "%");
            sttm.setString(3, "%" + sobanphathanh + "%");
            sttm.setString(2, "%" + nhaxuatban + "%");

            sttm.setString(4, "%" + ngayphathanh + "%");
            rs = sttm.executeQuery();

            while (rs.next()) {
                Bao data = new Bao();
                data.setMatailieu(rs.getString("matailieu"));
                data.setNhaxuatban(rs.getString("nhaxuatban"));
                data.setSobanphathanh(rs.getInt("sobanphathanh"));
                data.setNgayphathanh(rs.getString("ngayphathanh"));
                ls.add(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ls;
    }

    public static List<TapChi> FindTapchi(String matailieu, String nhaxuatban, String sobanphathanh, String sophathanh, String thangphathanh) throws Exception {
        ResultSet rs = null;
        PreparedStatement sttm = null;
        List<TapChi> ls = new ArrayList<>();

        try {
            String sql = "Select * from TapChi where matailieu like ? or nhaxuatban like ? or sobanphathanh like ? or sophathanh like ? or thangphathanh like ?";
            Connection con = DatabaseHelper.openConnection();
            sttm = con.prepareCall(sql);
            sttm.setString(1, "%" + matailieu + "%");
            sttm.setString(2, "%" + nhaxuatban + "%");
            sttm.setString(3, "%" + sobanphathanh + "%");
            sttm.setString(4, "%" + sophathanh + "%");
            sttm.setString(5, "%" + thangphathanh + "%");
            rs = sttm.executeQuery();

            while (rs.next()) {
                TapChi data = new TapChi();
                data.setMatailieu(rs.getString("matailieu"));
                data.setNhaxuatban(rs.getString("nhaxuatban"));
                data.setSobanphathanh(rs.getInt("sobanphathanh"));
                data.setSophathanh(rs.getInt("sophathanh"));
                data.setThangphathanh(rs.getString("thangphathanh"));
                ls.add(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ls;
    }

}
