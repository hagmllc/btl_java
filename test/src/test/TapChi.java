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
public class TapChi extends TaiLieu {

    private int sophathanh;
    private String thangphathanh;

    public TapChi(String matailieu, String nhaxuatban, int sobanphathanh, int sophathanh, String thangphathanh) {
        super(matailieu, nhaxuatban, sobanphathanh);
        this.sophathanh = sophathanh;
        this.thangphathanh = thangphathanh;
    }

    public int getSophathanh() {
        return sophathanh;
    }

    public void setSophathanh(int sophathanh) {
        this.sophathanh = sophathanh;
    }

    public String getThangphathanh() {
        return thangphathanh;
    }

    public void setThangphathanh(String thangphathanh) {
        this.thangphathanh = thangphathanh;
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

    public TapChi() {
    }

    public TapChi(String matailieu, String nhaxuatban, int sobanphathanh) {
        super(matailieu, nhaxuatban, sobanphathanh);
    }

}
