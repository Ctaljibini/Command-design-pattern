/**
 * InnerturnOnTVCommand
*/
// televizyonu çalıştıran komut
public class turnOnTVCommand implements Command{

    private Television television;

    public turnOnTVCommand(Television television){
        this.television = television;
    }

    @Override
    public void execute(){
        this.television.turnOn();
    }

    @Override
    public void undo(){
        this.television.turnOff();
    }
}
