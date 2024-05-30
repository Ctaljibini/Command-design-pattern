import java.util.LinkedList;

/**
 * RemoteControl
 * Invoker
 */
public class RemoteControl {
    private Command[] onCommands;  // tüm etkili komutlar dizisi.
    private Command[] offCommands; // tüm kapalı komutlar dizisi.

    private LinkedList<Command> history; // geri alma (undo) işlemi için, gerçekleştirilen Command'ları tutmak.  

    NoCommand noCommand = new NoCommand();
    public RemoteControl(){
        onCommands = new Command[5];
        offCommands = new Command[5];
        history = new LinkedList<>();

        for(int i = 0; i < onCommands.length; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    // tuşlara komut vermek için.
    public void addCommand(int key, Command onCommand, Command offCommand){
        onCommands[key] = onCommand;
        offCommands[key] = offCommand;
    }

    // Açma Button'a basıldı
    public void onButtonPressed(int key){
        onCommands[key].execute();          // Kapatılacak Command dizisinden key index'li komutu çalıştır.
        history.push(onCommands[key]);      // işlemi listeye ekle.
    }

    // Kapatma Button'a basıldı
    public void offButtonPressed(int key){
        offCommands[key].execute();         // Çalıştıralacak Command dizisinden key index'li komutu çalıştır.
        history.push(offCommands[key]);     // işlemi listeye ekle.
    }

    // Geri alama Button'a basıldı.
    public void undoButtonPressed(){
        if(history.peek() != null){         // listeyi boş olup olmadığını peek()'le kontrol işlemi   
            history.poll().execute();       // son Command'ı al ve devam et.
        }else{
            System.out.println("No more history");
        }               
    }
}