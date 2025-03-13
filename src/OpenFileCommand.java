public class OpenFileCommand  implements Command{

    private FileSystemReceiver fs;

    public OpenFileCommand(FileSystemReceiver fs){
        this.fs = fs;
    }

    @Override
    public void execute() {
        // open command is forwarding the request
        this.fs.openFile();
    }
}
