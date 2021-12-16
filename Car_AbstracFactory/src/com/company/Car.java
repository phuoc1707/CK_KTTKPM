package com.company;

public abstract class Car {
    public abstract String getThongTin();
    public  abstract  String getCauHinh();
    public  abstract  String getNhaSX();
    public  abstract  String getTinhNang();

    @Override
    public String toString(){
        return "getThongTin= "+this.getThongTin()+", getCauHinh="+this.getCauHinh()+",getNhaSX="+this.getNhaSX()+",getTinhnNang="+this.getTinhNang();
    }
}
