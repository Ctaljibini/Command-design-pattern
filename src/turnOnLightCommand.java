/**
 * InnerturnOnLightCommand
 */
// Lampayı çalıştıran komut.
public class turnOnLightCommand implements Command {

    private Light light;

    public turnOnLightCommand(Light light){
        this.light = light;
    }
    
    @Override
    public void execute(){
        this.light.turnOn(); 
    }

    @Override
    public void undo(){
        this.light.turnOff();
    }
}
