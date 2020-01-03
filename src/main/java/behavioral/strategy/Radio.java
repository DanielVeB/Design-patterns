package behavioral.strategy;

public class Radio {

    private PlayBehavioral player;

    public Radio(PlayBehavioral player){
        this.player = player;
    }

    public void play(){
        player.play();
    }
}
