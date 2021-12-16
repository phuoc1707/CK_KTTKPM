package com.company;

public class Honda extends Car{
    private  String thongTin;
    private  String cauHinh;
    private String nhaSX;
    public  String tinhNang;

    public Honda(String thongTin, String cauHinh, String nhaSX, String tinhNang) {
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
    public String getTinhNang() {
        return this.tinhNang;
    }
}
