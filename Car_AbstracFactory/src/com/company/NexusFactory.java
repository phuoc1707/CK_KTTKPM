package com.company;

public class NexusFactory implements CarAbstractFactory{
    private  String thongTin;
    private  String cauHinh;
    private String nhaSX;
    public  String tinhNang;

    public NexusFactory(String thongTin, String cauHinh, String nhaSX, String tinhNang) {
        this.thongTin = thongTin;
        this.cauHinh = cauHinh;
        this.nhaSX = nhaSX;
        this.tinhNang = tinhNang;
    }

    @Override
    public Car createCar() {
        return new Nexus(thongTin,cauHinh,nhaSX,tinhNang);
    }
}
