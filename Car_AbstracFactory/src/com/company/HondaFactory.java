package com.company;

public class HondaFactory implements CarAbstractFactory{
    private  String thongTin;
    private  String cauHinh;
    private String nhaSX;
    public  String tinhNang;

    public HondaFactory(String thongTin, String cauHinh, String nhaSX, String tinhNang) {
        this.thongTin = thongTin;
        this.cauHinh = cauHinh;
        this.nhaSX = nhaSX;
        this.tinhNang = tinhNang;
    }

    @Override
    public Car createCar() {
        return new Honda(thongTin,cauHinh,nhaSX,tinhNang);
    }
}
