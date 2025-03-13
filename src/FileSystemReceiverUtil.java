public class FileSystemReceiverUtil {
    public static FileSystemReceiver getFileSystem(String platform){
        if (platform.equals ("Windows")){
            return new WindowsFileSystemReceiver();
        }
        else
            return new LinuxFileSystemReceiver();
    }
}
