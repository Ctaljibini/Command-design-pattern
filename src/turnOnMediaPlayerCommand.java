/**
 * InnerturnOnMediaPlayerCommand
 */
// MediaPlayer Açmak komutu
public class turnOnMediaPlayerCommand implements Command{

    private MediaPlayer mediaPlayer;

    public turnOnMediaPlayerCommand(MediaPlayer mediaPlayer){
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void execute(){
        this.mediaPlayer.turnOn();
    }

    @Override
    public void undo(){
        this.mediaPlayer.turnOff();
    }
}
