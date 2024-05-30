/**
 * Client
 * Kullancı sınıfı (Main)
 */
public class Client {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();  

        Light light = new Light();
        turnOnLightCommand turnOnLightCommand = new turnOnLightCommand(light);
        turnOffLightCommand turnOffLightCommand = new turnOffLightCommand(light);

        Television television = new Television();
        turnOnTVCommand turnOnTVCommand = new turnOnTVCommand(television);
        turnOffTVCommand turnOffTVCommand = new turnOffTVCommand(television);
        
        MediaPlayer mediaPlayer = new MediaPlayer();
        turnOnMediaPlayerCommand turnOnMediaPlayerCommand = new turnOnMediaPlayerCommand(mediaPlayer);
        turnMedaiPlayerOffCommand turnMedaiPlayerOffCommand = new turnMedaiPlayerOffCommand(mediaPlayer);


        // Komutları ekleme işlemleri.

        remoteControl.addCommand(0, turnOnLightCommand, turnOffLightCommand); 
        remoteControl.addCommand(1, turnOnTVCommand, turnOffTVCommand);
        remoteControl.addCommand(2, turnOnMediaPlayerCommand, turnMedaiPlayerOffCommand);

        // kumanda tuşları basmak işlemi.
        remoteControl.onButtonPressed(0);
        remoteControl.onButtonPressed(1);
        remoteControl.onButtonPressed(2);
        
        System.out.println("-----------------------");

        remoteControl.offButtonPressed(0);
        remoteControl.offButtonPressed(1);
        remoteControl.offButtonPressed(2);

        System.out.println("-----------------------");
        
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();

    }
  
}