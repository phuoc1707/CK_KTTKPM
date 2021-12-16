package com.company.CarFactory;

import com.company.entity.Car;
import com.company.entity.Honda;
import com.company.entity.Nexus;
import com.company.entity.Toyota;

public class CarFactory {

    public static Car getCar(String type, String thongTin, String
            cauHinh, String nhaSX,String tinhNang){
        if("honda".equalsIgnoreCase(type)) return new Honda(thongTin,cauHinh, nhaSX,tinhNang);
        else   if("toyota".equalsIgnoreCase(type)) return new Toyota(thongTin,cauHinh, nhaSX,tinhNang);
        else   if("nexus".equalsIgnoreCase(type)) return new Nexus(thongTin,cauHinh, nhaSX,tinhNang);

        return null;
    }
}
