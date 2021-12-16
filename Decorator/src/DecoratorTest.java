import entity.*;

public class DecoratorTest {
    public static void main(String[] args) {
        Game game= new DuaXe("Xa mạc","Đua xe f1");
        game= new VoLang(game);
        System.out.println(game.getTenGame() +"-"+ game.getTheLoai()+"-" + game.getPhuKien());



//        System.out.println(game);
        System.out.println("====================================");
        Game game1= new HanhDong("PVP","Đấu trường thú");
        game1= new TayCam(game1);
        game1= new VoLang(game1);
        System.out.println(game1.getTenGame() +"-"+ game1.getTheLoai()+"-" + game1.getPhuKien());
    }
}
