public class WriteFileCommand implements Command{

    private FileSystemReceiver fs;

    public WriteFileCommand(FileSystemReceiver fs){
        this.fs = fs;
    }


    @Override
    public void execute() {
        // write command is forwarding the request
        this.fs.writeFile();
    }
}
