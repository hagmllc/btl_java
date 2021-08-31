/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.DriverManager;

public class Sach extends TaiLieu {

    private String tg;
    private int st;

// public Sach(String matailieu, String nhaxuatban, int sobanphathanh, String tg, int st)
// {
//  super(matailieu,nhaxuatban,sobanphathanh);
//  this.tg = tg;
//  this.st = st;
// }
//
//    Sach() {
//         //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public String getTg() {
//        return tg;
//    }
//
//    public void setTg(String tg) {
//        this.tg = tg;
//    }
//
//    public int getSt() {
//        return st;
//    }
//
//    public void setSt(int st) {
//        this.st = st;
//    }
//
//    public String getMatailieu() {
//        return matailieu;
//    }
//
//    public void setMatailieu(String matailieu) {
//        this.matailieu = matailieu;
//    }
//
//    public String getNhaxuatban() {
//        return nhaxuatban;
//    }
//
//    public void setNhaxuatban(String nhaxuatban) {
//        this.nhaxuatban = nhaxuatban;
//    }
//
//    public int getSobanphathanh() {
//        return sobanphathanh;
//    }
//
//    public void setSobanphathanh(int sobanphathanh) {
//        this.sobanphathanh = sobanphathanh;
//    }
// 
// public String gettg()
// {
//  return tg;
// }
// public int getst()
// {
//  return st;
// }
// public void settg(String tg)
// {
//  this.tg = tg;
// }
// public void setst(int st)
// {
//  this.st = st;
// }
    public Sach() {
    }

    public Sach(String tg, int st, String matailieu, String nhaxuatban, int sobanphathanh) {
        super(matailieu, nhaxuatban, sobanphathanh);
        this.tg = tg;
        this.st = st;
    }

    public String getTg() {
        return tg;
    }

    public void setTg(String tg) {
        this.tg = tg;
    }

    public int getSt() {
        return st;
    }

    public void setSt(int st) {
        this.st = st;
    }

    public String getMatailieu() {
        return matailieu;
    }

    public void setMatailieu(String matailieu) {
        this.matailieu = matailieu;
    }

    public String getNhaxuatban() {
        return nhaxuatban;
    }

    public void setNhaxuatban(String nhaxuatban) {
        this.nhaxuatban = nhaxuatban;
    }

    public int getSobanphathanh() {
        return sobanphathanh;
    }

    public void setSobanphathanh(int sobanphathanh) {
        this.sobanphathanh = sobanphathanh;
    }

}
