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
public class Person {

    private String tendangnhap, pass, gioitinh, email, phanquyen, name;
    private int tuoi;

    public Person() {
    }

    public Person(String tendangnhap, String pass, String gioitinh, String email, String phanquyen, String name, int tuoi) {
        this.tendangnhap = tendangnhap;
        this.pass = pass;
        this.gioitinh = gioitinh;
        this.email = email;
        this.phanquyen = phanquyen;
        this.name = name;
        this.tuoi = tuoi;
    }

    public String getTendangnhap() {
        return tendangnhap;
    }

    public void setTendangnhap(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhanquyen() {
        return phanquyen;
    }

    public void setPhanquyen(String phanquyen) {
        this.phanquyen = phanquyen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

}
