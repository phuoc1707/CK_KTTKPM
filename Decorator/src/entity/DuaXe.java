package entity;

public class DuaXe extends  Game{
    private  String loaiHinh;
    private  String ten;

    public String getLoaiHinh() {
        return loaiHinh;
    }

    public String getTen() {
        return ten;
    }

    public DuaXe(String loaiHinh, String ten) {
        this.loaiHinh = loaiHinh;
        theLoai="Đua Xe -"+"loại hình : "+ loaiHinh;
        tenGame= ten;
    }
}
