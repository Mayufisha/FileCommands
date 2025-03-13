public class FileSystemReceiverUtil {
    public static FileSystemReceiver getFileSystem(String platform){
        if (platform.contains ("Windows")){
            return new WindowsFileSystemReceiver();
        }
        else
            return new LinuxFileSystemReceiver();
    }
}
