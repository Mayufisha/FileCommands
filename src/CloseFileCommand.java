public class CloseFileCommand implements Command{

    private FileSystemReceiver fs;

    public CloseFileCommand(FileSystemReceiver fs){
        this.fs = fs;
    }

    @Override
    public void execute() {
        // close command is forwarding the request
        this.fs.closeFile();
    }
}
