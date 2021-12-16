package com.company.entity;

public abstract class Car {

    public abstract String getThongTin();
    public  abstract  String getCauHinh();
    public  abstract  String getNhaSX();
    public  abstract  String getTinhnNang();

    @Override
    public String toString(){
        return "getThongTin= "+this.getThongTin()+", getCauHinh="+this.getCauHinh()+",getNhaSX="+this.getNhaSX()+",getTinhnNang="+this.getTinhnNang();
    }
}
