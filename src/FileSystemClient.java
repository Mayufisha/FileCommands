public class FileSystemClient {
    public static void main(String[] args){
        String platform = System.getProperty("os.name");

        //creating the receiver object
        FileSystemReceiver fs = FileSystemReceiverUtil.getFileSystem(platform);

        //creating command and associating receiver for each command
        OpenFileCommand openFilecmd = new OpenFileCommand(fs);
        WriteFileCommand writeFilecmd = new WriteFileCommand(fs);
        CloseFileCommand closeFilecmd = new CloseFileCommand(fs);

        //creating invoker for OpenFilecmd
        FileInvoker openInvoker = new FileInvoker(openFilecmd);
        openInvoker.execute();

        //creating invoker for WriteFilecmd
        FileInvoker writeInvoker = new FileInvoker(writeFilecmd);
        writeInvoker.execute();

        //creating invoker for CloseFilecmd
        FileInvoker closeInvoker = new FileInvoker(closeFilecmd);
        closeInvoker.execute();
    }
}
