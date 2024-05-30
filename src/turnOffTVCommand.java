/**
 * InnerturnOffTVCommand
 */
// televizyonu kapatmak için komut
public class turnOffTVCommand implements Command{

    private Television television;

    public turnOffTVCommand(Television television){
        this.television = television;
    }

    @Override
    public void execute(){
        this.television.turnOff();
    }

    @Override
    public void undo(){
        this.television.turnOn();
    }
}
