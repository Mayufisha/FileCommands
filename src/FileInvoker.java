public class FileInvoker {
    public Command cmd;

    public FileInvoker(Command c){
        this.cmd = c;
    }
    public void execute(){
        this.cmd.execute();
    }
}
