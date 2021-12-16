package entity;

public class HanhDong extends  Game{
    private  String kieuHanhDong;
    private  String ten;

    public HanhDong(String kieuHanhDong,String ten) {
        this.kieuHanhDong = kieuHanhDong;
        theLoai="Thể loại: Hành động - Kiểu hành động : "+ kieuHanhDong;
        tenGame=ten;
    }
}
