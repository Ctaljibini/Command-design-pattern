/**
 * InnerCommand
 * Interface
 */
public interface Command {

  void execute();  // komutu çalıştıran fonksiyon.

  void undo();     // geri alma fonksiyonu.

}