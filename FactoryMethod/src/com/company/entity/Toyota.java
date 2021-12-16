package com.company.entity;

public class Toyota extends  Car{

    private String thongTin;
    private String cauHinh;
    private String nhaSX;
    private String tinhNang;

    public Toyota(String thongTin, String cauHinh, String nhaSX, String tinhNang) {
        this.thongTin = thongTin;
        this.cauHinh = cauHinh;
        this.nhaSX = nhaSX;
        this.tinhNang = tinhNang;
    }

    @Override
    public String getThongTin() {
        return this.thongTin;
    }

    @Override
    public String getCauHinh() {
        return this.cauHinh;
    }

    @Override
    public String getNhaSX() {
        return this.nhaSX;
    }

    @Override
    public String getTinhnNang() {
        return this.tinhNang;
    }
}
