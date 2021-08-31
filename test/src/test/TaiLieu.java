/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author anhph
 */
public class TaiLieu {

    protected String matailieu;
    protected String nhaxuatban;
    protected int sobanphathanh;

    public TaiLieu() {

    }

    public TaiLieu(String matailieu, String nhaxuatban, int sobanphathanh) {
        this.matailieu = matailieu;
        this.nhaxuatban = nhaxuatban;
        this.sobanphathanh = sobanphathanh;
    }

    public String thongTin() {
        String tt = "Ma Tai Lieu: " + matailieu + "\nNha Xuat Ban: " + nhaxuatban + "\nSo Ban Phat Hanh: " + sobanphathanh;
        return tt;
    }

    public void setmatailieu(String matailieu) {
        this.matailieu = matailieu;
    }

    public String getmatailieu() {
        return matailieu;
    }

    public void setnhaxuatban(String nhaxuatban) {
        this.nhaxuatban = nhaxuatban;
    }

    public String getnhaxuatban() {
        return nhaxuatban;
    }

    public void setsobanphathanh(int sobanphathanh) {
        this.sobanphathanh = sobanphathanh;
    }

    public int getsobanphathanh() {
        return sobanphathanh;
    }

}
