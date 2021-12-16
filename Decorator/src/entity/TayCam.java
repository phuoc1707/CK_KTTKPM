package entity;

public class TayCam extends  GameDecorator {
    Game game;

    public TayCam(Game game) {
        this.game = game;
    }
    public  String getPhuKien(){
        return  game.getPhuKien()+"Tay Cam";
    }
    public  String getTenGame(){
        return  game.getTenGame();
    }
    public  String getTheLoai(){
        return  game.getTheLoai();
    }


}
