import java.io.File;
import java.io.IOException;

public class FileSystemClient {
    public static void main(String[] args) {
        String platform = System.getProperty("os.name");

        //creating the receiver object
        FileSystemReceiver fs = FileSystemReceiverUtil.getFileSystem(platform);

        //File name and content examples
        String filename = "samplefile.txt";
        String content = "This is a sample content";

        OpenFileCommand openFilecmd = new OpenFileCommand(fs,filename);
        //creating invoker for OpenFilecmd
        FileInvoker openInvoker = new FileInvoker(openFilecmd);
        openInvoker.execute();

        //get the file handle
        File file = openFilecmd.getFile();

        //creating command and associating receiver for each command

        WriteFileCommand writeFilecmd = new WriteFileCommand(fs,file, content);
        //creating invoker for WriteFilecmd
        FileInvoker writeInvoker = new FileInvoker(writeFilecmd);
        writeInvoker.execute();

        CloseFileCommand closeFilecmd = new CloseFileCommand(fs, file);
        //creating invoker for CloseFilecmd
        FileInvoker closeInvoker = new FileInvoker(closeFilecmd);
        closeInvoker.execute();
    }
}
