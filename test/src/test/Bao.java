package test;

import java.util.Date;

public class Bao extends TaiLieu {

    private String ngayphathanh;

    public Bao() {

    }

    public Bao(String matailieu, String nhaxuatban, int sobanphathanh, String ngayphathanh) {
        super(matailieu, nhaxuatban, sobanphathanh);
        this.ngayphathanh = ngayphathanh;
    }

    public String getNgayphathanh() {
        return ngayphathanh;
    }

    public void setNgayphathanh(String ngayphathanh) {
        this.ngayphathanh = ngayphathanh;
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
