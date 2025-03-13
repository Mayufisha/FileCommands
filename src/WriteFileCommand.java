import java.io.File;
import java.io.IOException;

public class WriteFileCommand implements Command{

    private FileSystemReceiver fs;
    private File file;
    private String content;

    public WriteFileCommand(FileSystemReceiver fs, File f, String c){
        this.fs = fs;
        this.file = f;
        this.content = c;
    }


    @Override
    public void execute() {
        // write command is forwarding the request
        try {
            this.fs.writeFile(file, content);
        }catch (IOException e){
            System.err.println("Error writing to file: "+e.getMessage());
        }
    }
}
