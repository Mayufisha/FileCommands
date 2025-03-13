import java.io.File;
import java.io.IOException;

public class OpenFileCommand  implements Command{

    private FileSystemReceiver fs;
    private String filename;
    private File file;

    public File getFile() {
        return file;
    }

    public OpenFileCommand(FileSystemReceiver fs, String fn){
        this.fs = fs;
        this.filename = fn;
    }

    @Override
    public void execute() {
        // open command is forwarding the request
        try {
            this.fs.openFile(filename);
        } catch (IOException e){
            System.err.println("Error opening file: " +e.getMessage());
        }
    }
}
