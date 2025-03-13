import java.io.File;
import java.io.IOException;
public class CloseFileCommand implements Command{

    private FileSystemReceiver fs;
    private File file;

    public CloseFileCommand(FileSystemReceiver fs, File f){
        this.fs = fs;
        this.file = f;
    }

    @Override
    public void execute()  {
        // close command is forwarding the request
        try{
            this.fs.closeFile(file);
        }catch(IOException e){
            System.err.println("Error closing file");
        }
    }
}
