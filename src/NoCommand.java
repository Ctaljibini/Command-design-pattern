/**
 * NoCommand
 * Command verilmeyen bir tuşa basılırsa Uyari işlemi. 
 */
public class NoCommand implements Command {
    @Override
    public void execute(){}
    
    @Override
    public void undo(){}
  
}