/**
 * InnerturnMedaiPlayerOffCommand
 */
// MediaPlayer Kapatmak komutu
public class turnMedaiPlayerOffCommand implements Command{

  private MediaPlayer mediaPlayer;

  public turnMedaiPlayerOffCommand(MediaPlayer mediaPlayer){
      this.mediaPlayer = mediaPlayer;
  }

  @Override
  public void execute(){
      this.mediaPlayer.turnOff();
  }

  @Override
  public void undo(){
      this.mediaPlayer.turnOn();
  }
}
