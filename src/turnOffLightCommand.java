/**
 * InnerturnOffLightCommand
 */
// Lampayi kapatan komut.
public class turnOffLightCommand implements Command{

    private Light light;

    public turnOffLightCommand(Light light){
        this.light = light;
    }
    
    @Override
    public void execute(){
        this.light.turnOff();
    }

    @Override
    public void undo(){
        this.light.turnOn();
    } 
}
