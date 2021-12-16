package entity;

public class VoLang extends  GameDecorator {

    Game game;

    public VoLang(Game game) {
        this.game = game;
    }

    public  String getTenGame(){
        return  game.getTenGame();
    }

    public  String getTheLoai(){
        return  game.getTheLoai();
    }

    public  String getPhuKien(){
        return  game.getPhuKien()+ "Vô lăng";
    }


}
