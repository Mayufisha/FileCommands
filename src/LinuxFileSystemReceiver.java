import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LinuxFileSystemReceiver implements FileSystemReceiver{
    String platform = "Linux";


    @Override
    public void openFile(String fn) throws IOException {
        File file = new File(fn);

        if(file.createNewFile())
            System.out.println("Creating file'"+fn+"' in linux OS");
        else
            System.out.println("Opening file"+fn+" in linux OS");
    }

    @Override
    public void writeFile(File file, String content) throws IOException {
        try{
            FileWriter writer = new FileWriter(file,true);
            writer.write(content + System.lineSeparator());
            System.out.println("Writing to file '"+ file.getName()+"' in linux OS");
        }catch (IOException e){
            System.err.println("Error writing to file"+ e.getMessage());
        }

    }

    @Override
    public void closeFile(File file) throws IOException {
        System.out.println("Writing file in Linux OS");
    }
}
