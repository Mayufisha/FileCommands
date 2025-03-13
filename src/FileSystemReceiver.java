import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public interface FileSystemReceiver {
    void openFile( String filename) throws IOException;
    void closeFile(File file) throws IOException;
    void writeFile(File file, String content) throws IOException;
}
